package io.javalab.strings;

import java.util.Scanner;

public class FindVawel {

    public static boolean checkVawel(Character c){
        if(c.equals('a')|c.equals('e')|c.equals('i')|c.equals('o')|c.equals('u'))
            return true;
        return false;
    }
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        System.out.println("enter first");
        String inputString=scn.next();

        inputString.chars().mapToObj(i->(char)i).forEach(i-> System.out.print(checkVawel(i)?i:""));
    }
}
