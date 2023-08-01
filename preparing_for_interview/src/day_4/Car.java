package day_4;
class Car {
    
  int numberOfSeats = 4;
    
  void addOneSeat(int numberOfSeats) {
   numberOfSeats = numberOfSeats + 1; // changes will only affect the local variable
  }
    
  public static void main(String args[]) {
    Car car = new Car();
    
    System.out.println("Number of seats before the change: " + car.numberOfSeats);
    
    car.addOneSeat(car.numberOfSeats);
    
    System.out.println("Number of seats after the change " + car.numberOfSeats);
  }
}

