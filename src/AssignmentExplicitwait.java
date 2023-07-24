import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AssignmentExplicitwait {

	public static void main(String[] args) throws InterruptedException {
	
	  // System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\admin\\\\Documents\\\\chromedriver.exe");
		 WebDriver driver= new ChromeDriver();
		 
		 driver.get("https://rahulshettyacademy.com/loginpagePractise/");
		 driver.findElement(By.id("username")).sendKeys("rahulshettyacademy");
		 
		 driver.findElement(By.id("password")).sendKeys("learning");
		 //driver.findElement(By.className("checkmark")).click();
		 
		 driver.findElement(By.cssSelector(".customradio:nth-child(2)")).click();
		//hread.sleep(3000);
		 WebDriverWait w= new WebDriverWait(driver, Duration.ofSeconds(5));
		 w.until(ExpectedConditions.visibilityOfElementLocated(By.id("okayBtn")));
		 driver.findElement(By.id("okayBtn")).click();
		 
		 //StaticDropdown
		 WebElement staticdropdown= driver.findElement(By.cssSelector("select.form-control"));
		 Select dropdown= new Select(staticdropdown);
			dropdown.selectByIndex(2);
			
			driver.findElement(By.id("terms")).click();
			driver.findElement(By.id("signInBtn")).click();
			
			//WebDriverWait w= new WebDriverWait(driver, Duration.ofSeconds(5));
			w.until(ExpectedConditions.visibilityOfElementLocated(By.partialLinkText("Checkout")));

			List <WebElement> products = driver.findElements(By.cssSelector(".card-footer .btn-info"));

			for(int i =0;i<products.size();i++)

			{

			products.get(i).click();

			}
			
			
			 driver.findElement(By.partialLinkText("Checkout")).click();
			 }


			 
				
	}



