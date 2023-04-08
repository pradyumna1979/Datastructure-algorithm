package crackingCodingInterviews.arraysAndStrings;

import java.util.Arrays;

public class OneIsPermutationOfOther {
    public static void main(String[] args) {
        System.out.println(isOnePermutationOfOther("bcd","cbd"));
        System.out.println(isOnePermutationOfOther("bcd","abd"));
        System.out.println(permution("bcd","cbde"));
    }
    //Method 1
    public static boolean isOnePermutationOfOther(String str1, String str2){
        if(str1==null || str2 == null)
        return false;
        if(str1.length() != str2.length())
            return false;
        char[] str1Array = str1.toCharArray();
        char[] str2Array = str2.toCharArray();
        Arrays.sort(str1Array);
        Arrays.sort(str2Array);
        for(int i=0; i< str1.length(); i++){
            if(str1Array[i] != str2Array[i])
                return false;
        }
           return true;
    }
    // method2
    public static boolean permution(String str1, String str2){
        if(str1.length() != str2.length()){
            return false;
        }
        int[] letters = new int[128];
        char[] charArray = str1.toCharArray();
        for(char c : charArray){
            letters[c] ++;
        }
        for(int i=0; i < str2.length(); i++){
            int c =(int) str2.charAt(i);
            letters[c]--;
            if(letters[c] < 0){
                return false;
            }
        }
        return true;
    }
}
