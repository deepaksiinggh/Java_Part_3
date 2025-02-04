package Projects.Student;

public interface StudentBussiness {
    public void addStudent();

    public void fetchAllStudents() throws AddStudentExeption;

    public Student fetchStudentByNumber(long PhoneNo) throws AddStudentExeption;

    public Student fetchStudentByBranch(String branch) throws AddStudentExeption;

    public void updateStudentDetails() throws AddStudentExeption;

    public void deleteStudentIdById() throws AddStudentExeption;

}
