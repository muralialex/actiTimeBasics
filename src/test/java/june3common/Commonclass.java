package june3common;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Commonclass {
	public WebDriver driver;
	WebDriverWait  wait=null;
	@Test(priority=1)

	//launch browser
	public void openbrowser() {
		System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"\\chromedriver.exe");
		//Webdrivermanager().firefoxdriver().setup(); 
		driver=new ChromeDriver();
		 driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		WebDriverWait  wait =new  WebDriverWait(driver,5);
		driver.get("https://online.actitime.com/urani/login.do");
		driver.findElement(By.id("username")).sendKeys("rani.bhoomula@gmail.com");
		driver.findElement(By.name("pwd")).sendKeys("4hazdnWu");
		driver.findElement(By.id("loginButton")).click();
		
		String expectedtitle="actiTIME - Login";
		String actualtitle=driver.getTitle();
		if(actualtitle.equals(expectedtitle)) {
			String a=driver.getTitle();
			System.out.println(a);
			
		}
		System.out.println("Beforeclass completed ");
		
		
	}
	}

