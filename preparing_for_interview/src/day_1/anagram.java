package day_1;

import java.util.Arrays;
import java.util.Scanner;

public class anagram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner in =new Scanner(System.in);
		
		System.out.print("Enter the first string: ");
        String str1 = in.nextLine().replaceAll("\\s", "").toLowerCase();
		
        System.out.print("Enter the second string: ");
        String str2 = in.nextLine().replaceAll("\\s", "").toLowerCase();
        
        
        char[] arr1=  str1.toCharArray();
        char[] arr2=  str2.toCharArray();
        
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        
       boolean isAnagram = Arrays.equals(arr1, arr2);
       if (isAnagram) {
           System.out.println("The entered strings are anagrams.");
       } else {
           System.out.println("The entered strings are not anagrams.");
       }
       in.close();

	}

}
