package ControlFlowStatements;

import java.util.Scanner;

public class Fibonacciseries {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of terms: ");
        int terms = scanner.nextInt();  
        int first = 0, second = 1;

        System.out.println("Fibonacci Series up to " + terms + " terms:");

        if (terms == 0) 
        {
            System.out.println("No terms to display.");
        } else if (terms == 1) {
            System.out.println(first);
        } else {
            System.out.print(first + " " + second + " ");

            for (int i = 3; i <= terms; i++) {
                int nextTerm = first + second;  
                System.out.print(nextTerm + " ");  

               
                first = second;
                second = nextTerm;
            }
        }

       
    }


	}

