package string;

public class BiggestSumSlider {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		 int [] arr = {2,-4,8,-5,1,-9,4};
		 
		 int k =3;
		 
		 int windowSum=0,MaxSum=0;
		 
		 for(int i=0;i<k;i++) {
			 
			 windowSum+=arr[i];
			 
		 }
		 MaxSum=windowSum;
		 
		 
		 for(int i=k;i<arr.length;i++) {
			 
			 windowSum+=arr[i]-arr[i-k];
			 MaxSum=Math.max(MaxSum, windowSum);
		 }
		 
		 System.out.println(MaxSum);
	}

}
