package Collection.ArrayList.All_Methods;

import java.util.ArrayList;

public class CollectionInterfaceMethod {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(23);
        numbers.add(3);
        numbers.add(100);
        numbers.add(50);

        System.out.println("Numbers List: " + numbers);

        ArrayList<String> info = new ArrayList<>();
        // add() method is used to add values in ArrayList
        info.add("Deepak");
        info.add("B.tech");
        info.add("Rewa");
        info.add("Madhyapradesh");
        System.out.println("Info List: " + info);

        ArrayList<String> info2 = new ArrayList<>();
        // Another list with some elements
        info2.add("Deepak");
        info2.add("B.tech");

        // addAll() method is used to merge two ArrayLists
        ArrayList<Object> mergeArr = new ArrayList<>(numbers); // Use Object to handle different types
        mergeArr.addAll(info);
        System.out.println("Merged List: " + mergeArr);

        // remove() method is used to remove an element by index
        mergeArr.remove(1);
        System.out.println("After remove(1): " + mergeArr);

        // removeAll() method removes all occurrences of elements in the given
        // collection
        // mergeArr.removeAll(info);
        // System.out.println("After removeAll(info): " + mergeArr);

        // contains() method checks if a specific element exists in the list
        System.out.println("Contains 'Deepak'? " + mergeArr.contains("Deepak"));

        // containsAll() checks if all elements in info2 exist in mergeArr
        System.out.println("Contains all elements of info2? " + mergeArr.containsAll(info2));

        // retainAll() keeps only the elements that exist in another collection
        System.out.println("RetainAll result: " + mergeArr.retainAll(info2));
        System.out.println("After retainAll(info2): " + mergeArr);

        // clear() method is used to remove all elements from a collection making it
        // empty
        info2.clear();
        System.out.println(info2);

        // The isEmpty() method in Java is used to check whether a collection, map,
        // string, or other data structures are empty. It returns true if the object is
        // empty and false otherwise.
        System.out.println(info2.isEmpty());

        // toArray();

        // iterator();

    }
}
