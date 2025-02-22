/*Create Employee class with id, name and salary fields. Create necessary methods and
constructor. Create 3 instances of the Employee class and add them to a list. Using
streams, find first Employee that is not null and has salary of at least 30000. If not found,
throw exception.*/

//Based on employees list from previous exercise, using streams create new list with employees sorted by name.

//Based on employees list from exercise 7, using streams get a number representing maximum salary of all employees.
package exercise7;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {
        Employee employee1 = new Employee(1, "John", 1800);
        Employee employee2 = new Employee(2, "Jane", 30000);
        Employee employee3 = new Employee();

        List<Employee> employeeList = Arrays.asList(employee1, employee2, employee3);

        Employee employee = employeeList.stream()
                .filter(e -> e != null)
                .filter(e -> e.salary >= 30000)
                .findFirst()
                .orElseThrow(() -> new IllegalArgumentException("No employee found with salary >= 30000"));

        System.out.println(employee);


        List<Employee> sortedList = employeeList.stream()
                .filter(e -> e.getName() != null)
                .sorted(Comparator.comparing(e -> e.getName()))
                .toList();

        System.out.println("Sorted list: " + sortedList);


        int maxSalary = employeeList.stream()
                .mapToInt(Employee::getSalary)
                .max()
                .orElseThrow(() -> new IllegalArgumentException("No employee found"));

        System.out.println("Maximum salary: " + maxSalary);
    }
}
