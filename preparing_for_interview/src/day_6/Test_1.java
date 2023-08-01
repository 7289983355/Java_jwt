package day_6;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Test_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
		
		
		
		Predicate<Integer> isEven = num ->num%2==0 ;
		
		 numbers.stream()
		       .filter(isEven)
		       .collect(Collectors.toList()).stream().forEach(data ->System.out.println(data));
		
		
		
		
	}

}
