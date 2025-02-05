package String.PawanSirClassQuestion.WithMethod;

import java.util.Scanner;

public class ConvertLowerToUpper {

    public static void convertUpper(String s) {
        String res = "";
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (Character.isLowerCase(ch)) {
                char chs = Character.toUpperCase(ch);
                res += chs;
            } else {
                res += ch;
            }
        }
        System.out.println(res);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the String with lower char ");
        String str = sc.next();
        convertUpper(str);
    }
}
