package String.VarunSir;


public class AsciVal {
    public static void main(String[] args) {
        String str = "AaDeEFf";
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            System.out.println("The asquie value of " + ch + " is => " + (int) ch);
        }
    }
}
