package Com.test;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.pages.LoginPage;
import com.pages.SearchHotelpage;

import Base.TestBaseclass;

public class SearchHotelTest extends TestBaseclass {

	LoginPage lp;
	SearchHotelpage se;

	public SearchHotelTest() {
		super();
	}

	@BeforeMethod
	public void set() {
		install();
		lp = new LoginPage();
		se = new SearchHotelpage();
	}
	@Test
	public void validate() {
		se = lp.getUser(prop.getProperty("username"), prop.getProperty("password"));
	}

	@Test
	public void validateLocation() {
		se = lp.getUser(prop.getProperty("username"), prop.getProperty("password"));
		se.getLocat();
		se.getRoom();
		se.getdat(prop.getProperty("CheckInDate"), prop.getProperty("CheckOutDate"));
		se.adult();
		se.getSubmi();

	}

	

	@AfterMethod
	public void tearDown() {

		driver.quit();
	}

}
