package String.PawanSirClassQuestion.WithoutMethod;

public class AlternativWord {
    public static void main(String[] args) {
        String s = "Java is high lavel programming language";
        s += " ";
        String str = "";
        int count = 0;

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch != ' ') {
                str += ch;
            } else {
                count++;
                if (count % 2 != 0) {
                    System.out.println(str);

                }
                str = "";

            }

        }

    }
}
