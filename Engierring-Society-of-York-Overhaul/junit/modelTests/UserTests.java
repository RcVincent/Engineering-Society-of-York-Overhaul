package modelTests;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test; 

import model.*;

public class UserTests {
	//Test users and admin
	
	private User user1, user2, user3;
	private User Admin1, Admin2;
	
	@Before
	public void setUp() {
		user1 = new User();
		user1.setAccountType("User");
		
		user1.setUsername("Sir Galahad");
		user1.setPassword("the pure");
		user1.setUserInformation("Graham", "Chapman", "lumberjacks@canada.com");
		
		
	}
}
