package javapoint_programs_BasicPrograms;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class smallest_integer {
	int[] a;
	
	public int smallest_integer(int[] a)
	{
		
	}
	
	
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		List<Integer> al = new ArrayList<Integer>();
		for(int i =0;i<5;i++)
		{
			int num = sc.nextInt();
			al.put(num);
		}
		
		
		smallest_integer si = new smallest_integer();
	}

}
