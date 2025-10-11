package programs.java;

import java.util.Arrays;
import java.util.stream.Collectors;

public class ReverseLastWord {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s ="I LOVE JAVA";
		
		String [] splitString = s.split(" ");
		//Reverse last word
	//	splitString[splitString.length-1] = new StringBuilder(splitString[splitString.length-1])
		//		.reverse().toString();
		
		//String result = Arrays.stream(splitString).collect(Collectors.joining(" "));
		//System.out.println(result);


		//Reverse Middle word

		int middleString = splitString.length/2;
		splitString[middleString] = new StringBuilder(splitString[middleString])
				.reverse().toString();
		
		String result1 = Arrays.stream(splitString).collect(Collectors.joining(" "));
		System.out.println(result1);
		
	}

}
