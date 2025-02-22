/*Reverse a number using while Loop. The program will prompt user to input the number
and, then it will reverse the same number using while loop.*/
package exercise1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);
        System.out.print("Input number: ");
        int num = scanner.nextInt();
        StringBuilder reversedStr = new StringBuilder();

        while (num > 0) {
            int digit = num % 10;
            reversedStr.append(digit);
            num /= 10;
        }
        System.out.println("Reversed Number: " + reversedStr);
    }
}
