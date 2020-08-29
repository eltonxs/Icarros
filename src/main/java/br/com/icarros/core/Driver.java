package br.com.icarros.core;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Driver {
	private static WebDriver driver;

	public Driver() {

	}

	public static WebDriver getDriver() {

		System.setProperty("webdriver.chrome.driver",
				System.getProperty("user.dir") + "/src/main/resources/chromedriver.exe");
		if (driver == null) {
			driver = new ChromeDriver();
			JavascriptExecutor js = (JavascriptExecutor) driver;
			// maximizar a tela
			driver.manage().window().maximize();
		}
		// nessa linha pede para esperar 20 segundos
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		return driver;

	}

	// @After
	public static WebDriver encerraDriver() {
		if (driver != null) {
			driver.quit();
		}
		return driver;
	}

}
