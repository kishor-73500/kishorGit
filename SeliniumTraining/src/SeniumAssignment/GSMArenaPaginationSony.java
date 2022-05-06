package SeniumAssignment;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class GSMArenaPaginationSony {

	public static void main(String[] args) throws InterruptedException {
		String driverPath = System.getProperty("user.dir") + "\\exicutables\\chromedriver.exe";
		//step1: set driver executable path by using System.setProperty(String key,String value)
		System.setProperty("webdriver.chrome.driver", driverPath);
		//step2: create an instance of Chrome Browser
		WebDriver driver = new ChromeDriver();
		//maximize browser
		driver.manage().window().maximize();
		//implicit wait
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		WebDriverWait wait=new WebDriverWait(driver,20); 
		driver.get("https://www.gsmarena.com/sony-phones-7.php");
		List<WebElement> paginationLinks=driver.findElements(By.xpath("//div[@class='nav-pages']/a"));//list la import util
		if(paginationLinks.size()>0) {
			System.out.println("pagination exist......");
		}
		for(int i=0;i<paginationLinks.size();i++) {
			wait.until(ExpectedConditions.elementToBeClickable(paginationLinks.get(i)));
			paginationLinks.get(i).click();
			System.out.println(driver.getCurrentUrl());
			Thread.sleep(2000);
			paginationLinks=driver.findElements(By.xpath("//div[@class='nav-pages']/a"));// reinitilize elements bcs of StsleElementException
		}
		

	}

}
/*TC4:
1.	Open gsmarena.com
1.Validate home page
2.Click on sony phone link present in phone finder
3.Get device count and print on console
4.Print all the device names on the console*/

