package day_8;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class SortByKeyExample1 {

    public static void main(String[] args) {

        Map<String, String> unsortMap = new HashMap<String, String>();
        unsortMap.put("Z", "z");
        unsortMap.put("B", "b");
        unsortMap.put("A", "a");
        unsortMap.put("C", "c");
        unsortMap.put("D", "d");
        unsortMap.put("E", "e");
        unsortMap.put("Y", "y");
        unsortMap.put("N", "n");
        unsortMap.put("J", "j");
        unsortMap.put("M", "m");
        unsortMap.put("F", "f");

        System.out.println("Unsort Map......");
        printMap(unsortMap);
        
       TreeMap<String, String>   treeMap =new TreeMap<>(unsortMap);
       
       System.out.println("Sorted Map......");
       printMap(treeMap);
        
    }

	private static <K, V> void printMap(Map<K, V> unsortMap) {
		
		for(Map.Entry<K,V> entry :unsortMap.entrySet()) {
			
			System.out.println("key : "+entry.getKey()+"   Value : "+entry.getValue());
			
		}
		
		
	}
    
    
    
}