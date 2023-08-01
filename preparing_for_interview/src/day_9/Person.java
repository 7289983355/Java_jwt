package day_9;
public class Person {

  private int age;
  private String fullName;

  public Person(String fullName, int age) {
      this.fullName = fullName;
      this.age = age;
  }

  public int getAge() {
      return age;
  }

  public String getFullName() {
      return fullName;
  }
}