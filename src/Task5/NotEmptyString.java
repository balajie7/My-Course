package Task5;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class NotEmptyString {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> strings = Arrays.asList("abc", "", "be", "efg", "abcd", "", "jkl");
        System.out.println("Original list of strings: " + strings);
        List<String> nonEmptyStrings = strings.stream()
                .filter(s -> !s.isEmpty())
                .collect(Collectors.toList());
        System.out.println("Non-empty strings: " + nonEmptyStrings);

        scanner.close();
 }

}
