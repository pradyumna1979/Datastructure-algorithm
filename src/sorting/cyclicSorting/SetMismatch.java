package sorting.cyclicSorting;

import java.util.Arrays;

public class SetMismatch {
    public static void main(String[] args) {
        int[] arr = {1,2,2,4};
        int[] ans = returnDuplicateAndMissingNumber(arr);
        System.out.println(Arrays.toString(ans));
    }
    static int[] returnDuplicateAndMissingNumber(int[] arr){
        int[] ans = new int[2];
        int i =0;
        while(i < arr.length){
            int correct = arr[i]-1;
            if( arr[i] != arr[correct]) {
                swap(arr, i, correct);
            }else{
                i++;
            }
        }
        for(int j = 0; j< arr.length; j++){
            if(arr[j] != j+1){
                ans[0]=arr[j];
                ans[1]=j+1;
            }
        }
        return ans;
    }
    static void swap(int[] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
