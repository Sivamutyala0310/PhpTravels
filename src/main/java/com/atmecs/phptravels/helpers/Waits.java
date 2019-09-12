package com.atmecs.phptravels.helpers;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Waits {
	
	String sendkeys;

	public static void explicitWaitClick(WebDriver driver,WebElement element,String xpath) {
		WebDriverWait wait = new WebDriverWait(driver, 20);
		element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(xpath)));
		element.click();
	}

	public void explicitWaitSendKeys(WebDriver driver,WebElement element,String xpath) {
		WebDriverWait wait = new WebDriverWait(driver, 20);

		element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(xpath)));
		element.sendKeys(sendkeys);
	}

	public void fluentWait(WebDriver driver) {
		Wait<WebDriver> wait = new FluentWait<WebDriver>(driver).withTimeout(30, TimeUnit.SECONDS)
				.pollingEvery(5, TimeUnit.SECONDS).ignoring(NoSuchElementException.class);
	}
}
