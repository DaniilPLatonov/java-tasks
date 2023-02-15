package LeetCode_tasks;

public class BestTimeToBuyAndSellStock {

    public static int maxProfit(int[] prices) {
        int min = Integer.MAX_VALUE;
        int maxProfit = 0;
        for(int i = 0; i < prices.length; i++){
            min = Math.min(min, prices[i]);
            maxProfit = Math.max(maxProfit, prices[i] - min);
        }
        return maxProfit;
    }

    public static void main(String[] args) {
        int [] a = new int[]{7,1,5,3,6,4};
        System.out.println(maxProfit(a));
    }
}
