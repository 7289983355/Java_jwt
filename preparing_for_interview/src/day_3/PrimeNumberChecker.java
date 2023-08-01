package day_3;

import java.util.Scanner;

public class PrimeNumberChecker {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Enter the number :");
		Scanner scn =new Scanner(System.in);
		
		 int number=scn.nextInt();
		 
		 boolean isPrime = true;
		 
		 
		 if(number<=1) {
			 System.out.println("it is 8 the prime number "); 
		 }
		
		 
		
		for(int i=2 ;i<Math.sqrt(number);i++) {
			
			  if(number%2==0) {
				  
				  isPrime=false;
				  break;
			  }
			
		}
		
		
		if(isPrime) {
			
			System.out.println("it is not the prime number ");
		}else {
			System.out.println("it is 8 the prime number ");
		}

	}

}
