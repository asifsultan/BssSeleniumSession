package com.session.test;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class WindowsHandleDemo {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver\\chromedriver.exe");

		
		
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.get("https://automationteststore.com/");
		
		String currentWindow = driver.getWindowHandle();
		System.out.println("Current window handle: "+ currentWindow);
		
		driver.findElement(By.xpath("//div[@class='header_block']/div/a[1]")).click();
		driver.findElement(By.xpath("//div[@class='header_block']/div/a[2]")).click();
		
		
		Set<String> allWindows = driver.getWindowHandles();
		
		for(String window : allWindows) {
			//System.out.println( window);
			if(!window.equals(currentWindow)) {
				driver.switchTo().window(window);
				
				if(driver.getTitle().equals("Facebook – log in or sign up")){
					driver.findElement(By.id("email")).sendKeys("someone@somedomain.com");
					driver.findElement(By.id("pass")).sendKeys("password");
				}
				else if(driver.getTitle().equals("Explore / Twitter")) {
					driver.findElement(By.xpath("//a[@href='/login']")).click();
					
				}
					
					
				
			}
		}
		
		
		
		
		
		
		

		
	
		
		
		
	}

}
