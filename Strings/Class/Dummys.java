package Strings.Class;

import java.util.Scanner;

public class Dummys {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string");
        String input1 = sc.nextLine();
        String fristChar = input1.substring(0, 1).toUpperCase();
        String remainingChar = input1.substring(1, input1.length()).toLowerCase();
        System.out.println(fristChar.concat(remainingChar));
        String s = "";

        for (int i = 0; i < input1.length(); i++) {
            if (i % 2 == 0) {
                s += input1.substring(i, i + 1).toUpperCase();
            } else {
                s += input1.substring(i, i + 1).toLowerCase();
            }
        }

        System.out.println(s);
    }
}
