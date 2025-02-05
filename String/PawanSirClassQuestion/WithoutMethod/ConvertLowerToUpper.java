package String.PawanSirClassQuestion.WithoutMethod;

public class ConvertLowerToUpper {
    public static void main(String[] args) {
        String s = "Java";
        String res = "";
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (Character.isLowerCase(ch)) {
                char chs = Character.toUpperCase(ch);
                res += chs;
            } else {
                res += ch;
            }
        }
        System.out.println(res);
    }
}
