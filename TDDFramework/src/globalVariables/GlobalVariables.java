package globalVariables;

import org.openqa.selenium.By;

public class GlobalVariables {

	public String applicationURL ="https://www.amazon.in/";
	public String testDataFileLocation = "F:\\\\MyProgress.xlsx";
	public By signInUserName = By.name("email");
	public By userNameContinue = By.id("continue");
	public By signIn = By.cssSelector("span[class=nav-action-inner]");
	public By myAccountOverlay = By.cssSelector("a[data-nav-ref='nav_ya_signin']");
	public By passwordField = By.cssSelector("input[type='password']");
	public By loginSubmitButton = By.id("signInSubmit");
	

}
