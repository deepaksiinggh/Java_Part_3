package String.PawanSirClassQuestion.WithoutMethod;

public class FristTwoChar {
    // print frist 2 charecter in a given string 
    public static void main(String[] args) {
        String s = "Java is simple";
        s += " ";
        String str = "";

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch != ' ') {
                str += ch;
            } else {
                if (str != "") {

                    System.out.println(str.substring(0, 2));

                }
                str = "";

            }

        }
    }
}
