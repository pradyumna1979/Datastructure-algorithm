package GeekForGeeks.sortAnArrayContaining01and2WithoutAlgorithm;

import java.util.Arrays;

public class SortAnArrayContaining01And2 {
    public static void sortAnArray(int[] arr, int n) {
        int count0 = 0;
        int count1 = 0;
        int count2 = 0;
        int j = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] == 0) {
                count0++;
            }
            if (arr[i] == 1) {
                count1++;
            }
            if (arr[i] == 2) {
                count2++;
            }
        }
        for(int i = 0; i < count0 ; i++){
            arr[j++] = 0;
        }for(int i = 0; i < count1 ; i++){
            arr[j++] = 1;
        }for(int i = 0; i < count2 ; i++){
            arr[j++] = 2;
        }

        System.out.println(Arrays.toString(arr));
    }

    public static void main(String[] args) {
        int[] arr = {0, 1, 0, 0, 1, 1, 2, 1, 2};
        sortAnArray(arr, arr.length);
    }
}
