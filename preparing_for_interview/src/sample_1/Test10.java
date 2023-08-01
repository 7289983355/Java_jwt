package sample_1;
//10. Given a list of integers, sort all the values present in it in descending order using Stream functions?

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

class Test10 {

	public static void main(String[] args) {
		List<Integer> myList = Arrays.asList(10, 15, 8, 49, 25, 98, 98, 32, 15);

		List<Integer> reverseList = myList.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());

		System.out.println(reverseList);

		myList.stream().sorted(Collections.reverseOrder()).forEach(System.out::println);

	}
}