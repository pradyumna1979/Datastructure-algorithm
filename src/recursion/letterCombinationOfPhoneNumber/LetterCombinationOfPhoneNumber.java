package recursion.letterCombinationOfPhoneNumber;

import java.util.Scanner;

public class LetterCombinationOfPhoneNumber {
    static String[] keyBoard = {"","","ABC","DEF","GHI","JKL","MNO","PQRS","TUV","WXYZ"};

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String phoneNo=sc.next();
        letterCombination(phoneNo,"");
    }

    private static void letterCombination(String phoneNo, String res) {
        if (phoneNo.length() == 0) {
            System.out.print(res + "  ");
            return;
        }
        String key = keyBoard[phoneNo.charAt(0)-48];
        for (int i = 0; i < key.length(); i++) {
            letterCombination(phoneNo.substring(1),res+key.charAt(i));
        }
    }
}
