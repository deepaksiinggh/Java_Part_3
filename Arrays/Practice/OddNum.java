package Practice;

public class OddNum {
    public static void main(String[] args) {
        int[] arr = { 5, 67, 8, 9, 34, 678, 90, 67, 45, 34, 23, 234, 556, 678 };
        System.out.print("The odd number is- ");
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 != 0) {
                System.out.print(arr[i] + " ");
            }
        }

    }
}
