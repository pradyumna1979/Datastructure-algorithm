package search;

public class BinarySearchRecursion {
    public static void main(String[] args) {
       // int[] arr = {1,5,7,9,11,15,17,19,21,22};
        int[] arr = {1,5,7,9,11,15,17,21,22};
        int n = arr.length;
        int x = 15;
        int result = binarySearch(arr, 0, n-1, x);
        System.out.println("result : "+result);
    }
    public static int binarySearch(int[] arr, int l, int r, int x ){
        int mid = l + (r-l)/2;
        if(r >= l){
            if(arr[mid] == x)
                return mid;
            if(x < arr[mid])
                return binarySearch(arr, l, r-1,x);
            return binarySearch(arr, mid+1,r,x);

        }else{
            return -1;
        }
    }
}
