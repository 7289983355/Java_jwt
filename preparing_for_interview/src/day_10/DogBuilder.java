package day_10;


public class DogBuilder {
	
 public static void main(String[] agrs)
 
  {
     Dog dog = new Dog.DogBuilder().name("Potter").age(23).build();
     

     Dog dog1 = new Dog.DogBuilder().name("Potter").age(20).build();
     
     System.out.println(dog);
     
     System.out.println(dog1);
     
     
  }
}