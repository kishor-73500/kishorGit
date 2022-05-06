package browserOperations;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OpenGoogle {

	public static void main(String[] args) {
		//Open Chrome browser
		//step-1 executable path
		System.setProperty("webdriver.chrome.driver",".\\exicutables\\chromedriver.exe");
		//step-2 create an instance of required browser
		WebDriver driver=new ChromeDriver();
		//enter google url
		driver.get("https://www.google.com/");
		// Get current page source code and print the length in the console
		String sourceCode=driver.getPageSource();
		System.out.println("ApplicatiGoogleon Source Code: "+sourceCode);
		System.out.println("Source Code length:"+sourceCode.length());
		//Get current url from the application and print in the console
		System.out.println("Application current URL: "+driver.getCurrentUrl());
		//Get current page title and print in the console
		System.out.println("Application Title: "+driver.getTitle());
		
		if(driver.getTitle().equals("Google")) {
		System.out.println("Goole search page open successfully");
		}
		else {
			System.out.println("Eigther google page not open or its title got change");
		}
		//close current instance of browser
		//driver.close(); // to see page comment it otherwise fast exicution

		

	}

}
/**
* 1. Open chrome browser 
* 2. Enter https://www.google.com 
* 3. Get current page title and print in the console 
* 4. Get current url from the application and print in the console 
* 5. Get current page source code and print the length in the console 
* 6. close the browser once all the above operations are done
*/
