package javapoint_programs_BasicPrograms;

import java.util.Scanner;

public class Ascii_value {

	public static void main(String[] args) {

		System.out.println("enter an alphbet");
		Scanner sc = new Scanner(System.in);
		char ch = sc.next().charAt(0);
		int alpha = (int)ch; 
		System.out.println("ascii value is alpha " + alpha );
		
	}

}
