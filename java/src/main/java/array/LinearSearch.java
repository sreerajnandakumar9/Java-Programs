package array;

public class LinearSearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr = { 12, 40, 5, 15 };
		int key = 15;
		System.out.println(LinearSearch(arr, key));
	}

	private static int LinearSearch(int[] arr, int key) {
		// TODO Auto-generated method stub

		for (int i = 0; i < arr.length; i++) {

			if (arr[i] == key) {
				//System.out.println("Match Found at index " + i);

				return i;

			}
		}
	//	System.out.println("Match not Found anywhere");

		return -1;

	}

}
