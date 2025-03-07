package Collection.ArrayList.Logical_Questions;

import java.util.ArrayList;
import java.util.Scanner;

public class MergeTwoArrayList {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter frist Array Size");
        int fristSize = sc.nextInt();
        ArrayList<Integer> arr1 = new ArrayList<>();
        for (int i = 0; i < fristSize; i++) {
            arr1.add(sc.nextInt());
        }

        System.out.println("Enter second arrayList size");
        int secondSize = sc.nextInt();
        ArrayList<String> arr2 = new ArrayList<>();
        for (int i = 0; i < secondSize; i++) {
            arr2.add(sc.next());
        }

        ArrayList<Object> arr3 = new ArrayList<>();
        arr3.add(arr1);
        arr3.add(arr2);
        System.out.println(arr3);
    }
}
