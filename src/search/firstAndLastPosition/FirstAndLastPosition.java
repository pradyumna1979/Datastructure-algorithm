package search.firstAndLastPosition;

import java.util.Scanner;

public class FirstAndLastPosition {
    public static void main(String[] args) {
        // int[] arr = {2,6,12,18,21,26,33,42,42,42};
        int[] arr = {2,6,12,12,12,12,18,21,22,22};//7
        System.out.println("Enter search element: ");
        int target = new Scanner(System.in).nextInt();
        Pair<Integer,Integer> positions = firstAndLastPosition(arr,target);
        System.out.println("count : "+positions);
    }

    private static Pair<Integer,Integer> firstAndLastPosition(int[] arr, int target) {
        return  binarySearch(arr,target);
    }
    private static Pair<Integer,Integer> binarySearch(int[] arr,int target){
        int low=0;int high = arr.length-1;;int mid=0;
        Pair<Integer,Integer> pair = new Pair<>(-1,-1);
        while (low <= high){
            mid = (low+high)/2;
            if(target==arr[mid]){
               pair.setFirst(mid);
               high=mid-1;
            } else if (target > arr[mid]) {
                low = mid+1;
            }else{
                high = mid-1;
            }
        }
        low=mid=0;high= arr.length-1;
        while (low <= high){
            mid = (low+high)/2;
            if(target==arr[mid]){
                pair.setSecond(mid);
                low=mid+1;
            } else if (target > arr[mid]) {
                low = mid+1;
            }else{
                high = mid-1;
            }
        }
        return pair;
    }

}

