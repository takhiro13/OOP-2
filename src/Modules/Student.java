package Modules;

public class Student extends Person {

    private double gpa;

    public Student(String name, String surname, double gpa) {
        super(name, surname);
        setGpa(gpa);
    }

    @Override
    public double getPaymentAmount() {
        if (gpa > 2.67) {
            return 36660.00;
        }
        return 0;
    }

    @Override
    public String getPosition() {
        return "Student";
    }

    public double getGpa() {
        return gpa;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }
}