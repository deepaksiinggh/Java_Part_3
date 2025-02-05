package String.PawanSirClassQuestion.WithoutMethod;

public class ConvertUpperToLower {
    public static void main(String[] args) {
        String s = "Java";
        String res = "";
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (Character.isUpperCase(ch)) {
                char chs = Character.toLowerCase(ch);
                res += chs;
            } else {
                res += ch;
            }
        }
        System.out.println(res);
    }
}
