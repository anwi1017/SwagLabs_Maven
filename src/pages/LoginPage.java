package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import test.Baseclass;

public class LoginPage {
	
	WebDriver driver;
	ExtentReports report;
	ExtentTest test;
	
	//============ WebElements ==================
	
	@FindBy(xpath="//*[@id='user-name']")
	WebElement UserName;
	
	@FindBy(xpath="//*[@id='password']")
	WebElement Password;
	
	@FindBy(xpath="//*[@id='login-button']")
	WebElement Submit;
	

	//=============== Constructor ======================
	
	public LoginPage() {
		
		driver = Baseclass.driver;
		report = Baseclass.report;
		test = Baseclass.test;
		
		//PageFactory.initElements(driver, this);
	}
	
	
	// ============= Methods ==========================
	
	public void Login(String uname, String pass) {
		
		//WebElement UserName = driver.findElement(By.xpath("//*[@id='user-name']"));
		UserName.sendKeys(uname);
		//test.log(LogStatus.PASS, "Successfully entered the user name");
		
 		//WebElement Password = driver.findElement(By.xpath("//*[@id='password']"));
        Password.sendKeys(pass);
        //test.log(LogStatus.PASS, "Successfully entered the password");
        
 		//WebElement Submit = driver.findElement(By.xpath("//*[@id='login-button']"));
 		Submit.click();
	}

}
