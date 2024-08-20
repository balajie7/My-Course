package Task5;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;


public class UpperCase {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a list of strings separated by spaces:");
        String input = scanner.nextLine();

        List<String> names = Arrays.asList(input.split("\\s+"));

        List<String> uppercaseNames = names.stream()
                .map(String::toUpperCase)
                .collect(Collectors.toList());
        System.out.println("Uppercase strings: " + uppercaseNames);
        scanner.close();
   }


}
