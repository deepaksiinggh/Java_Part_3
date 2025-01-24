package VarunSirQuestion;

import java.util.Arrays;
import java.util.Scanner;

public class UpdateElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(sc);
        System.out.println("Enter the size of array");
        int size = sc.nextInt();
        System.out.println("create the array the size of array is " + size);

        int[] arr = new int[size];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("before update the val");
        System.out.println(Arrays.toString(arr));

        System.out.println("Enter the replaceble Element : ");
        int replaceVal = sc.nextInt();
        for (int i = 0; i < arr.length; i++) {
            if (replaceVal == arr[i]) {
                System.out.println("Enter the replaceble value : ");
                int val = sc.nextInt();
                arr[i] = val;
            }
        }

        System.out.println("After update the val");
        System.out.println(Arrays.toString(arr));

    }
}
