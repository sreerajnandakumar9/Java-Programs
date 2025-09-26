package programs.java;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class FindDuplicatesSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Integer> numbers = Arrays.asList(5, 12, 3, 6, 2, 12, 3, 5, 5);
		
		Set<Integer> NOS = new HashSet<>();
		Set<Integer> dup = numbers.stream().filter(n->NOS.add(n))
		 .collect(Collectors.toSet());
		 
			System.out.println(dup);


	}

}
