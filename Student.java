public class Student {

    // Attributes
    private int studentId;
    private String name;
    private int age;
    private double gpa;

    // Constructor
    public Student(int id, String name, int age, double gpa) {
        this.studentId = id;
        this.name = name;
        this.age = age;
        this.gpa = gpa;
    }

    // Getter methods
    public String getName() {
        return name;
    }

    public double getGpa() {
        return gpa;
    }

    // Display student information
    public void displayInfo() {
        System.out.println("ID: " + studentId);
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("GPA: " + gpa);
    }
}
