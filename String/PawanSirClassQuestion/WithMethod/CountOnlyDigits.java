package String.PawanSirClassQuestion.WithMethod;

import java.util.Scanner;

public class CountOnlyDigits {

    public static void countOnlyDigits(String s) {
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (Character.isDigit(ch)) {
                count++;
            }
        }
        System.out.println("The no of digit is " + count);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the String with Digits ");
        String str = sc.next();
        countOnlyDigits(str);

    }
}
