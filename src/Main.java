import Modules.Employee;
import Modules.Person;
import Modules.Student;

import java.util.Collections;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class Main {
    static void printData(Iterable<Person> people) {
        for (Person person : people) {
            System.out.println(person + " earns " + person.getPaymentAmount() + " tenge");
        }
    }

    public static void main(String[] args) {

        String name;
        String surname;
        String position;
        double salary;
        double gpa;

        Scanner scanner = new Scanner(System.in);
        ArrayList<Person> people = new ArrayList<Person>();

        System.out.println("1. Add a student");
        System.out.println("2. Add a employee");
        System.out.println("3. Print a data");
        System.out.println("0. Exit");
        System.out.print("Enter the number of the operation you want: ");

        boolean process = true;
        while (process) {
            String userInput = scanner.nextLine();

            switch (userInput) {
                case "1":
                    System.out.print("Enter the students name: ");
                    name = scanner.nextLine();
                    System.out.print("Enter the students surname: ");
                    surname = scanner.nextLine();
                    System.out.print("Enter the students gpa: ");
                    gpa = scanner.nextDouble();
                    people.add(new Student(name, surname, gpa));
                    System.out.println();
                    System.out.print("Enter the number of the operation you want: ");
                    break;
                case "2":
                    System.out.print("Enter the employees name: ");
                    name = scanner.nextLine();
                    System.out.print("Enter the employees surname: ");
                    surname = scanner.nextLine();
                    System.out.print("Enter the employees position: ");
                    position = scanner.nextLine();
                    System.out.print("Enter the employees salary: ");
                    salary = scanner.nextDouble();
                    people.add(new Employee(name, surname, position, salary));
                    System.out.println();
                    System.out.print("Enter the number of the operation you want: ");
                    break;
                case "3":
                    Collections.sort(people);
                    printData(people);
                    System.out.println();
                    System.out.print("Enter the number of the operation you want: ");
                    break;
                case "0":
                    process = false;
                    break;
            }
        }
    }
}
