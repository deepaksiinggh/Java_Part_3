package Projects.Student;

public class Student {
    private String name;
    private int age;
    private char gender;
    private long phoneNumber;
    private String email;
    private String branch;
    private double percentage;

    public Student(String name, int age, char gender, long phoneNumber, String email, double percentage,
            String branch) {
        setName(name);
        setAge(age);
        setGender(gender);
        setPhoneNumber(phoneNumber);
        setEmail(email);
        setPersentage(percentage);
        setBranch(branch);
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public void setPhoneNumber(long phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPersentage(double percentage) {
        this.percentage = percentage;
    }

    public void setBranch(String branch) {
        this.branch = branch;
    }

    public String getName() {
        return this.name;
    }

    public int getAge() {
        return this.age;
    }

    public char getGender() {
        return this.gender;
    }

    public long getPhoneNumber() {
        return this.phoneNumber;
    }

    public String getEmail() {
        return this.email;
    }

    public double getPersentage() {
        return this.percentage;
    }

    public String getBranch() {
        return this.branch;
    }

    @Override
    public String toString() {
        return " Name " + getName() + " Age : " + getAge() + " Gender " + getGender() + " PhoneNumber "
                + getPhoneNumber() + " Email " + getEmail() + " Percentage " + getPersentage() + " Branch "
                + getBranch();
    }
}
