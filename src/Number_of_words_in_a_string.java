import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;


public class Number_of_words_in_a_string {
 
	public void iteration()
	{
		HashMap<Integer, String> it = new HashMap<Integer, String>();
		it.put(1, "aaa");
		it.put(2, "aaa");
		it.put(3, "aaa");
		it.put(4, "aaa");
		it.put(5, "aaa");
		
		for(Integer value1 : it.keySet())
		{
			System.out.println(it.get(value1));
		}
		
	}
	
	public static void main(String[] args) {

		HashMap<Integer, String> line = new HashMap<Integer, String>();
		String myline = "I love Automation Testing";
		
		String[] split = myline.split(" ");
		int i = 1;
		for(String value: split)
		{
			line.put(i, value);
			i++;
		}
		System.out.println(line);
		System.out.println("count is "+line.size());
		
		//iteration();
		Number_of_words_in_a_string n = new Number_of_words_in_a_string();
		n.iteration();
	}

}


