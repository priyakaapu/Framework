import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Dropdown 

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

WebElement color = browser.findElement(By.xpath("//*[@id= 'SelectID_One']//child::option[2]"));
color.click();
		

Thread.sleep(5000);

//Select the “Orange” in the fruit drop down

WebElement fruit = browser.findElement(By.xpath("//*[@id= 'SelectID_Two']//child::option[text() = 'Orange']"));
fruit.click();

Thread.sleep(5000);

//Select the “Elephant” in the animal drop down	

WebElement animal = browser.findElement(By.xpath("//*[@id= 'SelectID_Three']//child::option[text() = 'Elephant']"));
animal.click();	

Thread.sleep(5000);

System.out.println("Program Executed Successfully!");
}	
}

		//End
