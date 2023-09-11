package AutomationSolutionz.Interview;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;





public class testcases {

	WebDriver driver = new ChromeDriver();
	testpage testpage = new testpage (driver);
	
	@BeforeTest
	public void before_test() throws IOException {
		driver.get("https://demo.zeuz.ai/web/level/one/actions/save_text");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().window().fullscreen();
	}
	
	@Test(priority=1)
	public void reg_Positive() {
		String s2= testpage.click_signout_button();
		testpage.click_dresses_button(s2);
		testpage.click_summer_dresses_button();
		Assert.assertEquals(testpage.verify_button(), "You have successfully verified the text");

	}
	
	@AfterTest
	public void after_test() {
		driver.close();
	}
	
	
}
