import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;

public class Locators2 {

	public static void main(String[] args) throws InterruptedException {
		String name="rahul";
		
	   //System.setProperty("webdriver.chrome.driver","C:\\Users\\admin\\Documents\\chromedriver.exe");
	  // WebDriver driver= new  ChromeDriver();
	   
	   //System.setProperty("webdriver.gecko.driver", "C:\\Users\\admin\\Documents\\geckodriver.exe");
	   //WebDriver driver= new  FirefoxDriver();
	   
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\admin\\Documents\\msedgedriver.exe");
		WebDriver driver= new  EdgeDriver();
		
	   driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	   String password=getpassword(driver);
	   driver.get("https://rahulshettyacademy.com/locatorspractice/");
	   driver.findElement(By.id("inputUsername")).sendKeys(name);
		driver.findElement(By.name("inputPassword")).sendKeys(password);
		driver.findElement(By.className("submit")).click();
		Thread.sleep(2000);
		System.out.println(driver.findElement(By.tagName("p")).getText());
		Assert.assertEquals(driver.findElement(By.tagName("p")).getText(),"You are successfully logged in." );
		Assert.assertEquals(driver.findElement(By.tagName("h2")).getText(),"Hello "+name+"," );
		driver.findElement(By.className("logout-btn")).click();
		driver.close();
		}
	public static String getpassword(WebDriver driver) throws InterruptedException
	{
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		driver.findElement(By.linkText("Forgot your password?")).click();
		Thread.sleep(1000);
		driver.findElement(By.cssSelector(".reset-pwd-btn")).click();
		String passwordtext=driver.findElement(By.cssSelector("form p")).getText();
		//Please use temporary password 'rahulshettyacademy' to Login.
		
		String[] passwadrArray= passwordtext.split("'");
		String password=passwadrArray[1].split("'")[0];
		return password;
		
		//0th index= Please use temporary password
		//1st index= rahulshettyacademy' to Login.
		
		
		
		
		
		
	}

}
