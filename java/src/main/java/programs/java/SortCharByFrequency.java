package programs.java;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class SortCharByFrequency {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		String str = "banana";
		
		Map<Character,Long> no =str.chars() .mapToObj(ch -> (char) ch)
		.collect(Collectors.groupingBy(ch->ch,Collectors.counting()))
		.entrySet().stream()
        .sorted(Map.Entry.<Character, Long>comparingByValue().reversed())
        .collect(Collectors.toMap(Map.Entry::getKey,
        		                Map.Entry::getValue,
        		                (a,b)->a,
        		                LinkedHashMap::new));
		
		System.out.println(no);
;
		

		
	}

}
