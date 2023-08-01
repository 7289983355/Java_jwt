package day_6;

public class EmployeeTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Employee employee =new Employee("Dharmesh" ,9876 ,"M");
		Employee employee1 =new Employee("Ramesh" ,9876 ,"M");
		Employee employee2 =new Employee("Geeta" ,9876 ,"F");
		Employee employee3 =new Employee("Site" ,9876 ,"F");
		
		
		//print the employee with female
		
		
		System.out.println(employee.isFemale());
		

	}

}
