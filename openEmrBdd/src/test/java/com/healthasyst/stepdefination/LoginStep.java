package com.healthasyst.stepdefination;



import java.time.Duration;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;


public class LoginStep {
	WebDriver driver;

	
	
	
	
	@Given("I have browser with OpenEMR page")
	public void i_have_browser_with_open_emr_page() {
	
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

		driver.get("http://demo.openemr.io/b/openemr");
	}

	@When("I enter username as {string}")
	public void i_enter_username_as(String string) {
		driver.findElement(By.id("authUser")).sendKeys(string);
	
	}

	@When("I enter password as {string}")
	public void i_enter_password_as(String string) {
		driver.findElement(By.id("clearPass")).sendKeys(string);
	}

	@When("I select language as {string}")
	public void i_select_language_as(String string) {
		Select obj=new Select(driver.findElement(By.name("languageChoice")));
		obj.selectByVisibleText("English (Indian)");
		
		
	}

	@When("I click on login")
	public void i_click_on_login() {
		driver.findElement(By.xpath("//button[@type='submit']")).click();
	}

	@Then("I should get access to portal with title as {string}")
	public void i_should_get_access_to_portal_with_title_as(String string) {
		String actualtitle=driver.getTitle();
		Assert.assertEquals(actualtitle,"OpenEMR");
		
	}


}
