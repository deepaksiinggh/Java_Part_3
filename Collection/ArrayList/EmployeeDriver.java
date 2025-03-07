package Collection.ArrayList;

import java.util.ArrayList;

public class EmployeeDriver {
    public static void main(String[] args) {
        ArrayList<Employee> arr1 = new ArrayList<>();
        arr1.add(new Employee("Deepak", 23, 155555555.5d));
        arr1.add(new Employee("Paul", 24, 345667.7d));
        arr1.add(new Employee("Pranav", 22, 345667.69d));

        System.out.println(arr1);
    }

}
