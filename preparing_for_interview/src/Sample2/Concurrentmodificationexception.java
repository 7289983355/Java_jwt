package Sample2;

import java.util.ArrayList;
import java.util.Iterator;

public class Concurrentmodificationexception {

	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<>();

		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);

		Iterator<Integer> itr = list.iterator();

		while (itr.hasNext()) {

			Integer data = itr.next();
			
			if(data.equals(3)) {
				list.remove(data); 	
			}
			  

		}

	}

}