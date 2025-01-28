package Projects.Student;

public class AddStudentExeption extends Exception {
    String message;

    public AddStudentExeption(String message) {
        super(message);
    }

}
