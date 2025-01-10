package ArraysandStrings;

import java.util.Scanner;

public class StringComparison {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input two strings for comparison
        System.out.print("Enter the first string: ");
        String string1 = scanner.nextLine();

        System.out.print("Enter the second string: ");
        String string2 = scanner.nextLine();

        // Using equals() method to compare strings
        if (string1.equals(string2)) {
            System.out.println("The strings are equal using equals().");
        } else {
            System.out.println("The strings are not equal using equals().");
        }

        // Using compareTo() method to compare strings
        int comparisonResult = string1.compareTo(string2);
        if (comparisonResult == 0) {
            System.out.println("The strings are equal using compareTo().");
        } else if (comparisonResult < 0) {
            System.out.println("The first string is lexicographically smaller than the second string using compareTo().");
        } else {
            System.out.println("The first string is lexicographically larger than the second string using compareTo().");
        }

        scanner.close();
    }
}

