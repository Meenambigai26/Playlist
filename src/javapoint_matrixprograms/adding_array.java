package javapoint_matrixprograms;

import java.util.Scanner;

public class adding_array {

	public static void main(String[] args) {

		int a[][] = {{1,1,4},{1,1,4},{1,1,4}};
		int b[][] = {{1,1,1},{1,1,1},{1,1,1}};
		int sum[][] = new int[3][3];
		Scanner sc = new Scanner(System.in);
		for(int i=0; i<3 ; i++)
		{
			for(int j=0;j<3;j++)
			{
				 sum[i][j] = a[i][j] + b[i][j];
			}
		}
		for(int i=0; i<3 ; i++)
		{
			for(int j=0;j<3;j++)
			{
				System.out.print(sum[i][j]+" ");
			}
			System.out.println();
		}
		
	}

}
