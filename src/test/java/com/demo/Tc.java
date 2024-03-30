package com.demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import com.gibl.generic.Base;

public class Tc extends Base{
@Test
public static void RegisterPager() throws InterruptedException {
driver.findElement(By.xpath("(//a[text()='Register Now'])[2]")).click();
driver.findElement(By.xpath("//input[@placeholder='Full Name']")).sendKeys("Sambit Nayak");
Thread.sleep(2000);
driver.findElement(By.xpath("//input[@id='user_email_desk']")).sendKeys("asd@123");
Thread.sleep(2000);
driver.findElement(By.xpath("(//button[@type='submit'])[3]")).submit();


	}

}
