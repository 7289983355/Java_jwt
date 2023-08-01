package day_8;

public class Actor implements Comparable<Actor> {

	String firstName;

	public Actor(String firstName, String lastName) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
	}

	String lastName;

	@Override
	public int compareTo(Actor o) {

		int value = this.lastName.compareTo(o.lastName);

		if (value != 0) {
			return value;
		}

		value = this.firstName.compareTo(o.firstName);

		return value;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

}
