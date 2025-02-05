package String.PawanSirClassQuestion.WithMethod;

import java.util.Scanner;

public class PrintlastChar {

    public static void lastChar(String str) {
        System.out.println(str.charAt(str.length() - 1));
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the String ");
        String str = sc.next();
        lastChar(str);

    }
}
