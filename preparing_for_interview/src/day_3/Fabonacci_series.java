package day_3;

import java.util.Scanner;

public class Fabonacci_series {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scn = new Scanner(System.in);

		System.out.println("Enter te first number : ");
		int number = scn.nextInt();

		int first = 0;
		int second = 1;
	
		System.out.print("Fibonacci Series: " + first + ", " + second );
		for (int i = 3; i < number; i++) {

		int 	third = first + second;
			System.out.print(""+third);
			first = second;
			second = third;
		}

		

	}

}
