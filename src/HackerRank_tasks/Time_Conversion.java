package HackerRank_tasks;

import java.io.*;


class Result3 {
    public static String timeConversion(String s) {
        String[] time = s.split(":");
        int hour = Integer.parseInt(time[0]);
        int minute = Integer.parseInt(time[1]);
        int second = Integer.parseInt(time[2].substring(0, 2));
        String hour2 = null;
        String pmAM = time[2].substring(2, 4);
        if (pmAM.equals("AM") && hour == 12) {
            hour = 0;
            hour2 = "0" + String.valueOf(hour);
        }

        if (pmAM.equals("AM") && hour < 12) {
            hour2 = "0" + String.valueOf(hour);
        }

        if (pmAM.equals("PM") && hour < 12) {
            hour = hour + 12;
            hour2 = String.valueOf(hour);
        }
        if (pmAM.equals("PM") && hour == 12) {
            hour2 = String.valueOf(hour);
        }

        return hour2 + ":" + time[1] + ":" + time[2].substring(0, 2);

    }
}

 class Solution3 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String s = bufferedReader.readLine();

        String result = Result3.timeConversion(s);

        bufferedWriter.write(result);
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}

