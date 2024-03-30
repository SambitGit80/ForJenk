package com.gibl.generic;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

public class Base {
public static WebDriver driver;
	@BeforeMethod
	public void Beforeclass() {
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("http://gweb.ecelticgroup.com/posp/login.php");
	}
	
	@AfterMethod
	public void logout() {
		//driver.quit();
	}
}
