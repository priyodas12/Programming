package io.javalab.hackerrank;

import java.util.Arrays;
import java.util.Scanner;

public class MakingAnagrams {

    // Complete the makingAnagrams function below.
    static int makingAnagrams(String s1, String s2) {

        int val=0;
        char [] ch1=s1.toCharArray();
        char [] ch2=s2.toCharArray();

        int [] counter1=new int[26];

        for(int i=0;i<ch1.length;i++){
            counter1[ch1[i]-97]++;
        }

        int [] counter2=new int[26];

        for(int i=0;i<ch2.length;i++){
            counter2[ch2[i]-97]++;
        }

        for(int i=0;i<counter1.length;i++){
            if(counter1[i]>counter2[i]){
                val+=(counter1[i]-counter2[i]);
            }
            if(counter2[i]>counter1[i]){
                val+=(counter2[i]-counter1[i]);
            }
        }

        return val;
    }

    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        System.out.println("enter first");
        String s1=scn.next();
        System.out.println("enter second");
        String s2=scn.next();

        System.out.println(makingAnagrams(s1,s2));
    }
}
