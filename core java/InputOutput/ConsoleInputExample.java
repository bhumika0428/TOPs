package InputOutput;

import java.util.Scanner;

public class ConsoleInputExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String name = scanner.nextLine(); 
        System.out.println("Hello, " + name + "!");

        System.out.print("Enter your age: ");
        int age = scanner.nextInt();  
        System.out.println("You are " + age + " years old.");

       
         System.out.print("Are you a student? (true/false): ");
        boolean isStudent = scanner.nextBoolean();  
        System.out.println("Student status: " + isStudent);

        scanner.close();
    }
}

