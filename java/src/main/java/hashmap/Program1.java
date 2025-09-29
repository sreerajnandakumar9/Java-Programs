package hashmap;

public class Program1 {

	String Model;
	int Price;

	public String toString() {
		return "Model Name " + Model;

	}
	
	public Boolean equalTo(Program1 th) {
		
		return this.Model.equals(th.Model) && this.Price==th.Price;
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Program1 p = new Program1();
		p.Model = "Volvo";
		p.Price = 100000;
		
		Program1 p1 = new Program1();
		p1.Model = "Volvo";
		p1.Price = 100000;
		
		Boolean result = p.equals(p1);


		System.out.println(result);

	}

}
