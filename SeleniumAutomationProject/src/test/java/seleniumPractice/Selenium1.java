package seleniumPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

//import io.github.bonigarcia.wdm.WebDriverManager;

public class Selenium1 {

	public static void main(String[] args) throws InterruptedException {

		// WebDriverManager.chromedriver().setup(); // Driver and Browser verions
		// compatibility not needed after selenium 4.x

		ChromeOptions options = new ChromeOptions();
		options.addArguments("--incognito");
		// options.addArguments("--start-maximized"); // To start the window in
		// maximized size
		WebDriver driver = new ChromeDriver(options); // Browser launch
		driver.manage().window().maximize(); // To maximize the window

		driver.get("https://www.saucedemo.com/"); // URL launch

		WebElement userName = driver.findElement(By.xpath("//input[@id='user-name']"));
		userName.sendKeys("standard_user");

		WebElement password = driver.findElement(By.name("password"));
		password.sendKeys("secret_sauce");

		WebElement loginBtn = driver.findElement(By.id("login-button"));
		loginBtn.click();

		Thread.sleep(2000);
		driver.close();
	}

}