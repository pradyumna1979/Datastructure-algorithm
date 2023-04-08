package recursion.permutation;

public class Permutation1 {
    public static void main(String[] args) {
        String str = "abc";
        permutation("",str);
    }
    private static void permutation(String p, String up){
        if(up.isBlank()){
            System.out.println(p);
            return;
        }
        char ch = up.charAt(0);
        for (int i = 0; i <= p.length(); i++) {
            String f = p.substring(0,i);
            String s = p.substring(i,p.length());
            permutation(f+ch+s,up.substring(1));
        }
    }
}
