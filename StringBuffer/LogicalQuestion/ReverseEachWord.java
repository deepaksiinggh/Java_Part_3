package StringBuffer.LogicalQuestion;

public class ReverseEachWord {
    public static void main(String[] args) {
        String str = new String("Deepak is a good boy");
        String[] splitStr = str.split("\\s+");
        StringBuffer reverseWord = new StringBuffer();

        for (int i = 0; i < splitStr.length; i++) {
            String reverseStr = "";
            for (int j = splitStr[i].length() - 1; j >= 0; j--) {
                reverseStr += splitStr[i].charAt(j);
            }
            reverseWord.append(reverseStr).append(" ");
        }
        System.out.println(reverseWord);
    }
}
