package VarunSirQuestion;

import java.util.Scanner;

public class SearchElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean flag = false;
        System.out.println("Enter the size of array");
        int size = sc.nextInt();
        System.out.println("create the array the size of array is " + size);

        int[] arr = new int[size];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("Enter the Search Element ");
        int key = sc.nextInt();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == key) {
                System.out.println("Element found");
                flag = true;
                break;
            }
        }

        if (!flag) {
            System.out.println("Element  not found");
        }
    }
}
