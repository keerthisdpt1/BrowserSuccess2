package MavenProject.BrowserSuccess;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
@Test
public class MyBrowserTest {
	
	public void myMethod()
	{
		System.setProperty("webdriver.chrome.driver","D:\\Selenium Training\\JavaSourceCode\\FlipkartDeleteIt\\BrowserSuccess\\DRIVER\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
	}
	

}
