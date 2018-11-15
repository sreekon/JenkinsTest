package my.first.selenium.webdriver;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DayOne {
	WebDriver driver;
	public  void InvokeBrowser(){
		try {
			System.setProperty("webdriver.chrome.driver","C:\\Users\\konda\\Downloads\\chromedriver_win32\\chromedriver.exe");
			driver = new ChromeDriver();	
			driver.manage().deleteAllCookies();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
			driver.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);
//	driver.get("https://walmart.com");
			driver.get("https://storejobs.wal-mart.com/HiringCenter/");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		}
	public void AcceptDisclaimer(){
		
		try {
	//		WebElement option1= driver.findElement(By.className("mat-checkbox-inner-container"));
	//		WebElement option2= driver.findElement(By.id("mat-checkbox-1"));
			WebElement option3 = driver.findElement(By.xpath("//*[@id='mat-checkbox-1']"));
			Thread.sleep(10000);
		//	option3.sendKeys(Keys.SPACE);
			option3.click();
//option1.click();
			
			Thread.sleep(5000);
/* if(option3.isEnabled()){
	 //option3.sendKeys(Keys.SPACE);
	 
		 System.out.println("Check box is  Selected");
		 
 }else{
	 
	 System.out.println("Check box is  Selected");
*/			 
	 Thread.sleep(5000); 
	 
	 WebElement option4 = driver.findElement(By.xpath("//*[@id='menuButton']"));
	 
	 //if(option4.isDisplayed()){
		 option4.click();
		 driver.findElement(By.id("menuButton")).click();
		 driver.findElement(By.xpath("//*[@id='menuButton']")).click();
	// }
			
 
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public static  void main(String[] args) {
		// TODO Auto-generated method stub
		DayOne myobj = new DayOne();
				myobj.InvokeBrowser();
				myobj.AcceptDisclaimer();
	}

}
