package object;

public class PersonInterface implements Comparable<PersonInterface> {
	    String name;
	    int age;
	    double weight;

	    public PersonInterface(String name, int age, double weight) {
	        this.name = name;
	        this.age = age;
	        this.weight = weight;
	    }

	    @Override
	    public String toString() {
	        return "PersonV2 [name=" + name + ", age=" + age + ", weight=" + weight + " kgs]";
	    }

	    @Override
	    public int compareTo(PersonInterface other) {
	        return this.age - other.age;
	    }
	}

