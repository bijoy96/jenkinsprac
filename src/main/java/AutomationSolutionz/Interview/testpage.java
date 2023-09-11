package AutomationSolutionz.Interview;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class testpage {
	WebDriver driver;
	public testpage(WebDriver driver) {
		this.driver= driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="randomText")
	WebElement randomText;
	
	
	@FindBy(id="enter_text")
	WebElement enterText;
	
	
	@FindBy(id="verify_id")
	WebElement verifyId;
	
	
	
	@FindBy(id="text_showing")
	WebElement text_showing;
	
	public String click_signout_button() {
		String s1= randomText.getText();
		return s1;
	}
	
	public void click_dresses_button(String s) {
	 enterText.sendKeys(s);;
	}
	
	public void click_summer_dresses_button() {
		verifyId.click();
	}
	
	public String verify_button() {
		String te = text_showing.getText();
		return te;
	}
	
}
