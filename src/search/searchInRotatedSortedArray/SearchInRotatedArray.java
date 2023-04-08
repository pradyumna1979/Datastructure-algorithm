package search.searchInRotatedSortedArray;

import java.util.Scanner;
// 3 4 5 6 7 0 1 2
public class SearchInRotatedArray {
    public static void main(String[] args) {
        int[] arr = {4,5,6,7,0,1,2,3};
        System.out.print("Insert search element : ");
        int target = new Scanner(System.in).nextInt();
        int index = search(arr,target);
        System.out.println(index);
    }


    private static int search(int[] arr, int target){
        int low=0;int high= arr.length-1;
        while(low <= high){
            int mid = (low+high)/2;
            if (target == arr[mid]) {
               return mid;
            } else if (arr[low] < arr[mid] ) {
                if(target>=arr[low] && target<arr[mid]){
                    high = mid-1;
                }else {
                    low = mid + 1;
                }
            }else {
                if(target>arr[mid] && target <= arr[high]){
                    low = mid+1;
                }else{
                    high = mid-1;
                }
            }
        }
        return -1;
    }

}
