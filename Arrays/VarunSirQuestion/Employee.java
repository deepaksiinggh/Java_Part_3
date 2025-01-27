package VarunSirQuestion;

import java.util.Arrays;
import java.util.Scanner;

public class Employee {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of emp");
        int empSize = sc.nextInt();

        EmployeeDriver[] employee = new EmployeeDriver[empSize];

        System.out.println("Enter the emp details in order");
        System.out.println("name,id age,designation,sal");

        for (int i = 0; i < employee.length; i++) {
            employee[i] = new EmployeeDriver(sc.next(), sc.nextInt(), sc.nextInt(), sc.next(), sc.nextInt());
        }

        System.out.println(Arrays.toString(employee));

        System.out.println("Employee id to fetch the datails");
        int empid = sc.nextInt();

        for (int i = 0; i < employee.length; i++) {
            if (empid == employee[i].id) {
                System.out.println(employee[i]);
            }
        }
    }
}
