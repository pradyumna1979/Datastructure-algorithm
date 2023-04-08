package recursion.array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Subset {
    public static void main(String[] args) {
        int[] arr = {1,2,3};//unprocess
        List<List<Integer>> result = subSequence(arr);
        System.out.println(result);
    }

    private static List<List<Integer>> subSequence(int[] arr) {
    List<List<Integer>> outer = new ArrayList<>();
    outer.add(new ArrayList<>());
    for(int num : arr){
        int n = outer.size();
        for(int i=0; i<n; i++){
            List<Integer> innerList = new ArrayList<>(outer.get(i));
            innerList.add(num);
            outer.add(innerList);
        }
    }
    return outer;
    }
}
