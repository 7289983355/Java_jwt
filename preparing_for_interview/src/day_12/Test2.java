package day_12;

class Test2 {
    
  public static void main(String[] args) {
    first:// label
      
    	for (int i = 1; i < 10; i++) {
        second:// label
        
        	for (int j = 1; j < 4; j++) {
          System.out.println("i: " + i + ", j:" + j);
          if (j == 3) {
            break first;
          }
        }
      }
        
      System.out.println("Code after the loop...");
  }
}