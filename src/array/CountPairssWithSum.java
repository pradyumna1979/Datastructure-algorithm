package array;

public class CountPairssWithSum {
    public static void main(String[] args) {
        int[] arr = {1,5,7,-1};
        int sum = 6;
        int count = numberOfPairs(arr,sum);
        System.out.println(count);
    }
    public static int numberOfPairs(int[] arr, int sum){
        int count = 0;
        for(int i=0; i< arr.length; i++){
            for(int j=i+1; j< arr.length; j++){
                if(arr[i] + arr[j] == 6){
                    count++;
                }
            }
        }
        return count;
    }
}
