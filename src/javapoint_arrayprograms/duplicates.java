package javapoint_arrayprograms;

import java.util.HashMap;

public class duplicates {

	public static void main(String[] args) {

		int arr[] = {1,1,2,2,31,11};
		HashMap<Integer, Integer> hm = new HashMap<Integer, Integer>();
		for(int i=0; i<arr.length;i++)
		{
			if(hm.containsValue(arr[i]))
				System.out.println(arr[i]);
			else
			hm.put(i, arr[i]);
		}
		System.out.println(hm);
		
		//copy one array to another
		HashMap<Integer, Integer> hm1= new HashMap<Integer, Integer>();
		hm1.putAll(hm);
		System.out.println(hm1);
		
	}

}
