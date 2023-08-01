package sample_4;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

//Write a program to print the names of all departments in the organization.
public class Test1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee emp = new Employee();

		Map<String, Long> departmentName = emp.init().stream()
				.collect(Collectors.groupingBy(Employee::getDepartment, Collectors.counting()));

		System.out.println(departmentName);

		List<String> department = emp.init().stream().map(Employee::getDepartment).distinct()
				.collect(Collectors.toList());

		System.out.println(department);

	}

}
