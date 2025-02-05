package String.PawanSirClassQuestion.WithMethod;

import java.util.Scanner;

public class Polindriome {
    public static boolean isPalindrome(String str) {
        int left = 0;
        int right = str.length() - 1;
        while (left < right) {
            if (str.charAt(left) != str.charAt(right)) {
                return false;
            }

            left++;
            right--;
        }
        return true;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter String ");
        String str = sc.next();
        boolean isPolin = isPalindrome(str);
        if (isPolin) {
            System.out.println("it is polindrome");
        } else {
            System.out.println(" it is not polindrome");
        }

    }
}
