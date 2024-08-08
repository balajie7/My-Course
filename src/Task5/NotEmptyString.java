package Task5;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class NotEmptyString {

   public static void main(String[] args) {
       List<String> strings = Arrays.asList("abc", "", "bc", "efg", "abcd", "", "jkl");
       List<String> nonEmptyStrings = strings.stream()
               .filter(string -> !string.isEmpty()).collect(Collectors.toList());
       System.out.println(nonEmptyStrings);
   }

}
