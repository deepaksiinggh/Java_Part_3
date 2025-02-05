package String.PawanSirClassQuestion.WithMethod;

import java.util.Scanner;

public class PrintOnlySpecialChar {
    public static void printOnlySpecialChar(String s) {
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (!Character.isLetterOrDigit(ch)) {
                System.out.print(ch + " ");
            }
        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the String with special charecter");
        String str = sc.next();
        printOnlySpecialChar(str);
    }
}
