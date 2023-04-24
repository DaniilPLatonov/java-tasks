package JetBrains_tasks;

import java.util.*;

class MapUtils {
    public static Map<Integer, String> getSubMap(TreeMap<Integer, String> map) {

        return map.firstKey() % 2 == 0 ? map.descendingMap().headMap(map.lastKey() - 5) :
                map.descendingMap().tailMap(map.firstKey() + 4);

/*        Map<Integer, String> map2 = new TreeMap<>(Collections.reverseOrder());

        if (map.firstKey() % 2 != 0) {
             map2.putAll(map.subMap(1,6));
             return map2;
        }else {
            map2.putAll(map.subMap(map.lastKey()-4, map.lastKey()+1));
            return map2;
        }*/
    }
}

/* Do not modify code below */
class Main3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        TreeMap<Integer, String> map = new TreeMap<>();
        Arrays.stream(scanner.nextLine().split("\\s")).forEach(s -> {
            String[] pair = s.split(":");
            map.put(Integer.parseInt(pair[0]), pair[1]);
        });

        Map<Integer, String> res = MapUtils.getSubMap(map);
        res.forEach((k, v) -> System.out.println(k + " : " + v));
    }
}
