package javapoint_programs_BasicPrograms;

import java.util.Scanner;

public class armstrong_number {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int val = 0;
		while(num!=0)
		{
			System.out.println("entered");
			int rem = num%10;
			int cube = rem*rem*rem;
			int div = num/10;
			num = div;
			
			 val += cube;
		}
		System.out.println(val);
	}

}
