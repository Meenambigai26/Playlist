package javapoint_programs_BasicPrograms;

import java.util.Scanner;

public class star_pattern {

	public static void main(String[] args) {

		int n = 0;
		int n1 = 0;
		System.out.println("enter a number");
		Scanner sc = new Scanner(System.in);
		 n = sc.nextInt();
		
		for(int i = 0;i<n; i++)
		{
			for(int j = 0; j<=i; j++)
			{
				System.out.print(" * ");
			}
			System.out.println();
		}
		
		System.out.println("enter a number");
		Scanner sc1 = new Scanner(System.in);
		 n1 = sc.nextInt();
		 for(int i = 0;i<n1; i++)
			{
				for(int j = n; j>=i; j--)
				{
					System.out.print(" * ");
				}
				System.out.println();
			}
	}

}
