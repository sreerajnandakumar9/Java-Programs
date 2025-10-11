package array;

import java.util.Arrays;
import java.util.stream.IntStream;

public class MissingNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] no = {1,2,4,5,6};
		int n=6;
		
		int total =IntStream.rangeClosed(1, n).sum();
		
		int arr =Arrays.stream(no).sum();
		
		int missingNum= total-arr;
		
		System.out.println("Missing Num - "+missingNum);
		
		
		
	}

}
