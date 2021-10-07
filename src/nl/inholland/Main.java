package nl.inholland;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc= new Scanner(System.in);

        System.out.println( "Enter course name: ");
        String courseName = sc.nextLine();
        System.out.println( "Enter number of students: ");
        int nrOfStudents = sc.nextInt();

        Student [] students = new Student[nrOfStudents];

        for (int i = 0; i < nrOfStudents; i++) {
            students[i] = new Student();
            System.out.println("Enter name of student: ");
            students[i].Name = sc.next();
        }

        double sum = 0;
        double maxGrade = 0;
        Student bestStudent = new Student();

        for (int i = 0; i < nrOfStudents; i++) {
            System.out.println("Enter grade for " + students[i].Name +":");
            students[i].grade = sc.nextDouble();
            sum += students[i].grade;
            if (students[i].grade > maxGrade) {
                maxGrade = students[i].grade;
                bestStudent = students[i];
            }
        }
        System.out.format("Average grade: %.1f", (sum/nrOfStudents));

        System.out.println("\n" + "Student " +bestStudent.Name + " has max grade: " + bestStudent.grade);

        for (int i = 0; i < nrOfStudents; i++) {
            System.out.println("Grade for student " + students[i].Name + " for course (" + courseName + "): " + students[i].grade);

        }

    }
}
