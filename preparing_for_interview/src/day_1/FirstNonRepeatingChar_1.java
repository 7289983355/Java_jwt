package day_1;

import java.util.LinkedHashMap;
import java.util.Map;

public class FirstNonRepeatingChar_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String name = "dharmesh";

		Map<Character, Integer> charCount = new LinkedHashMap<>();

		for (int i = 0; i < name.length(); i++) {

			if (!charCount.containsKey(name.charAt(i))) {

				charCount.put(name.charAt(i), 1);

			} else {

				charCount.put(name.charAt(i), charCount.get(name.charAt(i)) + 1);
			}

		}

		Character result = charCount.entrySet().stream()
				.filter(x -> x.getValue()<1)
				.map(entry -> entry.getKey())
				.findFirst().get();
		System.out.println(result);

	}

}
