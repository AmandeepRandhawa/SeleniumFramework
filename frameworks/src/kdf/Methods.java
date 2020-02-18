package kdf;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;


public class Methods {
	static WebDriver driver;
	public static void openBrowser() {
		driver = new ChromeDriver();
		
	}
	
	public static void maximizeBrowser() {
		driver.manage().window().maximize();
	}

	public static void implicitWait() {
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
	}
	public static void navigateToApplication(String url) {
		driver.get(url);
	}
	

	public static void enterUserID(String loc, String locValue, String userID) {
		if(loc.equals("id")){
				driver.findElement(By.id(locValue)).sendKeys(userID);
		}
		else if (loc.equals("name")) {
			driver.findElement(By.name(locValue)).sendKeys(userID);
			
		}
	}
	
	public static void enterPassword(String locValue, String password) {
		driver.findElement(By.id(locValue)).sendKeys(password);
	}
	public static void clickSignIn(String loc, String locValue) {
		if(loc.equals("id")) {
			driver.findElement(By.id(locValue)).click();
		}
		else if (loc.equals("name")) {
			driver.findElement(By.name(locValue)).click();
		}
		
	}
	public static void verifyErrorMessage(String locValue, String expectedMsg) {
		String actualMsg = driver.findElement(By.cssSelector(locValue)).getText();
		Assert.assertEquals(actualMsg, expectedMsg);
			
	}
	
	public static void closeApplication() {
		driver.close();
		}
}
