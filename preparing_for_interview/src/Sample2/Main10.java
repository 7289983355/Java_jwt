package Sample2;
public class Main10 {
	
	public static void print(int a) {
    	System.out.println("int: " + a);
	}
 	
	public static void print(Integer a) {
    	System.out.println("Integer: " + a);
	}
	public static void print(Object a) {
    	System.out.println("Integer: " + a);
	}
	public static void main(String[] args) {
    	int a = 5;
    	Integer b = 10;
    	print(a);
    	print(b);
    	
	}
}

