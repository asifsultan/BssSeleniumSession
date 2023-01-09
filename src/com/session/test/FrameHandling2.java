package com.session.test;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class FrameHandling2 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.get("https://ui.vision/demo/webtest/frames/");
		driver.manage().window().maximize();
		int sizeFrames = driver.findElements(By.tagName("frame")).size();
		
		System.out.println("Number of frame in main content: " + sizeFrames);
		
		driver.switchTo().frame(0);
		
		driver.findElement(By.xpath("//input[@name='mytext1']")).sendKeys("ANything");
		//////////////// Switch back to default content of the page/////////////////////
		driver.switchTo().defaultContent();
		
		WebElement frame2 = driver.findElement(By.xpath("//frame[@src='frame_2.html']"));
		driver.switchTo().frame(frame2);
		WebElement inputFeild = new WebDriverWait(driver, Duration.ofSeconds(7))
				.until(ExpectedConditions.elementToBeClickable(By.name("mytext2")));
		inputFeild.sendKeys("Other");
		///////////////////Switching back to main content
		driver.switchTo().defaultContent();
		
		///////////////////////iFrame inside frame example////////////////////////
		WebElement frame3 = driver.findElement(By.xpath("//frame[@src='frame_3.html']"));
		////switching to first frame
		System.out.println("Switching to frame 3");
		driver.switchTo().frame(frame3);
		int sizeiFrames = driver.findElements(By.tagName("iframe")).size();
		System.out.println("Total number of iframe in frame 3: is  " + sizeiFrames);
		
		WebElement frame4 = driver.findElement(By.xpath("//iframe[@width='650']"));
		//////switching to iframe within frame////////////////////
		System.out.println("Switching to iFrame in frame 3");
		driver.switchTo().frame(frame4);
		//Performing action on iframe
		driver.findElement(By.xpath("//div[@id='i5']")).click();
		driver.findElement(By.xpath("//div[@id='i19']")).click();
		
		//////////////////// Switching back to parent frame////////////////
		driver.switchTo().parentFrame();
		System.out.println("Switching back to parent frame and performing action on it");
		driver.findElement(By.name("mytext3")).sendKeys("Input for parent frame 3");
		
		///////////////// Getting back to default content//// //////////
		
		driver.switchTo().defaultContent();
		
		/////////////switching to frame 4 from default content//////////////////////
		WebElement frame5 = driver.findElement(By.xpath("//frame[@src='frame_4.html']"));
		driver.switchTo().frame(frame5);
		driver.findElement(By.name("mytext4")).sendKeys("This is for frame 4");
		
		
		
		
		 
	
		

	}
}
