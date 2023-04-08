package GeekForGeeks.bestTimeToBuyAndShellStock;

public class MaxProfit {
    public static void maxProfit(int[] arr, int n){
        int currPrice = Integer.MAX_VALUE;
        int maxProfit = 0;
        for(int i =0; i < n; i++){
            if(arr[i] < currPrice){
                currPrice = arr[i];
            } else if(arr[i]-currPrice > maxProfit){
                maxProfit = arr[i]-currPrice;
            }
        }
        System.out.println(maxProfit);  
    }
    public static void main(String[] args) {
        int[] arr = {7,1,5,3,6,4};
        maxProfit(arr, arr.length);
    }
}
