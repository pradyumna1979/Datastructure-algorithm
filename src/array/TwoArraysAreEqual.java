package array;

import java.util.Arrays;

public class TwoArraysAreEqual {
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4};
        int[] arr2 = {1,2,3,4};
        System.out.println("isEqual : "+Arrays.equals(arr1,arr2));
        System.out.println(arr1 == arr2);
        if (arr1.length != arr2.length) {
            System.out.println("Arrays are not equal");
        }
        boolean isEqual = false;
        for (int i = 0; i < arr1.length; i++) {

            if (arr1[i] == arr2[i]) {
                isEqual = true;
            } else {
                isEqual = false;
                break;
            }
        }

        System.out.println("is equal = " + isEqual);
    }
}
