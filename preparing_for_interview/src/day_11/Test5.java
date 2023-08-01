package day_11;
public class Test5 {

  public void drawCircle() {
    System.out.println("Drawing circle...");
  }

  public static void main(String[] args) {
	  
	  
	  Drawable drawable =() -> System.out.println("drawing.............");
	  
	  drawable.draw();
	  
	  
	  Test5  test =new Test5();
	  

	  Drawable draw =() ->test.drawCircle();
	  
	  draw.draw();
  }
}