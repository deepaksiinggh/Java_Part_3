package String.PawanSirClassQuestion.WithMethod;

public class SegrigateUpperAndLower {
    public static void main(String[] args) {
        String s = "JaVa Is EaSy";
        String Upper = "";
        String lower = "";
        String whiteSpace="";

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (Character.isUpperCase(ch)) {
                Upper += ch;
            } else if(Character.isWhitespace(ch)){
                
            }else {
                lower += ch;
            }
        }
        System.out.println(Upper);
        System.out.println(lower);
    }
}
