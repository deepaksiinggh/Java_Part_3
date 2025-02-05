package String.PawanSirClassQuestion.WithoutMethod;

public class PrintOnlyAlphabates {

    public static void main(String[] args) {
        String str = "Deepak34rt4h560d";

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (!Character.isDigit(ch)) {
                System.out.print(ch + " ");
            }
        }
    }

}
