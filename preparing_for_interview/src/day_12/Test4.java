package day_12;

class Test4 {

	public static void main(String[] args) {
		first: // label

		for (int i = 1; i < 3; i++) {
			second: // label
			for (int j = 1; j < 4; j++) {
				
				if (j == 3) {
					continue second;
				}
				System.out.println("i: " + i + ", j:" + j);
			}
		}

		System.out.println("Code after the loop...");
	}
}

