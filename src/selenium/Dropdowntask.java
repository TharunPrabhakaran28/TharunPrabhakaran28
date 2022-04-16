package selenium;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdowntask {

	
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Ramya\\Desktop\\Driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.globalsqa.com/demo-site/select-dropdown-menu/");
		
		WebElement down = driver.findElement(By.xpath("//*[@id=\"post-2646\"]/div[2]/div/div/div/p/select"));
		
		
		Select s = new Select(down);
		List<WebElement> opt = s.getOptions();
		int size = opt.size();
		
		System.out.println(size);

		for (int i = 0 ; i <= opt.size(); i++) {
			
			WebElement e = opt.get(i);
			String text = e.getText();
			System.out.println(text);
		
		
			
			
		}
		
		
		
	
	
		
		
			
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
