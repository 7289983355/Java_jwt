package day_1;

public class FirstNonRepeatedCharacter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String name="\0dharmesh";
		
		
	int count[] = new int[256];
		
		for(int i=0 ;i<name.length();i++) {
			
			 count[name.charAt(i)-'a']++;
		}

	}

}
