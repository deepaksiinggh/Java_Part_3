package ClassRoomPr;

import java.util.Arrays;

public class Prc {
    public static void main(String[] args) {
        int[] arr = { 4, -78, 56, 34, 56, 12, 78, -58, -5, -8, -3, -6 };

        int start = 0;
        int end = arr.length - 1;
        int temp = 0;

        while (start < end) {
            temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;

        }

        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] < 0 && arr[i] % 2 == 0) {
                System.out.println(arr[i]);
            }
        }
    }
}
