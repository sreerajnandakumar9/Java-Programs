package programs.java;

import java.util.Arrays;

public class ModifyElementsBasedCondition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr = { 12, 3, 78, 5, 12 };

		int[] result = Arrays.stream(arr).map(num -> num < 30 ? num + 10
				                               : num > 30 ? num + 20 
						                         : num).toArray();

		System.out.println(Arrays.toString(result));

	}
}
