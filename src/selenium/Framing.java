package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Framing {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Ramya\\Desktop\\Selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("http://www.leafground.com/pages/frame.html");
		/* 1. iframe - we have to switch default frame to iframe by using ** switchTo().frame(0);
		 *  once we switch that we can do the process and he should come out from current frame
		 *  by using switchTo().defaultContent();	*/
		
		
		driver.switchTo().frame(0);
		WebElement fone = driver.findElement(By.id("Click"));
		fone.click();
		
		String text = driver.findElement(By.id("Click")).getText();
		
		System.out.println(text);
		
		driver.switchTo().defaultContent();
		
		//********************************************************
		/* 2. Nested frame -  have to check how many frame tottaly the html has 
		 * we have switch from one frame to n frame we should is index number 
		 * we have to come out to default frame once we finish he frame process
		 * */
		
		driver.switchTo().frame(1);
		driver.switchTo().frame("frame2");
		
		WebElement ftwo = driver.findElement(By.id("Click1"));
		ftwo.click();
		
		String val = driver.findElement(By.id("Click1")).getText();
	    System.out.println(val);
	    
	    driver.switchTo().defaultContent();
	    
	    //***************************************************************
	    
	    List<WebElement> space =  driver.findElements(By.tagName("iframe"));
	    
	    int a = space.size();
	    
	    System.out.println(a);
	    
	    
		
		
		

	}

}
