package Sample.sample;
import org.openqa.selenium.chrome.ChromeDriver;
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
		 ChromeDriver driver = new ChromeDriver();
			driver.get("https://www.sugarcrm.com/request-demo/");
			System.out.print(driver.getTitle());
			driver.close();
	 }

}
