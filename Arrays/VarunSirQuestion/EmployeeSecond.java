package VarunSirQuestion;

import java.util.Arrays;
import java.util.Scanner;

public class EmployeeSecond {

    EmployeeDriver[] employee;

    Scanner sc = new Scanner(System.in);

    public void addEmployee() {
        System.out.println("Enter the size of emp");
        int empSize = sc.nextInt();

        this.employee = new EmployeeDriver[empSize];

        System.out.println("Enter the emp details in order");
        System.out.println("name,id age,designation,sal");

        for (int i = 0; i < employee.length; i++) {
            this.employee[i] = new EmployeeDriver(sc.next(), sc.nextInt(), sc.nextInt(), sc.next(), sc.nextInt());
        }
    }

    public void fetchEmployee() {
        if (this.employee == null) {
            System.out.println("plese enter the employee");
            addEmployee();
        } else {
            System.out.println(Arrays.toString(this.employee));
        }

    }

    public static void main(String[] args) {
        EmployeeSecond emp = new EmployeeSecond();
        emp.fetchEmployee();
        emp.addEmployee();

    }
}
