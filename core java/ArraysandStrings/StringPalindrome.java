package ArraysandStrings;


	import java.util.Scanner;

	public class StringPalindrome {

	    // Method to reverse a string
	    public static String reverseString(String str) {
	        StringBuilder reversed = new StringBuilder(str);
	        return reversed.reverse().toString();
	    }

	    // Method to check if the string is a palindrome
	    public static boolean isPalindrome(String str) {
	        // Remove spaces and convert to lowercase for uniformity
	        String cleanedString = str.replaceAll("[\\W_]+", "").toLowerCase();
	        String reversedString = reverseString(cleanedString);

	        return cleanedString.equals(reversedString);
	    }

	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        // Input string from the user
	        System.out.print("Enter a string: ");
	        String input = scanner.nextLine();

	        String reversed = reverseString(input);
	        boolean palindrome = isPalindrome(input);

	        // Output results
	        System.out.println("Reversed String: " + reversed);
	        if (palindrome) {
	            System.out.println("The string is a palindrome.");
	        } else {
	            System.out.println("The string is not a palindrome.");
	        }

	        scanner.close();
	    }
	}

