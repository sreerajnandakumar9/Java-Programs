package programs.java;

import java.util.Arrays;
import java.util.stream.Collectors;

public class ReverseLastWord {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s ="I LOVE JAVA";
		
		String [] splitString = s.split(" ");
		
		splitString[splitString.length-1] = new StringBuilder(splitString[splitString.length-1])
				.reverse().toString();
		
		String result = Arrays.stream(splitString).collect(Collectors.joining(" "));
		System.out.println(result);


	}

}
