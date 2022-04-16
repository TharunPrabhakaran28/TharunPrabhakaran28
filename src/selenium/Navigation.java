package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Navigation {

	public static void main(String[] args) {
    System.setProperty( "webdriver.chrome.driver", "C:\\Users\\Ramya\\Desktop\\Selenium\\chromedriver.exe");
    WebDriver driver = new ChromeDriver();
    driver.get("https://en-gb.facebook.com/");
    driver.findElement(By.id("email")).sendKeys("tharundhanush28@gmail.com");
    driver.findElement(By.id("pass")).sendKeys("tharuntharun1");
    driver.findElement(By.name("login")).click();
    
    driver.navigate().to("https://www.google.com/aclk?sa=L&ai=DChcSEwih47rpgaj1AhXVk2YCHVjLDqAYABADGgJzbQ&ae=2&sig=AOD64_0QlBtdAXYFYkS95Qr2rvZob8XV4w&q&adurl&ved=2ahUKEwj2ta_pgaj1AhVdzTgGHaKeBasQ0Qx6BAgEEAE");
   driver.navigate().back();
   driver.navigate().refresh();
	}

}
