package selenium;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Whandling {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Ramya\\Desktop\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://www.leafground.com/pages/Window.html");
		
		String first = driver.getWindowHandle();
		
		WebElement path = driver.findElement(By.id("home"));
		path.click();
		
		Set<String> path1 = driver.getWindowHandles();
		
		for (String neww : path1) {
			
			driver.switchTo().window(neww);
			
		}
		
		driver.close();
		
		
		driver.switchTo().window(first);
		
		WebElement win = driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[2]/div/div/button"));
		win.click();
		
		int a =driver.getWindowHandles().size();
		 System.out.println(a);
		 
		 
		
		
	
		
		
		
	}

}
