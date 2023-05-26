package javapoint_arrayprograms;

import java.util.TreeMap;
import java.util.TreeSet;

public class largest_smalles_inanarray {

	public static void main(String[] args) {
		int arr[] = {31,1,2,0,31,11};
		
		//largest in an array / ascending
		//TreeMap<Integer, Integer> tm = new TreeMap<Integer, Integer>();
		TreeSet<Integer> tree = new TreeSet<Integer>();
		for(int i = 0;i<arr.length; i++)
		{
			tree.add(arr[i]);
		}
		System.out.println(tree);
 		
		
		Object[] arr1 = tree.toArray();
		int length = arr1.length;
		System.out.println(length);
		System.out.println("largest in an array "+arr1[length-1]);
		System.out.println("second largest in an array "+arr1[arr1.length - 2]);
		System.out.println("third largest in an array "+arr1[arr1.length - 3]);
		System.out.println("smallest in an array "+arr1[0]);
		System.out.println("second largest in an array "+arr1[1]);
		System.out.println("third largest in an array "+arr1[2]);
		System.out.println("-----descending--------");
		System.out.println(tree.descendingSet());
	}

}
