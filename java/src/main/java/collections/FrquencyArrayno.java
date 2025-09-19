package collections;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FrquencyArrayno {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Map<Integer,Integer> count = new HashMap<>();
		
		List<Integer> arr = Arrays.asList(5,7,8,7,16,51,2,7);
		
		for(int num:arr) {
			
			count.put(num, count.getOrDefault(num, 0)+1);
			
		}
		for(Map.Entry<Integer, Integer> entry:count.entrySet()) {
			
			if(entry.getValue()>2) {
			
			System.out.println(entry.getKey()+" is appearing "+entry.getValue()+" times");
			}
		}
	}

}
