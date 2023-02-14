package JetBrains_tasks;

import java.util.*;

public class Task3 {


    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int amountOfTelescope = scanner.nextInt();
        int amountOfStars = scanner.nextInt();
        int amountOfModes = scanner.nextInt();

        List<Integer> modesAfterWork = new ArrayList<>();
        Set<Set<Integer>> numTreeSet = new TreeSet<>(Comparator.comparing(Set::hashCode));

        for (int i = 0; i < amountOfTelescope; i++) {
            modesAfterWork.add(scanner.nextInt());
        }

        for (int i = 0; i < amountOfStars; i++) {
            numTreeSet.add(new TreeSet<>() {{
                add(scanner.nextInt());
                add(scanner.nextInt());
            }});
        }

        List<List<Integer>> numList = new ArrayList<>();
        int q = 0;
        for (Set<Integer> s : numTreeSet) {
            numList.add(new ArrayList<>());
            numList.get(q).addAll(s);
            q++;
        }

        for (int i = 0; i < numList.size(); i++) {
            for (int j = i + 1; j < numList.size(); j++) {
                for (int k = 0; k < numList.get(i).size(); k++) {
                    if (numList.get(j).contains(numList.get(i).get(k))) {
                        Set<Integer> ss = new TreeSet<>(numList.get(j));
                        ss.addAll(numList.get(i));
                        numList.set(i, new ArrayList<>(ss));
                        numList.remove(j);
                        j--;
                        if (j <= i) break;
                    }
                }
                if (j <= i) break;
            }
        }

        List<List<Integer>> ss = new ArrayList<>();

        int number = 0;

        for (int i = 0; i < numList.size(); i++) {
            ss.add(new ArrayList<>());
            for (int j = 0; j < numList.get(i).size(); j++) {
                ss.get(i).add(modesAfterWork.get(numList.get(i).get(j) - 1));
            }
            number += findAmount(ss.get(i));
        }

        System.out.println(number);
    }

    private static int findAmount(List<Integer> integers) {
        TreeMap<Integer, Integer> map = new TreeMap<>();
        for (Integer i : integers) {
            map.putIfAbsent(i, 0);
            map.put(i, map.get(i) + 1);
        }
        return integers.size() - map.firstEntry().getValue();
    }

}