package recursion.string.subSequence;

import java.util.ArrayList;
import java.util.List;

public class SubSequenceOfStringUsingList {
    public static void main(String[] args) {
        String up = "abc";//unprocess
        String p ="";//process
        List<String> list = subSequence(p,up);
        System.out.println(list);
    }

    private static List<String> subSequence(String p, String up) {
        if(up.isBlank()){
            List<String> list = new ArrayList<>();
            list.add(p);
            //System.out.println(p);
            return list;
        }
        char ch = up.charAt(0);
        List<String> left = subSequence(p+ch,up.substring(1));
        List<String> right = subSequence(p,up.substring(1));
        left.addAll(right);
        return left;
    }
}
