package com.frameworks.MavenProject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day1_Fr_Ma_IntroTask {
	
	private void FD01M01() throws InterruptedException{
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		
		WebElement txtemail = driver.findElement(By.name("email"));
		WebElement txtpass = driver.findElement(By.name("pass"));
		txtemail.sendKeys("yog@gmail.com");
		txtpass.sendKeys("greensedu");
		
		Thread.sleep(10000);
		driver.close();
	}
	
	public static void main(String[] args) throws InterruptedException {
		Day1_Fr_Ma_IntroTask d1 = new Day1_Fr_Ma_IntroTask();
		d1.FD01M01();
	}
}
