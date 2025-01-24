package Practice;

public class FindValLinear {
    public static int findVal(int[] arr, int target) {
        int find = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                find = i;
                System.out.println("Target matched at index number " + find + " and the value is " + arr[i]);
                break;
            }
        }
        return find;
    }

    public static void main(String[] args) {
        int[] arr = { 3, 67, 899, 456, 789, 445 };
        int target = 456;
        findVal(arr, target);

    }
}
