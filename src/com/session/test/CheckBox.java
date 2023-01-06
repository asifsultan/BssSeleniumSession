package com.session.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckBox {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://automationteststore.com/index.php?rt=account/create");
		
		WebElement checkbox =driver.findElement(By.xpath("//input[@name='agree']"));
		
		for(int i = 0; i< 2; i++) {
			
			checkbox.click();
			Thread.sleep(2000);
			System.out.println("Status: " + checkbox.isSelected());
		}

	}

}
