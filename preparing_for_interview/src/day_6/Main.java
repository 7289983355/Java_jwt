package day_6;

public class Main{

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Square squarefinder = new Square() {

			@Override
			public int squart(int x) {
				// TODO Auto-generated method stub
				return x * x;
			}

		};

		System.out.println(squarefinder.squart(5));

	}
}

