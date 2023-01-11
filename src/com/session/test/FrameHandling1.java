package com.session.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FrameHandling1 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
	
		
		driver.get("https://www.formsite.com/templates/registration-form-templates/club-registration-signup-form/");
		//https://www.formsite.com/templates/registration-form-templates/club-registration-signup-form/
		driver.manage().window().maximize();
		
		int sizeFrames = driver.findElements(By.tagName("iframe")).size();
		
		System.out.println(sizeFrames);
		System.out.println("Switching to iframe");
		driver.switchTo().frame("frame-one102941247");
		//driver.switchTo().frame(0);
		System.out.println("Performing action on iframe");
		driver.findElement(By.id("RESULT_TextField-2")).sendKeys("Asif Sultan");
		System.out.println("Switch back to main content");
		driver.switchTo().defaultContent();
		System.out.println("Performing action on main content");
		/////////////////////////////Clicking on the form again///////////////////////////////
		driver.findElement(By.xpath("//img[@title='Club Signup Forms and Templates']")).click();
		

		
		
		 
	
		

	}
}
