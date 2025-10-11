package object;

import java.util.Comparator;

public class ComaparatorInterface {
	String name;
	int age;
	double weight;

	public ComaparatorInterface(String name, int age, double weight) {
		this.name = name;
		this.age = age;
		this.weight = weight;
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	public double getWeight() {
		return weight;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + ", weight=" + weight + " kgs]";
	}

}


