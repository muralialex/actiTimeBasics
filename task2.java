package tasks;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import june3common.Commonclass;

public class task2  extends Commonclass{

	@Test
	public void tasks2() {
		//click on tasks
				driver.findElement(By.xpath("//div[@id='container_tasks']")).click();
		//xpath of galaxy copertion
				WebElement f=driver.findElement(By.xpath("(//div[text()='Galaxy Corporation'])[1]"));

				//galaxy title is enabled
				boolean n=f.isEnabled();
				System.out.println(n);
					//click on galaxy coperation setting button is displayed 
					Actions act1=new Actions(driver);
					act1.moveToElement(f).click().perform();
					//setting  button   of galaxy copertion(customerview)
					WebElement x=driver.findElement(By.xpath("(//div[text()='Galaxy Corporation'])[1]//following::div[2]"));
					//setting button clicked of galaxy coperation(customer view active)
					act1.moveToElement(x).click().perform();
					//navigate page should be galaxy coperation is dispalyed.
					boolean z=driver.findElement(By.xpath("(//div[@class='nameLabel'])[1]")).isDisplayed();
					System.out.println(z);
					
				//list (assignd managers,details )of galaxy coperation is dispalyed in console
					
				List<WebElement>  a=driver.findElements(By.xpath("(//div[@class='tabs'])[1]/div/span"));
				int    b=a.size();
				for(int c=0;c<b;c++)
				{
				String d=a.get(c).getText();
				System.out.println(d);
				}  

				//close of galaxy coperation pop-up

				driver.findElement(By.xpath("(//div[@class='hideButton_panelContainer'])[1]")).click();
		
		
		
		
		
	}
}
