package testCases;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import testDataAndOtherStartupMethods.BrowserInstantiation;
import testDataAndOtherStartupMethods.TestDataAccessMethods;
import globalVariables.GlobalVariables;

public class BasicRead {

	public static void main(String[] args) throws IOException {
		
		BrowserInstantiation browserInstantiation = new BrowserInstantiation();
		browserInstantiation.browserStart();
		
		TestDataAccessMethods testDataAccessMethods = new TestDataAccessMethods();
		WebDriver driver = new ChromeDriver();
		GlobalVariables globalVariables = new GlobalVariables();
		Actions actions = new Actions(driver);
		
		
		driver.get(globalVariables.applicationURL);
		testDataAccessMethods.testDataFileSet(globalVariables.testDataFileLocation);
		WebElement myAccountoverlay = driver.findElement(globalVariables.myAccountOverlay);
		actions.moveToElement(myAccountoverlay).perform();
		
		WebElement signIn = driver.findElement(globalVariables.signIn);
		signIn.click();
		
		driver.findElement(globalVariables.signInUserName).sendKeys(testDataAccessMethods.testDataRead(1, 0));
		
		driver.findElement(globalVariables.userNameContinue).click();
		driver.findElement(globalVariables.passwordField).sendKeys(testDataAccessMethods.testDataRead(1, 1));
		driver.findElement(globalVariables.loginSubmitButton).click();
		

	}

}
