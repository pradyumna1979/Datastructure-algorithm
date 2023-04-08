package recursion.balancedParanthesis;
import java.util.Scanner;
import java.util.stream.Stream;
/*
Write a function to generate all possible n pairs of balanced parentheses.

Examples:

Input: n=1
Output: {}
Explanation: This the only sequence of balanced
parenthesis formed using 1 pair of balanced parenthesis.

Input : n=2
Output:
{}{}
{{}}
Explanation: This the only two sequences of balanced
parenthesis formed using 2 pair of balanced parenthesis.

 */
public class PrintBalancedParanthesis {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number of parentheses");
        int n = scanner.nextInt();
        parentheses(n);
    }

    private static void parentheses(int n) {
        char[] arr = new char[n*2];
        int i = 0;
        int open=0;
        int close = 0;
        parentheses(arr,n,i,open,close);
    }

    private static void parentheses(char[] arr, int n, int i, int open, int close) {
        if(i== arr.length){
            Stream.of(arr).forEach(System.out::println);
            return;
        }
        if(open < n){
            arr[i]='(';
           parentheses(arr,n,i+1,open+1,close);
        }
        if(close < open){
            arr[i] = ')';
          parentheses(arr,n,i+1,open,close+1);
        }
    }
}
