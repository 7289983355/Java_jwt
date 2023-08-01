package day_12;
class BreakOutOfNestedLoop {

  public static void main(String[] args) {

    int[] arr1 = {1, 2, 3, 4, 5};

    int[] arr2 = {6, 7, 8, 9, 10};

    // enhanced for-loops
    outer: for (int k : arr1) {
    	
    	System.out.println("");
    	System.out.println(k);
    	System.out.println("==================");
    	
      inner: for (int i : arr2) {
    	  
    	  // nested for-loop
        if (k + i == 12) {
          break inner;
        }
        
        System.out.println(i);
      }
      
    }
  }

}