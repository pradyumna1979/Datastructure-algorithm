package recursion.string.subSequence;

public class SubSequenceOfString {
    public static void main(String[] args) {
        String up = "abc";//unprocess
        String p ="";//process
        subSequence(p,up);
    }

    private static void subSequence(String p, String up) {
        if(up.isBlank()){
            System.out.println(p);
            return;
        }
        char ch = up.charAt(0);
        subSequence(p+ch,up.substring(1));
        subSequence(p,up.substring(1));
    }
}
