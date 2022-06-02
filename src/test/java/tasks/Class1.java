package tasks;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Class1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"\\chromedriver.exe");
		//Webdrivermanager().firefoxdriver().setup(); 
	ChromeDriver 	driver=new ChromeDriver();
		 driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		WebDriverWait  wait =new  WebDriverWait(driver,5);
		//driver.get("https://demo.actitime.com/tasks/tasklist.do?customerId=7");
		driver.get("https://online.actitime.com/urani/login.do");
		driver.findElement(By.id("username")).sendKeys("rani.bhoomula@gmail.com");
		driver.findElement(By.name("pwd")).sendKeys("4hazdnWu");
		driver.findElement(By.id("loginButton")).click();
		driver.findElement(By.xpath("//div[@id='container_tasks']")).click();
		Actions act1=new Actions(driver);
		WebElement f=driver.findElement(By.xpath("(//div[text()='Galaxy Corporation'])[1]"));
		act1.moveToElement(f).click().perform();
		//settion button xpath ogf galaxy copertion
		WebElement x=driver.findElement(By.xpath("(//div[text()='Galaxy Corporation'])[1]//following::div[2]"));
		//setting button clicked of galaxy coperation
		act1.moveToElement(x).click().perform();
		//navigate page should be galaxy coperation is dispalyed
		boolean z=driver.findElement(By.xpath("(//div[@class='nameLabel'])[1]")).isDisplayed();
		System.out.println(z+"   yes");
		//close   the popup
		driver.findElement(By.xpath("(//div[@class='hideButton_panelContainer'])[1]")).click();
		/*down arrow button is dispalyed
		//driver.findElement(By.xpath("(//div[@class='collapseButton'])[2]")).isDisplayed();
		//click on android prototype 
		driver.findElement(By.xpath("//div[text()='Android prototyping']")).click();
		
		System.out.println("yes");
		Actions act2=new Actions(driver);
		//setting button clicked of android prototype
		act2.moveToElement(driver.findElement(By.xpath("(//div[text()='Android prototyping']/../..//div[2]//following::div[3])[1]"))).click().perform();
		System.out.println("yes");
		//navigate the page and android prototype title is dispalyed
		driver.findElement(By.xpath("(//div[@class='nameLabel'])[2]")).isEnabled();
		//close navigate page
		driver.findElement(By.xpath("(//div[@class='hideButton_panelContainer'])[2]")).click();
		System.out.println("yes");*/
		}
		}

