package Practice;

public class PrintElement {
    public static void main(String[] args) {
        int[] arr = { 23, 445, 67, 89, 90, 65, 34, 56, 76, 42, 95 };

        System.out.println(arr.length);
        System.out.println(arr[4]);
        System.out.print("The index of the arr is - ");
        System.out.print(arr.length - 1);

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
