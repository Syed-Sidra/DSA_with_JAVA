package arrays;

public class BuyAndSellStock {
    public static int buyAndSellStock(int[] prices){
        int buy = Integer.MAX_VALUE;
        int max = 0;
        for(int i=0;i<prices.length;i++){
            if(buy<prices[i]){
                int profit = prices[i] - buy;
                max = Math.max(max,profit);
            }
            else{
                buy = prices[i];
            }

        }
                    return max;

    }
    public static void main(String[] args) {
        int prices[] = {1,5,3,6,4};
       System.out.print( buyAndSellStock(prices));
    }
}
