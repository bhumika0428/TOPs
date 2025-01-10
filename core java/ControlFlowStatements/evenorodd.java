package ControlFlowStatements;

import java.util.Scanner;

public class evenorodd {

	public static void main(String[] args) {
		
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Number :");
		
		int number =sc.nextInt();
		if(number % 2 == 0)
		{
			System.out.println(number+"even number");
			
		}else
		{
			System.out.println(number+"odd number");
		}
	}
}
