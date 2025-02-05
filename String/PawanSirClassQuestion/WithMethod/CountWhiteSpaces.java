package String.PawanSirClassQuestion.WithMethod;

import java.util.Scanner;

public class CountWhiteSpaces {
    public static void countWhiteSpace(String str) {
        int count = 0;
        for (int i = 0; i < str.length(); i++) {

            if (Character.isWhitespace(str.charAt(i))) {
                count++;
            }
        }

        System.out.println("In this string have " + count + " whiteSpaces");
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter String ");
        String str = sc.nextLine();
        countWhiteSpace(str);
    }
}
