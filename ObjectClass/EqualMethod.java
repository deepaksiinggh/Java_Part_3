package ObjectClass;

public class EqualMethod {

    String movieName;
    double time;
    char grade;

    public EqualMethod(String movieName, double time, char grade) {
        this.movieName = movieName;
        this.time = time;
        this.grade = grade;
    }

    public String toString() {
        return "The Movie name is " + this.movieName + " And the Duration of movie is " + this.time
                + " And the grade of movie is " + this.grade;
    }

    @Override
    public boolean equals(Object obj) {
        EqualMethod e = (EqualMethod) obj;
        return this.movieName == e.movieName && this.time == e.time && this.grade == e.grade;
    }

    public static void main(String[] args) {
        Object e1 = new EqualMethod("Avatar", 3.3, 'A');
        Object e2 = new EqualMethod("Avatar", 3.3, 'A');
        System.out.println(e1);
        System.out.println(e2);
        System.out.println(e1.equals(e2));

    }
}
