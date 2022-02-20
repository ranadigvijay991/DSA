package Arrays;

public class Stock {
    public static void maxProfit(int[] prices, int n){
        //int n = prices.length;
        int min = prices[0];
        int max_profit = 0;
        for(int i=0;i<n;i++){
            if(prices[i]<min){
                min = prices[i];
                
            }
           max_profit = Math.max(max_profit,prices[i] - min);
            
           
        }
        System.out.println("MAXIMUM PROFIT : "+max_profit);
    }
    public static void main(String[] args) {
        int arr[] = {7,1,5,3,6,4};
        int n = arr.length;
        maxProfit(arr,n);
    }
}
