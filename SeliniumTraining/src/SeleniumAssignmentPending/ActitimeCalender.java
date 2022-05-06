package SeleniumAssignmentPending;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ActitimeCalender {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		WebDriverWait wait=new WebDriverWait(driver,20);
		
		driver.get("https://demo.actitime.com/login.do");

		driver.findElement(By.id("username")).sendKeys("admin");
		driver.findElement(By.name("pwd")).sendKeys("manager");
		
		WebElement checkbox=driver.findElement(By.cssSelector("#keepLoggedInCheckBox"));
		checkbox.click();
		System.out.println(checkbox.isSelected());
		driver.findElement(By.id("loginButton")).click();
		
		driver.findElement(By.id("container_tasks")).click();
		driver.findElement(By.cssSelector(".title.ellipsis")).click();
		driver.findElement(By.cssSelector(".item.createNewTasks")).click();
		
		driver.findElement(By.cssSelector("div.customerSelector.customerOrProjectSelector.selectorWithPlaceholderContainer>div.components_combobox>div.comboboxButton>div.selectedItem")).click();
		driver.findElement(By.xpath("//div[text()='Our company' and @class='itemRow cpItemRow ' or @class='itemRow cpItemRow selected']")).click();
		driver.findElement(By.cssSelector(".projectSelector>.components_combobox.cpCombobox>.comboboxButton>.selectedItem")).click();
		driver.findElement(By.cssSelector("tr.selectProjectRow.projectSelectorRow>td:nth-child(1)>div>div>div:nth-child(2)>div>div:nth-child(1)>div>div:nth-child(5)")).click();
		
		WebElement task=driver.findElement(By.cssSelector("tbody>tr>td.nameCell>input.inputFieldWithPlaceholder:nth-child(1)"));
		wait.until(ExpectedConditions.elementToBeClickable(task));
		task.click();
		task.sendKeys("Testing");
		
		driver.findElement(By.id("ext-gen45")).click();
		WebElement date=driver.findElement(By.id("ext-gen110"));
		wait.until(ExpectedConditions.elementToBeClickable(date));
		date.click();
		
		WebElement date1=driver.findElement(By.cssSelector("#ext-gen95>#ext-gen99>#ext-gen103>#ext-gen104>#ext-gen105>tbody>tr:nth-child(2)>td>table>tbody>tr:nth-child(3)>td:nth-child(2)"));
		wait.until(ExpectedConditions.elementToBeClickable(date1));
		date1.click();
		
		driver.findElement(By.cssSelector(".createTasksTable>tbody>tr:nth-child(1)>td:nth-child(5)>div.typeOfWorkButton.editable>div")).click();
		driver.findElement(By.cssSelector(".createTasksTable>tbody>tr:nth-child(1)>td:nth-child(5)>div:nth-child(1)>div>div>div:nth-child(1)>div>div:nth-child(11)>div")).click();
		
		driver.findElement(By.cssSelector(".basicLightboxFooter>div:nth-child(2)>div>div>div:nth-child(1)")).click();
		
		System.out.println("New task created is displayed or not :"+driver.findElement(By.cssSelector(".tasksTablesWrapper>div:nth-child(1)>table>tbody>tr>td:nth-child(2) div.title")).isDisplayed());
		
		WebElement tick=driver.findElement(By.cssSelector(".taskRow.noLastTrackingDate .img"));
		tick.click();
		wait.until(ExpectedConditions.elementToBeClickable(tick));
		System.out.println("New task is selected or not :"+tick.isSelected());
		
		driver.findElement(By.cssSelector(".delete.button")).click();
		driver.findElement(By.xpath("//span[text()='Delete permanently' and @class='submitTitle buttonTitle']")).click();
		
		List<WebElement> tasklist=driver.findElements(By.cssSelector(".tasksTable>div:nth-child(1)>div:nth-child(1)>div>div:nth-child(1)>div:nth-child(1)>div:nth-child(1)>div:nth-child(2)>table>tbody>tr>td.names div.title"));
		System.out.println("Total task :"+tasklist.size());
		for(int i=0; i<tasklist.size(); i++) {
		if(tasklist.get(i).getText().equals("Testing")) {
			System.out.println("New created Testing task is not deleted");
			break;
		}else {
			System.out.println("New created Testing task is deleted");
			break;
		}
		}
		driver.close();

	}

}
