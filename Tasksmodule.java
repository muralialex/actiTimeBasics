package tasks;


import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import june3common.Commonclass;

public class Tasksmodule extends Commonclass{

	@Test
	public void taskmodule() throws InterruptedException {
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
 
		
	//searchbox is displayed
	boolean r=driver.findElement(By.xpath("((//input[@type='text']))[5]")).isDisplayed();

	
	System.out.println(r);
	}


	
	
 
	


		
	}


