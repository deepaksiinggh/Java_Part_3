package String.PawanSirClassQuestion.WithoutMethod;

public class LastCharOfWord {

    public static void main(String[] args) {
        String s = "Java is object oriented programming language";
        s += " ";
        String str = "";

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch != ' ') {
                str += ch;
            } else {
                if (str != "") {

                    System.out.println(str.charAt(str.length() - 1));

                }
                str = "";

            }

        }
    }

}
