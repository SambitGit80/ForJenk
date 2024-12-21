package test;

import javax.xml.xpath.XPath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class NewClass {
	@Test
	public void demo() throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		Thread.sleep(1000);
		driver.findElement(By.id("email")).sendKeys("sambitkunayak44654@gmail.com");
		Thread.sleep(500);
		driver.findElement(By.id("pass")).sendKeys("IwOLoRw7@5kL9hJ");
		Thread.sleep(500);
		driver.findElement(By.name("login")).click();
		Thread.sleep(1000);
		driver.close();
	}
}
