package SimpleAlgoritms;

import java.util.Arrays;
import java.util.Collections;

public class GreedyAlgoritms {
    public static void main(String[] args) {
        int[] station = {0, 200, 375, 550, 750, 950};
        System.out.println(minStops(station, 400));

  /*      int[] digits = {1, 3, 7, 9, 9, 5};
        System.out.println(maxNumberFromDigits(digits));*/
    }

    public static String maxNumberFromDigits(int[] digits) {
        return String.join("", Arrays.stream(digits).boxed()
                .sorted(Collections.reverseOrder())
                .map(String::valueOf)
                .toArray(String[]::new));
    }

    public static int minStops(int[] station, int capacity) {
        int result = 0;
        int currentStop = 0;

        while (currentStop < station.length - 1) {
            int nextStop = currentStop;
            while (nextStop < station.length - 1 &&
                    station[nextStop + 1] - station[currentStop] <= capacity)
                nextStop++;

            if (currentStop == nextStop) {
                return -1;
            }

            if (nextStop < station.length - 1) {
                result++;
            }
            currentStop = nextStop;
        }
        return result;
    }

}
