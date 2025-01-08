package ObjectClass;

public class ToString {

    String movieName;
    double time;
    char grade;

    public ToString(String movieName, double time, char grade) {
        this.movieName = movieName;
        this.time = time;
        this.grade = grade;
    }

    @Override

    public String toString() {
        return "Movie name is " + this.movieName + " time is " + this.time + " Grade is " + this.grade;
    }

    public static void main(String[] args) {
        ToString t = new ToString("Avatar", 3.3, 'A');
        System.out.println(t);

    }

}
