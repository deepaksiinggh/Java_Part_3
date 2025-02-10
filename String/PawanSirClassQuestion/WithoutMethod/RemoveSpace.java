package String.PawanSirClassQuestion.WithoutMethod;

public class RemoveSpace {
    public static void main(String[] args) {
        String s = "Java is Easy";
        String result = " ";
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            if (!Character.isWhitespace(ch)) {
                result += ch;
            }
        }
        System.out.println(result); 
    }
}
