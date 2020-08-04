package io.javalab.stream;

import java.util.Arrays;
import java.util.stream.IntStream;

public class IntToInteger {
    public static void main(String[] args) {
        Integer[] integer=IntStream.range(0,11).mapToObj(i->i).toArray(Integer[]::new);

        System.out.println(Arrays.toString(integer));
    }
}
