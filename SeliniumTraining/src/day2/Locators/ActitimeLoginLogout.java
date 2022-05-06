package day2.Locators;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ActitimeLoginLogout {

	public static void main(String[] args) {
		String driverPath=System.getProperty("user.dir")+"\\exicutables\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", driverPath);
		WebDriver driver=new ChromeDriver();
		//implicit wait
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);//agar nahi lagaya to script fail
		driver.get("https://demo.actitime.com/login.do");
		String expectedTitle="actiTIME - Login";
		String actualTitle=driver.getTitle();
		if(actualTitle.equals(expectedTitle)) {
			System.out.println("Login page open Successfully");
		}
		else {
			System.out.println("Either login page not opened or page title got changed");
		}
		//identify the required element from the UI and perform reqiored action 0-30
		driver.findElement(By.id("username")).sendKeys("admin");
		//identify the required element from the UI and perform reqiored action 0-30
		driver.findElement(By.name("pwd")).sendKeys("manager");
		//identify the required element from the UI and perform reqiored action
		driver.findElement(By.id("loginButton")).click();//0-30
		
		//driver.findElement(By.linkText("Logout")).click(); //0-30
				driver.findElement(By.id("logoutLink")).click();
				
		//close browser
		//driver.close();

	}

}
