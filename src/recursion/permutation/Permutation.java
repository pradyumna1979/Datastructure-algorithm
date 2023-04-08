package recursion.permutation;

import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Permutation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.next();
        char[] arr = str.toCharArray();
        permutation(arr);
    }
    private static void permutation(char[] arr){
        permutation(arr,0);
    }

    private static void permutation(char[] arr, int fix) {
        if(fix == arr.length-1){
            System.out.println(Stream.of(arr).map(String::valueOf).collect(Collectors.joining()));
            return;
        }
        for(int i=fix; i< arr.length;i++){
            swap(arr,i,fix);
            permutation(arr,fix+1);
            swap(arr,i,fix);
        }
    }
    private static  void  swap(char[] arr,int i,int fix){
        char ch = arr[i];
        arr[i] = arr[fix];
        arr[fix] = ch;
    }
}
