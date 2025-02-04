package Strings.Practice;

public class ReverseStr {
    public static void main(String[] args) {
        String s1 = "Deepak Singh";
        // StringBuilder s3 = new StringBuilder("Shilpi Singh");
        
        // System.out.println(s3.reverse());

        String s2 = "";
        for (int i = s1.length() - 1; i >= 0; i--) {
            s2 += s1.charAt(i);
        }
        System.out.println(s2);
    }

}
