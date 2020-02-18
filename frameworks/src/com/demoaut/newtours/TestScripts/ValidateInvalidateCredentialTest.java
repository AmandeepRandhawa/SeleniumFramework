package com.demoaut.newtours.TestScripts;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.demoaut.newtours.Pages.Login;
import com.demoaut.newtours.Pages.SignOn;

import utils.GenericMethods;



public class ValidateInvalidateCredentialTest {

WebDriver driver;
@BeforeTest

public void openBrowser() {
	System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
driver = new ChromeDriver();
driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
driver.get("http://newtours.demoaut.com");

}



@Test
public void verifyInvalidCredential() throws IOException {
Login lp = new Login(driver);
SignOn so = new SignOn(driver);

String[][] data = GenericMethods.getData("/Users/randhawa/Desktop/Workbook3.xlsx", "Sheet1");



for(int i=1; i<data.length;i++)
{


lp.ApplicationLogin("data[i][0]", "data[i][1]");

Boolean signOnLinkVisible = so.signOnVisible().isDisplayed();
Assert.assertTrue(signOnLinkVisible);


driver.navigate().back();
}



}

@AfterTest
public void closeApplication() {
driver.close();
}




}