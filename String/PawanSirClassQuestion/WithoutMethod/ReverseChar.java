package String.PawanSirClassQuestion.WithoutMethod;

public class ReverseChar {
    public static void main(String[] args) {
        String s = "JaVa Is EasY";

        String result = "";

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (Character.isUpperCase(ch)) {

                result += Character.toLowerCase(ch);
            } else {
                result += Character.toUpperCase(ch);

            }
        }
        System.out.println(result);
    }
}
