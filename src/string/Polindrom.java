package string;

public class Polindrom {
    public static void main(String[] args) {
        System.out.println(isPolindrom("abcba"));
        System.out.println(isPolindrom("abcb"));
        System.out.println(isPolindrom("a"));

    }
    private static boolean isPolindrom(String str){
        int start = 0;
        int end = str.length()-1;
        while(start <= end){
            if (str.charAt(start) != str.charAt(end)) {
                return false;
            }
            start++;
            end--;
        }
        return true;
    }
}
