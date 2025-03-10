public class Person {
    String hoobie1;
    String hobbie2;

    @Override
    public String toString() {
        return "Person [hoobie1=" + hoobie1 + ", hobbie2=" + hobbie2 + "]";
    }

    public Person(String hobbie1, String hobbie2) {
        this.hoobie1 = hobbie1;
        this.hobbie2 = hobbie2;
    }

    
}
