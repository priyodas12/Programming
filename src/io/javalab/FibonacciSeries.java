package io.javalab;

import java.util.Scanner;
import java.util.stream.IntStream;

public class FibonacciSeries {

    private static int  checkAndPrintFibonacci(int k) {
        if (k<=1){
            return k;
        }
        return checkAndPrintFibonacci(k-1)+checkAndPrintFibonacci(k-2);

    }
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        System.out.println("Enter End Limit::");
        int endLimit=scn.nextInt();

        IntStream
                .range(0,endLimit)
                .forEach(k->System.out.println(checkAndPrintFibonacci(k)));
    }


}
