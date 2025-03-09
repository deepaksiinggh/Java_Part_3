package Collection.ArrayList.Project;

import java.util.ArrayList;
import java.util.Scanner;

public class EmployeeDriver {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Employee> arr1 = new ArrayList<>();
        arr1.add(new Employee("Deepak", 23, 155555555.5d));
        arr1.add(new Employee("Paul", 24, 345667.7d));
        arr1.add(new Employee("Pranav", 22, 345667.69d));

        System.out.println(arr1);

        // delete the Employee
        System.out.println("Enter the name whose want to delete : ");
        String userInput = sc.next();
        for (int i = 0; i < arr1.size(); i++) {
            if (arr1.get(i).name.equals(userInput)) {
                arr1.remove(i);
                break;
            }
        }
        System.out.println(arr1);
    }

}
