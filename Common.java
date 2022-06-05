package common;


import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class Common {
	public WebDriver driver;
	public WebDriverWait wait = null;
           WebElement element=null;
	@Test(priority = 1)
	public void launchbrowser() {
		System.setProperty("webdriver.chrome.driver",
				System.getProperty("user.dir") + "\\resourses\\chromedriver.exe ");
		driver = new ChromeDriver();
		driver.get("https://online.actitime.com/smanam");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

	}

	@Test(priority = 2)
	public void login() {
		driver.findElement(By.id("username")).sendKeys("swethamanam1996@gmail.com");
		driver.findElement(By.xpath(
				"//body[1]/table[1]/tbody[1]/tr[1]/td[1]/table[1]/tbody[1]/tr[1]/td[1]/div[1]/table[1]/tbody[1]/tr[1]/td[2]/div[1]/table[1]/tbody[1]/tr[5]/td[1]/table[1]/tbody[1]/tr[1]/td[1]/table[1]/tbody[1]/tr[2]/td[1]/input[1]"))
				.sendKeys("@L2rX3p@");
		driver.findElement(By.cssSelector("#keepLoggedInCheckBox")).click();
		driver.findElement(By.xpath(
				"//body[1]/table[1]/tbody[1]/tr[1]/td[1]/table[1]/tbody[1]/tr[1]/td[1]/div[1]/table[1]/tbody[1]/tr[1]/td[2]/div[1]/table[1]/tbody[1]/tr[5]/td[1]/table[1]/tbody[1]/tr[2]/td[1]/table[1]/tbody[1]/tr[1]/td[3]/a[1]"))
				.click();

	}

	@Test(priority = 3)
	public void createtask() {
		// wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//tbody/tr[1]/td[4]/a[1]")));
		driver.findElement(By.xpath("//tbody/tr[1]/td[4]/a[1]")).click();
		boolean result = driver.findElement(By.xpath("//div[@class=\"itemsContainer\"][1]//div[contains(@class ,' customerNode ')][1]")).isDisplayed();
		System.out.println(result);
		String firstcompany= driver.findElement(By.xpath("//div[@class=\"itemsContainer\"][1]//div[contains(@class ,' customerNode ')][1]")).getText();
		System.out.println(firstcompany);
      //driver.findElements(By.xpath("//div[@class='itemsContainer'][1]//div[contains(@class, ' projectNode ')][position()<=3]")).size();
	  List<WebElement> lists = driver.findElements(By.xpath("//div[@class='itemsContainer'][1]//div[contains(@class, ' projectNode ')][position()<=3]"));  
	   for(WebElement element:lists) {
		 System.out.println ( element.getText());
	   }
	   System.out.println("new line===");
	   driver.findElement(By.xpath("(//div[text()='Big Bang Company'])[1]")).click();
 
	  List <WebElement> list1=  driver.findElements(By.xpath("(//tbody)[22]"));
      for(WebElement element1:list1) {
	 System.out.println ( element1.getText());
		driver.findElement(By.xpath("(//div[text()='Flight operations'])[1]")).click();
		String commodity [] =  {"Flight analysis","Flight support","Lunar mission","Mars mission support","NASA negotiations","Team meetings"};

        for(String com : commodity) {
            String text = driver.findElement(By.xpath("(//div[text()='"+com+"'])[1]")).getText();

            System.out.println(com+"-->"+text);
        }
		
      }
	}
	}

