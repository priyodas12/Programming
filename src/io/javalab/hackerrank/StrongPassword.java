package io.javalab.hackerrank;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StrongPassword {
    public static int minimumNumber(int n, String password) {

        Pattern pattern= Pattern.compile("^(?=.*[a-zA-Z])(?=.*[0-9])(?=.*[^a-zA-Z0-9\\\\s]).{6,}");
        Matcher matcher=pattern.matcher(password);
        if(matcher.matches()){
            return 0;
        }
        return 1;
    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter size of string::");
        int n = scanner.nextInt();
        System.out.println("enter string::");
        String password = scanner.nextLine();

        int answer = minimumNumber(n, password);
        System.out.println(answer);

    }


}
