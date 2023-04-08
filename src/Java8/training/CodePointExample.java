package Java8.training;

import java.util.List;
import java.util.stream.Collectors;

public class CodePointExample {
    public static void main(String[] args) {
        String str = "abc";
        List<String> list = expand(str);
        System.out.println(list);
    }

    private static List<String> expand(String str) {
        return str.codePoints()
                .mapToObj(Character::toString)
                .collect(Collectors.toList());
    }
}
