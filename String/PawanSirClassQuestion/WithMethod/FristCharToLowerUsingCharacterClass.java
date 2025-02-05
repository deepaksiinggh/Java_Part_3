package String.PawanSirClassQuestion.WithMethod;

import java.util.Scanner;

public class FristCharToLowerUsingCharacterClass {

    public static void fristCharToLowerUsingCharacterClass(String str) {

        String result = "";
        char fristChar = str.charAt(0);
        if (Character.isUpperCase(fristChar)) {
            result = Character.toLowerCase(fristChar) + str.substring(1);
        } else {
            result = str;
        }
        System.out.println(result);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter String ");
        String str = sc.next();
        fristCharToLowerUsingCharacterClass(str);
    }
}
