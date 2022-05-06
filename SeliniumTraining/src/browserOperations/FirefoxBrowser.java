package browserOperations;

import org.openqa.selenium.firefox.FirefoxDriver;

public class FirefoxBrowser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//get required browser executable path
		String path1="D:\\workspace\\SeliniumTraining\\exicutables\\geckodriver.exe";
		String path2=".\\exicutables\\geckodriver.exe";
		String path3=System.getProperty("user.dir")+"\\exicutables\\geckodriver.exe";
		System.setProperty("webdriver.gecko.driver", path2);
		
		FirefoxDriver fdriver=new FirefoxDriver();
	}

}

