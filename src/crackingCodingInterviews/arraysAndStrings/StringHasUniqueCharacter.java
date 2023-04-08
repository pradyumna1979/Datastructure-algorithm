package crackingCodingInterviews.arraysAndStrings;

public class StringHasUniqueCharacter {
    public static void main(String[] args) {
        String str = "PRADYUMNA";
        boolean isUnique = stringHasUniqueCharacter(str);
        System.out.println(isUnique );
    }
    public static boolean isDuplicateChar(String str){
        for(int i=0; i<str.length(); i++){
            for(int j= i+1 ; j< str.length() ; j++) {
                if (str.charAt(i) == str.charAt(j))
                    return true;
            }
        }
        return false;
    }
    //Method 2
    public static boolean stringHasUniqueCharacter(String str){
        if(str.length()>128) return false;
        boolean[] charSet = new boolean[128];
        for (int i = 0; i< str.length(); i++ ){
            int val = str.charAt(i);
            if(charSet[val]) {
                return false;
            }
            charSet[val] = true;
        }
        return false;
    }
}
