package string;

public class ReverseEachWord {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s = "Hello World";
		
		String [] words = s.split(" ");
		
		StringBuilder sb = new StringBuilder();
		
		for(String word:words) {
			
			sb.append(new StringBuilder(word).reverse()).append(" ");
			
		}
		System.out.println(sb.toString().trim());
	}

}
