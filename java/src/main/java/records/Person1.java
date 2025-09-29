package records;

public record Person1(String Name, int age) {

	//Canonical Constructor
	public Person1(String Name, int age) {

		if (age < 18) {
			throw new IllegalArgumentException("You are not allowed to Vote in elections - " + age);
		}
		// must assign explicitly
		this.Name = Name.toUpperCase(); // transformation example
		this.age = age;

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {
			Person1 p = new Person1("Varsha", 29);
			System.out.println("You are eligible for voting in the election");
		} catch (IllegalArgumentException e) {
			e.getMessage();

		}
	}

}
