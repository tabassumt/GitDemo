import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.chrome.ChromeOptions;
//import org.openqa.selenium.firefox.FirefoxDriver;

public class SelIntroduction {

	public static void main(String[] args) {
		
		//ChromeOptions options= new ChromeOptions();

		//options.addArguments("--remote-allow-origins=*");
		
		//System.setProperty("webdriver.chrome.driver", "C:\\Users\\admin\\Documents\\chromedriver.exe");
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\admin\\Documents\\geckodriver.exe");
		
		
		//MicrosoftEdgeDriver
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\admin\\Documents\\msedgedriver.exe");
		WebDriver driver= new EdgeDriver();
		
		
		//WebDriver driver= new FirefoxDriver();
		//WebDriver driver= new ChromeDriver(options);
		driver.get("https://www.amazon.in");
		driver.getPageSource();
		System.out.println (driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		//driver.close();
		//driver.quit();

	}

}
