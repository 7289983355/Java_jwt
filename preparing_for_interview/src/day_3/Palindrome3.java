package day_3;

import java.util.Scanner;

public class Palindrome3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.print("Enter the string");

		Scanner scn = new Scanner(System.in);

		String str = scn.next();


		int start = 0;
		int end = str.length() - 1;
		boolean isPalindrome = true;

		while (start <= end) {

			if (str.charAt(start) != str.charAt(end)) {

				isPalindrome = false;
				break;
			}
			
			start++;
			end--;

		}

		if (isPalindrome) {

			System.out.println("yes");
		} else {
			System.out.println("no");

		}

	}

}
