package sample_1;

import java.util.Arrays;
import java.util.List;

//4. Given the list of integers, find the first element of the list using Stream functions?

class Test4 {
    
  public static void main(String[] args) {
     List<Integer> myList = Arrays.asList(10,15,8,49,25,98,98,32,15);
     
    // myList.stream().limit(1).forEach(System.out::println);
     
      int data =myList.stream().findFirst().get();
      
      System.out.println(data);
      
      myList.stream()
      .findFirst()
      .ifPresent(System.out::println);
   
  }
}