package test;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Dashboard_Activities {
	private static FirefoxDriver driver;
	private static String baseUrl= "http://appery.io/app/mobile-frame?src=http://appery.io/app/view/6e1b60d5-b6c2-4eba-809d-9ca98083d060&type=mobile";
	

	@BeforeClass
	public static void setUp() throws Exception {
		// driver = new ChromeDriver();
		driver = new FirefoxDriver();
		// driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
	}

	@Test
	public void test() throws Exception {
		driver.get(baseUrl);
		
	driver.findElement(By.xpath("//form [@id='login_form']/div[1]//input")).sendKeys("amazur@exadel.com");
	driver.findElement(By.xpath("//form [@id='login_form']/div[2]//input")).sendKeys("lavandos");	
	driver.findElement(By.xpath("//input[@id='loginBtn']")).click();	
	driver.findElement(By.xpath("//div[@id='mobile_sizes']/div[3]")).click();
	driver.findElement(By.xpath("//div[@id='switch_to_landscape']")).click();
	
	
	
	driver.switchTo().frame("frame_viewport");
	String Activity = driver.findElement(By.xpath("//div[@class='stratch-vertically']/div[2]/div[2]/div/div[1]/div/div/div[1]/span")).getText(); //save Activity to the memory
	driver.findElement(By.xpath("//div[@class='stratch-vertically']/div[2]/div[2]/div/div[1]/div/div/div[2]/div/button[1]")).click(); // click 'Today' button
	driver.findElement(By.xpath("//div[@class='stratch-vertically']/div[2]/div[2]/div/div[1]/div/div/div[2]/div/button[2]")).click(); // click 'This Week' button
	driver.findElement(By.xpath("//div[@class='stratch-vertically']/div[2]/div[2]/div/div[1]/div/div/div[2]/div/button[3]")).click(); // click 'This Month' button
	driver.findElement(By.xpath("//div[@class='stratch-vertically']/div[2]/div[2]/div/div[1]/div/div/div[2]/div/button[4]")).click(); // click 'All' button

	List<WebElement> List =driver.findElements(By.xpath("//div[@class='stratch-vertically']/div[2]/div[2]/div/div[2]/ion-scroll/div[1]/div[1]/div")); //save full 
	 for(WebElement el : List) {
	  System.out.print(Activity + " " + el.getText());}
	 
	 
	 
	//div[@class='stratch-vertically']/div[2]/div[2]/div/div[2]/ion-scroll/div[1]/div[1]/div
	}
	
	
	
	
	
	
	
	/*
	 List<WebElement> List =driver.findElements(By.xpath("//div[@class='rep-list-table-body']/ion-scroll/div[1]/div/div[1]/div/span")); //Name, FirmName, YTD Sales, PriorYRSales
	 for(WebElement el : List) {
	  System.out.print(el.getText()+ " ");

	  
	        }
	  
	  Wait(2000);
	  String addr = driver.findElement(By.xpath("//div[@class='rep-list-table-body']/ion-scroll/div[1]/div/div[1]/div[3]/div/div[1]/div/span")).getText(); //Address, upper row
	  System.out.print(addr);
	  
	  List<WebElement> AdrDit =driver.findElements(By.xpath("//div[@class='rep-list-table-body']/ion-scroll/div[1]/div/div[1]/div[3]/div/div[2]/div/span[@class='rep-details rep-phone-prefix ng-binding']/span[2]")); //Address, lower row
	  for(WebElement el : AdrDit) {
	   System.out.print(el.getText() + " ");
	         }
	}



/*driver.findElement(By.xpath("//ion-header-bar/div[1]/button[1]")).click();
driver.findElement(By.xpath("//ion-side-menus/ion-side-menu/div/ion-scroll/div[1]/div/a[3]/p")).click();
driver.findElement(By.xpath("//ion-header-bar/div[1]/button[1]")).click();
driver.findElement(By.xpath("//ion-side-menus/ion-side-menu/div/ion-scroll/div[1]/div/a[4]/p")).click();
driver.findElement(By.xpath("//ion-header-bar/div[1]/button[1]")).click();
driver.findElement(By.xpath("//ion-side-menus/ion-side-menu/div/ion-scroll/div[1]/div/a[5]/p")).click();
String text = driver.findElement(By.xpath("//div[@class='scroll']/div/div[1]/div[1]/span")).getText();
System.out.println(text);

driver.findElement(By.xpath("//ion-side-menus/ion-side-menu/div/ion-scroll/div[1]/div/a[2]/p")).click();

*/
	
	public void Wait(int time){
		   try {
		    Thread.sleep(time);
		   } catch (InterruptedException e) {
		    e.printStackTrace();
		   }
		 }
		 
}