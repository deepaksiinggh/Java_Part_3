package VarunSirQuestion;

import java.util.Arrays;
import java.util.Scanner;

public class RemoveDuplicate {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the size of array");
        int size = sc.nextInt();
        System.out.println("Create a " + size + " element of array");
        int[] arr = new int[size];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println(" before " + Arrays.toString(arr));

        int getCount = 0;
        System.out.println("enter the element to remove");
        int removeItem = sc.nextInt();

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == removeItem) {
                getCount++;
            }
        }
        int update = 0;
        int newArr[] = new int[size - getCount];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != removeItem) {
                newArr[update] = arr[i];
                update++;
            }
        }
        System.out.println(Arrays.toString(newArr));
        sc.close();
        ;
    }
}
