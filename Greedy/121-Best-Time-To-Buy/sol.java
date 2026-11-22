class sol {
    public int maxProfit(int[] prices) {
        int n = prices.length;
        int buy = prices[0];
        int profit = 0;
        for(int i = 0; i < n; i++){
            if( prices[i] < buy ){
                buy = prices[i];
            }
            else{
                profit = Math.max(profit, prices[i] - buy);
            }

        }
        return profit;
    }
}
public class Main {
    public static void main(String[] args) {
        sol solution = new sol();
        int[] prices = {7, 1, 5, 3, 6, 4};
        int maxProfit = solution.maxProfit(prices);
        System.out.println("Maximum Profit: " + maxProfit);
    }
}