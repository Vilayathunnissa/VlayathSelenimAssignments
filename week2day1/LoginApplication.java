package week2day1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginApplication {
	
	public static void main(String[] args) throws InterruptedException {

	        //launch browser
			ChromeDriver driver= new ChromeDriver();
			
			//launch application
			driver.get("http://leaftaps.com/opentaps/control/main");
			
			//maximize the window
			driver.manage().window().maximize();
			
			
			//to find webelement and pass value
			driver.findElement(By.id("username")).sendKeys("Demosalesmanager");	
			
			//to wait
			Thread.sleep(2000);
			
			//close browser
			driver.close();
}
}

