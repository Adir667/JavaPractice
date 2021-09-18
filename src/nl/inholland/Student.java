package nl.inholland;

public class Student {
    String name;
    int age;


    public Student (String name, int age) {
        this.name = name;
        this.age = age;
    }

    void printInformation() {
        System.out.println("Name: "+this.name);
        System.out.println("Age: "+this.age);
        }

}
