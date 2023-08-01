package sample_4;

import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.stream.Collectors;

//List down the employees of each department.
public class Test10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee emp = new Employee();

		Map<String, List<Employee>> data = emp.init().stream()
				.collect(Collectors.groupingBy(Employee::getDepartment));

		Set<Entry<String, List<Employee>>> empSet = data.entrySet();

		for (Map.Entry<String, List<Employee>> map : empSet) {

			
			System.out.println("============="+map.getKey());

			for (Employee employee : map.getValue()) {
				System.out.println(employee);
			}

		}

	}

}
