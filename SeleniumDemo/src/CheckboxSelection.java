import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;



public class CheckboxSelection {

	public static void main(String[] args) {
		WebDriver driver= new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		System.out.println(driver.findElement(By.cssSelector("input[id*='friendsandfamily']")).isSelected());
		driver.findElement(By.cssSelector("input[id*='friendsandfamily']")).click();
		System.out.println(driver.findElement(By.cssSelector("input[id*='friendsandfamily']")).isSelected());
		
		
		
		
		
		//driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).click();
	
    System.out.println(driver.findElements(By.cssSelector("input[type='checkbox']")).size());
   // ('input[type="checkbox"]')
    // ('input[type="checkbox"]')
}
}
