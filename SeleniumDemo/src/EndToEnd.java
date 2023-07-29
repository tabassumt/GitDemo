import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class EndToEnd {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver= new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		
		driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXTaction")).click();
        driver.findElement(By.xpath("//a[@value='BLR']")).click();
        Thread.sleep(2000);
        
        driver.findElement(By.xpath("//div[@id='glsctl00_mainContent_ddl_destinationStation1_CTNR'] //a[@value='AIP']")).click();
        
   
        driver.findElement(By.cssSelector(".ui-state-default.ui-state-highlight.ui-state-hover")).click();
        //driver.findElement(By.id("divpaxinfo")).click();
       
        driver.findElement(By.id("ctl00_mainContent_rbtnl_Trip_1")).click();
        
        if(driver.findElement(By.id("Div1")).getAttribute("style").contains("0.5"))
	    {
	    	System.out.print("is enable");	
	    }
	    else 
	    {
	    	System.out.print("is disable");
	    }
        
	    driver.findElement(By.id("divpaxinfo")).click();
	    Thread.sleep(2000);
	    for(int i=1; i<5;i++)
	    {
	    	driver.findElement(By.id("hrefIncAdt")).click();
	    	
	    }
	    
	    driver.findElement(By.id("ctl00_mainContent_chk_SeniorCitizenDiscount")).click();
	    driver.findElement(By.id("btnclosepaxoption")).click();
	   // driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency")).click();
	    driver.findElement(By.xpath("//option[@value='AED']")).click();
	    
	    driver.findElement(By.id("ctl00_mainContent_btn_FindFlights")).click();
  	  
        
	}

}
