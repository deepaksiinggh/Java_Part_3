package String.PawanSirClassQuestion.WithoutMethod;

public class CountWordLengthFromString {
    // Check how many words have more than two characters in the string
    public static void main(String[] args) {
        String s = "aa bbb cccc d eeeee ff";
        s += " ";
        String str = "";
        int count = 0;

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch != ' ') {
                str += ch;
            } else {
                if (str.length() > 2) {
                    count++;
                }
                str = "";
            }
        }

        System.out.println("The number of words with more than two characters in this string is: " + count);

    }
}
