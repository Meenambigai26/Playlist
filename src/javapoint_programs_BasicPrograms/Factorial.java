package javapoint_programs_BasicPrograms;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {

		int fact = 1;
		System.out.println("enter a number");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		
		for(int i = 1; i<=num ; i++)
		{
			 
			fact = fact*i;
			
		}
		System.out.println("factorial number is "+fact);
	}

}
