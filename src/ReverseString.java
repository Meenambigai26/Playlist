
public class ReverseString {

	public static void main(String[] args) {

		String name = "Manoj";
		String reverse ="";
		char[] namechar = name.toCharArray();
		System.out.println(namechar.length);
		
		for(int i = namechar.length - 1; i>=0 ; i--)
		{
			reverse+=namechar[i];
		}
		
		System.out.println(reverse);
	}

}
