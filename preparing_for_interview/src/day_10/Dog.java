package day_10;

public class Dog {

	public Dog(DogBuilder builder) {
		this.name = builder.name;
		this.age = builder.age;

	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	private final String name;

	@Override
	public String toString() {
		return "Dog [name=" + name + ", age=" + age + "]";
	}

	private final int age;

	public static class DogBuilder {

		private String name;
		private int age;

		DogBuilder name(String name) {
			this.name = name;
			return this;

		}

		DogBuilder age(int age) {
			this.age = age;
			return this;

		}

		public Dog build() {
			return new Dog(this);
		}

	}

}
