package day_6;

public class GreetingMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Greeting greet =name -> "hi " +name ;
		
		System.out.println(greet.greeting("Dharmesh"));

	}

}