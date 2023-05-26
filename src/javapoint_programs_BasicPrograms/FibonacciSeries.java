package javapoint_programs_BasicPrograms;

import java.util.Scanner;

public class FibonacciSeries {

	public static void main(String[] args) {

		int n1 = 0;
		int n2 = 1;
		
		Scanner sc = new Scanner(System.in);
		int count = sc.nextInt();
		
		System.out.println(n1 );
		System.out.println(n2 );
		
		for(int i=0;i<count;i++)
		{
			int n3 = n1 + n2;
			System.out.println(n3);
			n1 = n2;
			n2 = n3;		
		}

		
	}

}
