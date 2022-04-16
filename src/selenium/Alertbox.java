package selenium;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alertbox {
	
	public static void main(String[] args) {
		
		
		/*There is 3 types of alert box
		
		1. Alert box - first we have to select the alert button . 
		once it pop up on top of the screen. we have to click ok button by finding the locator. so we have to use **alert obj = driver.swithchTo().alert();** 
		now we can select driver.accept();
		2. confirmation box- We can accept or dismiss()
		3. Prompt box - we can sendKey and accept or dismiss
		
		
		
		
		*/
		
		
		
		
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Ramya\\Desktop\\Selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://www.leafground.com/pages/Alert.html");
		WebElement alertbox = driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[1]/div/div/button"));
		alertbox.click();
		
		Alert obj = driver.switchTo().alert();
		obj.accept();
		
		WebElement confirmbox = driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[2]/div/div/button"));
		confirmbox.click();
		
		Alert box = driver.switchTo().alert();
		
		box.dismiss();
		
		WebElement promptbox = driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[3]/div/div/button"));
		
		promptbox.click();
		
		Alert prompt = driver.switchTo().alert();
		
	    prompt.sendKeys("tharundhanush");
	    prompt.accept();
		
			
		
		
	}

}
