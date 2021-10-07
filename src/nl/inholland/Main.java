package nl.inholland;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here

        Scanner sc = new Scanner(System.in);

        System.out.println( "Please enter the size of your group and press [ENTER]: ");
        int nrOfStudents = sc.nextInt();
        System.out.println("group size: " + nrOfStudents);
        Student [] group = new Student[nrOfStudents];

        for (int i = 0; i <nrOfStudents ; i++) {
            group[i] = new Student();
            System.out.println("Please enter the name of student #" +(i+1)+ " and press [ENTER]:");
            group[i].setName(sc.next());
        }

        for (int i = 0; i <nrOfStudents ; i++) {
            System.out.println("Student #" + (i+1) + ": " + group[i].getName());
        }

        for (int i = 0; i <nrOfStudents ; i++) {
            System.out.println("Is student #" +(i+1) + "(" + group[i].getName() + ") present? [Y/N + ENTER]:");
            char p = sc.next().charAt(0);
            if (p == 'y') {
                group[i].setPresence(true);
            }
        }

        for (int i = 0; i <nrOfStudents ; i++) {
            System.out.println("Student #" + (i+1) + ": (" +group[i].getName() + ") | Present: " + group[i].isPresence());
        }
    }
}
