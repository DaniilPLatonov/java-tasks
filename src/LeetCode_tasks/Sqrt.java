package LeetCode_tasks;

public class Sqrt {

    public static int mySqrt(int x) {
        if(x<0)
            return -1;
        if(x == 0)
            return 0;
        if(x<4)
            return 1;
        int leftBoard = 0;
        int rightBoard = x;
        long medium;
        int temp = x;
        for (; ; ) {
            medium = (leftBoard + rightBoard) / 2;
            if (medium == temp || medium * medium == x) {
                break;
            }
            if (medium * medium < x) {
                leftBoard = (int) medium;
            } else {
                rightBoard = (int) medium;
            }
            temp = (int) medium;
        }
        return (int) medium;
    }

    public static void main(String[] args) {
        System.out.println(mySqrt(2147395599));
    }
}
