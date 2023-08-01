package day_9;

import java.util.Comparator;

public class PersonComparator implements Comparator<Person> {

	@Override
	public int compare(Person o1, Person o2) {
		// TODO Auto-generated method stub
		
		if(o1==null && o2==null) {
			return 0;
		}
		
		
		if(o1==null) {
			return -1;
		}
		if(o2==null) {
			return 1;
		}
		
		int value =o1.getAge()-o2.getAge();
		
		if(value!=0) {
		 return	value ;
		}
		
		
		//compare by age
		
		//compare by name
		 value =o1.getFullName().compareTo(o2.getFullName());
		
		
		
		return value;
	}

}
