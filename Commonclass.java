package june3common;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Commonclass {
	public WebDriver driver=null;
	WebDriverWait  wait=null;
	@BeforeClass

	//launch browser
	public void launchbrowser() {
		System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"\\chromedriver.exe");
		//Webdrivermanager().firefoxdriver().setup(); 
		driver=new ChromeDriver();
		 driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		WebDriverWait  wait =new  WebDriverWait(driver,5);
		driver.get("https://demo.actitime.com/login.do");
		driver.manage().window().maximize();
		}
		@BeforeMethod
		public void login() {
		driver.findElement(By.id("username")).sendKeys("admin");
		driver.findElement(By.name("pwd")).sendKeys("manager");
		driver.findElement(By.id("loginButton")).click();
		
		String expectedtitle="actiTIME - Login";
		String actualtitle=driver.getTitle();
		if(actualtitle.equals(expectedtitle)) {
			String a=driver.getTitle();
			System.out.println(a);
			
		}
		
		
		
	}@AfterClass
		public void logout() throws InterruptedException {
		driver.findElement(By.id("logoutLink")).click();
		Thread.sleep(3000);
		}
	@AfterClass
	public void teardown() {
		driver.close();
	}
	}

