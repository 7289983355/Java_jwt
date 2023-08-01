package sample_4;

import java.util.Comparator;
import java.util.Map;
import java.util.Optional;

//Find out the height of experienced employees in the organization
public class Test11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Employee emp = new Employee();
		
	Optional<Employee>	 data=emp.init().stream().sorted(Comparator.comparingInt(Employee ::getYearOfJoining)).findFirst();
		
          System.out.println(data.get());
	}

}
