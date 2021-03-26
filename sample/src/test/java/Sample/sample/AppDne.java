package Sample.sample;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;



public class AppDne {
	
	 @Test
		public void testApp()
	    {
	    	System.out.println("hello world done");
	    }
	 
	 @Test
	 public void chromeTest() {
		 WebDriverManager.chromedriver().setup();
		 ChromeOptions options = new ChromeOptions();
	        options.addArguments("--headless");

		 ChromeDriver driver = new ChromeDriver(options);
			driver.get("https://www.sugarcrm.com/request-demo/");
			System.out.print(driver.getTitle());
			driver.close();
	 }

}
