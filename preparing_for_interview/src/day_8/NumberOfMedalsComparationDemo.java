package day_8;
public class NumberOfMedalsComparationDemo {

	public static void main(String[] args) {

		// US team achievement
		NumberOfMedals american = new NumberOfMedals(40, 15, 15);

		// Japan team achievements
		NumberOfMedals japan = new NumberOfMedals(10, 5, 20);

		// South Korean team achievements
		NumberOfMedals korea = new NumberOfMedals(10, 5, 20);

		System.out.println("Medals of American equals Japan ? " + american.equals(japan));

		System.out.println("Medals of Korea equals Japan ? " + korea.equals(japan));
	}

}