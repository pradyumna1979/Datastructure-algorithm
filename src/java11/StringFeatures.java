package java11;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;
import java.util.stream.Collectors;

public class StringFeatures {
    public static void main(String[] args) throws IOException {
        boolean isBlank = isBlank("");
        System.out.println(isBlank);//true
        System.out.println(isBlank("  "));//true
        System.out.println(isBlank("  a"));//false
        String str = "Geeks pradyumna\nFor\nGeeks";
        System.out.println(lines(str));//[Geeks pradyumna, For, Geeks]
        System.out.println(strip("  abc   "));//"abc"
        System.out.println(stripLeading("   Pradyumna"));//"Pradyumna"
        System.out.println(stripTrailing("   Pradyumna  "));//"   Pradyumna"
        Files.writeString(Path.of("example.txt"), "GeeksForGeeks!");

    }
    private static boolean isBlank(String str){
        return str.isBlank();
    }
    private static List<String> lines(String str){
        return str.lines().collect(Collectors.toList());
    }
    /*
    Returns a string whose value is this string, with all leading white space removed.
    If this String object represents an empty string, or if all code points in this string are white space, then an empty string is returned.
    Otherwise, returns a substring of this string beginning with the first code point that is not a white space up to and including the last code point of this string.
     */
    private static String strip(String str){

        return str.strip();
    }
    /*
    Returns a string whose value is this string, with all leading white space removed.
     */
    private static String stripLeading(String str){

        return str.stripLeading();
    }
    private static String stripTrailing(String str){

        return str.stripTrailing();
    }
    /*
    Returns a string whose value is the concatenation of this string repeated count times.
    If this string is empty or count is zero then the empty string is returned.
     */
    private static String repeat(String str){
       return  str.repeat(4);
    }

}
