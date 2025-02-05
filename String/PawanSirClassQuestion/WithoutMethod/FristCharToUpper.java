package String.PawanSirClassQuestion.WithoutMethod;

public class FristCharToUpper {

    public static void main(String[] args) {
        String str = "deepak";
        String s = str.substring(0, 1);
        String s2 = str.substring(1, str.length());
        String result = s.toUpperCase() + s2;
        System.out.println(result);

    }

}
