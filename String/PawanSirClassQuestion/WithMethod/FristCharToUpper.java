package String.PawanSirClassQuestion.WithMethod;

import java.util.Scanner;

public class FristCharToUpper {
    public static void fristCharToLower(String str) {
        String s = str.substring(0, 1);
        String s2 = str.substring(1, str.length());
        String result = s.toUpperCase() + s2;
        System.out.println(result);

    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter String ");
        String str = sc.next();
        fristCharToLower(str);

    }
}
