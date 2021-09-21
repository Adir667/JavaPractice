package nl.inholland;

public class Main {

    public static void main(String[] args) {
	// write your code here

        Teacher teacher = new Teacher("Teacher", "Teacher@inholland.nl", 2500);
        Student student = new Student("Student", "Student@inholland.nl", "2A");

        teacher.printDeails();
        student.printDeails();
    }
}
