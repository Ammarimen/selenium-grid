package testCases;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.BrowserType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

public class ExecuteTestZaleniumChrome {
	
	@Test
	public void test1() throws MalformedURLException, InterruptedException {
		
		System.out.println("Thread which is running " +Thread.currentThread().getId());
		
		DesiredCapabilities cap = new DesiredCapabilities();
		cap.setBrowserName(BrowserType.CHROME);
		WebDriver driver = new RemoteWebDriver(new URL("http://localhost:4444/wd/hub"), cap);
		driver.manage().window().maximize();
		driver.get("https://fr-fr.facebook.com/");
		Thread.sleep(3000);
		System.out.println(driver.getTitle());
		driver.quit();
	}
}
