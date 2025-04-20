package seleniumPractice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Selenium3 {

	public static void main(String[] args) {

		ChromeOptions options = new ChromeOptions();
		options.addArguments("--incognito");
		WebDriver driver = new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();

		driver.get("https://seleniumpractise.blogspot.com/2016/08/bootstrap-dropdown-example-for-selenium.html");

		WebElement bootstrap = driver.findElement(By.id("menu1"));
		bootstrap.click();

		List<WebElement> allBootstrap = driver.findElements(By.xpath("//ul[@class='dropdown-menu']/li/a"));

		for (WebElement ele : allBootstrap) {

		}

	}
}
