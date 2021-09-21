package nl.inholland;

public class Teacher extends Person{
    double salary;

    public Teacher(String fullName, String email, double salary) {
        super(fullName, email);
        this.salary = salary;
    }

    @Override
    void printDeails() {
        super.printDeails();
        System.out.println("Salary:" +this.salary);
    }
}
