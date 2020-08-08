package io.javalab.arrays;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class TwoDStringArray {
    public static void main(String[] args) {
        String [][] data = {
                { "abc", "bca", "def" },
                { "edf", "wsf", "jgk"}
        };
        //print 2D array:
        System.out.println(Arrays.deepToString(data));

        //
       List<String> str= Arrays.stream(data).flatMap(Arrays::stream).collect(Collectors.toList());

       str.forEach(System.out::println);
    }
}
