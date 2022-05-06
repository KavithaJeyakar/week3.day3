package week3.day2;

//import java.awt.List;
import java.util.List;

//import org.openqa.selenium.By;
import org.openqa.selenium.*;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AjioSearch {
	
	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://www.ajio.com");
		
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//input[@name = 'searchVal']")).sendKeys("bags");
		driver.findElement(By.xpath("//span[@class = 'ic-search']")).click();
		driver.findElement(By.xpath("//label[@for='Men - Fashion Bags']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//label[@for='Men']")).click();
		
		driver.findElement(By.xpath("//div[@class='length']")).getText();
		
		String text = driver.findElement(By.xpath("//div[@class='length']")).getText();
		System.out.println(text);
		System.out.println(" List of Brands");
		
		List <WebElement> bagBrandList= driver.findElements(By.className("brand"));
		System.out.println(" Size :" + bagBrandList.size());
		
		for (WebElement brandList : bagBrandList) {
			String text1 = brandList.getText();
			System.out.println(text1);
		}
		
		List<WebElement> bagNameList = driver.findElements(By.className("name"));
		System.out.println(" Size :" + bagNameList.size());
		System.out.println(" Names of the Bags");
		
		for (WebElement NameList : bagNameList) {
		String text2 = NameList.getText();
		System.out.println(text2);
					}
		
	}
}
