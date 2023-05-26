package javapoint_arrayprograms;

public class odd_even_inarray {

	public static void main(String[] args) {

		int arr[] = {31,1,2,31,11};
		int sum = 0;
		
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]%2 == 0)
				System.out.println("even numbers "+arr[i] + " its position "+i);
			else
				System.out.println("odd numbers "+arr[i]+ "its position "+i);
		}
		
		System.out.println("----------sum of all elements in an array----------");
		for(int i=0;i<arr.length;i++)
		{
			sum += arr[i];
		}
		System.out.println("sum is "+sum);
	}

}
