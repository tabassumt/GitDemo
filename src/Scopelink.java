import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scopelink {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver= new ChromeDriver();
		driver.get("http://qaclickacademy.com/practice.php");
		System.out.println(driver.findElements(By.tagName("a")).size());
		
	  WebElement footerdriver=	driver.findElement(By.id("gf-BIG"));
	 System.out.println(footerdriver.findElements(By.tagName("a")).size());
	 
	WebElement columnfooter= driver.findElement(By.xpath("//table/tbody/tr/td[1]/ul"));
	
	System.out.println(columnfooter.findElements(By.tagName("a")).size());
	//click on each link on the column and check if the pages are opening
	
	for(int i=1; i<columnfooter.findElements(By.tagName("a")).size(); i++)
	{
		
	    	String Clickonlinktab= Keys.chord(Keys.CONTROL, Keys.ENTER);
		    columnfooter.findElements(By.tagName("a")).get(i).sendKeys(Clickonlinktab);
		    Thread.sleep(5000);
	}	
		Set<String> abc=driver.getWindowHandles();
		Iterator<String>it= abc.iterator();
		
		 while(it.hasNext())
		 {
			 driver.switchTo().window(it.next());
			 System.out.println(driver.getTitle());
		 }

	
	
	}
}