package recursion.array;

public class SubSequence {
    public static void main(String[] args) {
        String str = "abc";
        findSubSequence(str," ");
    }

    private static void findSubSequence(String str, String ans) {
        if(str.length()==0){
            System.out.println(ans);
            return;
        }
        findSubSequence(str.substring(1),ans+str.charAt(0));
        findSubSequence(str.substring(1),ans);
    }
}
