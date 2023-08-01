package day_7;

class User {
  private String name;
  private String username;
  private String membershipType;
  private String address;

  public User(String name, String username, String membershipType, String address) {
    this.name = name;
    this.username = username;
    this.membershipType = membershipType;
    this.address = address;
  }

  public String getMembershipType() {
    return membershipType;
  }

  @Override
  public String toString() {
    return "name: " + name + " ," + "username: " + username;
  }
}