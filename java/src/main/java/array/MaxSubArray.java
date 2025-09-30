package array;

public class MaxSubArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Kadane's Algorithm
		
		int[] arr = {15,-6,2,-9,-12};
		MaxSubArray(arr);
	}

	private static void MaxSubArray(int[] arr) {
		// TODO Auto-generated method stub
		
		int currSum =0;
		int MaxSum = Integer.MIN_VALUE;
		
		for(int i=0;i<arr.length;i++) {
			
				currSum+=arr[i];
				if(currSum<0) {
					currSum=0;
				}
				MaxSum=Math.max(currSum, MaxSum);
				
			}
		System.out.println("Maximum sum - "+MaxSum);
		}
		
	}


