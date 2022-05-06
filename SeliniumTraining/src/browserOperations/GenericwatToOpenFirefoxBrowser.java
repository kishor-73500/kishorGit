package browserOperations;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class GenericwatToOpenFirefoxBrowser {

	public static void main(String[] args) {
		String driverPath1="D:\\workspace\\SeliniumTraining\\exicutables\\geckodriver.exe";
		//or
		String driverPath2=".\\exicutables\\geckodriver.exe";
		//or
		String driverPath3=System.getProperty("user.dir")+"\\exicutables\\geckodriver.exe";
		
		//step1: set driver executable path by using System.setProperty(String key,String value)
		System.setProperty("webdriver.gecko.driver",driverPath3);
		//step2: create an instance of Firefox Browser
		WebDriver driver=new FirefoxDriver();

	}

}
