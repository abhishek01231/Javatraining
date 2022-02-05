package com.healthasyst.open;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class MessageTest {

	public static void main(String[] args)  {
		System.setProperty("webdriver.chrome.driver", "./Library/chromedriver/chromedriver.exe");
		System.setProperty("webdriver.edge.driver", "C:\\Components\\msedgedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

		driver.get("https://demo.openemr.io/b/openemr"); 

		driver.findElement(By.id("authUser")).sendKeys("admin");
		driver.findElement(By.id("clearPass")).sendKeys("pass");

		Select obj=new Select(driver.findElement(By.name("languageChoice")));
		obj.selectByVisibleText("English (Indian)");
		
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		
		String actualTitle=driver.getTitle();
		System.out.println(actualTitle);
		
		String url=driver.getCurrentUrl();
		System.out.println(url);
	
		
		driver.quit();
		   
		
	

	}
}
