package VarunSirQuestion;

public class EmployeeDriver {
    String name;
    int id;
    int age;
    String designation;
    double sal;

    public EmployeeDriver(String name, int id, int age, String designation, double sal) {
        this.name = name;
        this.id = id;
        this.age = age;
        this.designation = designation;
        this.sal = sal;
    }

    @Override
    public String toString() {
        return "name -" + name + " id - " + id + " age - " + age + " designation - " + designation + " sal - " + sal
                + "\n";
    }
}
