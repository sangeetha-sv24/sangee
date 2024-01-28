package Testing;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class NykaaPgm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.nykaa.com/");
		driver.findElement(By.id("popups")).click();
		driver.findElement(By.linkText("Etnicwear")).click();
		List<WebElement> etnicList=driver.findElements(By.xpath("//div[@class='css-1ago99h']"));
		int ethnicount=etnicList.size();
		System.out.println("Total product under Ethnic wear is "+ethnicount);
		int count=0;
		for(WebElement ele:etnicList) {
			count++;
			if(count==11) {
				System.out.println(ele.getText());
			}
			
		}

	}

}
