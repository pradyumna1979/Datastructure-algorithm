package subArray.maximumSubArraySum;

public class MaximumSubArraySum {
    public static void main(String[] args) {
        int[] arr = {-2,1,-3,4,-1,2,1,-5,4};
        int sum = maximumSum(arr);
        System.out.println(sum);
    }

    private static int maximumSum(int[] arr) {
        int maxSum = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr.length; j++) {
                int sum = 0;
                for(int k=i; k<=j;k++){
                    System.out.print(arr[k]+" ");
                    sum = sum+arr[k];
                    maxSum = Integer.max(maxSum,sum);
                }
                System.out.print("->"+sum);
                System.out.println();
            }

        }
        return maxSum;
    }
}
