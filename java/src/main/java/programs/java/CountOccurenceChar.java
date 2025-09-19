package programs.java;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class CountOccurenceChar {

	public static void main(String[] args) {

		
		String in = "Hello Everyone";
		
        in.toLowerCase();
		Map<Character, Long> n = in.replace(" ","").chars().mapToObj(e->(char)e)
				.collect(Collectors.groupingBy(c->c,LinkedHashMap::new,Collectors.counting()));
				
		System.out.println(n);
		
		//Find duplicates
		
}
	}


