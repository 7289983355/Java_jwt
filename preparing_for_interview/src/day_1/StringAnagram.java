package day_1;
import java.util.Scanner;

public class StringAnagram {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the first string: ");
        String str1 = input.nextLine().replaceAll("\\s", "").toLowerCase();

        System.out.print("Enter the second string: ");
        String str2 = input.nextLine().replaceAll("\\s", "").toLowerCase();

        if (str1.length() != str2.length()) {
            System.out.println("The entered strings are not anagrams.");
            input.close();
            return;
        }

        int[] count1 = new int[26];
        int[] count2 = new int[26];

        for (int i = 0; i < str1.length(); i++) {
        	
        	System.out.print(str1.charAt(i) - 'a');
         	System.out.print(str2.charAt(i) - 'a');
        	
            count1[str1.charAt(i) - 'a']++;
            count2[str2.charAt(i) - 'a']++;
        }

        boolean isAnagram = true;
        for (int i = 0; i < 26; i++) {
            if (count1[i] != count2[i]) {
                isAnagram = false;
                break;
            }
        }

        if (isAnagram) {
            System.out.println("The entered strings are anagrams.");
        } else {
            System.out.println("The entered strings are not anagrams.");
        }

        input.close();
    }
}