package String.PawanSirClassQuestion.WithoutMethod;

public class FirstCharOfWord {
    // Print each word frist charecter in a given string
    public static void main(String[] args) {
        String s = "Java is strongly type programming language";
        s += " ";
        String str = "";

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch != ' ') {
                str += ch;
            } else {
                if (str != "") {

                    System.out.println(str.charAt(0));

                }
                str = "";

            }

        }
    }

}
