package programs.java;

import java.util.LinkedHashMap;
import java.util.stream.Collectors;

public class Printcharwithtotalcount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		 String s = "aaabb";
		 // char[] ch = s.toCharArray();
		  
		String result =  s.toLowerCase().chars().mapToObj(ch->(char)ch)
		  .collect(Collectors.groupingBy(ch->ch,LinkedHashMap::new,Collectors.counting()))
		  .entrySet().stream().map(e->e.getKey()+""+e.getValue())
		  .collect(Collectors.joining());
		
		System.out.println(result.toString());
	}

}
