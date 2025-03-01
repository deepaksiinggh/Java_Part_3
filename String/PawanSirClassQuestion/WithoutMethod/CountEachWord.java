package String.PawanSirClassQuestion.WithoutMethod;

public class CountEachWord {
    // Count each and every word in a given string
    public static void main(String[] args) {
        String s = "Java is high lavel programming language";
        s += " ";
        int count = 0;

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch == ' ') {
                count++;
            }

        }

        System.out.println("The number of characters in this string is " + count);

    }
}
