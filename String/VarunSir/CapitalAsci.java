package String.VarunSir;

public class CapitalAsci {
    public static void main(String[] args) {
        String str = "AbCddfjfE";
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch >= 65 && ch <= 91) {
                System.out.println(ch);
                System.out.println("Capital latter of " + ch + " ASCI val is => " + (int) ch);
            }

        }
    }
}
