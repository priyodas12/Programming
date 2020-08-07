package io.javalab;

import java.util.Scanner;
import java.util.stream.IntStream;

public class ArmstrongNumber {
    public static int printArmStrong(int i){
        int sum=0;
        while(i!=0){
            int rest=i%10;
            sum=sum+(rest*rest*rest);
            i=i/10;
        }
        return sum;
    }
    public static void main(String[] args) {

        Scanner scn=new Scanner(System.in);
        System.out.println("Enter End Limit::");
        int endLimit=scn.nextInt();

        IntStream.range(0,endLimit).forEach(i-> System.out.println(printArmStrong(i)==i?i:0));

    }
}
