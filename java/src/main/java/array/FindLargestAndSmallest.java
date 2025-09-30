package array;

import java.util.Arrays;
import java.util.OptionalInt;

public class FindLargestAndSmallest {

	private static void FindLargeAndSmall(int[] arr) {
		// TODO Auto-generated method stub

		int min = Integer.MAX_VALUE;
		int max = Integer.MIN_VALUE;

		for (int i = 0; i < arr.length; i++) {

			if (max < arr[i]) {

				max = arr[i];
			}
			if (min > arr[i]) {

				min = arr[i];
			}
			
		}
		System.out.println("Largest - "+max);
		System.out.println("Smallest - "+min);


	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr = { 12, 5, 8, 1, 4 };

		FindLargeAndSmall(arr);
	    OptionalInt max = Arrays.stream(arr).max();
        // Find smallest
        OptionalInt min = Arrays.stream(arr).min();

        // Print results
        max.ifPresent(value -> System.out.println("Largest - " + value));
        min.ifPresent(value -> System.out.println("Smallest - " + value));

	}

}
