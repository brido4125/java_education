package stream.generate;

import java.util.Arrays;
import java.util.stream.Stream;

public class ArrayStream{
    public ArrayStream() {
        String[] names = {"John", "Paul", "George", "Ringo"};
        Stream<String> stream = Arrays.stream(names);
        Stream<String> stringStream = Arrays.stream(names, 1, 3);

    }

    public static void main(String[] args) {

    }
}
