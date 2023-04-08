package array.maximumLeanthOfAlternativeEvenAndOdd;

public class MaximumLenth {
    public static void main(String[] args) {
        int[] arr = {10,13,14} ;
        int max = findMaxLength(arr);
        System.out.println("max count : " +max);
    }

    private static int findMaxLength(int[] arr) {
        int count =1;
        int maxCount =0;
        for (int i = 0; i< arr.length; i++) {
            for (int j = i+1; j < arr.length ; j++) {
                if(arr[j]%2==0){
                   if(arr[j-1]%2 != 0){
                       count++;
                       maxCount = Integer.max(count,maxCount);
                   }
                   else {
                       count=1;
                       break;
                   }
                }else if(arr[j]%2!=0){
                   if(arr[j-1]%2 == 0){
                       count++;
                       maxCount = Integer.max(count,maxCount);
                   }
                   else {
                       count=1;
                       break;
                   }
                }
            }
            count=1;
        }
        return  maxCount;
    }
}
