package Task5;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Students {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> students = new ArrayList<>();
        System.out.println("Enter the names of 10 students:");
        for (int i = 0; i < 10; i++) {
            System.out.print("Student " + (i + 1) + ": ");
            String name = scanner.nextLine();
            students.add(name);
        }
        List<String> specialStudents = students.stream()
                .filter(name -> name.startsWith("A"))
                .collect(Collectors.toList());
        System.out.println("Students who will receive special gifts:");
        for (String name : specialStudents) {
            System.out.println(name);
        }

        scanner.close();
 }

}
