package ClassRoomPr;

import java.util.Arrays;

public class ReverseEven {
    public static void main(String[] args) {
        int[] arr = { 4, -78, 56, 34, 56, 12, 78, -58, -5, -8, -3, -6 };
        int start = 0;
        int end = arr.length - 1;
        int val = 0;

        while (start < end) {
            val = arr[start];
            arr[start] = arr[end];
            arr[end] = val;
            start++;
            end--;
        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 0 && arr[i] % 2 == 0) {

                System.out.print(arr[i] + " ");
            }
        }
    }
}
