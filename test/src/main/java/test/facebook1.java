package test;
import java.util.List;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class facebook1 {

	WebDriver driver = new FirefoxDriver();
	WebElement firstname,lastname,mobile,remobile,password,bmonth,bday,byear,ButtonSubmit;
	//List<WebElement> radio;	
	@Before	
	public void initializationpage() throws InterruptedException{
					String Url = "http://www.facebook.com";
			driver.get(Url);
			firstname = driver.findElement(By.xpath(".//*[@name='firstname']"));
			lastname = driver.findElement(By.id("u_0_3"));
			mobile = driver.findElement(By.xpath(".//*[@id='u_0_6']"));
			remobile = driver.findElement(By.id("u_0_9"));
			password = driver.findElement(By.xpath(".//*[@id='u_0_b']"));
			bmonth = driver.findElement(By.id("month"));
			bday = driver.findElement(By.id("day"));
			byear = driver.findElement(By.id("year"));
			//radio = driver.findElements(By.className("_58mt"));
			ButtonSubmit = driver.findElement(By.xpath(".//*[@id='u_0_j']"));	
			}
		@Test
		public void registration() throws InterruptedException
		{
			
		Thread.sleep(5000);
		driver.manage().window().maximize();
		firstname.sendKeys("selenium");
		lastname.sendKeys("automation");
		mobile.sendKeys("1221212121");
		remobile.sendKeys("1221212121");
		password.sendKeys("selenium");
		Select bmonthdrop = new Select(bmonth);
		bmonthdrop.selectByIndex(4);
		Select bdaydrop = new Select(bday);
		bdaydrop.selectByIndex(8);
		Select byeardrop = new Select(byear);
		byeardrop.selectByIndex(12);
		//radio.get(0).click();
		ButtonSubmit.submit();		
		
	}
}
