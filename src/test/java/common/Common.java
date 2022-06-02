package common;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class Common {
	static WebDriver driver = null;
	static WebDriverWait wait = null;

	@Test
	public void launchBrowser() {
		System.setProperty("webdriver.chrome.driver",
				System.getProperty("user.dir") + "\\src\\test\\resources\\drivers\\chromedriver_101.exe");
		driver = new ChromeDriver();
		driver.get("https://online.actitime.com/cisco2/login.do");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		wait = new WebDriverWait(driver, 30);
	}

	@Test
	public void login() {
		driver.findElement(By.id("username")).sendKeys("unique.muralistl@gmail.com");
		driver.findElement(By.xpath("//body[1]/table[1]/tbody[1]/tr[1]/td[1]/table[1]/tbody[1]/tr[1]/td[1]/div[1]/table[1]/tbody[1]/tr[1]/td[2]/div[1]/table[1]/tbody[1]/tr[5]/td[1]/table[1]/tbody[1]/tr[1]/td[1]/table[1]/tbody[1]/tr[2]/td[1]/input[1]")).sendKeys("GTvbN@nd");
		driver.findElement(By.cssSelector("#keepLoggedInCheckBox")).click();
		driver.findElement(By.xpath("//body[1]/table[1]/tbody[1]/tr[1]/td[1]/table[1]/tbody[1]/tr[1]/td[1]/div[1]/table[1]/tbody[1]/tr[1]/td[2]/div[1]/table[1]/tbody[1]/tr[5]/td[1]/table[1]/tbody[1]/tr[2]/td[1]/table[1]/tbody[1]/tr[1]/td[3]/a[1]")).click();
	}
}
