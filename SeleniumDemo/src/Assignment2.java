import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment2 {

	public static void main(String[] args) {
		 WebDriver driver= new ChromeDriver();
		 driver.get("https://rahulshettyacademy.com/angularpractice/");
		 //driver.findElement(By.className("form-control ng-pristine ng-invalid ng-touched")).click();
		// driver.findElement(By.name("name")).sendKeys("Tabassum Tamboli");
		// driver.findElement(By.name("email")).sendKeys("tabassumtamboli104@gmail.com");
        driver.findElement(By.xpath("//input[@value='name']")).sendKeys("tabbu");
	}

}
