package sample_1;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

//9. Given a list of integers, sort all the values present in it using Stream functions?

class Test8 {

	public static void main(String[] args) {
		List<Integer> myList = Arrays.asList(10, 15, 8, 49, 25, 98, 98, 32, 15);

		List<Integer> data = myList.stream().sorted().collect(Collectors.toList());
		
		System.out.println(data);

	}
}