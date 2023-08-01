package day_3;

public class ArmStrong {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 153;
		int sumCube=0;
		
		while (num > 0) {

			int remainder = num % 10;

			System.out.println("remainder " + remainder);
			
			sumCube=sumCube+remainder*remainder*remainder;
			System.out.println("sumCube "  +sumCube);
			int d = num / 10;
			
			    num=d;
			System.out.println("d " + d);
		}

		System.out.println("sumCube" +sumCube);
		
	}

}
