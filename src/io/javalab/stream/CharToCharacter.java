package io.javalab.stream;

public class CharToCharacter {
    public static void main(String[] args) {
        //string to intStream to integer to char conversion.
        "abcdefghijklmnopqrstuvwxyz".chars().forEach(i-> System.out.println((char)i));

        //string to intStream to integer to char conversion.
        "abcdefghijklmnopqrstuvwxyz".chars().mapToObj(i->(char)i).forEach(i-> System.out.println(i));

        //string-->IntStream-->integer-->char-->character array
        "abcdefghijklmnopqrstuvwxyz".chars().mapToObj(i->(char)i).toArray(Character[]::new);
    }
}
