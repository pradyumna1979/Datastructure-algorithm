package subArray;

import java.util.ArrayList;
import java.util.List;

public class PrintSubArray {
    public static void main(String[] args) {
        int[] arr = {3,34,4};
        List<List<Integer>> subArrays = findSubArrays(arr);
        System.out.println(subArrays);
    }
    private static List<List<Integer>> findSubArrays(int[] arr){
        List<List<Integer>> list = new ArrayList<>();
        for(int i=0; i < arr.length; i++) {
            for (int j = i; j < arr.length; j++) {
                List<Integer> subList = new  ArrayList<>();
                for(int k=i;k<=j;k++) {
                    subList.add(arr[k]);
                }
                list.add(subList);
            }
        }
        return list;
    }
}
