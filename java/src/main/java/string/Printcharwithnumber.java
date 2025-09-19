package string;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;

public class Printcharwithnumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		  String s = "abaccb";
		  char[] ch = s.toCharArray();
		  
		  Map<Character,Integer> mp = new LinkedHashMap<>();
		  
		  for(char c:ch) {
			  
			  mp.put(c, mp.getOrDefault(c, 0)+1);
			  
		  }
		  StringBuilder sb= new StringBuilder();
		  
		  for(Entry<Character,Integer> entry:mp.entrySet()) {
			  
			  sb.append(entry.getKey()).append(entry.getValue());
		  }
		  System.out.println(sb.toString());
	}

}
