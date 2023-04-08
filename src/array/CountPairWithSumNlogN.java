package array;

import java.util.Arrays;

public class CountPairWithSumNlogN {
    public static void main(String[] args) {
        int[] arr = {1,5,7,-1};
        int n = arr.length;
        int sum = 6;
        int count = numberOfPairs(arr,n,sum);
        System.out.println(count);
    }
    public static int numberOfPairs(int[] arr, int n, int sum){
       int count = 0;
       //-1,1,5,7
        Arrays.sort(arr);
        for(int i = 0; i < n-1; i++){
            int key = sum - arr[i];
            int y = lowerBound(arr, i+1, n, key);
            int z = upperBound(arr, i+1, n, key);
            count = count + z -y;
        }
        return count;
    }

    private static int upperBound(int[] arr, int start, int end, int key) {
        while(start < end){
            int mid = start + (end - start)/2;
            if(arr[mid] <= key){
                start = mid+1;
            }else{
                end = mid;
            }
        }
        return start;
    }

    private static int lowerBound(int[] arr, int start, int end, int key) {
        while(start < end){
            int mid = start + (end - start)/2;
            if(arr[mid] < key){
                start = mid+1;
            }else{
                end = mid;
            }
        }
        return start;
    }
}
