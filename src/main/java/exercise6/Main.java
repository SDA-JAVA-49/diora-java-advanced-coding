/*Write a method that returns a comma-separated string based on a given list of integers.
Each element should be preceded by the letter 'e' if the number is even, and preceded by
the letter 'o' if the number is odd. For example, if the input list is (3,44), the output
should be 'o3,e44'. Use streams.*/
package exercise6;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(58,96,37,8);

        String result = numbers.stream()
                .map(integer -> (integer%2 == 0 ? "e" : "0") + integer)
                .collect(Collectors.joining(","));

        System.out.println(result);
    }
}
