package selenium.day1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class day61OrangeHRM {

	public static void main(String[] args) {
		//step1: set driver executable path by using System.setProperty(String key,String value)
		System.setProperty("webdriver.chrome.driver",".\\exicutables\\chromedriver.exe");
		//step2: create an instance of Chrome Browser
		WebDriver driver=new ChromeDriver();
		//maximize the browser window
		driver.manage().window().maximize();
		//implicit wait
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		driver.get("https://opensource-demo.orangehrmlive.com/");
		String cred=driver.findElement(By.tagName("span")).getText();
		System.out.println(cred);
		/*cred=cred.replace("( Username : ", "");
		cred=cred.replace(" | Password : ", " ");
		cred=cred.replace(" )", "");
		System.out.println(cred);
		
		String[] logindetails=cred.split(" ");
		driver.findElement(By.id("txtUsername")).sendKeys(logindetails[0]);
		driver.findElement(By.id("txtPassword")).sendKeys(logindetails[1]);
		driver.findElement(By.id("btnLogin")).click();
		*/
	
		//or
		
		String[] logindetails=cred.split(" ");//( Username : Admin | Password : admin123 ) isko space nikalke split karegi 
		driver.findElement(By.id("txtUsername")).sendKeys(logindetails[3]);//give index..>>( Username : Admin | Password : admin123 )
		driver.findElement(By.id("txtPassword")).sendKeys(logindetails[7]);
		driver.findElement(By.id("btnLogin")).click();
		
	}

}
