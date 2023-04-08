package recursion.subSequence;

import java.util.Scanner;

public class SubSequence {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str=scanner.next();
        subsequence(str);
    }
    private static void subsequence(String str){
        subsequence(str,"");
    }

    private static void subsequence(String str, String s) {
        if(str.length()==0){
            System.out.println(s);
            return;
        }
        subsequence(str.substring(1),s+str.charAt(0));
        subsequence(str.substring(1),s);
    }
}
