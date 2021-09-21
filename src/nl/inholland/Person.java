package nl.inholland;

public abstract class Person {

    protected String fullName;
    protected String email;

    public Person(String fullName, String email) {
        this.fullName = fullName;
        this.email = email;
    }

    void printDeails() {
        System.out.println("Name: "+ this.fullName);
        System.out.println("Email: "+ this.email);
    }
}
