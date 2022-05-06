package browserOperations;

import org.openqa.selenium.chrome.ChromeDriver;

public class ChromeBrowser {

	public static void main(String[] args) {
		String path1="D:\\workspace\\SeliniumTraining\\exicutables\\chromedriver.exe";
		String path2=".\\exicutables\\chromedriver.exe";
		String path3=System.getProperty("user.dir")+"\\exicutables\\chromedriver.exe";
		
		//set required browser executable path using System.setProperty(String key,String value)
		//System.setProperty("webdriver.chrome.driver", ".\\exicutables\\chromedriver.exe");
		//or
		System.setProperty("webdriver.chrome.driver", path3);
		//create an instance of required browser class
		ChromeDriver cdriver=new ChromeDriver();

	}

}
/**
 * Selenium always opens new browser for every run, it won't work on already opened browser
 * Browser open by selenium will not have any cookies or history or download history or plug-in
 */ 
