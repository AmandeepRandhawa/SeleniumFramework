package com.demoaut.newtours.TestScripts;


import java.util.concurrent.TimeUnit;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Base {

WebDriver driver;
@BeforeClass

public void openBrowser() {
driver = new ChromeDriver();
driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
driver.get("http://newtours.demoaut.com");

}

@AfterClass
public void closeApplication() {
driver.close();
}


}