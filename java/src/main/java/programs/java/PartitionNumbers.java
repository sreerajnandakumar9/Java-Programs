package programs.java;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class PartitionNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		 List<Integer> nos = Arrays.asList(5,12,4,8,3,9);
		 
		Map<Boolean,List<Integer>> partitioned =nos.stream()
				.collect(Collectors.partitioningBy(num->num%2==0));
		 
		 System.out.println("Even Nos -> "+partitioned.get(true));
		 System.out.println("Odd Nos -> "+partitioned.get(false));

		 
	}

}
