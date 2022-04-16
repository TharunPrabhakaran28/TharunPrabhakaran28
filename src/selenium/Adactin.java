package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Adactin {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Ramya\\Desktop\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://adactinhotelapp.com/index.php");
		driver.findElement(By.id("username")).sendKeys("Tharun97");
		driver.findElement(By.id("password")).sendKeys("Tharuntharun1");
		driver.findElement(By.id("login")).click();
		WebElement ddown = driver.findElement(By.id("location"));
		Select select = new Select(ddown);
		
		select.selectByValue("Los Angeles");
		
		WebElement ddownn = driver.findElement(By.id("hotels"));
		Select selectt = new Select(ddownn);
		
		selectt.selectByValue("Hotel Sunshine");
		
		WebElement ddownnn = driver.findElement(By.id("room_type"));
		Select selecttt = new Select(ddownnn);
		
		selecttt.selectByValue("Super Deluxe");
		
		WebElement ddownnnn = driver.findElement(By.id("room_nos"));
		Select selectttt = new Select(ddownnnn);
		
		selectttt.selectByValue("1");
		
		driver.findElement(By.id("datepick_in")).clear();
		driver.findElement(By.id("datepick_in")).sendKeys("01/02/2022");

	
	
		driver.findElement(By.id("datepick_out")).clear();
		driver.findElement(By.id("datepick_out")).sendKeys("01/02/2022");
		
		WebElement ddownnnnn = driver.findElement(By.id("adult_room"));
		Select selecttttt = new Select(ddownnnnn);
		
		selecttttt.selectByValue("2");
		
		driver.findElement(By.id("Submit")).click();
		
		driver.findElement(By.id("radiobutton_0")).click();
		
		driver.findElement(By.id("continue")).click();

		driver.findElement(By.id("first_name")).sendKeys("Tharun");

		driver.findElement(By.id("last_name")).sendKeys("Prabhakran");	
		
		driver.findElement(By.id("address")).sendKeys("NO.873,10th central cross street, MKB nagar");
		
		driver.findElement(By.id("cc_num")).sendKeys("1234567890123456");
		
		WebElement down = driver.findElement(By.id("cc_type"));
		
		Select card = new Select(down);
		card.selectByValue("AMEX");
		

		WebElement month = driver.findElement(By.id("cc_exp_month"));
		
		Select mt = new Select(month);
		mt.selectByValue("2");
		

		WebElement year = driver.findElement(By.id("cc_exp_year"));
		
		Select cc = new Select(year);
		cc.selectByValue("2022");
		
		driver.findElement(By.id("cc_cvv")).sendKeys("992");
		
		driver.findElement(By.id("book_now")).click();

		
		

	}

}
