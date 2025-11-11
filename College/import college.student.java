import college.student.Student;
import college.faculty.Faculty;

public class Main {
    public static void main(String[] args) {
        Student student = new Student("Aarav", 101);
        Faculty faculty = new Faculty("Dr. Mehta", "Physics");

        student.displayDetails();
        System.out.println();
        faculty.displayDetails();
    }
}