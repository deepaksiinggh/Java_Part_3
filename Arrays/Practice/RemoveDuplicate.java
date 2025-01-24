package Practice;

public class RemoveDuplicate {
    public static void main(String[] args) {
        int[] arr = { 4, 6, 7, 99, 3, 78, 90, 12, 34, 56, 87 };
        boolean noDupli = false;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    noDupli = true;
                    System.out.println(arr[i]);
                    break; // if duplicate found then stop the cheacking

                }
            }

        }

        if (!noDupli) {
            System.out.println(" no duplicate found");
        }
    }
}
