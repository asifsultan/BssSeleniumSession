package com.session.test;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class WebElementsExample {
	
	public static void main(String[] args) {
	//	System.setProperty("webdriver.chrome.driver", "D:\\chrome\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://automationteststore.com/index.php?rt=account/create");
//		driver.findElement(By.id("searchInput")).sendKeys("Quaid e Azam");
//		driver.findElement(By.xpath("//button[@type='submit']")).click();
		
		List<WebElement> elements = driver.findElements(By.xpath("//select[@id='AccountFrm_country_id']/option"));
		 
		System.out.println("The size is: "+elements.size());
		 
		 
		 for(int i =0 ; i< elements.size(); i++) {
			 
			if(elements.get(i).getText().equals("Pakistan")) {
				System.out.println("Index number of pakistan is: " + i);
				elements.get(i).click();
			}
		 }
		
		
		 
//		 for(WebElement element : elements) {
//			 
//			 System.out.println(element.getText());
//		 }
		 
		 
		 
		 
		
			
			 
			 
	}
}
	
