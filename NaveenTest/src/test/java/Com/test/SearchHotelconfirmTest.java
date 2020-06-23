package Com.test;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.pages.EntryPage;
import com.pages.LoginPage;
import com.pages.SearchHotelpage;
import com.pages.SelectHotel;

import Base.TestBaseclass;

public class SearchHotelconfirmTest  extends TestBaseclass{

	LoginPage lp;
	SearchHotelpage se;
	SearchHotelconfirmTest con;
	EntryPage e=  new EntryPage();
	SelectHotel x= new SelectHotel();
	
	public SearchHotelconfirmTest() {
	super();
	}
	
	@BeforeMethod
	public void set() {
		install();
		lp = new LoginPage();
		se = new SearchHotelpage();
	}
//	@Test
//	public void validate() {
//		se = lp.getUser(prop.getProperty("username"), prop.getProperty("password"));
//	}
//
//	@Test
//	public void validateLocation() {
//		se = lp.getUser(prop.getProperty("username"), prop.getProperty("password"));
//		se.getLocat();
//		se.getRoom();
//		se.getdat(prop.getProperty("CheckInDate"), prop.getProperty("CheckOutDate"));
//		se.adult();
//		se.getSubmi();
//	}
@Test
public void getTitle() throws InterruptedException {

	se = lp.getUser(prop.getProperty("username"), prop.getProperty("password"));
	se.getLocat();
	se.getRoom();
	se.getdat(prop.getProperty("CheckInDate"), prop.getProperty("CheckOutDate"));
	se.adult();
	se.getSubmi();
	Thread.sleep(3000);
	String currentUrl = driver.getCurrentUrl();
	System.out.println(currentUrl);
	System.out.println("s");
	Thread.sleep(3000);
	x.getradio();
	

}
	

	@AfterMethod
	public void tearDown() {

		driver.quit();
	}

}