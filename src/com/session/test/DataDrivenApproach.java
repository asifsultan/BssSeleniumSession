package com.session.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class DataDrivenApproach {

	public static void main(String[] args) {

		ChromeOptions options = new ChromeOptions();

		// To run tests without opening the browser
		options.setHeadless(true);
		WebDriver driver = new ChromeDriver(options);
		driver.get("https://automationteststore.com/");
		driver.getTitle();
		
		if(driver.getTitle().equals("A place to practice your automation skills!")) {
			 System.out.println("Valid website is opened");
		}
	}

}
