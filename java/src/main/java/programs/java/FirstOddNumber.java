package programs.java;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class FirstOddNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		List<Integer> li = Arrays.asList(4,8,9,16,7);
		
		Optional<Integer> nos =li.parallelStream().filter(e->e%2!=0).findFirst();
		nos.ifPresent(System.out::println);
	}

}
