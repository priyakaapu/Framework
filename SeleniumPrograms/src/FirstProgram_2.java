import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class FirstProgram_2 

{
@SuppressWarnings("deprecation")

public static void main(String[] args) throws InterruptedException 

{
	
WebDriver browser = new FirefoxDriver();

String url = "https://accounts.google.com";
browser.get(url);
browser.manage().window().maximize();

String Expected_title = "Sign in – Google accounts";
String Actual_title = browser.getTitle();


if (Expected_title.equals(Actual_title))
{
	System.out.print("Verification Successful!");
	
}
else
{
	System.out.print("Verification Failed!");
}

WebElement Username =  browser.findElement(By.cssSelector("[type='email']"));
Username.clear();
Username.sendKeys("testagain.selenium2022@gmail.com");

WebElement Next = browser.findElement(By.xpath("//span[contains(text(), 'Next')]//parent::button"));
Next.click();

//Explicit wait

WebDriverWait wait= new WebDriverWait(browser, 20); 
WebElement Password = wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("input[type='password']")));

Password.click();
Password.clear();
Password.sendKeys("test123)(*");
	  

WebElement Next1 = browser.findElement(By.xpath("//span[contains(text(), 'Next')]//parent::button"));
Next1.click();

System.out.print("Successful Login");
browser.close();
System.exit(0);
}
}






