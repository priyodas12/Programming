package io.javalab.arrays;

import java.util.Arrays;

public class Counter {
    public static void main(String[] args) {
        int [] arr=new int [10];
        for(int i=0;i<10;i++){
            arr[i]++;
        }

        Arrays.stream(arr).forEach(System.out::println);
    }
}
