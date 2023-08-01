package day_8;

public class User implements Comparable<User>  {
	
	public int userId;
	  public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String username;
	  public String address;
	  
	  

	public User(int userId, String username, String address) {
		super();
		this.userId = userId;
		this.username = username;
		this.address = address;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	@Override
	public int compareTo(User o) {
		// TODO Auto-generated method stub
		
		if(this.userId==o.getUserId())
			return 0;
		

		if(this.userId>o.getUserId())
			return 1;
		

		if(this.userId<o.getUserId())
			return -1;
		
		return userId;
	}

}
