package javapoint_numberprograms;

public class reverse_a_number {

	public static void main(String[] args) {

		int a = 21;
		String rev = "";
		
		while (a!=0)
		{
			
			int b = a%10;
			//System.out.println(b);
			a=a/10;
			//System.out.println(a);
			rev = rev+b;
		}
		System.out.println(rev);
	}

}
