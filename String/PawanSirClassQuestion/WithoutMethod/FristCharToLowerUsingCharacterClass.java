package String.PawanSirClassQuestion.WithoutMethod;

public class FristCharToLowerUsingCharacterClass {
    public static void main(String[] args) {
        String str = "Deepak";
        String result = "";
        char fristChar = str.charAt(0);
        if (Character.isUpperCase(fristChar)) {
            result = Character.toLowerCase(fristChar) + str.substring(1);
        } else {
            result = str;
        }
        System.out.println(result);

    }
}
