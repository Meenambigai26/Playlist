package javapoint_programs_BasicPrograms;

public class array {

	public static void main(String[] args) {

		int[] arr = {'1', '7', '6', '5','4', '3', '8', '9', '9'};
		int length = arr.length;
		for(int i=0;i<length;i++)
		{
			if(arr[i]=='8')
			{
				System.out.println(i);
			}
		}
	}

}
