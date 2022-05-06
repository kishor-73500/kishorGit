package SeniumAssignment;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OpenDemOctiTime {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",".\\exicutables\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();//import statements
		driver.get("https://demo.actitime.com/");
		String title=driver.getTitle();
		System.out.println("Application Title: "+title);
		System.out.println("Title length: "+title.length());
		String sourceCode=driver.getPageSource();
		System.out.println("Source Code length: "+sourceCode.length());
		System.out.println("Application current URL: "+driver.getCurrentUrl());
		
		if(driver.getTitle().equals("actiTIME - Login")) {
			System.out.println("actiTIME log in page open successfully");
		}
		else {
			System.out.println("Eigther actiTIME log in page not open or its title got change");
		}
		driver.close();// to see page comment this method
		

	}

}
