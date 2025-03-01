package String.PawanSirClassQuestion.WithoutMethod;

public class WordsStartingWithJ {
    // Print the words which is Starting with 'j'

    public static void main(String[] args) {
        String s = "java was developed by james Gosling";
        s += " ";
        String str = "";

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch != ' ') {
                str += ch;
            } else {
                if (str != "") {
                    char firstChar = str.charAt(0);
                    if (firstChar == 'j') {
                        System.out.println(str);
                    }
                }
                str = "";

            }

        }

    }
}
