package object;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
public class CustomSorting {

	public static void main(String[] args) {

		//comparable interface
		 List<PersonInterface> people = new ArrayList<>(Arrays.asList(
	                new PersonInterface("Alice", 30, 65.5),
	                new PersonInterface("Bob", 25, 75.0),
	                new PersonInterface("Charlie", 35, 80.0)
	                ));
		 System.out.println("Original people list: " + people);

	        Collections.sort(people);
	        
	        System.out.println("Sorted people list: " + people);
			//comparator interface

	        List<ComaparatorInterface> people1 = new ArrayList<>();

	        people1.add(new ComaparatorInterface("Sree", 25, 65.5));
	        people1.add(new ComaparatorInterface("Arun", 22, 70.2));
	        people1.add(new ComaparatorInterface("Bala", 28, 60.8));
	        Collections.sort(people1, new PersonNameComparator());
			 System.out.println("Sorted people list: Comparator: " + people1);

		 
	}


}
