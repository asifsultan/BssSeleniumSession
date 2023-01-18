package com.session.test;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandles {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.get("https://automationteststore.com/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//div[@class='header_block']/div/a[1]")).click();
		 driver.findElement(By.xpath("//div[@class='header_block']/div/a[2]")).click();

		String currentWindow = driver.getWindowHandle();
		System.out.println("Window handle: " + currentWindow);

		Set<String> allWindows = driver.getWindowHandles();

		// Iterator<String> iterateSet = allWindows.iterator();

//		while(iterateSet.hasNext()) {
//			 System.out.println(iterateSet.next());
//			
//		}

		for (String window : allWindows) {

			System.out.println("Id of open windows: " + window);
			if (!window.equals(currentWindow)) {
				driver.switchTo().window(window);
				if (driver.getTitle().contains("Facebook – log in or sign up")) {
					// Perform actions on the new window
					driver.findElement(By.id("email")).sendKeys("someone@somedomain.com");
					driver.findElement(By.id("pass")).sendKeys("password");
				} else if (driver.getTitle().contains("Explore / Twitter")) {
					driver.findElement(By.xpath("//a[@href='/login']")).click();
//		    	 driver.findElement(By.id("email")).sendKeys("someone@somedomain.com");
//				    driver.findElement(By.id("pass")).sendKeys("password");
				}
			}
		}

		WebDriver newTab= driver.switchTo().newWindow(WindowType.TAB);
		newTab.get("https://www.google.com");

		

	}

}
