package day_8;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class SortByKeyExample2 {

	public static void main(String[] args) {

		Map<Integer, String> unsortMap = new HashMap<Integer, String>();
		unsortMap.put(10, "z");
		unsortMap.put(5, "b");
		unsortMap.put(6, "a");
		unsortMap.put(20, "c");
		unsortMap.put(1, "d");
		unsortMap.put(7, "e");
		unsortMap.put(8, "y");
		unsortMap.put(99, "n");
		unsortMap.put(50, "j");
		unsortMap.put(2, "m");
		unsortMap.put(9, "f");

		System.out.println("Unsort Map......");
		printMap(unsortMap);

		  /* For Java 8, try this lambda
				Map<Integer, String> treeMap = new TreeMap<>(
				                (Comparator<Integer>) (o1, o2) -> o2.compareTo(o1)
				        )
				        ;
				*/
  
		

		TreeMap<Integer, String> treeMap = new TreeMap<Integer, String>(

				new Comparator<Integer>() {

					@Override
					public int compare(Integer o1, Integer o2) {
						// TODO Auto-generated method stub
						return o2.compareTo(o1);
					}
				}

		);
		
		 treeMap.putAll(unsortMap);
		
		System.out.println("sort Map......");
		printMap(treeMap);
		

	}

	public static <K, V> void printMap(Map<K, V> map) {
		for (Map.Entry<K, V> entry : map.entrySet()) {
			System.out.println("Key : " + entry.getKey() + " Value : " + entry.getValue());
		}
	}

}