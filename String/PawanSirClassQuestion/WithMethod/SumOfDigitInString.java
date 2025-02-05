package String.PawanSirClassQuestion.WithMethod;

import java.util.Scanner;

public class SumOfDigitInString {
    public static void sumOfDigitInString(String str) {
        String digit = "";

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (Character.isDigit(ch)) {
                digit += ch;
            }
        }

        int convertedDigit = Integer.parseInt(digit);
        int sum = 0;
        while (convertedDigit != 0) {
            int d = convertedDigit % 10;
            sum += d;
            convertedDigit /= 10;
        }
        System.out.println("the sum of digit is " + sum);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the String with interger Number");
        String str = sc.next();
        sumOfDigitInString(str);
    }
}
