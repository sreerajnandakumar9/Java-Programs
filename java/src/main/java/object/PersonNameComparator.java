package object;

import java.util.Comparator;

public class PersonNameComparator implements  Comparator<ComaparatorInterface>{

	@Override
	public int compare(ComaparatorInterface o1, ComaparatorInterface o2) {
		// TODO Auto-generated method stub
		return o1.getName().compareTo(o2.getName());
	}
	
	
}
