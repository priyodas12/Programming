package io.javalab.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

public class SumOfNumbers {
    public static void main(String[] args) {
        //from a random range
        System.out.println(IntStream.range(0,10).sum());

        //from a specific array
        Integer [] c=new Integer []{1,2,5,9,6,8};

        List<Integer> integers = Arrays.asList(c);

        //way1
        System.out.println(integers.stream()
                                    .reduce(0, (a, b) -> a + b));
        //way2
        System.out.println(integers.stream()
                .reduce(0,Integer::sum));

        //way3
        System.out.println(integers.stream()
                                    .mapToInt(Integer::intValue)
                                    .sum());


    }
}
