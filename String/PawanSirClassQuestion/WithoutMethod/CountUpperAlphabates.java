package String.PawanSirClassQuestion.WithoutMethod;

public class CountUpperAlphabates {
    public static void main(String[] args) {
        String s = "Deepak Singh";

        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (Character.isUpperCase(ch)) {
                count++;
            }
        }
        System.out.println("The uppercase Alphabate count is " + count);
    }
}
