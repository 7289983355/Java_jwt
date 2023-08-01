package sample_1;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;

//Write a program to print the count of each character in a String?
class Test11 {

	public static void main(String[] args) {
		String s = "string data to count each character";
		Arrays.stream(s.split("")).map(String::toLowerCase)
				.collect(Collectors.groupingBy(str -> str, LinkedHashMap::new, Collectors.counting())).entrySet()
				.forEach(x -> System.out.println(x.getKey() + " " + x.getValue()));

	}
}