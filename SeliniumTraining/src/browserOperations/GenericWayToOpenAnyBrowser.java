package browserOperations;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class GenericWayToOpenAnyBrowser {

	public static void main(String[] args) {
	String geckoDriverPath=System.getProperty("user.dir")+"\\exicutables\\geckodriver.exe";
	String chromeDriverPath=System.getProperty("user.dir")+"\\exicutables\\chromedriver.exe";
	
	openBrowser(chromeDriverPath,"Chrome");// ek ek check karo
	openBrowser(geckoDriverPath,"firefox");

	}
	static void openBrowser(String driverPath,String browserName) {
		if(browserName.equalsIgnoreCase("Chrome")){
			//step1: set driver executable path by using System.setProperty(String key,String value)
			System.setProperty("webdriver.chrome.driver",driverPath);
			//step2: create an instance of chrome Browser
			WebDriver driver=new ChromeDriver();// WebDriver and ChromeDriver dono ko import statement mngega
		}
		else if(browserName.equalsIgnoreCase("firefox")) {
			//step1: set driver executable path by using System.setProperty(String key,String value)
			System.setProperty("webdriver.gecko.driver",driverPath);
			//step2: create an instance of Firefox Browser
			WebDriver driver=new FirefoxDriver();
		}
	}

}
