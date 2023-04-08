package array;

import java.util.HashSet;
import java.util.Set;

public class FirstRepeatingElement {
    public static void main(String[] args) {
        int[] arr = {10, 5, 3, 4, 3, 5, 6};
        firstRepeatingElement(arr);
    }

    private static void firstRepeatingElement(int[] arr) {
        int min = -1;
        Set<Integer> set = new HashSet<>();
        for(int i = arr.length-1; i >= 0; i--){
           if(set.contains(arr[i])) {
               min = i;
           }
           else{
               set.add(arr[i]);
           }
        }
        if(min==-1)
            System.out.println("no repeated elements found");
        else
            System.out.println("First repeated element : "+arr[min]);
    }
}
