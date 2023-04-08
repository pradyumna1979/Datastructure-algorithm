package Java8;

import java.util.function.Consumer;

public class PlayWithConsumer {
    public static void main(String[] args) {
        Consumer<String> consumer = (String t) -> System.out.println(t);
        consumer.accept("hello");
    }
}
