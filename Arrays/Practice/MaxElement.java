package Practice;

public class MaxElement {
    public static void main(String[] args) {
        int[] arr = { 5, 67, 8, 9, 34, 678, 90, 67788, 45, 34, 23, 234, 556, 678 };
        int max = arr[0];

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }

        System.out.println(max);
    }

}
