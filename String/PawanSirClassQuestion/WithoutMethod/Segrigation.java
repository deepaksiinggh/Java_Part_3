package String.PawanSirClassQuestion.WithoutMethod;

public class Segrigation {
    public static void main(String[] args) {
        String s = "Java 12I3s E45a6s7y8";
        String digit = "";
        String alphabate = "";
        
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (Character.isDigit(ch)) {
                digit += ch;
            } else {
                alphabate += ch;
            }
        }
        String result = digit + alphabate;

        System.out.println(digit);
        System.out.println(alphabate);
        System.out.println(result);

    }
}
