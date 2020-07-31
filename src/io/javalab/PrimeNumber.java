package io.javalab;

import java.util.Scanner;
import java.util.stream.IntStream;

public class PrimeNumber {

    public static void checkAndPrintPrime(int i){

        int count=0;
        for(int j=i;j>0;j--){
            if(i%j==0){
                count=count+1;
            }
        }
        if(count==2){
            System.out.println(i);
        }

    }
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        System.out.println("Enter End Limit::");
        int endLimit=scn.nextInt();

        IntStream
                .range(2,endLimit)
                .forEach(k->checkAndPrintPrime(k));
    }
}
