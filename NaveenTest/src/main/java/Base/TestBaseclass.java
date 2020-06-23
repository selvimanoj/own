package Base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TestBaseclass {
	

	public static WebDriver driver;
	public static Properties prop;

	public TestBaseclass()  {
		try {
			prop = new Properties();
			FileInputStream fin = new FileInputStream(
					"C:\\ProjectPage\\NaveenTest\\src\\main\\java\\Utility\\config.properties");
		
		prop.load(fin);
		} catch (Exception e) {
			e.printStackTrace();
		}
		

	}
	
	public static void install() {
		String browsername = prop.getProperty("browser");
		if (browsername.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver", "C:\\ProjectPage\\NaveenTest\\Driver\\chromedriver.exe");
			driver= new ChromeDriver();
		}
		else if (browsername.equalsIgnoreCase("ff")) {
			System.setProperty("webdriver.gecko.driver", "C:\\ProjectPage\\NaveenTest\\Driver\\geckodriver.exe");
			driver= new FirefoxDriver();
		
	}
		
		driver.manage().window().maximize();
		driver.get(prop.getProperty("url"));
		}
	
	
}
