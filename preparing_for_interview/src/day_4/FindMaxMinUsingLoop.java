package day_4;

public class FindMaxMinUsingLoop {
	public static void main(String[] args) {
		int[] array = { 5, 12, 9, 18, 3, 21 };

		int max = array[0];
		int min = array[0];

		for (int i = 0; i < array.length; i++) {

			if (max < array[i]) {

				max = array[i];
			}

			if (min > array[i]) {

				min = array[i];
			}

		}

		
		System.out.println(max);
		System.out.println(min);
		
	}
}