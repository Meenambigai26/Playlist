package javapoint_programs_BasicPrograms;

import java.util.Random;
import java.util.Scanner;

public class Random_numbers {

	public static void main(String[] args) {

		//method1
		System.out.println("random number 1 "+Math.random());
		System.out.println("random number 2 "+Math.random());
		
		//method2
		Random random = new Random(); //object for random class
		System.out.println("number below 50 "+random.nextInt(50));
		System.out.println("number below 999 "+random.nextDouble());
		System.out.println("number below 999 "+random.nextFloat());
		System.out.println("number below 999 "+random.nextBoolean());
		System.out.println("number below 999 "+random.nextLong());
		
		//between min and max
		Scanner sc = new Scanner(System.in);
		System.out.println("enter min and max value");
		int min = sc.nextInt();
		int max = sc.nextInt();
		
		double random_value = Math.random()*(max-min+1)+min;
		
		int ran = (int)random_value;
		System.out.println("random value is "+ran );
	}

}
