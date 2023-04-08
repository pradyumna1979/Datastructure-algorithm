package array.maximumConsucativeElements;

public class maximumConsucativeOnes1 {
    public static void main(String[] args) {
        int[] arr = {0,1,1,0,0,1,1,1,0};
        int maxConsucative1 = findMax1(arr);
        System.out.println(maxConsucative1);
    }
    private static int findMax1(int[] arr) {
        int maxCount = Integer.MIN_VALUE;
        int count=0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]==0)
                count =0;
             else if (arr[i]==1)
                count++;
            else{
                count=0;
            }
            maxCount=Integer.max(count,maxCount);
        }
        return maxCount;
    }
}
