/*Given a list of strings, write a method that returns a list of all strings that start with the
letter 'a' (lower case) and have exactly 3 letters using streams.*/
package exercise5;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> stringList = Arrays.asList("every","any","all","none");

        List<String> otherList = stringList.stream()
                .filter(s -> s.startsWith("a"))
                .filter(s -> s.length() == 3)
                .toList();

        System.out.println(otherList);
    }

}
