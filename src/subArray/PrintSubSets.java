package subArray;

import java.util.ArrayList;
import java.util.List;

public class PrintSubSets {
    public static void main(String[] args) {
        //int[] arr = {3,34,4,12,5,2};
        int[] arr = {3,34,4};
        List<List<Integer>> subArrays = findSubArrays(arr);
        System.out.println(subArrays);
    }
    private static List<List<Integer>> findSubArrays(int[] arr){
        List<List<Integer>> resultList = new ArrayList<>();
        resultList.add(new ArrayList<>());
        for(int num: arr) {
            int n = resultList.size();
            for (int i = 0; i < n; i++) {
                List<Integer> list = new ArrayList<>(resultList.get(i));
                list.add(num);
                resultList.add(list);
            }
        }
        return resultList;
    }
}
