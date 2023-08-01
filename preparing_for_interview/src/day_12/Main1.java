package day_12;
import java.util.Comparator;
import java.util.stream.*;
public class Main1 {
    public static void main(String[] args) {
    	
      Integer min = Stream.of(1, 2, 3, 4, 5, 6,7)
                        .min(Comparator.comparing(Integer::intValue))
                        .get();
    System.out.println("The Minimum number is: " + min);
    }
}