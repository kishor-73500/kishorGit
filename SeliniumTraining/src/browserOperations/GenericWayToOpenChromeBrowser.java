package browserOperations;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GenericWayToOpenChromeBrowser {

	public static void main(String[] args) {
		String driverPath1="D:\\workspace\\SeliniumTraining\\exicutables\\chromedriver.exe";
		//or
		String driverPath2=".\\exicutables\\chromedriver.exe";
		//or
		String driverPath3=System.getProperty("user.dir")+"\\exicutables\\chromedriver.exe";
		
		//step1: set driver executable path by using System.setProperty(String key,String value)
		System.setProperty("webdriver.chrome.driver",driverPath2);
		//step2: create an instance of Chrome Browser
		WebDriver driver=new ChromeDriver();

	}

}
