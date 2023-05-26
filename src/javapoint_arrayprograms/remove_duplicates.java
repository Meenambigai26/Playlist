package javapoint_arrayprograms;

import java.util.HashSet;

public class remove_duplicates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {31,1,2,0,31,11};
		HashSet<Integer> hashset = new HashSet<Integer>();
		
		for(int i =0;i<arr.length;i++)
		{
			hashset.add(arr[i]);
		}
		System.out.println(hashset);
	}

}
