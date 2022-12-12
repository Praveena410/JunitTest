package org.baseclass;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {

	public static WebDriver driver;

	@BeforeClass
	public static void browserlaunch() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
	}

	public static void enterdetails(WebElement element, String data) {
		element.sendKeys(data);
	}

	@AfterClass
	public static void closebrowser() {
		driver.close();
	}

}
