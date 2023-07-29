import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdown {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\admin\\Documents\\chromedriver.exe");
		 WebDriver driver= new  ChromeDriver();
		 driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		WebElement staticdropdown= driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency"));
		 Select dropdown= new Select(staticdropdown);
		dropdown.selectByIndex(3);
		System.out.println(dropdown.getFirstSelectedOption().getText());
		Thread.sleep(2000);
		dropdown.selectByVisibleText("AED");
		System.out.println(dropdown.getFirstSelectedOption().getText());
		Thread.sleep(2000);
		dropdown.selectByValue("INR");
		System.out.println(dropdown.getFirstSelectedOption().getText());
		
	
}}
