package pages;


import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Hw {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\sanpanda\\eclipse-workspace\\Testing\\Drivers\\chromedriver.exe");
		WebDriver dr=new ChromeDriver();
		dr.get("https://www.amazon.in/s?k=one+%2B+plus+nord&crid=1S6AJ1NWTW1QJ&sprefix=one+%2Caps%2C365&ref=nb_sb_ss_ts-doa-p_1_4");
		//List<WebElement> li = dr.findElements(By.xpath("//div[@class='a-section aok-relative s-image-fixed-height']/descendant::img[@class='s-image']"));
		List<WebElement> li = dr.findElements(By.xpath("//span[@class='a-size-medium a-color-base a-text-normal']"));
		System.out.println("Size is "+li.size());
		for (int i=0;i<li.size();i++)
		{
			System.out.println(li.get(i).getText());
			//System.out.println("Here");
			if (li.get(i).getText().contains("Blue"))
			{
			li.get(i).click();
			break;
			}
			
		}
		System.out.println("This is main");

	}

}
