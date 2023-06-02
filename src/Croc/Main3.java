package Croc;

import java.util.*;

import java.util.*;

public class Main3 {
    public static void main(String[] args) {
        int n = 2; // количество лифтов
        int m = 3; // количество групп
        int d = 7; // пропускная способность лифтов
        int r = 49; // время перемещения лифта

        // Группы: время прибытия и количество человек
        int[][] groups = {{3, 46}, {5, 47}, {8, 48}};

        Queue<int[]> elevatorQueue = new LinkedList<>(); // очередь лифта
        int time = 0; // текущее время

        // Сортировка информации о группах по времени прибытия
        Arrays.sort(groups, Comparator.comparingInt(a -> a[0]));

        // Обработка каждой группы
        for (int i = 0; i < m; i++) {
            int[] group = groups[i];
            int freeElevators = n - elevatorQueue.size();

            if (freeElevators > 0) {
                // Группа заходит в свободный лифт и начинает движение
                int[] elevator = {group[0] + r, group[1]};
                elevatorQueue.offer(elevator);
            } else {
                // Добавляем группу в очередь лифта
                elevatorQueue.offer(group);
            }
        }

        int totalTime = 0; // общее время доставки пассажиров на второй этаж
        int totalPassengers = 0; // общее количество пассажиров

        while (!elevatorQueue.isEmpty()) {
            int[] elevator = elevatorQueue.poll();
            int arrivalTime = elevator[0];
            int passengers = elevator[1];

            if (time >= arrivalTime + r) {
                // Пассажиры выходят из лифта, лифт движется вниз
                time += r;
                int travelTime = time - arrivalTime;
                totalTime += passengers * travelTime;
                totalPassengers += passengers;
            } else {
                // Добавляем лифт обратно в очередь
                elevatorQueue.offer(elevator);
                time += r;
            }
        }

        // Добавляем время, необходимое последнему лифту для доставки пассажиров на второй этаж
        int lastElevatorTime = groups[m - 1][0] + r;
        totalTime += groups[m - 1][1] * (lastElevatorTime - groups[m - 1][0]);
        totalPassengers += groups[m - 1][1];

        double averageTime = (double) totalTime / totalPassengers;
        System.out.println("Среднее время доставки пассажиров на второй этаж: " + averageTime);
    }
}
