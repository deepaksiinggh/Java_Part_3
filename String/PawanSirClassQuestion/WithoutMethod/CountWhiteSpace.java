package String.PawanSirClassQuestion.WithoutMethod;

public class CountWhiteSpace {
    public static void main(String[] args) {
        String str = "Deepak is a good boy";
        int count = 0;
        for (int i = 0; i < str.length(); i++) {

            if (Character.isWhitespace(str.charAt(i))) {
                count++;
            }
        }

        System.out.println("In this string have " + count + " whiteSpaces");
    }
}
