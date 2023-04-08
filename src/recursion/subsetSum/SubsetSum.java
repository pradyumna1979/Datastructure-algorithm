package recursion.subsetSum;

public class SubsetSum {
    public static void main(String[] args) {
        int[] arr = {1,1,1,1};
        int sum=1;
        int count = subsetSum(arr,sum);
        System.out.println("count of sum : "+count);

    }

    private static int subsetSum(int[] arr, int sum) {
       return subsetSum(arr,sum,0);
    }

    private static int subsetSum(int[] arr, int sum, int i) {
        if(sum == 0){
            return 1;
        }
        if(sum < 0 || i > arr.length-1){
            return 0;
        }
        return subsetSum(arr,sum-arr[i],i+1)+subsetSum(arr,sum,i+1);
    }
}
