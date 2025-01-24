package Practice;

import java.util.Scanner;

public class InsertElement {
    @SuppressWarnings("resource")
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the array Element");

        int[] arr = new int[5];

        for (int i = 0; i < 5; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("The Array element is -");
        for (int i = 0; i < arr.length; i++) {

            System.out.print(arr[i] + " ");
        }
    }
}
