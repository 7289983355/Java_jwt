package day_6;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class PredicateEx3 {

    public static void main(String[] args) {

   
    Predicate<String>  startWithS =t ->t.startsWith("S");

        List<String> names = Arrays.asList("John", "Smith", "Samueal", "Catley", "Sie");
        
        
        
     //   names.stream().filter(s ->s.startsWith("S")).forEach(s ->System.out.println(s));
        names.stream().filter(startWithS).forEach(s ->System.out.println(s));

    }
}