package programs.java;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Integer> ins = Arrays.asList(5,12,3,6,2,5);
		
	   Map<Integer,Integer> mp = new HashMap<>();
	   
	   for(int no:ins) {
		   
		   mp.put(no, mp.getOrDefault(no, 0)+1);
	   }
		
	   for(Entry<Integer, Integer> entry:mp.entrySet()) {
		   
		   if(entry.getValue()>1) {
			   
			   System.out.println("Number "+entry.getKey()+" repeated "+entry.getValue()+" times");
		   }
	   }
	}

}
