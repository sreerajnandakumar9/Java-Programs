package programs.java;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class FindMaxMin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Integer> no = Arrays.asList(44,45,10,15,63);
		
	Optional<Integer> opt =	no.stream().max(Integer::compareTo);
	
	System.out.println("Max Integer in the Array "+opt.orElse(null));
	
	Optional<Integer> opt1 =no.stream().min(Integer::compareTo);
	System.out.println("Min Integer in the Array "+opt1.orElse(null));
	
	no.stream().sorted(Comparator.reverseOrder()).forEach(System.out::println);


	}

}
