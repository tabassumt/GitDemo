
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class Technogekxpath {

	WebDriver driver;
	public static void main(String[] args) {
		
		Technogekxpath tx= new Technogekxpath();
		tx.launchbrowser();
		//tx.launchApplication();
		tx.handleTables();
	}
	public void launchbrowser() 
	{
		driver= new ChromeDriver();
	}
	
	public void launchApplication()
	{
		driver.get("https://bonigarcia.dev/");
	}
	
	public void handleTables()
	{
		driver.get("https://www.moneycontrol.com/markets/indian-indices/");
		List<WebElement> columns=driver.findElements(By.xpath("//table[@id='indicesTable']/thead/tr/th"));
		int colnum=columns.size();
		System.out.println(colnum);
		
		List<WebElement> rows=driver.findElements(By.xpath("//table[@id='indicesTable']/tbody/tr"));
		int rowsnum= rows.size();
		System.out.println(rowsnum);
		
		for(int i=1;i<colnum;i++) {
		String data=driver.findElement(By.xpath("//table[@id='indicesTable']/tbody/tr[1]/td["+i+"]")).getText();
			System.out.print(data);
		}
		
		for(int i=1;i<rowsnum;i++) {
			String data=driver.findElement(By.xpath("//table[@id='indicesTable']/tbody/tr["+i+"]/td[1]")).getText();
				System.out.println(data);
		}
		
		for(int i=1;i<rowsnum;i++) {
			for(int j=1;j<colnum;j++) {
			String data=driver.findElement(By.xpath("//table[@id='indicesTable']/tbody/tr["+i+"]/td["+j+"]")).getText();
				System.out.print(data+" ");
		}
			System.out.println();
		
		}
	}
	
	
  public void handleCalender()
  {
	  driver.get("https://jqueryui.com/datepicker/");
	  
  }
	
	
	
	
	
	public void openNewTab() 
	{
		driver.get("https://www.naukri.com/nlogin/login");
		String tab1=driver.getWindowHandle();
		System.out.println(tab1);
		driver.switchTo().newWindow(WindowType.TAB);
		driver.get("https://www.naukri.com/registration/createAccount?othersrcp=22636");
		String tab2=driver.getWindowHandle();
		System.out.println(tab2);
	}
	
	public void multipleWindows()
	{
		driver.get("https://www.naukri.com/nlogin/login");
		String tab1=driver.getWindowHandle();
		WebElement services=driver.findElement(By.xpath("//a[@title='Naukri FastForward- Resume Services']"));
		services.click();
		
		
		Set<String> allids =driver.getWindowHandles();
		
		for( String x:allids)
		{
			if(!x.equals(tab1))
			{
				driver.switchTo().window(x);
				System.out.println(driver.getCurrentUrl());
				driver.close();
			}
		}
		
		driver.switchTo().window(tab1);
		System.out.println(driver.getCurrentUrl());
	}
	
}





