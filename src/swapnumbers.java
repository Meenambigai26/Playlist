import java.util.Scanner;

public class swapnumbers {

	public static void main(String[] args) {

		System.out.println("enter two numbers");
		int x ,y;
		Scanner sc = new Scanner(System.in);
		
		x = sc.nextInt();
		y = sc.nextInt();
		
		x = x+y;
		y = x-y;
		x = x-y;
		
		System.out.println("after swapping "+x+" "+y);
	}

}
