package String.PawanSirClassQuestion.WithoutMethod;

public class CountOnlyDigits {
    public static void main(String[] args) {
        String s = "j1a2y3a4";

        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (Character.isDigit(ch)) {
                count++;
            }
        }
        System.out.println("The no of digit is " + count);
    }
}
