package Collection.ArrayList.All_Methods;

import java.util.Collections;
import java.util.Comparator;
import java.util.ArrayList;

public class CollectionClassMethod {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(23);
        numbers.add(3);
        numbers.add(100);
        numbers.add(50);

        System.out.println(numbers);

        // In Java, the sort() method is used to arrange elements in ascending (default)
        // or custom order
        Collections.sort(numbers);
        System.out.println(numbers);

        // sort in decending order
        Collections.sort(numbers, Comparator.reverseOrder());
        System.out.println(numbers);

        // The reverse() method in Java is used to reverse the order of elements in a
        // list

        Collections.reverse(numbers);
        System.out.println(numbers);

        Collections.shuffle(numbers);
        System.out.println(numbers);

        System.out.println(Collections.min(numbers));
        System.out.println(Collections.max(numbers));

    }
}
