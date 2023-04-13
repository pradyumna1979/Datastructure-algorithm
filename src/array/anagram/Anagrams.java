package array.anagram;

import java.util.AbstractMap;
import java.util.Collections;

public class Anagrams {
    public static void main(String[] args) {
        String[] arr =  {"geeksquiz", "geeksforgeeks", "abcd","forgeeksgeeks", "zuiqkeegs"};
        anagram(arr);

    }

    private static void anagram(String[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {
                printAnagram(arr[i],arr[j]);
            }
        }
    }

    private static void printAnagram(String s, String s1) {
        if(s.length() != s1.length())
            return;
        int[] count = new int[256];
        for (int i = 0; i < s.length() && i < s1.length(); i++) {
            count[s.charAt(i)]++;
            count[s1.charAt(i)]--;
        }
        boolean isAnagram=true;
        for (int i = 0; i < 256; i++) {
            if (count[i] != 0) {
                isAnagram = false;
                break;
            }
        }
        if(isAnagram)
            System.out.println("[" + s + "," + s1 + "]");
    }
}
