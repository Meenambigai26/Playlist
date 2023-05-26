package javapoint_programs_BasicPrograms;

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map.Entry;
import java.util.Scanner;

public class char_occurance {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String st = sc.nextLine();
		
		HashMap<Character, Integer> hashmap = new HashMap<Character, Integer>();
		char[] line = st.toCharArray();
		
		for(char c: line)
		{
			if(hashmap.containsKey(c))
			{
				hashmap.put(c, hashmap.get(c)+1);
				//System.out.println(hash);
				
			}
			else
			{
				hashmap.put(c, 1);
			}
		}
		
		//for()
		
		
		  Iterator<Entry<Character, Integer>> iterator = hashmap.entrySet().iterator();
		  while(iterator.hasNext())
		  {
			  System.out.println(iterator.next());
		  }

}
}
