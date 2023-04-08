package MultiDiamonsonalArray;

import java.util.Arrays;
import java.util.Scanner;

public class TwoDiamonionalArray {
    public static void main(String[] args) {
        System.out.println("Enter number of rows: ");
        int m =new Scanner(System.in).nextInt();
        System.out.println("Enter number of columns: ");
        int n =new Scanner(System.in).nextInt();

        createArray(m,n);
    }
    public static void createArray(int m, int n){
        int count = 1;
        int[][] arr = new int[m][n];
        for(int i=0; i< m;i++){
            for(int j=0;j<n;j++){
                arr[i][j]=count++;
            }
        }
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
        for (int i = 0; i < m; i++) {
            if(i%2==0) {
                for (int j = 0; j < n; j++) {
                    System.out.print(arr[i][j] + " ");
                }
            }else{
                for (int j = n-1; j >= 0; j--) {
                    System.out.print(arr[i][j] + " ");
                }
            }
            System.out.println();
        }
    }

}
