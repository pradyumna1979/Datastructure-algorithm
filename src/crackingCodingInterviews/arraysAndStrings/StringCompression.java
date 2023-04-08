package crackingCodingInterviews.arraysAndStrings;

public class StringCompression {
    public static void main(String[] args) {
        String compressedString = compressedString("aaabggggdddffeeeeec");
        System.out.println(compressedString);
    }
    public static String compressedString(String str){
        String compressedString = "";
        int consucativeCount = 0;
        for(int i = 0; i<str.length(); i++){
           consucativeCount++;
           if(i+1 >= str.length() || str.charAt(i) != str.charAt(i+1)){
               compressedString = compressedString + str.charAt(i) + consucativeCount;
               consucativeCount=0;
           }
        }
        return compressedString;
    }
}
