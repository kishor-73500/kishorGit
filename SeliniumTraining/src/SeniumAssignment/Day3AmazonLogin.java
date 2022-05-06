package SeniumAssignment;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day3AmazonLogin {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", ".\\exicutables\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		String currentPageTitle1=driver.getTitle();
		System.out.println("Get currentpagetitle1: "+ currentPageTitle1);
		WebElement MobileFunctinality=driver.findElement(By.className("nav-a"));// error 
		MobileFunctinality.click();

	}

}
