package day_9;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ComparatorSortingDemo {

	public static void main(String[] args) {
		Person person1 = new Person("Marry", 20);
		Person person2 = new Person("Tom", 21);
		Person person3 = new Person("Daniel", 21);
		Person person4 = new Person("Mischa", 18);
		Person person5 = new Person("Christian", 20);

		// An array is not sorted
		Person[] array = new Person[] { person1, person2, person3, person4, person5 };

		// Sort the array, use: <T> Arrays.sort(T[],Comparator<? supers T>).
		// And provide a Comparator.
		Arrays.sort(array, new PersonComparator());

		for (Person person : array) {
			System.out.println("Person: " + person.getAge() + " / " + person.getFullName());
		}

		System.out.println("------------------------");

		// For List
		List<Person> list = new ArrayList<Person>();
		list.add(person1);
		list.add(person2);
		list.add(person3);
		list.add(person4);
		list.add(person5);

		// Sort the array, use:
		// <T> Arrays.sort(T[],Comparator<? supers T>).
		// And provide a Comparator.
		Collections.sort(list, new PersonComparator());

		for (Person person : list) {
			System.out.println("Person: " + person.getAge() + " / " + person.getFullName());
		}
	}

}