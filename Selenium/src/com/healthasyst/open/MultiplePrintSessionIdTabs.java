package com.healthasyst.open;

	import java.time.Duration;
	import java.util.ArrayList;
	import java.util.List;

	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.chrome.ChromeDriver;

	public class MultiplePrintSessionIdTabs {
		
		public static void main(String[] args) {
			
			System.setProperty("webdriver.chrome.driver", "./Library/chromedriver/chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

			driver.get("https://www.db4free.net/"); 
			
			driver.findElement(By.xpath("//b[contains(text(),'phpMy')]")).click();
			
			List<String> windows=new ArrayList<String>(driver.getWindowHandles());
			
			
			System.out.println(windows.get(0));
			System.out.println(windows.get(1));
			
			
			
		}

	}

