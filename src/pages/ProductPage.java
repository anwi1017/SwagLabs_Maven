package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;

import test.Baseclass;

public class ProductPage {

	WebDriver driver;
	ExtentReports report;
	ExtentTest test;
	
	//============ WebElements ==================
	
	@FindBy(xpath="//*[@id='add-to-cart-sauce-labs-bolt-t-shirt']")
	WebElement goToCart;
	

	//=============== Constructor ======================
	
	public ProductPage() {
		
		driver = Baseclass.driver;
		report = Baseclass.report;
		test = Baseclass.test;
		
		//PageFactory.initElements(driver, this);
	}
	
	
	// ============= Methods ==========================
	
		public void SelectProduct(String Product) {
 		
		WebElement btnProductSelection = driver.findElement(By.xpath("//*[test()='" + Product + "']//following::button[1]"));
		btnProductSelection.click();
 		
	}
	
		public void GotoCart() {
			
			goToCart.click();
		}
}
