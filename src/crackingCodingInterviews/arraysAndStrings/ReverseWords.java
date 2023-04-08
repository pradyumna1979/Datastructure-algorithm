package crackingCodingInterviews.arraysAndStrings;

import java.util.Stack;

public class ReverseWords {
    public static void main(String[] args) {
      String str = "The quick brown fox jumps over the lazy dog";
        reverseWords1(str);
        char []p = reverseWords2(str.toCharArray());
        System.out.println(p);
        reverseString3(str.split(" "));
    }

    private static void reverseWords1(String str) {
        Stack<String> stack = new Stack<>();
        String[] strArray = str.split(" ");
        for(String string : strArray){
            stack.push(string);
        }
        while(!stack.empty()){
            System.out.print(stack.pop() + " ");
        }
        System.out.println("/n");
    }
//Method 2
    private static char[] reverseWords2(char []s) {
        // Reversing individual words as
        // explained in the first step

        int start = 0;
        for (int end = 0; end < s.length; end++)
        {
            // If we see a space, we
            // reverse the previous
            // word (word between
            // the indexes start and end-1
            // i.e., s[start..end-1]
            if (s[end] == ' ')
            {
                reverse(s, start, end);
                start = end + 1;
            }
        }
        // Reverse the last word
        reverse(s, start, s.length - 1);

        // Reverse the entire String
        reverse(s, 0, s.length - 1);
        return s;
    }
    static void reverse(char str[],  int start, int end)
    {
        // Temporary variable
        // to store character
        char temp;

        while (start <= end)
        {
            // Swapping the first
            // and last character
            temp = str[start];
            str[start] = str[end];
            str[end] = temp;
            start++;
            end--;
        }
    }
//Method3
    public static void reverseString3(String[] s){
       // String str = "The quick brown fox jumps over the lazy dog";
        String ans = "";
        for (int i = s.length - 1; i >= 0; i--)
        {
            ans += s[i] + " ";
        }
        System.out.println("Reversed String:"+ans);
        System.out.println(ans.substring(0, ans.length() - 1));
    }
}
