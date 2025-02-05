package String.PawanSirClassQuestion.WithMethod;

import java.util.Scanner;

public class PrintOnlyAlphabates {
     public static String printOnlyAlphabates(String str) {
        String Alphabate = "";
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if (!Character.isDigit(ch)) {
                Alphabate += ch;
            }

        }
        return Alphabate;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter String  with numbers");
        String str = sc.next();
        String onlyAlphabates = printOnlyAlphabates(str);
        System.out.println("Only alphabates is - " + onlyAlphabates);

    }
}
