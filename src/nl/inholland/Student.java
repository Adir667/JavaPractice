package nl.inholland;

public class Student extends Person {
    String group;

    public Student (String fullName, String email, String group) {
        super(fullName, email);
        this.group = group;
    }

    @Override
    void printDeails() {
        super.printDeails();
        System.out.println("Group:" +this.group);
    }
}
