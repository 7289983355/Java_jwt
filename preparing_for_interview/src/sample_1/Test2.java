package sample_1;

import java.util.Arrays;
import java.util.List;

//Given a list of integers, find out all the numbers starting with 1 using Stream functions?
class Test2 {
    
  public static void main(String[] args) {
	  
	   List<Integer> myList = Arrays.asList(10,15,8,49,25,98,32);
	   
	   
	   myList.stream().map(x ->x+"")
	                  .filter(str ->str.startsWith("1"))
	                  .forEach(System.out::println);
  }
}