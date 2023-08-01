package sample_4;

import java.util.Collections;
import java.util.Map;
import java.util.stream.Collectors;

//Count the number of employees in each department.
public class Test7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee emp = new Employee();

		Map<String, Double> map = emp.init().stream()
				         .collect(Collectors.groupingBy(Employee::getDepartment, 
						   Collectors.averagingDouble(Employee::getSalary)));

		System.out.println(map);
	}

}
