package String.PawanSirClassQuestion.WithMethod;

import java.util.Scanner;

public class PrintFristChar {

    public static void fristChar(String str) {
        System.out.println(str.charAt(0));
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the String ");
        String str = sc.next();
        fristChar(str);

    }
}
