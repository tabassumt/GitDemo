import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Calender111 {

	public static void main(String[] args) {
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.path2usa.com/travel-companions");
		//driver.findElement(By.xpath(".//*[@id='travel_date']")).click();
		driver.findElement(By.name("form_fields[travel_comp_date]")).click();
		List<WebElement> dates= driver.findElements(By.className("day"));
		int count=driver.findElements(By.className("day")).size();
		
		for(int i=0;i<count;i++)
		{
		String text=driver.findElements(By.className("day")).get(i).getText();
		if(text.equalsIgnoreCase("21"))
		{
		driver.findElements(By.className("day")).get(i).click();
		break;
		

	}

}
	}
}
