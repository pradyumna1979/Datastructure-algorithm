package search.biotonicSearch;

public class BiotonicSearch {
    public static void main(String[] args) {
        int[] arr = {3,9,70,20,17,10,5,1};
        int position=search(arr,20);
        System.out.println(position);
    }
    public static int search(int[] arr,int target){
        int biotonicNum = findBiotonicNum(arr);
        return Math.max(binarySearchAscending(arr,target,biotonicNum),binarySearchDescending(arr,target,biotonicNum));
    }
    private static int binarySearchAscending(int[] arr,int target,int bitonicIndex){
        int low = 0; int high = bitonicIndex;
        while(low <= high){
            int mid = (low+high)/2;
            if(target==arr[mid]){
                return mid;
            }else if(target > arr[mid]){
                low=mid+1;
            }else if(target < arr[mid]){
                high=mid-1;
            }
        }
        return -1;
    }
    private static int binarySearchDescending(int[] arr,int target,int biotonicIndex){
        int low = biotonicIndex+1; int high = arr.length-1;
        while(low <= high){
            int mid = (low+high)/2;
            if(target==arr[mid]){
                return mid;
            }else if(target > arr[mid]){
                high=mid-1;

            }else if(target < arr[mid]){
                low=mid+1;
            }
        }
        return -1;
    }
    private static int findBiotonicNum(int[] arr) {
        int low=0; int high= arr.length-1;
        while(low <= high){
           int mid = (low + high)/2;
           if(arr[mid] > arr[mid-1] && arr[mid] > arr[mid+1]){
               return mid;
           } else if (arr[mid] < arr[mid+1]) {
               low=mid+1;
           } else if (arr[mid] < arr[mid-1]) {
               high=mid-1;
           }
        }
        return -1;
    }
}
