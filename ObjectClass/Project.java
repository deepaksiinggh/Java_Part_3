package ObjectClass;

// Project using toString And Equal methods;

public class Project {

    String name;
    String color;
    double weight;
    double price;

    public Project(String name, String color, double weight, double price) {
        this.name = name;
        this.color = color;
        this.weight = weight;
        this.price = price;

    }

    @Override
    public String toString() {
        return "The fruit name is " + this.name + " and fruit color is " + this.color + " and weight is  " + this.weight
                + " and price is " + this.price;
    }

    @Override

    public boolean equals(Object obj) {
        Project p = (Project) obj;

        return this.name == p.name && this.color == p.color && this.weight == p.weight && this.price == p.price;
    }

    public static void main(String[] args) {
        Project p1 = new Project("Apple", "red", 10.3, 345);
        Project p2 = new Project("Banana", "Yellow", 10.3, 345);
        Project p3 = new Project("Grapes", "Green", 10.3, 345);
        Project p4 = new Project("Grapes", "Green", 10.3, 345);

        System.out.println(p1);
        System.out.println(p2);
        System.out.println(p3);

        System.out.println(p1.equals(p2));
        System.out.println(p2.equals(p3));
        System.out.println(p3.equals(p1));
        System.out.println(p3.equals(p4));

    }

}
