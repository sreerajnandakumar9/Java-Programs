package programs.java;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class FirstRepeatChar 
{
    public static void main( String[] args )
    {
        
    	String input="SREERAJJ";
        System.out.println("First repeating charcter");	

    	input.chars().mapToObj(ch->(char)ch).collect(Collectors.groupingBy
    			(ch->ch,LinkedHashMap::new,Collectors.counting())).entrySet()
    	.stream().filter(entry->entry.getValue()>1).map(Map.Entry::getKey).findFirst()
    	.ifPresent(System.out::println);
    	
    System.out.println("First Non-repeatin charcter");	
    	input.chars().mapToObj(ch->(char)ch).collect(Collectors.groupingBy
    			(ch->ch,LinkedHashMap::new,Collectors.counting())).entrySet()
    	.stream().filter(entry->entry.getValue()==1).map(Map.Entry::getKey).findFirst()
    	.ifPresent(System.out::println);
    	
    	   System.out.println("Last Non-repeatin charcter");	
       	input.chars().mapToObj(ch->(char)ch).collect(Collectors.groupingBy
       			(ch->ch,LinkedHashMap::new,Collectors.counting())).entrySet()
       	.stream().filter(entry->entry.getValue()==1).map(Map.Entry::getKey).reduce((a,b)->b)
       	.ifPresent(System.out::println);
       	
        System.out.println("Last repeating charcter");	
       	input.chars().mapToObj(ch->(char)ch).collect(Collectors.groupingBy
       			(ch->ch,LinkedHashMap::new,Collectors.counting())).entrySet()
       	.stream().filter(entry->entry.getValue()>1).map(Map.Entry::getKey).reduce((a,b)->b)
       	.ifPresent(System.out::println);
    	
    	
    }
}
