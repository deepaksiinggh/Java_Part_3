package String.PawanSirClassQuestion.WithoutMethod;

public class FourLetterWordChecker {

    // Program to check and print words that have exactly 4 letters
    public static void main(String[] args) {
        String s = "Java is very is easy and it is Easy to understandable";
        s += " ";
        String res = "";

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            if (ch != ' ') {
                res += ch;
            } else {
                if (res.length() == 4) {
                    System.out.println(res);
                }
                res = "";
            }
        }
    }
}
