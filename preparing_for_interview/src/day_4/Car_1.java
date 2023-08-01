package day_4;
class Car_1{
    
   public String brand;
    
   public Car_1(String brand) {
     this.brand = brand;
   }
    
   public void setBrand(String brand) {
     this.brand = brand;
   }
    
  
   public static void main(String[] args) {
  
	   Car_1 Car_1 = new Car_1("Ford");
  
     System.out.println(Car_1.brand); //ford
  
     changeReference(Car_1);
  
     System.out.println(Car_1.brand);//ford
  
     modifyReference(Car_1);
  
     System.out.println(Car_1.brand);//ford
   }
    
   public static void changeReference(Car_1 localCar_1) {
     Car_1 honda = new Car_1("Honda");
     localCar_1 = honda;
   }
    
   public static void modifyReference(Car_1 localCar_1) {
     localCar_1.setBrand("Opel");
   }
  }