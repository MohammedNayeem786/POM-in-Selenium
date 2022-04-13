package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class LoginPage {
	
	WebDriver driver;

	
	public LoginPage(WebDriver driver ) {
		this.driver=driver;
		
	}
	
	@FindBy(how=How.ID,using="txtUsername")
	WebElement UserName;
	
	@FindBy(how=How.ID,using="txtPassword")
	WebElement Password;
	
	@FindBy(how=How.XPATH,using="//*[@id=\"btnLogin\"]")
	WebElement LoginBtn;
	
	public void LoginHRM(String Uname,String Psd) {
		UserName.sendKeys(Uname);
		Password.sendKeys(Psd);
		LoginBtn.click();
	}  
	
	
	
}
