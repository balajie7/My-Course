package Task5;

import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class UpperCase {

    public static void main(String[] args){

//        Scanner sc = new Scanner(System.in);
//        String userInput = sc.next();
//        System.out.println("The Input Provided is: " + userInput);
        Stream<String> names = Stream.of("aBc", "d", "ef");
        System.out.println(names.map(s -> {return s.toUpperCase();}).collect(Collectors.toList()));

    }

}
