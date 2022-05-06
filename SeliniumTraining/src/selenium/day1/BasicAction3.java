package selenium.day1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BasicAction3 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", ".\\exicutables\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.actitime.com/login.do");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		System.out.println("Page Title before login: "+driver.getTitle());
		WebElement userNameInputField=driver.findElement(By.id("username"));
		userNameInputField.sendKeys("admin");
		WebElement passwordInputField=driver.findElement(By.name("pwd"));
		passwordInputField.sendKeys("manager");
		WebElement loginButton=driver.findElement(By.id("loginButton"));
		loginButton.click();
		Thread.sleep(2000);//add throw exception
		System.out.println("Page title After login: "+driver.getTitle());
		//logoutLink
		
		WebElement logoutLink=driver.findElement(By.cssSelector("a[href='Login.html']"));// //id=logout link se run hogi
		logoutLink.click();
		//close current browser
		//driver.close();
		
		

	}

}
