import java.util.Scanner;

public class Student {

    private String name;
    private int id;
    private double grade;

    public Student(String name, int id, double grade) {
        this.name = name;
        this.id = id;
        this.grade = grade;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public double getGrade() {
        return grade;
    }

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        String name;
        int id;
        double grade;
        
        // Prompt the user to enter student details
        System.out.println("Enter student name:");
        name = scanner.nextLine();
        
        System.out.println("Enter student ID:");
        id = scanner.nextInt();
        
        System.out.println("Enter student grade:");
        grade = scanner.nextDouble();
        
        // Create a new Student object with the entered details
        Student student = new Student(name, id, grade);
        
        // Print out the student details
        System.out.println("Student name: " + student.getName());
        System.out.println("Student ID: " + student.getId());
        System.out.println("Student grade: " + student.getGrade());
        
        scanner.close();
        
    }

}
