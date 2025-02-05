package String.PawanSirClassQuestion.WithMethod;

import java.util.Scanner;

public class ConvertUpperToLower {
    public static void convertLower(String s) {
        String res = "";
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (Character.isUpperCase(ch)) {
                char chs = Character.toLowerCase(ch);
                res += chs;
            } else {
                res += ch;
            }
        }
        System.out.println(res);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the String with Upper char ");
        String str = sc.next();
        convertLower(str);
    }
}
