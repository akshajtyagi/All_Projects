package seleniumPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

//import io.github.bonigarcia.wdm.WebDriverManager;

public class SeleniumDropDownHandle {

	public static void main(String[] args) throws InterruptedException {

		//WebDriverManager.chromedriver().setup();
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--incognito");
		options.addArguments("--start-maximized");
		WebDriver driver = new ChromeDriver(options);

		//driver.get("https://www.hyrtutorials.com/");
		driver.navigate().to("https://www.hyrtutorials.com/p/html-dropdown-elements-practice.html");
		
		WebElement selectTab =	driver.findElement(By.xpath("//select[@id=\"course\"]"));
		
		Select s = new Select(selectTab);
		//s.selectByValue("java");
		s.selectByVisibleText("Dot Net");
		//s.selectByIndex(4);

//		WebElement seleniumPractice = driver.findElement(By.xpath("//a[text()='Selenium Practice']"));
//		seleniumPractice.click();
//
//		WebElement dropDownTab = driver.findElement(By.xpath("//a[text()='Dropdowns']"));
//		dropDownTab.click();
//		WebElement dismissBtn =	driver.findElement(By.xpath("//div[@id='dismiss-button']"));
//		dismissBtn.click();
//		
//		
//		Thread.sleep(2000);
//		driver.close();
//		Actions action = new Actions(driver);
//		action.moveToElement(seleniumPractice);

	}
}