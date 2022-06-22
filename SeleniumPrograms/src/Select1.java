import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Select1 
{


public static void main(String args[]) throws InterruptedException
{
		
	//Scenario to be automated
	//Launch the web browser and open the web page

	System.setProperty("webdriver.chrome.driver","C:\\chromedriver\\chromedriver.exe");
	WebDriver browser = new ChromeDriver();
	String url = "file:///C:/Users/priya/Desktop/index.htm";
	browser.get(url);

	//Click on the “Google” hyperlink

	WebElement link = browser.findElement(By.xpath("//a[contains(text(), 'Google')]"));
	link.click();

	//Navigate back to the original web page

	browser.navigate().back();

	//Select the “Green” in color drop down
	
	Select color = new Select(browser.findElement(By.xpath("//*[@id= 'SelectID_One']")));
	color.selectByValue("greenvalue");
	Thread.sleep(5000);

	//Select the “Orange” in the fruit drop down
	
	Select fruit = new Select(browser.findElement(By.xpath("//*[@id= 'SelectID_Two']")));
	fruit.selectByVisibleText("Orange");
	Thread.sleep(5000);

	//Select the “Elephant” in the animal drop down	
	
	Select animal = new Select(browser.findElement(By.xpath("//*[@id= 'SelectID_Three']")));
	animal.selectByIndex(1);
	Thread.sleep(5000);
	Thread.sleep(5000);


	System.out.println("Program Executed Successfully!");
	
	browser.close();
	System.exit(0);
	
	}	
	}