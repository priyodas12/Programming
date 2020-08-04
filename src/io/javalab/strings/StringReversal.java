package io.javalab.strings;

import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Collectors;

public class StringReversal {

    public static String reverseString(String myStr)
    {
        if (myStr.isEmpty()){
            return myStr;
        }
        return reverseString(myStr.substring(1)) + myStr.charAt(0);
    }
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        System.out.println("Enter any String::");
        String input=scn.nextLine().replaceAll("\\s","");

        String output=reverseString(input);
        System.out.println(output);
    }
}
