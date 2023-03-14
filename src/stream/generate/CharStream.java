package stream.generate;

import java.util.regex.Pattern;
import java.util.stream.Stream;

public class CharStream {
    public CharStream() {
        String str = "Hello";
        str.chars().forEach(System.out::println);
        Pattern.compile(" ").splitAsStream("Hello World").forEach(System.out::print);
    }

    public static void main(String[] args) {
        new CharStream();
        Stream.iterate(0, n -> n + 2).limit(10).forEach(System.out::println);
    }
}
