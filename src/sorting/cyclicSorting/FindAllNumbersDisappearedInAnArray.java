package sorting.cyclicSorting;

import java.util.ArrayList;
import java.util.List;

public class FindAllNumbersDisappearedInAnArray {
    /*Given an array nums of n integers where nums[i] is in the range [1,n] return an array of all the integers
    in the range [1,n] that donot appear in nums
    Ex: Input {4,3,2,7,8,2,3,1}
    output: {5,6}
    */

    public static void main(String[] args) {
        int[] arr = {4,3,2,7,8,2,3,1};
        cycleSort(arr);
        List<Integer> results = returnMissingNums(arr);
        System.out.println(results);
    }

    private static List<Integer> returnMissingNums(int[] arr) {

        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
           if(arr[i] != i+1){
               list.add(i+1);
           }
        }
        return list;
    }

    private static void cycleSort(int[] arr) {
         int i = 0;
         while(i < arr.length){
             int correct = arr[i] -1;
             if(arr[i] != arr[correct]){
                swap(arr,i,correct);
             }else{
                 i++;
             }
         }
    }
    private static void swap(int[] arr,int first,int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
