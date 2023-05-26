package javapoint_arrayprograms;

import java.util.HashMap;

public class frequency_of_element {

	public static void main(String[] args) {
		int arr[] = {1,1,2,2,31,11};
		//int count =1;
		HashMap<Integer, Integer> hm = new HashMap<Integer, Integer>();
		for(int i=0; i<arr.length;i++)
		{
			if(hm.containsValue(arr[i]))
				{
				hm.put(arr[i], hm.get(arr[i]+1));
				}
			else
			{
				hm.put( arr[i], 1);
			}
			
		}

		System.out.println(hm);
	}
}
