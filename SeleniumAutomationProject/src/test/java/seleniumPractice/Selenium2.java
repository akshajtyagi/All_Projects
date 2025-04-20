package seleniumPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class Selenium2 {

	public static void main(String[] args) throws InterruptedException {

		ChromeOptions options = new ChromeOptions();
		options.addArguments("--incognito");
		options.addArguments("--start-maximized");
		WebDriver driver = new ChromeDriver(options);

		driver.get("https://www.hyrtutorials.com/p/html-dropdown-elements-practice.html");

		WebElement selectTab = driver.findElement(By.xpath("//select[@id='course']"));

		Select s = new Select(selectTab);
		// s.selectByValue("java");
		s.selectByVisibleText("Dot Net");
		// s.selectByIndex(4);

		WebElement selectTab2 = driver.findElement(By.xpath("//select[@id='ide']"));
		Select s1 = new Select(selectTab2);
		s1.selectByVisibleText("Eclipse");
		s1.selectByIndex(2);
		s1.selectByValue("nb");

		Thread.sleep(2000);
		driver.close();

	}
}
