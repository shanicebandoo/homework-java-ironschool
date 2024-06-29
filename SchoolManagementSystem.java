import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SchoolManagementSystem {
    private String schoolName;
    private List<Teacher> teachers;
    private List<Course> courses;
    private List<Student> students;

    public SchoolManagementSystem() {
        this.teachers = new ArrayList<>();
        this.courses = new ArrayList<>();
        this.students = new ArrayList<>();
    }

    public void start() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter school name: ");
        schoolName = scanner.nextLine();

        System.out.print("Enter the number of teachers to create: ");
        int numTeachers = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < numTeachers; i++) {
            System.out.print("Enter teacher name: ");
            String teacherName = scanner.nextLine();
            System.out.print("Enter teacher salary: ");
            double teacherSalary = Double.parseDouble(scanner.nextLine());
            teachers.add(new Teacher(teacherName, teacherSalary));
        }

        System.out.print("Enter the number of courses to create: ");
        int numCourses = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < numCourses; i++) {
            System.out.print("Enter course name: ");
            String courseName = scanner.nextLine();
            System.out.print("Enter course price: ");
            double coursePrice = Double.parseDouble(scanner.nextLine());
            courses.add(new Course(courseName, coursePrice));
        }

        System.out.print("Enter the number of students to create: ");
        int numStudents = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < numStudents; i++) {
            System.out.print("Enter student name: ");
            String studentName = scanner.nextLine();
            System.out.print("Enter student address: ");
            String studentAddress = scanner.nextLine();
            System.out.print("Enter student email: ");
            String studentEmail = scanner.nextLine();
            students.add(new Student(studentName, studentAddress, studentEmail));
        }

        // Add commands to handle user interaction here

        scanner.close();
    }

    public static void main(String[] args) {
        SchoolManagementSystem sms = new SchoolManagementSystem();
        sms.start();
    }
}