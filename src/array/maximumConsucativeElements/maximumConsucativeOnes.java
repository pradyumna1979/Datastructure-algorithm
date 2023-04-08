package array.maximumConsucativeElements;

public class maximumConsucativeOnes {
    public static void main(String[] args) {
        int[] arr = {0,1,1,1,1,0,0,1,1,1,0};
        int maxConsucative1 = findMax1(arr);
        System.out.println(maxConsucative1);
    }
    private static int findMax1(int[] arr) {
        int maxCount = Integer.MIN_VALUE;
        int count=0;
        for (int i = 0; i < arr.length; i++) {
            maxCount=Integer.max(count,maxCount);
            count = 0;
            for (int j = i; j < arr.length; j++) {
                if(arr[j]!=1)
                    break;
                count++;
            }
        }
        return maxCount;
    }
}
