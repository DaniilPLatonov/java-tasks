package Croc;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt(); // количество лифтов
        int m = scanner.nextInt(); // количество групп
        int d = scanner.nextInt(); // пропускная способность каждого лифта
        int r = scanner.nextInt(); // время перемещения лифта с первого этажа на второй и наоборот

        List<Group> groups = new ArrayList<>();

        // считываем информацию о группах
        for (int i = 0; i < m; i++) {
            int ti = scanner.nextInt(); // время прибытия группы
            int si = scanner.nextInt(); // количество человек в группе
            groups.add(new Group(ti, si));
        }

        Collections.sort(groups); // сортируем группы по времени прибытия

        double totalTime = 0; // общее время доставки пассажиров
        int[] liftQueue = new int[n]; // очередь для каждого лифта
        int[] liftFinishTime = new int[n]; // время окончания текущей операции для каждого лифта

        for (Group group : groups) {
            int minFinishTime = Integer.MAX_VALUE;
            int minLift = -1;

            // ищем лифт, который закончит текущую операцию раньше всех
            for (int i = 0; i < n; i++) {
                if (liftFinishTime[i] < minFinishTime) {
                    minFinishTime = liftFinishTime[i];
                    minLift = i;
                }
            }

            // время ожидания до прибытия группы
            int waitTime = Math.max(0, group.arrivalTime - liftFinishTime[minLift]);

            // время, затрачиваемое на доставку группы на второй этаж
            int deliveryTime = (group.size + d - 1) / d * r;

            // обновляем время окончания текущей операции и очередь лифта
            liftFinishTime[minLift] = liftFinishTime[minLift] + waitTime + deliveryTime;
            liftQueue[minLift] = liftQueue[minLift] + group.size;

            // обновляем общее время доставки
            totalTime += liftFinishTime[minLift] - group.arrivalTime;

            // если очередь лифта превышает его вместимость, производим доставку пассажиров
            if (liftQueue[minLift] > d) {
                int excessPassengers = liftQueue[minLift] - d;
                int unloadTime = (excessPassengers + d - 1) / d * r;
                liftFinishTime[minLift] += unloadTime;
                liftQueue[minLift] = Math.max(0, liftQueue[minLift] - d);
            }
        }

        double averageTime = totalTime / m; // среднее время доставки пассажиров
        System.out.printf("%.10f\n", averageTime);
    }

    static class Group implements Comparable<Group> {
        int arrivalTime;
        int size;

        public Group(int arrivalTime, int size) {
            this.arrivalTime = arrivalTime;
            this.size = size;
        }

        @Override
        public int compareTo(Group other) {
            return Integer.compare(this.arrivalTime, other.arrivalTime);
        }
    }
}