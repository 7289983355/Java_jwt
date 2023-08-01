package day_4;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Test {

	
	public static void main(String[] args) {

		Integer[] array = new Integer[] { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };

		List<Integer> list = Arrays.asList(array);

		Collections.reverse(list);
		Integer[] strings = list.stream().toArray(Integer[]::new);
		
		for(int d:strings) {
			System.out.println(d);	
		}	
	}
}









