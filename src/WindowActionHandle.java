

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowActionHandle {

	public static void main(String[] args) {
		
		WebDriver driver= new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/loginpagePractise/");
		driver.manage().window().maximize();
		
		driver.findElement(By.cssSelector(".blinkingText")).click();
		                               //or By.cssSelector("a.blinkingText")) tagname.class
       
		Set<String> windows=driver.getWindowHandles();  //0th index parentwindow 1st index childwindow
		    Iterator<String>it= windows.iterator();
		    String parentId= it.next();
		    String childId= it.next();
		    driver.switchTo().window(childId);
		    
		  System.out.println( driver.findElement(By.cssSelector("p.im-para.red")).getText());
		    
		 String emailid= driver.findElement(By.cssSelector("p.im-para.red")).getText().split("at")[1].trim().split(" ")[0];
		 driver.switchTo().window(parentId);
		 driver.findElement(By.id("username")).sendKeys(emailid);
	}

}
