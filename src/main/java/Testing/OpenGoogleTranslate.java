package Testing;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class OpenGoogleTranslate {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://translate.google.com/?sl=auto&tl=en&text=como&op=translate");
		//driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		Thread.sleep(3000);
		//driver.findElement(By.xpath("//div[@class='OPPzxe']/child::c-wiz[1]")).clear();
		driver.findElement(By.xpath("//div[@class='OPPzxe']/child::c-wiz[1]")).click();
		driver.findElement(By.xpath("//div[@class='OPPzxe']/child::c-wiz[1]")).sendKeys("Hello World");
		String tabName=driver.findElement(By.xpath("//div[@class='zXU7Rb']/c-wiz[1]/div[@tabindex='0']")).getText();
	}

}
