package GeekForGeeks.largestSumContigousSubArray;

public class KadensAlgorithm {
    public static void largestSumSubArray(int[] arr, int n){
        int max = 0;
        int currentMax = 0;
        for (int i = 0; i < n; i++) {
            currentMax =currentMax + arr[i];
          if( currentMax > max){
              max = currentMax;
          }
          if(currentMax < 0) {
              currentMax = 0;
          }
        }
        System.out.println("max = "+max);
    }
    public static void main(String[] args) {
        int[] arr = {7,5,-13,5,10,-2,5};
        largestSumSubArray(arr,arr.length);
    }
}
