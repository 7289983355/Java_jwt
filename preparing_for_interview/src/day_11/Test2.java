package day_11;
public class Test2 {

  public void drawCircle() {
    System.out.println("Drawing circle...");
  }

  public static void main(String[] args) {
	  
	  
	    Test2 test = new Test2();
	    Drawable drawable = test::drawCircle;
	    drawable.draw();
  }
}