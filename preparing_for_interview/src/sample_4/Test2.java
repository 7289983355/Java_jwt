package sample_4;

import java.util.Collections;
import java.util.Map;
import java.util.stream.Collectors;

//Find the average age of Male and Female Employees.
public class Test2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee emp = new Employee();

		Map<String, Double> avgAge = emp.init().stream()
				.collect(Collectors.groupingBy(
						 Employee::getGender,
						 Collectors.averagingInt(Employee::getAge)));

		System.out.println(avgAge);

	}

}
