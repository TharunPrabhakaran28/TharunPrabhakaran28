package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Miniproject {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Ramya\\Desktop\\Driver\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		
		driver.get("http://automationpractice.com/index.php");
		driver.findElement(By.xpath("//a[@class=\"login\"]")).click();
		driver.findElement(By.xpath("//input[@id=\"email_create\"]")).sendKeys("Tharundhanush28@gmail.com");
	    driver.findElement(By.id("SubmitCreate")).click();
	    
	    try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	    WebElement radio= driver.findElement(By.xpath("//input[@id='id_gender1']"));
	    radio.click();
	    
	    driver.findElement(By.id("customer_firstname")).sendKeys("Tharun");
	    driver.findElement(By.id("customer_lastname")).sendKeys("Prabhakaran");
	    driver.findElement(By.id("passwd")).sendKeys("Tharuntharun1");
	    
	    WebElement date = driver.findElement(By.id("days"));
	    Select select = new Select(date);
	    
	    select.selectByValue("28");
	    
	    WebElement month = driver.findElement(By.id("months"));
	    Select select1 = new Select(month);
	    
	    select1.selectByValue("4");
	    
	    WebElement year = driver.findElement(By.id("years"));
	    Select select2 = new Select(year);
	    
	    select2.selectByValue("1997");
	    
	    WebElement cbox = driver.findElement(By.id("uniform-newsletter"));
	    cbox.click();
	    
	    WebElement cboz = driver.findElement(By.id("uniform-optin"));
	    cboz.click();
	    
	    driver.findElement(By.id("address1")).sendKeys("No.873,10th cental cross street,mkb nagar");
	    
	    driver.findElement(By.id("city")).sendKeys("Chennai");
	    
	    WebElement state = driver.findElement(By.id("id_state"));
	    
	    Select select3 = new Select(state);
	    
	    select3.selectByValue("6");
	    
	    driver.findElement(By.id("postcode")).sendKeys("60003");
	    driver.findElement(By.id("phone_mobile")).sendKeys("9790964413");
	    driver.findElement(By.id("submitAccount")).click();
	   
	    
	
	}

}

