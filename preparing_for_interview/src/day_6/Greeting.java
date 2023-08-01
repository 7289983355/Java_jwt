package day_6;

public interface Greeting {

	String greeting(String name);

	default String message(String name) {
		return "hi" + name;
	};

}
