package SeniumAssignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class VTigerLogin {

	public static void main(String[] args) {
		String driverPath=System.getProperty("user.dir")+"\\exicutables\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver",driverPath);
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://demo.vtiger.com/vtigercrm/index.php");
		
		WebElement userNameInputField=driver.findElement(By.id("username"));
		userNameInputField.clear();
		
		WebElement passWordInputField=driver.findElement(By.id("password"));
		passWordInputField.clear();
		
		userNameInputField.sendKeys("admin");
		passWordInputField.sendKeys("Test@123");
		
		WebElement signinButton=driver.findElement(By.className("button"));// fail ho rahi hai
		
		signinButton.click();
		
	
		

	}

}
