package Sample2;

class A {
	
	A get() {
		return this;
	}
}

class B extends A {
	
	B get() {
		return this;
	}

	void message() {
		System.out.println("Hello from B");
	}
	
}

public class Main13 {
	
	public static void main(String[] args) {
		new B().get().message();
	}
	
}