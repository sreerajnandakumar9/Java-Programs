package string;


import java.util.StringJoiner;

public class TransformString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     String s = "`My name is so and so`";
		
		StringJoiner sj = new StringJoiner("","{","}");
		
		for(char c: s.toCharArray()) {
			
			if(c==' ') {
				
				sj.add("-");
				
			}
			else
			{
				sj.add(String.valueOf(c));
			}
		}
		System.out.println(sj.toString());
	}

}
