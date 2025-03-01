package String.PawanSirClassQuestion.WithoutMethod;

//After counting word cheack weather count is even or odd
public class CountWordEvenOdd {
    public static void main(String[] args) {
        String s = "Deepak is good boy";
        s += " ";
        int count = 0;

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch == ' ') {
                count++;
            }

        }

        if (count % 2 == 0)
            System.out.println("The String word is even");
        else
            System.out.println("The String word is odd");
    }
}
