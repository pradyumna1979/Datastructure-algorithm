package recursion.letterCombinationOfPhoneNumber;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
/*
Given a string containing digits from 2-9 inclusive,
return all possible letter combinations that the number could represent. Return the answer in any order.
Input: digits = "23"
Output: ["ad","ae","af","bd","be","bf","cd","ce","cf"]
Input: digits = "2"
Output: ["a","b","c"]
 */
public class LetterCombinationOfPhoneNumberArray {
    static String[] keyBoard = {"","","ABC","DEF","GHI","JKL","MNO","PQRS","TUV","WXYZ"};

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String phoneNo=sc.next();
        List<String> list = letterCombination(phoneNo);
        System.out.println(list);
    }

    private static List<String> letterCombination(String phoneNo) {
        return letterCombination(phoneNo,"",new ArrayList<String>());
    }

    private static List<String> letterCombination(String phoneNo, String res, List<String> result) {
        if (phoneNo.length() == 0) {
            result.add(res);
            return result;
        }
        String key = keyBoard[phoneNo.charAt(0)-48];
        for (int i = 0; i < key.length(); i++) {
            letterCombination(phoneNo.substring(1),res+key.charAt(i),result);
        }
        return result;
    }
}
