package com.PractiseTest.TestCases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.PractiseTest.PractiseTest;

import Utility.Helper;
import library.Reusability;
	public class VerifyLogin {
		public WebDriver driver;
		@Test
		public void CheckValidUser() throws Exception {
			WebDriver driver = Helper.startBrowser("chrome", "https://practicetestautomation.com/practice-test-login/");
			Reusability.capturedscreenshots(driver,"Step1. Login to PractiseTestAutomation Application");
			PractiseTest loginPractiseTest = PageFactory.initElements(driver,PractiseTest.class);
			loginPractiseTest.login_PractiseTest("student", "Password123");
			
			Reusability.capturedscreenshots(driver,"Step2. Logout to PractiseTestAutomation Application");
			
		}
}
