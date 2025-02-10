package String.PawanSirClassQuestion.WithoutMethod;

public class PrintEachWord {
    public static void main(String[] args) {
        String s = "java is easy";
        s = s + " ";
        String res = "";
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (!Character.isWhitespace(ch)) {
                res += ch;
            } else {
                System.out.println(res);
                res = "";

            }
        }

    }
}
