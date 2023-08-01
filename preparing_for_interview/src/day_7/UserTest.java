package day_7;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class UserTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<User> users = getAllUsers();

		Map<String, List<User>> resultMap = users.stream().
				                                 collect(Collectors.groupingBy(User::getMembershipType));

		System.out.println(resultMap);

	}

	private static List<User> getAllUsers() {
		List<User> users = new ArrayList<>();
		users.add(new User("John", "john123", "premium", "5th Avenue"));
		users.add(new User("Megan", "meganusr", "gold", "New Light Street"));
		users.add(new User("Steve", "steve1234", "regular", "New Street Avenue"));
		users.add(new User("Melissa", "mell1", "premium", "Ser Kingston Street"));
		users.add(new User("Joan", "joan1234", "gold", "New Light Street"));

		return users;
	}

}
