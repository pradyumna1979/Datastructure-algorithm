package search.medianOfTwoShortedArrays;

import java.util.Arrays;

public class MedianOfTwoNumbers1 {
    public static void main(String[] args) {
        int[] arr1 = {1,3,8,17};
        System.out.println("arr1 : "+Arrays.toString(arr1));
        int[] arr2 = {5,6,7,19,21,25,27};
        System.out.println("arr2 : "+Arrays.toString(arr2));
        float median = findMedian(arr1,arr2);
        System.out.println(median);

    }
    public static float findMedian(int[] arr1, int[] arr2) {
        int low = 0,high=arr1.length;
        if(arr2.length < arr1.length){
            return findMedian(arr1,arr2);
        }
        while(low <= high){
            int mid1 = (low+high)/2;
            int mid2 = (arr1.length+ arr2.length+1)/2 -mid1;
            int l1 = (mid1==0) ?Integer.MIN_VALUE:arr1[mid1-1];
            int r1 = (mid1== arr1.length)?Integer.MAX_VALUE:arr1[mid1];
            int l2 = (mid2==0) ?Integer.MIN_VALUE:arr2[mid2-1];
            int r2 = (mid2== arr2.length)?Integer.MAX_VALUE:arr2[mid2];
            if(l1<=r2 && l2 <=r1){
                if ((arr1.length + arr2.length)%2 == 0) {
                    return (float)Integer.max(l1,l2);
                }
                else{
                    return (float)(Integer.max(l1,l2)+Integer.min(r1,r2))/2;
                }
            }else if (l2 > r1) {
                low = mid1+1;
            }else {
                high = mid1-1;
            }

        }
        return 0.0f;
    }
}
