import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SelIntroduction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Invoking Browser

		// Launch Chrome
		System.setProperty("WebDriver.Chrome.Driver", "D:/Softwares/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://login.salesforce.com/");

		/* Locators */
		/*
		 * driver.findElement(By.id("username")).sendKeys("selva");
		 * driver.findElement(By.id("password")).sendKeys("password");
		 * driver.findElement(By.name("Login")).click();
		 */

		driver.findElement(By.id("username")).sendKeys("selva");
		driver.findElement(By.id("password")).sendKeys("password");
		driver.findElement(By.name("Login")).click();
		// System.out.println(driver.findElement(By.cssSelector('\"#error\"')).getText());

		// Launch Firfox
		// System.setProperty("WebDriver.gecko.Driver", "D:/Softwares/geckodriver.exe");
		// WebDriver driver = new FirefoxDriver();
		// driver.get("https://www.spicejet.com/");

		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());

		// driver.close();
		// driver.quit();

	}

}
