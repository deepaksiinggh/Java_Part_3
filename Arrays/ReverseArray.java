
public class ReverseArray {

    public static void main(String[] args) {
        int[] arr = { 5, 67, 8, 9, 34, 678, 90, 67788, 45, 2, 34, 23, 234, 556, 678 };

        for (int i = arr.length - 1; i >= 0; i--) {
            System.out.print(arr[i] + " ");
        }

    }

}
