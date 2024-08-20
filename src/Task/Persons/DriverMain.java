package Task.Persons;

import java.util.Scanner;


public class DriverMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Create Task.Person.Person using default constructor
        Person defaultPerson = new Person();
        System.out.println("Default Task.Person.Person Info:");
        defaultPerson.displayInfo();

        // Create Task.Person.Person using parameterized constructor
        System.out.println("\nEnter details for a new Task.Person.Person:");
        System.out.print("Name: ");
        String name = scanner.nextLine();
        System.out.print("Age: ");
        int age = scanner.nextInt();

        Person customPerson = new Person(name, age);
        System.out.println("\nCustom Task.Person.Person Info:");
        customPerson.displayInfo();

        scanner.close();
 }

}
