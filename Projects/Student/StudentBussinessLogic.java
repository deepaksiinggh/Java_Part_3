package Projects.Student;

import java.util.Arrays;
import java.util.Scanner;

public class StudentBussinessLogic implements StudentBussiness {
    Student[] students;
    Student[] newArr;
    Scanner sc = new Scanner(System.in);

    @Override
    public void addStudent() {
        System.out.println("Enter number of students to add : ");
        int size = sc.nextInt();

        System.out.println("Enter the student details ");
        this.students = new Student[size];

        for (int i = 0; i < students.length; i++) {
            System.out.println("Enter student Name");
            String name = sc.next();

            System.out.println("Enter student Age");
            int age = sc.nextInt();

            System.out.println("Enter student Gender");
            char gender = sc.next().charAt(0);

            System.out.println("Enter student Number");
            long phoneNumber = sc.nextLong();

            System.out.println("Enter Email");
            String email = sc.next();

            System.out.println("Enter Student degree in %");
            double percentage = sc.nextDouble();

            System.out.println("Enter Student Branch");
            String branch = sc.next();

            students[i] = new Student(name, age, gender, phoneNumber, email, percentage, branch);
        }

        System.out.println("Sucessfully Added " + size + " students");

    }

    @Override
    public void fetchAllStudents() throws AddStudentExeption {
        if (students == null) {
            throw new AddStudentExeption("Please add student frist");
        } else {
            System.out.println(Arrays.toString(students));
        }
    }

    @Override
    public Student fetchStudentByNumber(long PhoneNo) throws AddStudentExeption {
        if (students == null) {
            throw new AddStudentExeption("Please add student frist");
        } else {
            for (int i = 0; i < students.length; i++) {
                if (students[i].getPhoneNumber() == PhoneNo) {
                    return students[i];

                }

            }
        }

        return null;
    }

    @Override
    public Student fetchStudentByBranch(String branch) throws AddStudentExeption {
        if (students == null) {
            throw new AddStudentExeption("Please add student frist");
        } else {
            for (int i = 0; i < students.length; i++) {
                if (students[i].getBranch().equals(branch)) {
                    return students[i];
                }

            }
        }

        return null;
    }

    @Override
    public void updateStudentDetails() throws AddStudentExeption {
        if (students == null) {
            throw new AddStudentExeption("Please add student frist");
        } else {

            System.out.println("Enter phoneNumber to update");
            long phoneNo = sc.nextLong();
            for (int i = 0; i < students.length; i++) {
                if (students[i].getPhoneNumber() == phoneNo) {
                    System.out.println("Enter new phoneNumber");
                    long updatedNumber = sc.nextLong();

                    System.out.println("Enter new Email");
                    String updatedEmail = sc.next();

                    students[i].setPhoneNumber(updatedNumber);
                    students[i].setEmail(updatedEmail);

                    System.out.println("Sucessfully updated email and number");

                }

            }
        }
    }

    @Override
    public void deleteStudentIdById() throws AddStudentExeption {
        if (students == null) {
            throw new AddStudentExeption("Please add student frist");
        } else {

            System.out.println("Enter student phoneNumber to delete");
            long phoneNumber = sc.nextLong();
            int irr = 0;

            for (int i = 0; i < students.length; i++) {
                if (students[i].getPhoneNumber() != phoneNumber) {
                    newArr[irr++] = students[i];
                }

            }
        }
        System.out.println(Arrays.toString(newArr));
    }

}
