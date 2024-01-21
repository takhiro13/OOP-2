package Modules;

public class Employee extends Person {

    private String position;
    private double salary;

    public Employee(String name, String surname, String position, double salary) {
        super(name, surname);
        setPosition(position);
        setSalary(salary);
    }

    @Override
    public double getPaymentAmount() {
        return getSalary();
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}