import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Screenshots1 {

			public static void main(String[] args) throws IOException  {
				
				
				WebDriver driver= new ChromeDriver();
				driver.manage().window().maximize();
				//driver.manage().addCookie();
			    // driver.manage().deleteAllCookies();
				driver.get("https://www.google.com/");
				
				File src=	 ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
					//FileUtils.copyFile(src,new File("F:\\screenshot.png"));
					FileUtils.copyFile(src,new File("F:\\Screenshot\\screenshot.png"));
		
			
						
		        
	}

}
