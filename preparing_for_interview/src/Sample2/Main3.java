package Sample2;
public class Main3{
	public static void main(String[] args) {
    	int dayOfWeek = 3;
    	String day;
     	switch (dayOfWeek) {
        	case 1:
            	day = "Monday";
            	break;
        	case 2:
            	day = "Tuesday";
            	break;
        	case 3:
            	day = "Wednesday";
            	break;
        	default:
            	day = "Unknown";
    	}
     	System.out.println(day);
	}
}