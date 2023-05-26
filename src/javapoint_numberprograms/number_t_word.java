package javapoint_numberprograms;

public class number_t_word {

	public static void main(String[] args) {

		int a = 21;
		String word = "";
		//String alpha = "";
		StringBuilder alpha = new StringBuilder();
		while(a!=0)
		{
		int b = a%10;
		//System.out.println(b);
		a=a/10;
		int x = b;
		
		switch (x) {
		case 0:
			word = "zero";
			break;
			
		case 1:
			word = "one";
			break;
			
		case 2:
			word = "two";
			break;
			
		case 3:
			word = "three";
			break;
			
		case 4:
			word = "four";
			break;
			
		case 5:
			word = "five";
			break;
			
		case 6:
			word = "six";
			break;
			
		case 7:
			word = "seven";
			break;
			
		case 8:
			word = "eight";
			break;
			
		case 9:
			word = "nine";
			break;
			
		}
		alpha = alpha.append(word);
		System.out.println(alpha);
		
		}
		//System.out.println(alpha.reverse());
	}	
	

}
