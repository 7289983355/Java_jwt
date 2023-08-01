package day_6;

import java.util.function.Predicate;

public class PredicateEx1 {

    public static void main(String[] args) {
        
        Predicate<Integer> tester = value -> value % 2 == 1;
        
        int value = 11;
        
        System.out.println(value + " Is an Odd Number? " + tester.test(value));
    }
}