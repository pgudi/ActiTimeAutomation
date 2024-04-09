package com.sgtesting.tests.testcases;

import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.RemoteWebDriver;

public class SampleTest {
	static WebDriver driver=null;
	public static void main(String[] args) throws Exception {
		String url = "https://www.lambdatest.com/blog/run-selenium-tests-in-docker/";
		String hubURL= "http://localhost:4444/";
		ChromeOptions options = new ChromeOptions();
		driver = new RemoteWebDriver(new URL(hubURL), options);
		driver.navigate().to(url);
		Thread.sleep(50000);
		driver.quit();
		System.out.println("Welcome");
	}

}
