import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Dropdownloop {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\admin\\Documents\\chromedriver.exe");
		 WebDriver driver= new  ChromeDriver();
		 driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		 driver.findElement(By.id("divpaxinfo")).click();
		 System.out.println(driver.findElement(By.id("divpaxinfo")).getText());
		 Thread.sleep(2000);
		 
		/* int i=1;
		 while(i<5)
		 {
			 driver.findElement(By.id("hrefIncAdt")).click();
			 i++;
		 }*/

		for(int i=1;i<5;i++)
		 {
			 driver.findElement(By.id("hrefIncAdt")).click();
		 }
		 
		 System.out.println(driver.findElement(By.id("divpaxinfo")).getText());
		 driver.findElement(By.id("btnclosepaxoption")).click();
	}

}
