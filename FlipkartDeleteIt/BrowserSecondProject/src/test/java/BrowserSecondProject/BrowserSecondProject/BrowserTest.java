package BrowserSecondProject.BrowserSecondProject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class BrowserTest {

	@Test
	public void MyMethod()
	{
		System.setProperty("webdriver.chrome.driver", "D:\\SeleniumTraining\\JavaSourceCode\\FlipkartDeleteIt\\BrowserSecondProject\\Driver\\chromedriver.exe");
		System.out.println("testing stash");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		driver.quit();
	}
}
