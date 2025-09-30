package exceptions;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class CheckedException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		readExcel("new.txt");
	}
	
	public static void readExcel(String path) {
		
		try {
			FileReader fr = new FileReader(path);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println("No such file "+e.getMessage());
		}
		
	}

}
