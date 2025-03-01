package String.PawanSirClassQuestion.WithoutMethod;

public class WordEndWith_e {
    // Print the words which ends with 'e'
    public static void main(String[] args) {

        String s = "Java is case sensitive programming language";
        s += " ";
        String str = "";

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch != ' ') {
                str += ch;
            } else {
                if (str != "") {
                    if (str.charAt(str.length() - 1) == 'e') {
                        System.out.println(str);

                    }
                }
                str = "";

            }

        }

    }
}
