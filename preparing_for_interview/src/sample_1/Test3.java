package sample_1;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

//3. How to find duplicate elements in a given integers list in java using Stream functions?

class Test3 {
    
  public static void main(String[] args) {
     List<Integer> myList = Arrays.asList(10,15,8,49,25,98,98,32,15);
     
     //unique
    // myList.stream().collect(Collectors.toSet()).forEach(System.out::println);
     
     Set<Integer> set = new HashSet();
     
     myList.stream().filter(data ->!set.add(data)).forEach(System.out::println);
     
     
     
  }
}