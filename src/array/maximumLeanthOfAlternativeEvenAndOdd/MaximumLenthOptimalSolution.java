package array.maximumLeanthOfAlternativeEvenAndOdd;

public class MaximumLenthOptimalSolution {
    public static void main(String[] args) {
        int[] arr = {8,10,13,11} ;
        int max = findMaxLength(arr);
        System.out.println("max count : " +max);
    }

    private static int findMaxLength(int[] arr) {
        int count =1;
        int maxCount =1;
        for (int i = 1; i< arr.length; i++) {
            if((arr[i] %2==0 && arr[i-1]%2 !=0) ||
                    (arr[i] %2!=0 && arr[i-1]%2 ==0) ){
                count++;
                maxCount = Integer.max(count,maxCount);
            }else{
                count=1;
            }
        }
        return  maxCount;
    }
}
