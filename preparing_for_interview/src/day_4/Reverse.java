package day_4;

import java.util.Arrays;

public class Reverse {

	public static void main(String[] args) {

		Integer[] array = new Integer[] { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		
		// for (int i = 0, j = array.length - 1; j >= i; i++, j--) 

		for (int i = 0; i < array.length; i++) {

			for (int j = i+1; j < array.length; j++) {

				int temp = array[i];
				array[i] = array[j];
				array[j] = temp;
			}
		}
		// print the elements
		Arrays.stream(array).forEach(item -> System.out.print(item + " "));
	}
}