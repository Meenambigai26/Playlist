package javapoint_arrayprograms;

import java.util.HashMap;
import java.util.Scanner;

public class playlist {

	public static void main(String[] args) {

		
		HashMap<Integer, String> hashm = new HashMap<Integer, String>();
		//HashMap<Integer, String> copy = new HashMap<Integer, String>();

		hashm.put(1, "s1");
		hashm.put(2, "s2");
		hashm.put(3, "s3");
		System.out.println("-------My Playlist-------");
		System.out.println(hashm.values());


		for (int i=6;i>=0;i++)
		{
			System.out.println("please enete music of your choice");
			Scanner sc = new Scanner(System.in);
			String newsong = sc.nextLine();
			
		if(hashm.containsValue(newsong))
		{
			String temp = hashm.get(2); 
			String temp2 = hashm.get(3); 
			hashm.replace(1, temp);
			hashm.replace(2, temp2);
			hashm.replace(3, newsong);
		}
		else
		{
			String temp = hashm.get(2); 
			String temp2 = hashm.get(3); 
			hashm.replace(1, temp);
			hashm.replace(2, temp2);
			hashm.replace(3, newsong);
		}

		System.out.println(hashm);
		}



	}

}
