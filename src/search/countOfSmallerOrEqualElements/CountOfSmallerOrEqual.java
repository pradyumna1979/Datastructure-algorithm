package search.countOfSmallerOrEqualElements;

import java.util.Scanner;

public class CountOfSmallerOrEqual {
    public static void main(String[] args) {
       // int[] arr = {2,6,12,18,21,26,33,42,42,42};
        int[] arr = {2,6,12,12,12,12,18,21,22,22};//7
        System.out.println("Enter search element: ");
        int target = new Scanner(System.in).nextInt();
        int count = countSmallerOrEqualElements(arr,target);
        System.out.println("count : "+count);
    }

    private static int countSmallerOrEqualElements(int[] arr, int target) {
        return  binarySearch(arr,target)+1;
    }
    private static int binarySearch(int[] arr,int target){
        int low=0;int high = arr.length-1;
        while (low <= high){
            int mid = (low+high)/2;
            if(target==arr[mid]){
                while(mid+1 < arr.length && target == arr[mid+1]){
                    mid = mid+1;
                }
                return mid;
            } else if (target > arr[mid]) {
                low = mid+1;
            }else{
                high = mid-1;
            }
        }
        return low-1;
    }
}
