package com.org.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ClassA {
	@Parameters({ "browser" })
	@Test

	private void startBrowser(String browser) {
		// TODO Auto-generated method stub
		switch (browser) {
		case "Chrome": {
			WebDriverManager.chromedriver().setup();
			WebDriver driver = new ChromeDriver();
			driver.get("https://www.google.com");
			break;
		}
		case "Firefox": {
			WebDriverManager.firefoxdriver().setup();
			WebDriver driver = new FirefoxDriver();
			driver.get("https://www.google.com");
			break;
		}
		case "Edge": {
			WebDriverManager.edgedriver().setup();
			EdgeDriver driver = new EdgeDriver();
			driver.get("https://www.google.com");
			break;
		}
		default: {
			System.out.println("Invalid");
			break;
		}
		}

	}

}
