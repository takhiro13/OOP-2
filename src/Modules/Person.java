package Modules;

public abstract class Person implements Payable, Comparable<Person> {

    private static int ID = 1;
    private final int id;
    private String name;
    private String surname;

    public Person(String name, String surname) {
        this.id = ID++;
        setName(name);
        setSurname(surname);
    }

    @Override
    public int compareTo(Person o) {
        return Double.compare(this.getPaymentAmount(), o.getPaymentAmount());
    }

    public abstract String getPosition();

    public String toString() {
        return getPosition() + ": " + id + ". " + name + " " + surname;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }
}