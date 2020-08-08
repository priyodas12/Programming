package io.javalab.strings;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
//Collections.frequency()
public class PrintDuplicateCharacters {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        System.out.println("Enter any String::");
        String input=scn.nextLine().replaceAll("\\s","");

        char[] chs=input.toCharArray();

        System.out.println(Arrays.toString(chs));
        //convert char to character array
        List<Character> list= Arrays.asList(input.chars()
                                                .mapToObj(c -> (char)c)
                                                .toArray(Character[]::new));

        list.stream()
                .filter(i->Collections.frequency(list,i)>1)
                .collect(Collectors.toSet())
                .forEach(System.out::println);

    }
}
