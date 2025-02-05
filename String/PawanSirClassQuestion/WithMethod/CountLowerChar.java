package String.PawanSirClassQuestion.WithMethod;

import java.util.Scanner;

public class CountLowerChar {
    public static void countLowerChar(String s) {
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (Character.isLowerCase(ch)) {
                count++;
            }
        }
        System.out.println("The no of lower char is " + count);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the String with lower char ");
        String str = sc.next();
        countLowerChar(str);

    }
}
