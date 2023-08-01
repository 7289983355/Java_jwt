package day_8;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public record Test() {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Person> persons = List.of(
			    new Person(1, "Alex", 100d, new Department(1, "HR")),
			    new Person(2, "Brian", 200d, new Department(1, "HR")),
			    new Person(3, "Charles", 900d, new Department(2, "Finance")),
			    new Person(4, "David", 200d, new Department(2, "Finance")),
			    new Person(5, "Edward", 200d, new Department(2, "Finance")),
			    new Person(6, "Frank", 800d, new Department(3, "ADMIN")),
			    new Person(7, "George", 900d, new Department(3, "ADMIN")));
		
		
		
		Map<Department, List<Person>> map = persons.stream().collect(Collectors.groupingBy(Person::department));
		

		System.out.println(map);
		
		
		

	}

}
