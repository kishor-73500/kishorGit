package day6.Dropdown;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HandlingMultiSelectDropdownList {

	public static void main(String[] args) {
		String driverPath=System.getProperty("user.dir")+"\\exicutables\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", driverPath);
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		driver.get("http://omayo.blogspot.com/");
		
		//**** Idetify dropdown list
		WebElement carDropdown=driver.findElement(By.id("multiselect1"));
		//**** Create an instance of Select class and pass above element into its constructor
		Select multiSelect=new Select(carDropdown);// vvimp  const me argument dekho >>import
		//**** check whether dropdown is multiselect dropdown or not
		System.out.println("Is dropdown allowing you to select multiple option: "+multiSelect.isMultiple());
		//**** get default or already select option
		//WebElement selectedOption=selectSkill.getFirstSelectedOption();
		//String selectedOptionName=selectedOption.getText();
		//System.out.println("Allready select option name: "+multiSelect.getFirstSelectedOption().getText());// exception >> no element selected here
		
		//get option count
		List<WebElement> options=multiSelect.getOptions();
		System.out.println("Option count is: "+options.size());
		for(int i=0;i<options.size();i++) {
			System.out.println("Option "+i+": "+options.get(i).getText());
		}
			//select options from dropdown
			multiSelect.selectByIndex(0);
			multiSelect.selectByIndex(2);
			//multiSelect.selectByIndex(3);
		//	multiSelect.selectByValue("Hyundaix");
			multiSelect.selectByVisibleText("Audi");
			
			//get all the selected options
			List<WebElement> selectcars=multiSelect.getAllSelectedOptions();
			System.out.println("Selected car count: "+selectcars.size());
		
			//unselect already select options
	//		multiSelect.deselectByIndex(0);
	//		multiSelect.deselectByValue("Hyundaix");
	//		multiSelect.deselectByVisibleText("Audi");
			//or
			multiSelect.deselectAll();
		

	}

}
