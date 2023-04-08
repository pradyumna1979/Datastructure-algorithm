package array;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class RemoveDuplicateElements {
    public static void main(String[] args) {
        Integer [] array = {1,2,2,3,4,1,2,5,5,5,5};
        removeDuplicates(array);
    }

      private static void removeDuplicates(Integer[] array) {
        Arrays.sort(array);
        int counter = 0;
        array[counter++] = array[0];
        for(int i = 0; i < array.length-1; i++){
            if(!Objects.equals(array[i], array[i+1])){
               array[counter++] = array[i+1];
            }
        }
          for (int i = 0; i < counter; i++) {
              System.out.println(array[i]);
          }
    }
}
