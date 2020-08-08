package io.javalab.stream;

import java.util.Arrays;
import java.util.stream.IntStream;

public class IntToInteger {
    public static void main(String[] args) {
        //from a random sequential range
        Integer[] integer=IntStream.range(0,11)
                                   .mapToObj(i->i)
                                   .toArray(Integer[]::new);

        //from a pre defined arr
        int [] a={2,4,6,8,10};

        Integer [] a1=Arrays.stream(a)
                            .mapToObj(i->i)
                            .toArray(Integer[]::new);

        System.out.println(Arrays.toString(integer));
    }
}
