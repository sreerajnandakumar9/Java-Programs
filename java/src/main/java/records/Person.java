package records;

public record Person(String name, int age) {

	//Compact Constructor
	public Person {

		if(age<18) 
			
			throw new IllegalArgumentException("You are not allowed to enter - "+age);
		else System.out.println("Passed "+age);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			Person rd = new Person("test", 15);
			System.out.println("Age of "+rd.name+" is : "+rd.age);

		} catch (IllegalArgumentException e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		}
		Person rd1;
		try {
			rd1 = new Person("sree", 18);
			System.out.println("Age of "+rd1.name+" is : "+rd1.age);

		} catch (IllegalArgumentException e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		}


	}

}
