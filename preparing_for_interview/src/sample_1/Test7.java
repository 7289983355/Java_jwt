package sample_1;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

//7. Given a String, find the first non-repeated character in it using Stream functions?

class Test7 {

	public static void main(String[] args) {
		String input = "Java articles are Awesome";

		IntStream i = input.chars();

		Stream<Object> c = i.mapToObj(data -> Character.valueOf((char) data));

	    Map<Object, Long>	data=c.collect(
			            Collectors.groupingBy(
			            		Function.identity(), LinkedHashMap::new, Collectors.counting()));
		
		
	   for( Map.Entry<Object, Long> value :data.entrySet()) {
		   
	               if(value.getValue()<=1) {
	            	   System.out.println(value.getKey());
	            	   break;
	               }
		   
	   }
	}
}