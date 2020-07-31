package io.javalab;

import java.util.Scanner;
import java.util.stream.IntStream;

public class EvenNumber {

    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        System.out.println("Enter End Limit::");
        int endLimit=scn.nextInt();

        IntStream
                .range(0,endLimit)
                .forEach(k->
                        {
                            if(k%2==0){
                                System.out.println(k);
                            }
                        });
    }
}
