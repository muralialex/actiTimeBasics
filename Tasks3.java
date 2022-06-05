package tasks;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import june3common.Commonclass;

public class Tasks3 extends Commonclass{
@Test
	public void test3() {
	//click on tasks
	driver.findElement(By.xpath("//div[@id='container_tasks']")).click();
	//xpath of android prototype testing
	WebElement f=driver.findElement(By.xpath("(//div[text()='Android prototyping'])[1]"));

	//android prototype testing  is enabled
	boolean n=f.isEnabled();
	System.out.println(n);
		//click on android prototype testing setting button is displayed 
		Actions act1=new Actions(driver);
		act1.moveToElement(f).click().perform();
		// xpath  of setting  button   of android prtotype(customerview)
		WebElement x=driver.findElement(By.xpath("(//div[text()='Android prototyping'])[1]//following::div[2]"));
		//click on setting button of android prototype testing(customer view active)
		act1.moveToElement(x).click().perform();
		//it should navigate the  page and check the title fot that page  is dispalyed or not.
		boolean z=driver.findElement(By.xpath("(//div[@class='nameLabel'])[2]")).isDisplayed();
		System.out.println(z);
		
	//list (assignd managers,details )of androidprtotype  is dispalyed in console
		
	List<WebElement>  a=driver.findElements(By.xpath("(//div[@class='tabs'])[2]/div/span"));
	int    b=a.size();
	for(int c=0;c<b;c++)
	{
	String d=a.get(c).getText();
	System.out.println(d);
	}  

	//close of android prtotypetesting pop-up

	driver.findElement(By.xpath("(//div[@class='hideButton_panelContainer'])[2]")).click();





}
}









