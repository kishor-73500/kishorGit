package SeniumAssignment;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoSiteLogin {

	public static void main(String[] args) {
		String driverPath=System.getProperty("user.dir")+"\\exicutables\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver",driverPath);
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://demosite.executeautomation.com/Login.html");
	
		
		driver.findElement(By.name("UserName")).sendKeys("execution");
		driver.findElement(By.name("Password")).sendKeys("admin");
		driver.findElement(By.name("Login")).click();//error name atribute is not working for login button // hamesha attributes kam karenge aisa nahi
		                                             // use css selector

	}

}
