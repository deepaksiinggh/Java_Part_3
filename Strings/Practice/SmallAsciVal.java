package Strings.Practice;

public class SmallAsciVal {
    public static void main(String[] args) {
        String str = "aBcdDEFfri";
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if (ch >= 97 && ch <= 122) {
                System.out.println(ch+"");
            }
        }
    }
}
