package arrayRotation;

import java.util.Arrays;
import java.util.Scanner;

public class   ArrayRotation {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6};
        System.out.println("Enter number of position to rotate");
        int position = new Scanner(System.in).nextInt();
        int[] leftRotationArray = leftRotation(arr, position);
        System.out.println(Arrays.toString(leftRotationArray));
    }

    private static int[] leftRotation(int[] arr, int position) {

        if(position < 0)
            position = position+ arr.length;
            position = position% arr.length;
        while (position > 0) {
            int temp = arr[0];
            for (int i = 1; i < arr.length; i++) {
                arr[i-1] = arr[i];
            }
            arr[arr.length - 1] = temp;
            position--;
        }
        return arr;
    }


}
