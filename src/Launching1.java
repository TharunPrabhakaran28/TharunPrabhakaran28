import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Launching1 {

	public static void main(String[] args) {

	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Ramya\\Desktop\\Selenium\\chromedriver.exe");
    WebDriver driver=new ChromeDriver();
    driver.get("https://www.facebook.com/");
    String a = driver.getCurrentUrl();
    System.out.println(a);
    
    String b = driver.getTitle();
    System.out.println(b);
    
    driver.close();
	}

}
