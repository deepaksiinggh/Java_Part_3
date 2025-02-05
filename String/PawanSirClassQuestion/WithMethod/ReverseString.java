package String.PawanSirClassQuestion.WithMethod;

import java.util.Scanner;

public class ReverseString {

    public static String reverseString(String str) {
        String reverseStr = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            reverseStr += str.charAt(i);
        }
        return reverseStr;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the String");
        String str = sc.next();
        String reverseStr = reverseString(str);
        System.out.println(reverseStr);

    }
}
