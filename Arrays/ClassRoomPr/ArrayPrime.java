package ClassRoomPr;

public class ArrayPrime {
    public static void main(String[] args) {
        int[] arr = { 5, 7, 8, 89, 56, 34, 45, 99 };

        for (int i = 0; i < arr.length; i++) {
            int val = arr[i];
            int count = 0;
            for (int j = 1; j <= val; j++) {
                if (val % j == 0) {
                    count++;
                }
            }
            if (count == 2) {
                System.out.println("prime number is " + val);
            }

        }

    }
}
