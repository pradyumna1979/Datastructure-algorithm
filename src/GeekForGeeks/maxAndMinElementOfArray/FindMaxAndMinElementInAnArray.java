package GeekForGeeks.maxAndMinElementOfArray;

public class FindMaxAndMinElementInAnArray {
    public static void findMaxAndMin(int[] arr, int n){
        int max = 0;
        int min = 0;
        if (arr[0] < arr[1]){
            max = arr[1];
            min = arr[0];
        }else{
            max = arr[0];
            min = arr[1];
        }
        for(int i = 2; i < n; i++){
            if(arr[i] > max){
                max = arr[i];
            }
            if(arr[i] < min){
               min = arr[i];
            }
        }
        System.out.println("max = " +max);
        System.out.println("min = " +min);
    }

    public static void main(String[] args) {
        int[] arr = {2,5,6,1,3,4};
        int n = arr.length;
        findMaxAndMin(arr,n);
    }
}
