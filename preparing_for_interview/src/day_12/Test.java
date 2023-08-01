package day_12;

class Test {
    
  public static void main(String[] args) {

	  for (int i = 0; i < 10; i++) {
      
		  System.out.println("Value:" + i);
      
      if (i == 3) {
        break; // terminate the loop if condition is met
      }
    }
        
    System.out.println("Code after the loop...");
  }
}