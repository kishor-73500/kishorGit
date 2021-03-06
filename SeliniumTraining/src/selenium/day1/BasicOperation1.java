package selenium.day1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BasicOperation1 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", ".\\exicutables\\chromedriver.exe");
		//creating an object of chromedriver class and upcasting it to WebDriver interface
		WebDriver driver=new ChromeDriver();//import
		//enter required application url
		driver.get("https://www.google.com");
		//implicit wait
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);//import
		//get the web page title
		//System.out.println("Current Page title is: "+driver.getTitle());
				//or
		String pageTitle=driver.getTitle();
		System.out.println("Current Page title is: "+pageTitle);
		//get current web page url
		System.out.println("Current page url: "+driver.getCurrentUrl());
		//get page source code
		System.out.println("Current web page source code: "+driver.getPageSource());
		//close current instance of browser
		//driver.close();	

	}

}
