package subArray.maximumSubArraySum;

public class MaximumSubArraySum1 {
    public static void main(String[] args) {
        int[] arr = {-2,1,-3,4,-1,2,1,-5,4};
        int sum = maximumSum(arr);
        System.out.println(sum);
    }

    private static int maximumSum(int[] arr) {
        int maxSum = arr[0];
        int sum=arr[0];
        for (int i = 0; i < arr.length; i++) {
            if(sum > 0){
               sum=sum+arr[i];
            }else{
                sum = arr[i];
            }
            if(sum > maxSum)
            maxSum = sum;
        }
        return maxSum;
    }
}
