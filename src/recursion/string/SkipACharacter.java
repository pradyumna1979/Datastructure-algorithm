package recursion.string;

public class SkipACharacter {
    public static void main(String[] args) {
        String str = "baccdah";
        skip("",str);
    }

    private static void skip(String newStr, String str) {
        if(str.isBlank()){
            System.out.println(newStr);
            return;
        }
        char ch = str.charAt(0);
        if(ch == 'a'){
            skip(newStr+"",str.substring(1));
        }else{
            skip(newStr+ch,str.substring(1));
        }
    }
}
