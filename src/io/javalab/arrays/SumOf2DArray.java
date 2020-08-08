package io.javalab.arrays;

import java.util.Arrays;

public class SumOf2DArray {
    public static void main(String[] args) {
        int [][] data = {
                { 1, 2, 3 },
                { 4, 5, 6 }
        };

        System.out.println(Arrays.stream(data).flatMapToInt(Arrays::stream).sum());
    }
}
