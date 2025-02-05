package String.PawanSirClassQuestion.WithoutMethod;

public class SumOfDigitInString {
    public static void main(String[] args) {
        String str = "Dee3p4a6k";
        String digit = "";

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (Character.isDigit(ch)) {
                digit += ch;
            }
        }

        int convertedDigit = Integer.parseInt(digit);
        int sum = 0;
        while (convertedDigit != 0) {
            int d = convertedDigit % 10;
            sum += d;
            convertedDigit /= 10;
        }
        System.out.println("the sum of digit is " + sum);
    }
}
