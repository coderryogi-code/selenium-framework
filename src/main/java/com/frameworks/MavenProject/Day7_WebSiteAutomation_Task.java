package com.frameworks.MavenProject;


import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

import com.frameworks.utility.BaseClass;

public class Day7_WebSiteAutomation_Task extends BaseClass {

	public void CreateOrderId() throws Exception {

		browserLaunch();
		//WebDriver driver = new ChromeDriver();

		//driver.get("https://omrbranch.com/");
		enterApplicationUrl("https://omrbranch.com/");

		//driver.manage().window().maximize();

		implicitWait(2);

		//WebElement email = driver.findElement(By.id("email"));
		WebElement txtEmailId = findLocatorById("email");

		//email.sendKeys("designerryogi@gmail.com");
		sendKeysElement(txtEmailId, getCellData("FrameTest", 1, 0));
		//WebElement pass = driver.findElement(By.id("pass"));

		//WebElement passTxtId = driver.findLocatorById("pass");
		WebElement txtPassId = findLocatorById("pass");

		//driver.sendKeys("Yog95465@");
		sendKeysElement(txtPassId, getCellData("FrameTest", 1, 1));

		//WebElement submitBtn = driver.findElement(By.xpath("//button[@value='login']"));
		WebElement submitBtn = findLocatorByXpath("//button[@value='login']");
		clickElement(submitBtn);

		//Product Search Page
		System.out.println("Welcome Yogesh");
	
		//Clearing the Cart
		clearCart();


		//Typing Nuts in the search box and clicking search button
		//WebElement search = driver.findElement(By.id("search"));
	//	WebElement search = findLocatorById("search");
		
		//search.sendKeys("Nuts");
	//	sendKeysElement(search, "Nuts");
		
		/*
		WebElement srchtBtn = driver.findElement(By.xpath("//button[@data-testid='searchbtn']"));
		srchtBtn.click();
		Thread.sleep(2000);

		//Clicking the 1st Product
		driver.findElement(By.linkText("Add")).click();

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));

		// Step 1: Click the cart button in the first overlay and selecting the 1kg
		WebElement cartBtn = wait.until(ExpectedConditions.elementToBeClickable(By.id("cart-24")));
		cartBtn.click();

		// Step 2: Wait until the first overlay is invisible
		wait.until(ExpectedConditions.invisibilityOfElementLocated(By.id("cart-24")));

		// Step 3: Now wait for "Go To Cart" to be clickable and click go to cart
		WebElement goToCart = wait.until(ExpectedConditions.elementToBeClickable(By.linkText("Go To Cart")));
		goToCart.click();

		//My Cart Page
		System.out.println("My Cart");
		driver.findElement(By.xpath("//div[@data-target='#addressModal']")).click();

		//Entering Details in the address form
		WebElement addressType = wait.until(ExpectedConditions.elementToBeClickable(By.name("address_type")));
		addressType.click();
		addressType.sendKeys("Work");

		driver.findElement(By.name("first_name")).sendKeys("Greens");
		driver.findElement(By.name("last_name")).sendKeys("OMR");
		driver.findElement(By.name("mobile")).sendKeys("1234567890");
		driver.findElement(By.name("apartment")).sendKeys("No.7, thoraipakkam road");
		driver.findElement(By.name("address")).sendKeys("Thoraipakkam main road");
		driver.findElement(By.name("country")).sendKeys("India");
		driver.findElement(By.name("state")).sendKeys("Tamil Nadu");

		// Wait for city options to load
		wait.until(ExpectedConditions.presenceOfElementLocated(
				By.xpath("//select[@name='city']/option[text()='Chennai']")
				));

		Select citySelect = new Select(driver.findElement(By.name("city")));     
		citySelect.selectByVisibleText("Chennai");

		driver.findElement(By.name("zipcode")).sendKeys("904008");
		driver.findElement(By.xpath("//button[contains(@class,'saveAddress')]")).click();

		//Payment Cart
		System.out.println("Payment Cart");

		Thread.sleep(2000);
		Select pymtType = new Select(driver.findElement(By.id("payment_type")));
		pymtType.selectByVisibleText("Debit Card");
		System.out.println("Selected: " + pymtType.getFirstSelectedOption().getText());

		*/
		
		Thread.sleep(3000);

		closeTheWindow();
		System.out.println("Done");
	}

		 

		public void clearCart() throws InterruptedException {

			// driver.get("https://omrbranch.com/my-cart");
			Thread.sleep(4000);
			enterApplicationUrl("https://omrbranch.com/my-cart");
			
			// Keep removing items until none left
//			while (true) {
//				//List<WebElement> removeBtns = driver.findElements(By.cssSelector("a.allinone.close"));
//				List<WebElement> removeBtns = findElementsByCss("div.scheduleClose a.allinone.close");
//				System.out.println(removeBtns);
//				
//				if (removeBtns.isEmpty()) {
//					System.out.println("Cart is empty.");
//					break;
//				}

			    By removeBtn = By.cssSelector("div.scheduleClose a.allinone.close"); // ⚠️ replace this

			    // Fetch all remove buttons
			    List<WebElement> removeButtons = driver.findElements(removeBtn);

			    while (removeButtons.size() > 0) {

			        // Always take first element (DOM changes after click)
			        WebElement btn = removeButtons.get(0);

			        // Wait until clickable
			        wait.until(ExpectedConditions.elementToBeClickable(btn)).click();

			        // Wait until that element disappears from DOM
			        wait.until(ExpectedConditions.stalenessOf(btn));

			        // Re-fetch updated list (VERY IMPORTANT 🔥)
			        removeButtons = driver.findElements(removeBtn);
			    }

			    System.out.println("Cart cleared successfully");
			}
		

		public static void main(String[] args) throws Exception {
			Day7_WebSiteAutomation_Task d4 = new Day7_WebSiteAutomation_Task();
			d4.CreateOrderId();

		}

	}
