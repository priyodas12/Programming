package io.javalab.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

public class SumOfNumbers {
    public static void main(String[] args) {
        System.out.println(IntStream.range(0,10).sum());
        Integer [] c=new Integer []{1,2,5,9,6,8};

        List<Integer> integers = Arrays.asList(c);
        System.out.println(integers.stream()
                                    .reduce(0, (a, b) -> a + b));
    }
}
