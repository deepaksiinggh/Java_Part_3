package String.PawanSirClassQuestion.WithoutMethod;

public class FristCharUpper {
    // convert each word frist charecter into uppercase
    public static void main(String[] args) {
        String s = "java is high level programming language";
        s += " ";
        String str = "";
        String result = "";

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch != ' ') {
                str += ch;
            } else {
                if (str.length() > 0) {
                    result += (Character.toUpperCase(str.charAt(0)))
                            + (str.substring(1)) + (" ");
                }
                str = "";
            }
        }

        System.out.println(result.toString().trim()); // Trim to remove extra space at the end
    }
}
