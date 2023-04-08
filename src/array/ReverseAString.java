package array;

import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ReverseAString {
    public static void main(String[] args) {
        String str = "pradyumna";
        char[] arr = str.toCharArray();
        int l=0;
        int r = arr.length-1;
       /* reverse(arr,l,r);
        System.out.println(String.valueOf(arr));
        reverseRecursive(arr,l,r);
        System.out.println(String.valueOf(arr));*/
        reverseUsingJava8(str);
    }
    public static void reverse(char[] strArr,int l,int r){
        char temp;
        while(l < r){
             temp = strArr[l];
            strArr[l] = strArr[r];
             strArr[r] = temp;
            l++;
            r--;
        }

    }
    public static void reverseRecursive(char[] arr,int l,int r){
        char temp =0;
        if(l>=r) {
            return;
        }
            temp = arr[l];
            arr[l] = arr[r];
            arr[r] = temp;
       reverseRecursive(arr,l+1,r-1);

    }
    public static void reverseUsingJava8(String str){
       String reverse= Stream.of(str)
               .peek(System.out::println)
                .map(string->new StringBuffer(string).reverse())
               .collect(Collectors.joining(""));
        System.out.println(reverse);

    }

}

