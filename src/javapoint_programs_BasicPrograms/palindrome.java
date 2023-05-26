package javapoint_programs_BasicPrograms;

import java.util.Scanner;

public class palindrome {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("enter a string/number");
		String line = sc.nextLine();
		String reverse = "";
		
		char[] linechar = line.toCharArray();
		
		int length = linechar.length;
		
		for(int i=length-1; i>=0 ; i--)
		{
			 reverse += linechar[i];
		}
		
		if(reverse.equals(line))
		{
			System.out.println(line+ " is palindrome");
		}
		else
		{
			System.out.println(line+ " is not palindrome");
		}
		
	}

}
