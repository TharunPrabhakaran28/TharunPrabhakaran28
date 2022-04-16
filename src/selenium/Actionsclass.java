package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Actionsclass {

	public static void main(String[] args) {
              System.setProperty("webdriver.chrome.driver", "C:\\Users\\Ramya\\Desktop\\Selenium\\chromedriver.exe");
              WebDriver driver = new ChromeDriver();
              
              driver.get("http://www.leafground.com/pages/drop.html");
              
              WebElement sour = driver.findElement(By.id("draggable"));
              
              WebElement Des = driver.findElement(By.id("droppable"));
              
              Actions drop = new Actions(driver);
              
              drop.dragAndDrop(sour, Des);
              drop.build().perform();
              driver.quit(); 
              
	}

}
