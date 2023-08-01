package day_10;

/**
 *
 * @author skargopolov
 */
public class UserBuilderExample {
 public static void main(String[] agrs)
 {
     User user = new User.Builder("Sergey", "Kargopolov").city("Vancouver").build();
     System.out.println("User object toString() = " + user);
     System.out.println("User first name = " + user.getFirstName());
     System.out.println("City name = " + user.getCity());
 }
}