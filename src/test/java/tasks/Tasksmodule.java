package tasks;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import june3common.Commonclass;

public class Tasksmodule extends Commonclass{

	@Test(priority=2)
	public void test1() {
		//click on tasks
		driver.findElement(By.xpath("//div[@id='container_tasks']")).click();
		//get the title of customers and project
		String e=driver.findElement(By.xpath("(//div[contains(text(),'Customers & Projects')])[1]")).getText();
	System.out.println(e);
	//display the +icon, add customer, dropdrown symbol
	boolean s=driver.findElement(By.xpath("//div[@class='addNewButton']/div")).isDisplayed();
	System.out.println(s);
	//list of dropdrown elements
	Actions act=new Actions(driver);
	act.moveToElement(driver.findElement(By.xpath("(//div[@class='downIcon'])[1]"))).click().build().perform();
 String w=driver.findElement(By.xpath("//div[@class='dropdownContainer addNewMenu']/div")).getText();	
	System.out.println(w);
	//searchbox is displayed
	boolean r=driver.findElement(By.xpath("((//input[@type='text']))[5]")).isDisplayed();
//WebElement	d=driver.findElement(By.xpath("((//input[@type='text']))[5]"));
	
	System.out.println(r);
	//d.sendKeys("usharani");
	//getthe text of all customer and all projects(active and archieved)
	String g=driver.findElement(By.xpath("//span[@id='ext-gen10']")).getText();
	System.out.println(g);
	//galaxy title is enabled
	WebElement f=driver.findElement(By.xpath("(//div[text()='Galaxy Corporation'])[1]"));
boolean n=f.isEnabled();
System.out.println(n);
	//click on galaxy coperation 
	Actions act1=new Actions(driver);
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
	//down arrow button is dispalyed
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
	System.out.println("yes");
	}
	}

