package Sample2;

import java.util.ArrayList;
import java.util.List;

public class Main12 {

	public static void main(String[] args) {

		List<String> list = new ArrayList<>();
		list.add("One");
		list.add("Two");
		list.add("Three");

		for (String item : list) {
			if (item.equals("Two")) {
				list.remove(item);
			}
		}

		list.stream().forEach(x -> System.out.println(x));
	}
}