package String.PawanSirClassQuestion.WithoutMethod;

public class FristCharToLower {
    public static void main(String[] args) {
        String str = "Deepak";
        String s = str.substring(0, 1);
        String s2 = str.substring(1, str.length());
        String result = s.toLowerCase() + s2;
        System.out.println(result);

    }
}
