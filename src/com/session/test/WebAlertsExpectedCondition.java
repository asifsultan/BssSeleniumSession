package com.session.test;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.netty.handler.timeout.TimeoutException;

public class WebAlertsExpectedCondition {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();

		driver.get("https://demo.guru99.com/test/delete_customer.php");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.manage().window().maximize();

		driver.findElement(By.name("cusid")).sendKeys("43656");
		driver.findElement(By.name("submit")).click();

		if (new WebDriverWait(driver, Duration.ofSeconds(5)).until(ExpectedConditions.alertIsPresent()) == null) {

		}

		boolean foundAlert = false;
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(7));
		try {
			wait.until(ExpectedConditions.alertIsPresent());
			foundAlert = true;
		} catch (TimeoutException eTO) {
			foundAlert = false;
		}

		if (foundAlert) {
			Alert alert = driver.switchTo().alert();

			System.out.println(alert.getText());

			alert.accept();

			Alert alert1 = driver.switchTo().alert();

			// System.out.println(alert.getText());

			alert1.accept();
		}

		else {
			System.out.println("No alert is found");
		}

	}

}
