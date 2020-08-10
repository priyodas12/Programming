package io.javalab.hackerrank;

import java.util.HashMap;
import java.util.LinkedHashMap;

public class HackerRankInAString {

    static String hackerrankInString(String s) {

        String input = "hackerrank";

        LinkedHashMap<Character, Integer> hackerrank
                = new LinkedHashMap<Character, Integer>();

        char[] strArray = input.toCharArray();

        // checking each char of strArray
        for (char c : strArray) {
            if (hackerrank.containsKey(c)) {
                hackerrank.put(c, hackerrank.get(c) + 1);
            } else {
                hackerrank.put(c, 1);
            }
        }
        hackerrank.forEach((k,v)-> System.out.println(k+">"+v));

        LinkedHashMap<Character, Integer> compare
                = new LinkedHashMap<Character, Integer>();

       System.out.println("----------------------------");

        char[] strArray2 = s.toCharArray();

        // checking each char of strArray
        for (char c : strArray2) {
            if (compare.containsKey(c)) {
                compare.put(c, compare.get(c) + 1);
            } else {
                compare.put(c, 1);
            }
        }

        compare.forEach((k,v)-> System.out.println(k+">"+v));

        int j=0;
        for(char c:hackerrank.keySet()){
            if(compare.containsKey(c)){
                if(compare.get(c)>=hackerrank.get(c)){
                    j=j+1;
                    System.out.println("matched "+j);
                }
                else{
                    j=j-1;
                    System.out.println("not matched "+j);
                }
            }
        }
        if(j==hackerrank.size()){
            return "YES";
        }
        else
            return "NO";
    }

        public static void main (String[]args){

            System.out.println(hackerrankInString("rhbaasdndfsdskgbfefdbrsdfhuyatrjtcrtyytktjjt"));

    }
}
