package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Buying {

	public static void main(String[] args) throws InterruptedException  {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Ramya\\Desktop\\Driver\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		
		driver.get("http://automationpractice.com/index.php");
		driver.findElement(By.xpath("//a[@class=\"login\"]")).click();
		driver.findElement(By.id("email")).sendKeys("tharundhanush28@gmail.com");
		driver.findElement(By.id("passwd")).sendKeys("Tharuntharun1");
		driver.findElement(By.id("SubmitLogin")).click();
		
		WebElement element = driver.findElement(By.xpath(
				"//*[@id=\"block_top_menu\"]/ul/li[2]/a"));
		
		
		Actions action = new Actions(driver);
		action.moveToElement(element).perform();
		
		driver.findElement(By.xpath("//*[@id=\"my-account\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"center_column\"]/ul/li[1]/div/div[2]/div[2]/a[1]/span")).click();
		
		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[@id=\'layer_cart\']/div[1]/div[2]/div[4]/a/span")).click();
		
		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[@id=\"center_column\"]/p[2]/a[1]/span")).click();
		
		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[@id=\"center_column\"]/form/p/button/span")).click();
		
		WebElement cbox = driver.findElement(By.id("cgv"));
		cbox.click();
		
		driver.findElement(By.xpath("//*[@id=\"form\"]/p/button/span")).click();
		
		driver.findElement(By.className("bankwire")).click();
		
		driver.findElement(By.xpath("//*[@id=\"cart_navigation\"]/button/span")).click();
		
		
		
	
				
				
		
		
		
		
		

	}

}
