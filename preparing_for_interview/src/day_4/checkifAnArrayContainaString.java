package day_4;

public class checkifAnArrayContainaString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String[] programmingLanguages = {"Python", "Kotlin", "Ruby", "JavaScript", "C#", "Java", "Flutter"};

		
//		for(int i=0 ;i<programmingLanguages.length;i++) {
//			
//			if(programmingLanguages[i].equalsIgnoreCase("java")) {
//				
//				System.out.println("programmingLanguages " +programmingLanguages[i]);
//				break;
//			}
//			
//		}
		
		
		
		for (String lang : programmingLanguages) {
		      if (lang.equals("Java")) {
		        System.out.println("It does contain!");
		        break; // value found, exit the loop
		      }
		    }
		

	}

}
