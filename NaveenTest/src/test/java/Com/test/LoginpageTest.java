package Com.test;

import org.junit.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.pages.LoginPage;
import com.pages.SearchHotelpage;

import Base.TestBaseclass;

public class LoginpageTest extends TestBaseclass {
	LoginPage lp;
	SearchHotelpage se;

	public LoginpageTest() {
		super();
	}

	@BeforeMethod
	public void setup() {
		install();
		lp = new LoginPage();
		se = new SearchHotelpage();

	}

	@Test
	public void logoTest() {
		boolean b = lp.getlogo();
		Assert.assertTrue(true);
	}

	@Test
	private void validateUser() {
		se = lp.getUser(prop.getProperty("username"), prop.getProperty("password"));
	}

	@AfterMethod
	public void tearDown() {
		driver.quit();
	}

}
