package String.PawanSirClassQuestion.WithoutMethod;

public class PrintLengthWithoutLength {
    public static void main(String[] args) {
        String s = "Java is easy";
        char[] ch = s.toCharArray();
        int count = 0;
        for (char _ : ch) {
            count++;
        }
        System.out.println("The length of the string is " + count);

    }
}
