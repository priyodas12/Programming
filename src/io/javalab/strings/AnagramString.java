package io.javalab.strings;

import java.util.Arrays;
import java.util.Scanner;

public class AnagramString {

    private static boolean checkAnagram(String stringOne , String stringTwo){
        char[] first = stringOne.toLowerCase().toCharArray();
        char[] second = stringTwo.toLowerCase().toCharArray();
        // if length of strings is not same
        if (first.length != second.length)
            return false;
        int[] counts = new int[26];
        for (int i = 0; i < first.length; i++){
            counts[first[i]-97]++;
            counts[second[i]-97]--;
            System.out.println(Arrays.toString(counts));
        }
        for (int i = 0; i<26; i++)
            if (counts[i] != 0) {
                return false;
            }
        return true;
    }

    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        System.out.println("enter first");
        String inputStringOne=scn.next();
        System.out.println("enter second");
        String inputStringTwo=scn.next();

        System.out.println(checkAnagram(inputStringOne,inputStringTwo)?"both are anagram":"not at all anagram!");

    }
}
