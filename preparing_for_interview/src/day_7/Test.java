package day_7;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

class Test {

  public static void main(String[] args) {
	  
    List<String> cities = new ArrayList<>(
    		      Arrays.asList("Paris", "Bern", "London", "Tokyo", "Boston"));

    
    Map<Integer ,List<String>> resultMap=cities.stream().collect(Collectors.groupingBy(String::length));

    System.out.println(resultMap);
  }
}