package String.PawanSirClassQuestion.WithMethod;

import java.util.Scanner;

public class FristCharToUpperUsingCharacterClass {
    public static void fristCharToUpperUsingCharacterClass(String str) {

        String result = "";
        char fristChar = str.charAt(0);
        if (Character.isLowerCase(fristChar)) {
            result = Character.toUpperCase(fristChar) + str.substring(1);
        } else {
            result = str;
        }
        System.out.println(result);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter String ");
        String str = sc.next();
        fristCharToUpperUsingCharacterClass(str);
    }
}
