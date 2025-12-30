package com.PractiseTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PractiseTest {
	WebDriver driver;
	public  PractiseTest(WebDriver driver) {
		this.driver = driver;
	}
	@FindBy(id = "username")
	WebElement email;
	
	@FindBy(id = "password")
	WebElement password;
	
	@FindBy(xpath = "//button[@id='submit']")
	WebElement loginbtn;
	
	public void login_PractiseTest(String uname,String pass) {
		email.sendKeys(uname);
		password.sendKeys(pass);
		loginbtn.click();
	}
}
