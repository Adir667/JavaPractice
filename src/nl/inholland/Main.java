package nl.inholland;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class Main {

    Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        Main myProgram = new Main();
        myProgram.Login();
    }

    void Login () {
        List<User> users = getAllUsers();

        System.out.println( "Enter username: ");
        String username = sc.nextLine();
        System.out.println( "Enter password: ");
        String password = sc.nextLine();

        for (User u: users) {
            if (u.getUsername().equals(username) && u.getPassword().equals(password)) {
                if (u.getAccess() == Enums.Access.Basic) {
                    studentInterface();
                }
                else if (u.getAccess() == Enums.Access.Editor) {
                    teacherInterface();
                }
            }
        }
    }

    void studentInterface ()
    {
        System.out.println("S. Display Students \t | T. Display Teachers \t | X. Exit");
        System.out.println("Please, enter a choice: ");
        char cmd = sc.next().toLowerCase().charAt(0);

        if (cmd == 's') {
            int id = 1;
            System.out.println("Id \t FirstName \t LastName \t Birthdate \t Age \t Group");
            System.out.println("** \t ********* \t ******** \t ********* \t *** \t *****");

            for (User student: getAllUsers()) {
                if (student instanceof Student) {
                    System.out.println(id + " " + student);
                    id++;
                }
            }
        }

        if (cmd == 'x') {
            System.out.println("Leaving the program now...");
            System.exit(0);
        }
    }

    void teacherInterface ()
    {

    }

    void managerInterface ()
    {

    }

    public List<User> getAllUsers () {
        List<User> users = new ArrayList<>();
        Student studentEmma = new Student("emma", "emma12", "Emma", "Smith", new SimpleDateFormat("1997-12-4"), 23, "IT-02-A");
        users.add(studentEmma);
        Student studentJack = new Student("jack", "jack12", "Jack", "Brown", new SimpleDateFormat("1993-8-7"), 27, "IT-02-A");
        users.add(studentJack);
        Teacher teacherDavid = new Teacher("david", "david12");
        users.add(teacherDavid);
        return users;
    }
}
