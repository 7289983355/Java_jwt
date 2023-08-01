package day_11;

public class Test3 {

	public static void drawCircle() {
		System.out.println("Drawing circle...");
	}

	public static void main(String[] args) {

		Drawable drawable = Test3::drawCircle;
		drawable.draw();
	}
}