package ObjectClass;

import java.util.Objects;

public class HashCodeMethod {
    String name;
    int age;

    HashCodeMethod(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.age, this.name);
    }

    public static void main(String[] args) {
        HashCodeMethod s1 = new HashCodeMethod("Deepak", 24);
        HashCodeMethod s2 = new HashCodeMethod("Deepak", 24);

        System.out.println(s1.hashCode());
        System.out.println(s2.hashCode());

    }

}
