package String.PawanSirClassQuestion.WithMethod;

import java.util.Scanner;

public class CountUpperAlphabates {
    public static void countUpperAlphabates(String s) {
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (Character.isUpperCase(ch)) {
                count++;
            }
        }
        System.out.println("The uppercase count is " + count);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the String with Uppercase Charecter ");
        String str = sc.next();
        countUpperAlphabates(str);

    }
}
