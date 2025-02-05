package String.PawanSirClassQuestion.WithoutMethod;

public class PrintOnlySpecialChar {
    public static void main(String[] args) {
        String s = "j1@2y3&a4";

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (!Character.isLetterOrDigit(ch)) {
                System.out.print(ch + " ");
            }
        }

    }
}
