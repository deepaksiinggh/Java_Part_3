package Collection.ArrayList.Project;

public class Employee {
    String name;
    int age;
    double sal;

    public Employee(String name, int age, double sal) {
        this.name = name;
        this.age = age;
        this.sal = sal;
    }

    public String toString() {
        return "Name: " + this.name + " age " + this.age + " Salary " + this.sal;
    }
}
