package com.session.test;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WaitsExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://pdpsil.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.manage().window().maximize();
		
		//WebElement closeBtn = driver.findElement(By.xpath("//button[@class='close']"));
		
		///////////////////// waiting for element visibility//////////////////////////////
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@class='close']")));
		WebElement closeBtn = driver.findElement(By.xpath("//button[@class='close']"));
		
		closeBtn.click();
		
		WebElement aboutSection = driver.findElement(By.xpath("//a[contains(text(),'About')]"));
		WebElement bot = driver.findElement(By.xpath("//a[contains(text(),'Board of Trustees 2022')]"));
		Actions action = new Actions(driver);
		
		

		action.moveToElement(aboutSection).click().perform();
		/////// other way of using the wait ////////////////////
		WebElement borClick = new WebDriverWait(driver, Duration.ofSeconds(10))
		        .until(ExpectedConditions.elementToBeClickable(bot));
		borClick.click();
		//bot.click();
		

	}

}
