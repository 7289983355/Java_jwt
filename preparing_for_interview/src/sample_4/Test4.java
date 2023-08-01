package sample_4;

import java.util.List;
import java.util.stream.Collectors;

//Get the Names of employees who joined after 2015.
public class Test4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee emp = new Employee();

		List<String> employee = emp.init().stream().filter(e -> e.yearOfJoining > 2015).map(Employee::getName)
				.collect(Collectors.toList());

		System.out.println(employee);

	}

}
