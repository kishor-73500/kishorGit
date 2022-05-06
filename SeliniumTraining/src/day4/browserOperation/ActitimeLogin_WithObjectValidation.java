package day4.browserOperation;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ActitimeLogin_WithObjectValidation {

	public static void main(String[] args) {
		String driverPath=System.getProperty("user.dir")+"\\exicutables\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver",driverPath);
		WebDriver driver=new ChromeDriver();
		
		//maximize the browser window
		driver.manage().window().maximize();
		//implicit wait
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		
		driver.get("https://demo.actitime.com/login.do");
		
		//identify the required element from the UI
		WebElement userNameInputField=driver.findElement(By.id("username"));
		
		System.out.println("Username input field visibility status is: "+userNameInputField.isDisplayed());
		System.out.println("Username input field editable status is: "+userNameInputField.isEnabled());
		String actualDefualttextOUsernameField=userNameInputField.getAttribute("placeholder");
		System.out.println("DefualtText Validation for username field: "+actualDefualttextOUsernameField.equals("Username"));
		//perform appropriate action the identified element
		userNameInputField.sendKeys("admin");
		
		//identify the required element from the UI
		WebElement passwordInputField=driver.findElement(By.name("pwd"));
		 
		System.out.println("Password input field visibility status: "+passwordInputField.isDisplayed());
		System.out.println("Password input field editable status: "+passwordInputField.isEnabled());
		String actualDefaulttextOfPasswordField=passwordInputField.getAttribute("placeholder");
		System.out.println("Defualt text validation for password field: "+actualDefaulttextOfPasswordField.equals("Password"));
		
		//perform appropriate action the identified element
		passwordInputField.sendKeys("manager");
		
		
		WebElement checkBox=driver.findElement(By.name("remember"));
		
		System.out.println("keep me login check box visibility is: "+checkBox.isDisplayed());
		System.out.println("keep me login check box editable status is: "+checkBox.isEnabled());
		System.out.println("keep me login check box defualt status is: "+checkBox.isSelected());
		checkBox.click();
		System.out.println("keep me login check box defualt status is: "+checkBox.isSelected());
		
		//identify the required element from the UI
		WebElement loginButton=driver.findElement(By.id("loginButton"));
		System.out.println("Tag name from login button: "+loginButton.getTagName());
		
		System.out.println("Login button visibility status is : "+loginButton.isDisplayed());
		System.out.println("Login button clickable status is : "+loginButton.isEnabled());
		
		String actualButtonName=loginButton.getText();
		System.out.println("Login button mane validation: "+actualButtonName.equals("Login"));
		
		//perform appropriate action the identified element
		loginButton.click();
		
		//identify remember check box
		//driver.close();// uncomment karo very fast exicution
		
	}

}
/**
 * visible 		-----> isDisplayed()--true/false ---> input, button, link, radio button, checkbox, dropdown, image ....
 * functional   -----> isEnabled()  --true/false ---> input, button, link, radio button, checkbox, dropdown, image ....
 * selected     -----> isSelected() --true/false ---> radio button, checkbox
 * validate text-----> getText()    --String     ---> use to get inner text of any Web Element
 * 
 * <htmatag> innertext </htmltag>
 * <a href="https://www.google.com">Forgot Password</a>
 * <div     > Sample text </div>
 * <span    > Demo Text   </span>
 * <td      > Testing bug </td>
 * 
 * attribute validation: getAttribute(String attributename) --> String--> it will return attribute value based on the given name
 * 
 * <input type="text" name="username" value="" id="username" class="textField" placeholder="Username">
 * 
 * WebElement userNameInputField=driver.findElement(By.id("username"));
 * 
 * String acutalPlaceholderName=userNameInputField.getAttribute("placeholder");
 * String acutalClassName=userNameInputField.getAttribute("class");
 * String acutalName=userNameInputField.getAttribute("name");
 * String acutalTypeValue=userNameInputField.getAttribute("type");
 * 
  */
