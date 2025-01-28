package Projects.Student;

public class StudentMainDriver {
    public static void main(String[] args) {
        StudentBussinessLogic std = new StudentBussinessLogic();
        boolean flag = true;
        while (flag) {
            System.out.println("Choose an option:");
            System.out.println("1 => Add students");
            System.out.println("2 => Get all student info");
            System.out.println("3 => Get student detail by number");
            System.out.println("4 => Get student detail by branch");
            System.out.println("5 => Update student details");
            System.out.println("6 => Delete student");
            System.out.println("7 => Exit ");

            int option = std.sc.nextInt();
            switch (option) {
                case 1:
                    std.addStudent();
                    break;
                case 2:
                    try {
                        std.fetchAllStudents();
                    } catch (AddStudentExeption e) {
                        System.out.println(e.getMessage());
                    }
                    break;
                case 3:
                    try {
                        System.out.println("Enter the phone number to find student: ");
                        long number = std.sc.nextLong();
                        Student student = std.fetchStudentByNumber(number);
                        if (student != null) {
                            System.out.println(student);
                        } else {
                            System.out.println("Student not found with the given phone number.");
                        }
                    } catch (AddStudentExeption e) {
                        System.out.println(e.getMessage());
                    }
                    break;
                case 4:
                    try {
                        System.out.println("Enter the branch to find student: ");
                        String branch = std.sc.next();
                        Student student = std.fetchStudentByBranch(branch);
                        if (student != null) {
                            System.out.println(student);
                        } else {
                            System.out.println("No student found in the given branch.");
                        }
                    } catch (AddStudentExeption e) {
                        System.out.println(e.getMessage());
                    }
                    break;
                case 5:
                    try {
                        std.updateStudentDetails();
                    } catch (AddStudentExeption e) {
                        System.out.println(e.getMessage());
                    }
                    break;
                case 6:
                    try {
                        std.deleteStudentIdById();
                    } catch (AddStudentExeption e) {
                        System.out.println(e.getMessage());
                    }

                    break;

                case 7:
                    flag = false;
                    System.out.println("Exiting program...");
                    break;
                default:
                    System.out.println("Please enter a valid option.");
            }
        }
    }

}
