package String.PawanSirClassQuestion.WithMethod;

import java.util.Scanner;

public class PrintOnlyDigits {

    public static void printOnlyDigits(String s) {

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (Character.isDigit(ch)) {
                System.out.print(ch + " ");
            }
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the String with Digits charecter");
        String str = sc.next();
        printOnlyDigits(str);

    }
}
