package programs.java;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FrequencyCharsArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> arr = Arrays.asList("Mango","Guava","Fruit");
		
		arr.stream().collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
		
		
		
		
	}

}
