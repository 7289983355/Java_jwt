package day_1;

import java.util.LinkedHashMap;
import java.util.Map;

public class FirstNonRepeatingChar_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String name = "dharmesh";

		Map<Character, Integer> charCount = new LinkedHashMap<>();
		

        for (char c : name.toCharArray()) {
            charCount.put(c, charCount.getOrDefault(c, 0) + 1);
        }

        for (Map.Entry<Character, Integer> entry : charCount.entrySet()) {
            if (entry.getValue() == 1) {
             
                break;
            }
        }
      


	}

}
