package sangee;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LaunceGoogle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		WebDriverManager.chromedriver().setup();
//		WebDriver driver=new ChromeDriver();
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.google.com/");
		System.out.println("Navigated to google");
		driver.findElement(By.id("APjFqb")).sendKeys("javatpoint");
	}

}
