//Write a method that converts all strings in a list to their upper case using streams
package exercise4;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<String> dogs = Arrays.asList("golden retriever", "malinois", "doberman");

        List<String> uppercaseStrings = dogs.stream()
                .map(String::toUpperCase)
                .toList();

        System.out.println(uppercaseStrings);
    }
}
