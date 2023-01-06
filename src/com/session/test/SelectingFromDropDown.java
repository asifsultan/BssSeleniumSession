package com.session.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectingFromDropDown {

	public static void main(String[] args) {

		// System.setProperty("webdriver.chrome.driver","D:\\chrome\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://automationteststore.com/index.php?rt=account/create");

		WebElement countryDD = driver.findElement(By.id("AccountFrm_country_id"));
		Select country = new Select(countryDD);
		country.selectByVisibleText("Pakistan");
	}

}
