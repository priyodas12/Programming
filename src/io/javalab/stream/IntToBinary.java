package io.javalab.stream;

import java.util.stream.IntStream;

public class IntToBinary {
    public static void main(String[] args) {
        IntStream.range(1,11)
                .mapToObj(num->Integer.toBinaryString(num))
                .forEach(System.out::println);
    }
}
