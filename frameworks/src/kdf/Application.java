package kdf;

import java.io.IOException;

import org.testng.annotations.Test;

import utils.GenericMethods;

public class Application {
	@Test
	public void applicationLoginTest() throws IOException {
		String[][] data = GenericMethods.getData("C:\\Users\\User\\Desktop\\userData.xlsx", "sheet2");
		for(int i=1; i<data.length;i++) {
			switch(data[i][3]) {
			
			case "openBrowser":
				Methods.openBrowser();
				break;
			
			case "maxBrowser":
				Methods.maximizeBrowser();
				break;
			
			case "impWait":
				Methods.implicitWait();
				break;
			
			case "NavToApplication":
				Methods.navigateToApplication(data[i][6]);
				break;
				
			case "enteUserID":
				Methods.enterUserID(data[i][4], data[i][5], data[i][6]);
				break;
				
			case "enterPassword":
				Methods.enterPassword(data[i][5], data[i][6]);
				break;
				
			case "ClickLogin":
				Methods.clickSignIn(data[i][4], data[i][5]);
				break;
				
			case "verifyErrMsg":
				Methods.verifyErrorMessage(data[i][5], data[i][6]);
				break;
				
			case "closeBrowser":
				
			}
		}
	}

}
