package String.PawanSirClassQuestion.WithoutMethod;

public class Polindrome {
    public static void main(String[] args) {
        String str = "dam";
        String reverseStr = "";

        for (int i = str.length() - 1; i >= 0; i--) {
            reverseStr += str.charAt(i);
        }

        if (str.equalsIgnoreCase(reverseStr)) {
            System.out.println("it is Polindrome");
        } else {
            System.out.println("it is not Polindrome");
        }
    }

}
