package day_10;

import com.fasterxml.jackson.databind.ObjectMapper;

public class Main {
	public static void main(String[] args) throws Exception {
		// Create an instance of a simple Java class
		Person person = new Person("John", 30);

		// Create an ObjectMapper instance from Jackson library
		ObjectMapper objectMapper = new ObjectMapper();

		// Serialize the Java object to JSON
		String json = objectMapper.writeValueAsString(person);

		// Output the JSON representation
		System.out.println(json);
	}
}

class Person {
	public Person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

	private String name;
	private int age;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

}