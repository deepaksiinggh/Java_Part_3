package Practice;


public class SecondLargest {
    public static void main(String[] args) {
        int[] arr = { 5, 67, 8, 9, 34, 678, 90, 67788, 732, 45, 34, 23, 234, 556, 678 };
        int largest = arr[1];
        int secondLargest = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > largest) {
                secondLargest = largest;
                largest = arr[i];
            } else if (arr[i] > secondLargest && arr[i] != largest) {
                secondLargest = arr[i];
            }
        }
        System.out.println("The largest element is " + largest);
        System.out.println("The second largest element is " + secondLargest);
    }
}
