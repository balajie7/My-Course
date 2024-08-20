import java.util.Scanner;


public class DriverMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Create Person using default constructor
        Person defaultPerson = new Person();
        System.out.println("Default Person Info:");
        defaultPerson.displayInfo();

        // Create Person using parameterized constructor
        System.out.println("\nEnter details for a new Person:");
        System.out.print("Name: ");
        String name = scanner.nextLine();
        System.out.print("Age: ");
        int age = scanner.nextInt();

        Person customPerson = new Person(name, age);
        System.out.println("\nCustom Person Info:");
        customPerson.displayInfo();

        scanner.close();
 }

}
