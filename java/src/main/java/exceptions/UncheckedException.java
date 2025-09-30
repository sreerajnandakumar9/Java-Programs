package exceptions;

public class UncheckedException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Checking exception at run time
		String s = null;
		try {
			System.out.println(s.length());
		} catch (NullPointerException e) {
			// TODO Auto-generated catch block
			System.out.println(e.getLocalizedMessage());
		}
	}

}
