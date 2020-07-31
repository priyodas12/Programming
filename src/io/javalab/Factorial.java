package io.javalab;

import java.util.Scanner;
import java.util.stream.IntStream;

public class Factorial {

    public static int printFactorialValue(int i){
        if(i<=0){
            return 1;
        }
        return i*printFactorialValue(i-1);
    }
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        System.out.println("Enter End Number::");
        int num=scn.nextInt();

        System.out.println(printFactorialValue(num));
    }
}
