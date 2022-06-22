import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class FirstProgram 
{
@SuppressWarnings("deprecation")

public static void main(String[] args) throws InterruptedException 

{
	
	System.setProperty("webdriver.chrome.driver","C:\\chromedriver\\chromedriver.exe");
	WebDriver browser = new ChromeDriver();

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

browser.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

Boolean staleElement = true; 

while(staleElement){

  try{

	  browser.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	  WebElement Password =  browser.findElement(By.cssSelector("input[type='password']"));
	  Password.clear();
	  Password.sendKeys("test123)(*");
	  
     staleElement = false;


  } catch(StaleElementReferenceException e){

    staleElement = true;

  }

}

WebElement Next1 = browser.findElement(By.xpath("//span[contains(text(), 'Next')]//parent::button"));
Next1.click();

System.out.print("Successful Login");
browser.close();
System.exit(0);
}
}






