package String.PawanSirClassQuestion.WithoutMethod;

public class CountLowerChar {
    public static void main(String[] args) {
        String s = "Deepak Singh";

        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (Character.isLowerCase(ch)) {
                count++;
            }
        }
        System.out.println("The lowercase count is " + count);
    }
}
