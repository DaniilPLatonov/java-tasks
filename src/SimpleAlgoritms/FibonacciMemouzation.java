package SimpleAlgoritms;

import java.util.Arrays;

public class FibonacciMemouzation {

    public static void main(String[] args) {

        Integer counter = 1;
        Integer c = 1;

        System.out.printf("%b",c == counter);




        int n = 100;
        long[] mem = new long[n +1];
        Arrays.fill(mem, -1);

        System.out.println(fibNaive(n , mem));
    }

    private static long fibNaive(int n, long[] mem){
        if(mem[n] != -1){
            return mem[n];
        }
        if(n <= 1){
            return n;
        }

        long result = fibNaive(n - 1, mem) + fibNaive(n-2, mem);
        mem[n] = result;
        return result;
    }
}
