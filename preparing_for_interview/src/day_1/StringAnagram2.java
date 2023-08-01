package day_1;
import java.util.Scanner;

public class StringAnagram2 {
    public static void main(String[] args) {

    
        int[] arr = new int[26];
        
        String s="abcdefghijklmnopabcdefghijklmnop";
      
        for (int i = 0; i <s.length(); i++) {
        	
        	
     
         	
         	arr[s.charAt(i)-'a']++;
        }

        
    }
}