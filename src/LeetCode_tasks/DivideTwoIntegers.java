package LeetCode_tasks;

public class DivideTwoIntegers {

    public static int divide(int dividend, int divisor) {

        if(dividend/divisor == Integer.MAX_VALUE){
            return (dividend/divisor)-1;
        }

        if(dividend == Integer.MIN_VALUE){
            dividend++;
        }



        return dividend/divisor;
    }

    public static void main(String[] args) {
        System.out.println(divide(-2147483648,-1));
    }
}
