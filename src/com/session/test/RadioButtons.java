package com.session.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioButtons {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://automationteststore.com/index.php?rt=account/create");
		
		WebElement radioYes = driver.findElement(By.cssSelector("input#AccountFrm_newsletter1"));
		WebElement radioNo = driver.findElement(By.cssSelector("input#AccountFrm_newsletter0"));
		radioYes.click();
		
		//radioNo.click();
		
		if(radioYes.isSelected()) {
			System.out.println("Yes is selected");
		}else if(radioNo.isSelected()){
			System.out.println("No is selected");
		}
		
		
	}

}
