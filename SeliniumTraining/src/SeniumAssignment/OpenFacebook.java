package SeniumAssignment;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class OpenFacebook {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver",".\\exicutables\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();// import statements for both
		driver.get("https://www.facebook.com");
		System.out.println("Application Title: "+driver.getTitle());
		
		if(driver.getTitle().equals("Facebook – log in or sign up")) {
			System.out.println("Facebook log in page open successfully");
		}
		else {
			System.out.println("Eigther facebook log in  page not open or its title got change");
		}
		driver.close();

	}

}
