package Practice;

public class ReverseStoreDiffArr {
    public static void main(String[] args) {
        int[] arr = { 2, 4, 6, 8, 9 };
        int[] reverseArr = new int[arr.length];
        int index = 0;

        for (int i = arr.length - 1; i >= 0; i--) {
            reverseArr[index] = arr[i];
            index++;
        }

        System.out.print("The Original array is - ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        System.out.print("the reverse array is - ");
        for (int i = 0; i < reverseArr.length; i++) {
            System.out.print(reverseArr[i] + " ");
        }
    }
}
