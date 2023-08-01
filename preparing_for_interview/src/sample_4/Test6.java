package sample_4;

import java.util.Map;
import java.util.stream.Collectors;

//Count the number of employees in each department.
public class Test6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee emp = new Employee();
		
	Map<String ,Long>  map	=emp.init().stream()
		.collect(Collectors.groupingBy(Employee::getDepartment ,
				Collectors.counting()));
	
	
	System.out.println(map);
		

	}

}
