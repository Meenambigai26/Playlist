package javapoint_matrixprograms;

import java.util.Scanner;

public class input_matrix {

	public static void main(String[] args) {


		int a[][] = new int[3][3];
		int b[][] = new int[3][3];
		Scanner sc = new Scanner(System.in);
		for(int i=0; i<3 ; i++)
		{
			for(int j=0;j<3;j++)
			{
				 a[i][j] = sc.nextInt();
			}
		}
		System.out.println(a[0][0]);
		
	}

}
