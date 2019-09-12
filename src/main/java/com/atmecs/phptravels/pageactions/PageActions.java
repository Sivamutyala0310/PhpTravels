package com.atmecs.phptravels.pageactions;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class PageActions {

	static WebElement element;

	public static void clickElement(WebDriver driver, String xpath) {

		driver.findElement(By.xpath(xpath)).click();
	}

	public static void sendKeys(WebDriver driver, String xpath, String keysToSend) {

		driver.findElement(By.xpath(xpath)).sendKeys(keysToSend);

	}

	public static void performActionEnter(WebDriver driver) {
		Actions action = new Actions(driver);
		action.sendKeys(Keys.ENTER).build().perform();
	}

	public static void selectDropDown(WebDriver driver, String xpath) {
		Select select = new Select(driver.findElement(By.xpath(xpath)));
		select.selectByValue("  Sign Up");
	}

	public static void scrollDown(WebDriver driver) {
		JavascriptExecutor js = ((JavascriptExecutor) driver);
		js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
	}

	public static void handlingAlert(WebDriver driver) {
		driver.switchTo().alert().dismiss();
	}

	public static void findElement(WebDriver driver, String xpath) {
		driver.findElement(By.xpath(xpath));
	}
	public static String fetchAttributeValue(WebDriver driver, String xpath) {
		String value=driver.findElement(By.xpath(xpath)).getAttribute("value");
		return value;
	}
	public static String fetchHtmlAttributeValue(WebDriver driver, String xpath) {
		String value=driver.findElement(By.xpath(xpath)).getAttribute("innerHTML");
		return value;
	}
	
}
