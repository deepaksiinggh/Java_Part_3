package String.PawanSirClassQuestion.WithoutMethod;

public class PrintOnlyDigits {
    public static void main(String[] args) {
        String s = "Deepak856Si657ngh";

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (Character.isDigit(ch)) {
                System.out.print(ch + " ");
            }
        }

    }
}
