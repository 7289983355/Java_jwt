package day_3;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.print("Enter the string");

		Scanner scn = new Scanner(System.in);

		String str = scn.next();

		String str2 = str.replaceAll("\\s", "").toLowerCase();

		String sb = new StringBuilder(str2).reverse().toString();

		if (str2.equalsIgnoreCase(sb)) {

			System.out.println("The string '" + str + "' is a palindrome.");
		} else {
			System.out.println("The string '" + str + "' is not a palindrome.");
		}

	}

}
