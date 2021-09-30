package nl.inholland;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        System.out.println( "Enter name: ");
        Scanner sc= new Scanner(System.in);
        String name = sc.nextLine();
        System.out.println( "Enter age: ");
        int age = sc.nextInt();

        System.out.println("Name: " + name + ", Age: " + age);
    }
}
