package GeekForGeeks.moveAllNegetiveElementsToOneSide;

import java.util.Arrays;

public class MoveNegativeElementsToOneSide {
    public static void moveElements(int[] arr, int n){
        int pivot = 0;
        int i = -1;
        for(int j=0; j <n; j++){
            if(arr[j] < 0){
                swap(arr,++i,j);
            }
        }
        System.out.println(Arrays.toString(arr));
    }

    private static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void main(String[] args) {
        int[] arr = {-2,1,-3,4,5,-4,6};
        int n = arr.length;
        moveElements(arr,n);
    }
}
