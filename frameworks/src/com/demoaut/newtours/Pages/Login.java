
package com.demoaut.newtours.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login {
@FindBy(name="userName")
private WebElement uName;

@FindBy(name="password")
private WebElement pass;

@FindBy(name="login")
private WebElement submit;

public Login(WebDriver driver) {
PageFactory.initElements(driver, this);
}


public void ApplicationLogin(String userName, String password) {
uName.clear();
uName.sendKeys(userName);
pass.sendKeys(password);
submit.click();
}


}