package TestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ThriveScreen1 {
	WebDriver Driver;
	public String URL = "http://hiring.hashtagloyalty.com";

	@BeforeTest
	public void BT() {
		System.setProperty("webdriver.chrome.driver", "E:\\Moolya_TR\\Driver\\chromedriver.exe");
		WebDriverManager.chromedriver().setup();

		Driver = new ChromeDriver();
		Driver.manage().window().maximize();
	}

	@Test(enabled = true, priority = 3)
	public void TestCase1() throws InterruptedException {
		Driver.get(URL);
		// MENU
		// TestCase 1 : Items are added/removed to/from cart.
		
		JavascriptExecutor js = (JavascriptExecutor) Driver;
		js.executeScript("window.scrollBy(0,650)", "");
		Thread.sleep(2000);
		
		// Add an Item 1
		Driver.findElement(By.cssSelector(
				"div.content:nth-child(2) div.product-card-group.mb-md-1.mb-lg-2 div.row.row-cols-1.row-cols-md-4:nth-child(2) div.col:nth-child(1) div.card.product-card div.card-body div.card-footer div.row.align-items-center.g-0.inline-add-to-cart div.col-8.col-md-8.col-8.px-0 div.text-end button.btn.btn-primary.btn-md > span:nth-child(1)"))
				.click();
		Thread.sleep(2000);
		// Remove an Item 1
		Driver.findElement(By.cssSelector(
				"div.content:nth-child(2) div.product-card-group.mb-md-1.mb-lg-2 div.row.row-cols-1.row-cols-md-4:nth-child(2) div.col:nth-child(1) div.card.product-card div.card-body div.card-footer div.row.align-items-center.g-0.inline-add-to-cart div.col-8.col-md-8.col-8.px-0 div.row.inline-cart-quantity div.col-12.col-md-12.col-lg-12.text-end button.btn.minus-btn:nth-child(1) > i.fa.fa-minus"))
				.click();
		Thread.sleep(2000);
		// Add an Item 2
		Driver.findElement(By.cssSelector(
				"div.content:nth-child(2) div.product-card-group.mb-md-1.mb-lg-2 div.row.row-cols-1.row-cols-md-4:nth-child(2) div.col:nth-child(2) div.card.product-card div.card-body div.card-footer div.row.align-items-center.g-0.inline-add-to-cart div.col-8.col-md-8.col-8.px-0 div.text-end button.btn.btn-primary.btn-md > span:nth-child(1)"))
				.click();
		Thread.sleep(2000);
		// Remove an Item 2
		Driver.findElement(By.cssSelector(
				"div.content:nth-child(2) div.product-card-group.mb-md-1.mb-lg-2 div.row.row-cols-1.row-cols-md-4:nth-child(2) div.col:nth-child(2) div.card.product-card div.card-body div.card-footer div.row.align-items-center.g-0.inline-add-to-cart div.col-8.col-md-8.col-8.px-0 div.row.inline-cart-quantity div.col-12.col-md-12.col-lg-12.text-end button.btn.minus-btn:nth-child(1) > i.fa.fa-minus"))
				.click();
		Thread.sleep(2000);
		// Add an 3rd Item
		Driver.findElement(By.cssSelector(
				"div.content:nth-child(2) div.product-card-group.mb-md-1.mb-lg-2 div.row.row-cols-1.row-cols-md-4:nth-child(2) div.col:nth-child(3) div.card.product-card div.card-body div.card-footer div.row.align-items-center.g-0.inline-add-to-cart div.col-8.col-md-8.col-8.px-0 div.text-end button.btn.btn-primary.btn-md > span:nth-child(1)"))
				.click();
		Thread.sleep(2000);
		// Go to Cart
		Driver.findElement(By.cssSelector(
				"app-root:nth-child(1) app-header:nth-child(1) div.toolbar div.cart-icon:nth-child(4) > i.fa.fa-shopping-cart"))
				.click();
		Thread.sleep(2000);
		// Remove Item from cart
		Driver.findElement(By.cssSelector(
				"div.content:nth-child(2) div.container-fluid.cart-container div.card.mb-2 div.row div.col-8.col-sm-8.col-md-8.col-lg-10.py-2 div.row.align-items-center.g-0.inline-add-to-cart div.col-8.col-md-8.col-8.px-0 div.row.inline-cart-quantity div.col-12.col-md-12.col-lg-12.text-end button.btn.minus-btn:nth-child(1) > i.fa.fa-minus"))
				.click();
		Thread.sleep(2000);
		// Click on Order Now
		Driver.findElement(By.cssSelector(
				"div.content:nth-child(2) app-cart:nth-child(2) div.container-fluid.cart-container div:nth-child(1) > button.btn.btn-primary"))
				.click();
		Thread.sleep(2000);
		JavascriptExecutor js2 = (JavascriptExecutor) Driver;
		js2.executeScript("window.scrollBy(0,850)", "");
		Thread.sleep(2000);
		// Add an Item 4
		Driver.findElement(By.cssSelector(
				"div.content:nth-child(2) div.product-card-group.mb-md-1.mb-lg-2 div.row.row-cols-1.row-cols-md-4:nth-child(2) div.col:nth-child(4) div.card.product-card div.card-body div.card-footer div.row.align-items-center.g-0.inline-add-to-cart div.col-8.col-md-8.col-8.px-0 div.text-end button.btn.btn-primary.btn-md > span:nth-child(1)"))
				.click();
		Thread.sleep(2000);
		// Click + Item 4
		Driver.findElement(By.cssSelector(
				"div.content:nth-child(2) div.product-card-group.mb-md-1.mb-lg-2 div.row.row-cols-1.row-cols-md-4:nth-child(2) div.col:nth-child(4) div.card.product-card div.card-body div.card-footer div.row.align-items-center.g-0.inline-add-to-cart div.col-8.col-md-8.col-8.px-0 div.row.inline-cart-quantity div.col-12.col-md-12.col-lg-12.text-end button.btn.plus-btn:nth-child(3) > i.fa.fa-plus"))
				.click();
		Thread.sleep(2000);
		// Remove Item 4
		Driver.findElement(By.cssSelector(
				"div.content:nth-child(2) div.product-card-group.mb-md-1.mb-lg-2 div.row.row-cols-1.row-cols-md-4:nth-child(2) div.col:nth-child(4) div.card.product-card div.card-body div.card-footer div.row.align-items-center.g-0.inline-add-to-cart div.col-8.col-md-8.col-8.px-0 div.row.inline-cart-quantity div.col-12.col-md-12.col-lg-12.text-end button.btn.minus-btn:nth-child(1) > i.fa.fa-minus"))
				.click();
		// Click - Item 4
		Driver.findElement(By.cssSelector(
				"div.content:nth-child(2) div.product-card-group.mb-md-1.mb-lg-2 div.row.row-cols-1.row-cols-md-4:nth-child(2) div.col:nth-child(4) div.card.product-card div.card-body div.card-footer div.row.align-items-center.g-0.inline-add-to-cart div.col-8.col-md-8.col-8.px-0 div.row.inline-cart-quantity div.col-12.col-md-12.col-lg-12.text-end button.btn.minus-btn:nth-child(1) > i.fa.fa-minus"))
				.click();
		// Add an Item 5
		Driver.findElement(By.cssSelector(
				"div.content:nth-child(2) div.product-card-group.mb-md-1.mb-lg-2 div.row.row-cols-1.row-cols-md-4:nth-child(2) div.col:nth-child(5) div.card.product-card div.card-body div.card-footer div.row.align-items-center.g-0.inline-add-to-cart div.col-8.col-md-8.col-8.px-0 div.text-end button.btn.btn-primary.btn-md > span:nth-child(1)"))
				.click();
		Thread.sleep(2000);
		// Remove an Item 5
		Driver.findElement(By.cssSelector(
				"div.content:nth-child(2) div.product-card-group.mb-md-1.mb-lg-2 div.row.row-cols-1.row-cols-md-4:nth-child(2) div.col:nth-child(5) div.card.product-card div.card-body div.card-footer div.row.align-items-center.g-0.inline-add-to-cart div.col-8.col-md-8.col-8.px-0 div.row.inline-cart-quantity div.col-12.col-md-12.col-lg-12.text-end button.btn.minus-btn:nth-child(1) > i.fa.fa-minus"))
				.click();
		Thread.sleep(2000);
		// Add an Item 6
		Driver.findElement(By.cssSelector(
				"div.content:nth-child(2) div.product-card-group.mb-md-1.mb-lg-2 div.row.row-cols-1.row-cols-md-4:nth-child(2) div.col:nth-child(6) div.card.product-card div.card-body div.card-footer div.row.align-items-center.g-0.inline-add-to-cart div.col-8.col-md-8.col-8.px-0 div.text-end button.btn.btn-primary.btn-md > span:nth-child(1)"))
				.click();
		Thread.sleep(2000);
		// Remove an Item 6
		Driver.findElement(By.cssSelector(
				"div.content:nth-child(2) div.product-card-group.mb-md-1.mb-lg-2 div.row.row-cols-1.row-cols-md-4:nth-child(2) div.col:nth-child(6) div.card.product-card div.card-body div.card-footer div.row.align-items-center.g-0.inline-add-to-cart div.col-8.col-md-8.col-8.px-0 div.row.inline-cart-quantity div.col-12.col-md-12.col-lg-12.text-end button.btn.minus-btn:nth-child(1) > i.fa.fa-minus"))
				.click();
		Thread.sleep(2000);
		JavascriptExecutor js3 = (JavascriptExecutor) Driver;
		js3.executeScript("window.scrollBy(0,450)", "");
		Thread.sleep(2000);
		// Add an Item 7
		Driver.findElement(By.cssSelector(
				"div.content:nth-child(2) div.product-card-group.mb-md-1.mb-lg-2 div.row.row-cols-1.row-cols-md-4:nth-child(2) div.col:nth-child(7) div.card.product-card div.card-body div.card-footer div.row.align-items-center.g-0.inline-add-to-cart div.col-8.col-md-8.col-8.px-0 div.text-end button.btn.btn-primary.btn-md > span:nth-child(1)"))
				.click();
		Thread.sleep(2000);
		// Remove an Item 7
		Driver.findElement(By.cssSelector(
				"div.content:nth-child(2) div.product-card-group.mb-md-1.mb-lg-2 div.row.row-cols-1.row-cols-md-4:nth-child(2) div.col:nth-child(7) div.card.product-card div.card-body div.card-footer div.row.align-items-center.g-0.inline-add-to-cart div.col-8.col-md-8.col-8.px-0 div.row.inline-cart-quantity div.col-12.col-md-12.col-lg-12.text-end button.btn.minus-btn:nth-child(1) > i.fa.fa-minus"))
				.click();
		Thread.sleep(2000);
		// Add an Item 8
		Driver.findElement(By.cssSelector(
				"div.content:nth-child(2) div.product-card-group.mb-md-1.mb-lg-2 div.row.row-cols-1.row-cols-md-4:nth-child(2) div.col:nth-child(8) div.card.product-card div.card-body div.card-footer div.row.align-items-center.g-0.inline-add-to-cart div.col-8.col-md-8.col-8.px-0 div.text-end button.btn.btn-primary.btn-md > span:nth-child(1)"))
				.click();
		Thread.sleep(2000);
		// Remove an Item 8
		Driver.findElement(By.cssSelector(
				"div.content:nth-child(2) div.product-card-group.mb-md-1.mb-lg-2 div.row.row-cols-1.row-cols-md-4:nth-child(2) div.col:nth-child(8) div.card.product-card div.card-body div.card-footer div.row.align-items-center.g-0.inline-add-to-cart div.col-8.col-md-8.col-8.px-0 div.row.inline-cart-quantity div.col-12.col-md-12.col-lg-12.text-end button.btn.minus-btn:nth-child(1) > i.fa.fa-minus"))
				.click();
		Thread.sleep(2000);
		JavascriptExecutor js4 = (JavascriptExecutor) Driver;
		js4.executeScript("window.scrollBy(0,450)", "");
		Thread.sleep(2000);
		// Add an Item 9
		Driver.findElement(By.cssSelector(
				"div.content:nth-child(2) div.product-card-group.mb-md-1.mb-lg-2 div.row.row-cols-1.row-cols-md-4:nth-child(2) div.col:nth-child(9) div.card.product-card div.card-body div.card-footer div.row.align-items-center.g-0.inline-add-to-cart div.col-8.col-md-8.col-8.px-0 div.text-end button.btn.btn-primary.btn-md > span:nth-child(1)"))
				.click();
		Thread.sleep(2000);
		// Remove an Item 9
		Driver.findElement(By.cssSelector(
				"div.content:nth-child(2) div.product-card-group.mb-md-1.mb-lg-2 div.row.row-cols-1.row-cols-md-4:nth-child(2) div.col:nth-child(9) div.card.product-card div.card-body div.card-footer div.row.align-items-center.g-0.inline-add-to-cart div.col-8.col-md-8.col-8.px-0 div.row.inline-cart-quantity div.col-12.col-md-12.col-lg-12.text-end button.btn.minus-btn:nth-child(1) > i.fa.fa-minus"))
				.click();
		Thread.sleep(2000);
		// Add an Item 10
		Driver.findElement(By.cssSelector(
				"div.content:nth-child(2) div.product-card-group.mb-md-1.mb-lg-2 div.row.row-cols-1.row-cols-md-4:nth-child(2) div.col:nth-child(10) div.card.product-card div.card-body div.card-footer div.row.align-items-center.g-0.inline-add-to-cart div.col-8.col-md-8.col-8.px-0 div.text-end button.btn.btn-primary.btn-md > span:nth-child(1)"))
				.click();
		Thread.sleep(2000);
		// Remove an Item 10
		Driver.findElement(By.cssSelector(
				"div.content:nth-child(2) div.product-card-group.mb-md-1.mb-lg-2 div.row.row-cols-1.row-cols-md-4:nth-child(2) div.col:nth-child(10) div.card.product-card div.card-body div.card-footer div.row.align-items-center.g-0.inline-add-to-cart div.col-8.col-md-8.col-8.px-0 div.row.inline-cart-quantity div.col-12.col-md-12.col-lg-12.text-end button.btn.minus-btn:nth-child(1) > i.fa.fa-minus"))
				.click();
		Thread.sleep(2000);
		// Add an Item 11
		Driver.findElement(By.cssSelector(
				"div.content:nth-child(2) div.product-card-group.mb-md-1.mb-lg-2 div.row.row-cols-1.row-cols-md-4:nth-child(2) div.col:nth-child(11) div.card.product-card div.card-body div.card-footer div.row.align-items-center.g-0.inline-add-to-cart div.col-8.col-md-8.col-8.px-0 div.text-end button.btn.btn-primary.btn-md > span:nth-child(1)"))
				.click();
		Thread.sleep(2000);
		// Remove an Item 11
		Driver.findElement(By.cssSelector(
				"div.content:nth-child(2) div.product-card-group.mb-md-1.mb-lg-2 div.row.row-cols-1.row-cols-md-4:nth-child(2) div.col:nth-child(11) div.card.product-card div.card-body div.card-footer div.row.align-items-center.g-0.inline-add-to-cart div.col-8.col-md-8.col-8.px-0 div.row.inline-cart-quantity div.col-12.col-md-12.col-lg-12.text-end button.btn.minus-btn:nth-child(1) > i.fa.fa-minus"))
				.click();
		Thread.sleep(2000);
		// Add an Item 12
		Driver.findElement(By.cssSelector(
				"div.content:nth-child(2) div.product-card-group.mb-md-1.mb-lg-2 div.row.row-cols-1.row-cols-md-4:nth-child(2) div.col:nth-child(12) div.card.product-card div.card-body div.card-footer div.row.align-items-center.g-0.inline-add-to-cart div.col-8.col-md-8.col-8.px-0 div.text-end button.btn.btn-primary.btn-md > span:nth-child(1)"))
				.click();
		Thread.sleep(2000);
		// Remove an Item 12
		Driver.findElement(By.cssSelector(
				"div.content:nth-child(2) div.product-card-group.mb-md-1.mb-lg-2 div.row.row-cols-1.row-cols-md-4:nth-child(2) div.col:nth-child(12) div.card.product-card div.card-body div.card-footer div.row.align-items-center.g-0.inline-add-to-cart div.col-8.col-md-8.col-8.px-0 div.row.inline-cart-quantity div.col-12.col-md-12.col-lg-12.text-end button.btn.minus-btn:nth-child(1) > i.fa.fa-minus"))
				.click();
		Thread.sleep(2000);
		JavascriptExecutor js5 = (JavascriptExecutor) Driver;
		js5.executeScript("window.scrollBy(0,350)", "");
		Thread.sleep(2000);
		// Add an Item 13
		Driver.findElement(By.cssSelector(
				"div.content:nth-child(2) div.product-card-group.mb-md-1.mb-lg-2 div.row.row-cols-1.row-cols-md-4:nth-child(2) div.col:nth-child(13) div.card.product-card div.card-body div.card-footer div.row.align-items-center.g-0.inline-add-to-cart div.col-8.col-md-8.col-8.px-0 div.text-end button.btn.btn-primary.btn-md > span:nth-child(1)"))
				.click();
		Thread.sleep(2000);
		// Remove an Item 13
		Driver.findElement(By.cssSelector(
				"div.content:nth-child(2) div.product-card-group.mb-md-1.mb-lg-2 div.row.row-cols-1.row-cols-md-4:nth-child(2) div.col:nth-child(13) div.card.product-card div.card-body div.card-footer div.row.align-items-center.g-0.inline-add-to-cart div.col-8.col-md-8.col-8.px-0 div.row.inline-cart-quantity div.col-12.col-md-12.col-lg-12.text-end button.btn.minus-btn:nth-child(1) > i.fa.fa-minus"))
				.click();
		Thread.sleep(2000);
		// Add an Item 14
		Driver.findElement(By.cssSelector(
				"div.content:nth-child(2) div.product-card-group.mb-md-1.mb-lg-2 div.row.row-cols-1.row-cols-md-4:nth-child(2) div.col:nth-child(14) div.card.product-card div.card-body div.card-footer div.row.align-items-center.g-0.inline-add-to-cart div.col-8.col-md-8.col-8.px-0 div.text-end button.btn.btn-primary.btn-md > span:nth-child(1)"))
				.click();
		Thread.sleep(2000);
		// Remove an Item 14
		Driver.findElement(By.cssSelector(
				"div.content:nth-child(2) div.product-card-group.mb-md-1.mb-lg-2 div.row.row-cols-1.row-cols-md-4:nth-child(2) div.col:nth-child(14) div.card.product-card div.card-body div.card-footer div.row.align-items-center.g-0.inline-add-to-cart div.col-8.col-md-8.col-8.px-0 div.row.inline-cart-quantity div.col-12.col-md-12.col-lg-12.text-end button.btn.minus-btn:nth-child(1) > i.fa.fa-minus"))
				.click();
		Thread.sleep(2000);
		// Add an Item 15
		Driver.findElement(By.cssSelector(
				"div.content:nth-child(2) div.product-card-group.mb-md-1.mb-lg-2 div.row.row-cols-1.row-cols-md-4:nth-child(2) div.col:nth-child(15) div.card.product-card div.card-body div.card-footer div.row.align-items-center.g-0.inline-add-to-cart div.col-8.col-md-8.col-8.px-0 div.text-end button.btn.btn-primary.btn-md > span:nth-child(1)"))
				.click();
		Thread.sleep(2000);
		// Remove an Item 15
		Driver.findElement(By.cssSelector(
				"div.content:nth-child(2) div.product-card-group.mb-md-1.mb-lg-2 div.row.row-cols-1.row-cols-md-4:nth-child(2) div.col:nth-child(15) div.card.product-card div.card-body div.card-footer div.row.align-items-center.g-0.inline-add-to-cart div.col-8.col-md-8.col-8.px-0 div.row.inline-cart-quantity div.col-12.col-md-12.col-lg-12.text-end button.btn.minus-btn:nth-child(1) > i.fa.fa-minus"))
				.click();
		Thread.sleep(2000);
		// Add an Item 16
		Driver.findElement(By.cssSelector(
				"div.content:nth-child(2) div.product-card-group.mb-md-1.mb-lg-2 div.row.row-cols-1.row-cols-md-4:nth-child(2) div.col:nth-child(16) div.card.product-card div.card-body div.card-footer div.row.align-items-center.g-0.inline-add-to-cart div.col-8.col-md-8.col-8.px-0 div.text-end button.btn.btn-primary.btn-md > span:nth-child(1)"))
				.click();
		Thread.sleep(2000);
		// Remove an Item 16
		Driver.findElement(By.cssSelector(
				"div.content:nth-child(2) div.product-card-group.mb-md-1.mb-lg-2 div.row.row-cols-1.row-cols-md-4:nth-child(2) div.col:nth-child(16) div.card.product-card div.card-body div.card-footer div.row.align-items-center.g-0.inline-add-to-cart div.col-8.col-md-8.col-8.px-0 div.row.inline-cart-quantity div.col-12.col-md-12.col-lg-12.text-end button.btn.minus-btn:nth-child(1) > i.fa.fa-minus"))
				.click();
		Thread.sleep(2000);
		JavascriptExecutor js6 = (JavascriptExecutor) Driver;
		js6.executeScript("window.scrollBy(0,450)", "");
		Thread.sleep(2000);
		// Add an Item 17
		Driver.findElement(By.cssSelector(
				"div.content:nth-child(2) div.product-card-group.mb-md-1.mb-lg-2 div.row.row-cols-1.row-cols-md-4:nth-child(2) div.col:nth-child(17) div.card.product-card div.card-body div.card-footer div.row.align-items-center.g-0.inline-add-to-cart div.col-8.col-md-8.col-8.px-0 div.text-end button.btn.btn-primary.btn-md > span:nth-child(1)"))
				.click();
		Thread.sleep(2000);
		// Remove an Item 17
		Driver.findElement(By.cssSelector(
				"div.content:nth-child(2) div.product-card-group.mb-md-1.mb-lg-2 div.row.row-cols-1.row-cols-md-4:nth-child(2) div.col:nth-child(17) div.card.product-card div.card-body div.card-footer div.row.align-items-center.g-0.inline-add-to-cart div.col-8.col-md-8.col-8.px-0 div.row.inline-cart-quantity div.col-12.col-md-12.col-lg-12.text-end button.btn.minus-btn:nth-child(1) > i.fa.fa-minus"))
				.click();
		Thread.sleep(2000);
		// Add an Item 18
		Driver.findElement(By.cssSelector(
				"div.content:nth-child(2) div.product-card-group.mb-md-1.mb-lg-2 div.row.row-cols-1.row-cols-md-4:nth-child(2) div.col:nth-child(18) div.card.product-card div.card-body div.card-footer div.row.align-items-center.g-0.inline-add-to-cart div.col-8.col-md-8.col-8.px-0 div.text-end button.btn.btn-primary.btn-md > span:nth-child(1)"))
				.click();
		Thread.sleep(2000);
		// Remove an Item 18
		Driver.findElement(By.cssSelector(
				"div.content:nth-child(2) div.product-card-group.mb-md-1.mb-lg-2 div.row.row-cols-1.row-cols-md-4:nth-child(2) div.col:nth-child(18) div.card.product-card div.card-body div.card-footer div.row.align-items-center.g-0.inline-add-to-cart div.col-8.col-md-8.col-8.px-0 div.row.inline-cart-quantity div.col-12.col-md-12.col-lg-12.text-end > button.btn.minus-btn:nth-child(1)"))
				.click();
		Thread.sleep(2000);
		// Add an Item 19
		Driver.findElement(By.cssSelector(
				"div.content:nth-child(2) div.product-card-group.mb-md-1.mb-lg-2 div.row.row-cols-1.row-cols-md-4:nth-child(2) div.col:nth-child(19) div.card.product-card div.card-body div.card-footer div.row.align-items-center.g-0.inline-add-to-cart div.col-8.col-md-8.col-8.px-0 div.text-end button.btn.btn-primary.btn-md > span:nth-child(1)"))
				.click();
		Thread.sleep(2000);
		// Remove an Item 19
		Driver.findElement(By.cssSelector(
				"div.content:nth-child(2) div.product-card-group.mb-md-1.mb-lg-2 div.row.row-cols-1.row-cols-md-4:nth-child(2) div.col:nth-child(19) div.card.product-card div.card-body div.card-footer div.row.align-items-center.g-0.inline-add-to-cart div.col-8.col-md-8.col-8.px-0 div.row.inline-cart-quantity div.col-12.col-md-12.col-lg-12.text-end > button.btn.minus-btn:nth-child(1)"))
				.click();
		Thread.sleep(2000);
		// Add an Item 20
		Driver.findElement(By.cssSelector(
				"div.content:nth-child(2) div.product-card-group.mb-md-1.mb-lg-2 div.row.row-cols-1.row-cols-md-4:nth-child(2) div.col:nth-child(20) div.card.product-card div.card-body div.card-footer div.row.align-items-center.g-0.inline-add-to-cart div.col-8.col-md-8.col-8.px-0 div.text-end button.btn.btn-primary.btn-md > span:nth-child(1)"))
				.click();
		Thread.sleep(2000);
		// Remove an Item 20
		Driver.findElement(By.cssSelector(
				"div.content:nth-child(2) div.product-card-group.mb-md-1.mb-lg-2 div.row.row-cols-1.row-cols-md-4:nth-child(2) div.col:nth-child(20) div.card.product-card div.card-body div.card-footer div.row.align-items-center.g-0.inline-add-to-cart div.col-8.col-md-8.col-8.px-0 div.row.inline-cart-quantity div.col-12.col-md-12.col-lg-12.text-end button.btn.minus-btn:nth-child(1) > i.fa.fa-minus"))
				.click();
		Thread.sleep(2000);
		JavascriptExecutor js7 = (JavascriptExecutor) Driver;
		js7.executeScript("window.scrollBy(0,450)", "");
		Thread.sleep(2000);
		// Add an Item 21
		Driver.findElement(By.cssSelector(
				"div.content:nth-child(2) div.product-card-group.mb-md-1.mb-lg-2 div.row.row-cols-1.row-cols-md-4:nth-child(2) div.col:nth-child(21) div.card.product-card div.card-body div.card-footer div.row.align-items-center.g-0.inline-add-to-cart div.col-8.col-md-8.col-8.px-0 div.text-end button.btn.btn-primary.btn-md > span:nth-child(1)"))
				.click();
		Thread.sleep(2000);
		// Remove an Item 21
		Driver.findElement(By.cssSelector(
				"div.content:nth-child(2) div.product-card-group.mb-md-1.mb-lg-2 div.row.row-cols-1.row-cols-md-4:nth-child(2) div.col:nth-child(21) div.card.product-card div.card-body div.card-footer div.row.align-items-center.g-0.inline-add-to-cart div.col-8.col-md-8.col-8.px-0 div.row.inline-cart-quantity div.col-12.col-md-12.col-lg-12.text-end button.btn.minus-btn:nth-child(1) > i.fa.fa-minus"))
				.click();
		Thread.sleep(2000);
		
		Driver.close();

	}

	@Test(enabled = true, priority = 0)
	public void TestCase2() throws InterruptedException {
		
		// MENU
		Driver.get(URL);
		
		// TestCase 2 : Items are getting filtered by VEG.
		// Scroll page
		JavascriptExecutor js10 = (JavascriptExecutor) Driver;
		js10.executeScript("window.scrollBy(0, 350)", "");
		Thread.sleep(2000);

		// Click on VEG Button to filter items
		Driver.findElement(By.cssSelector("#flexSwitchCheckChecked")).click();
		Thread.sleep(2000);

	}
	@Test(enabled = true, priority = 1)
	public void TestCase3() throws InterruptedException {
		// MENU
		Driver.get(URL);
		//TestCase 3 : Search an Item by Name
		
		//Search an Item in SearchBar
		Driver.findElement(By.cssSelector("#searchBox")).sendKeys("kadak pao");
		Thread.sleep(2000);
		Driver.findElement(By.cssSelector("#searchBox")).clear();
		//Search an Item By Category 
		Driver.findElement(By.cssSelector("#searchBox")).sendKeys("Rolls");
		Thread.sleep(2000);
		
	}
	@Test(enabled=true, priority = 2)
	public void TestCase4() throws InterruptedException {
		// MENU
		Driver.get(URL);
		// Scroll page
		JavascriptExecutor js10 = (JavascriptExecutor) Driver;
		js10.executeScript("window.scrollBy(0, -350)", "");
		Thread.sleep(2000);
		//TestCase 4 : Expand the item image by click next
		Driver.findElement(By.cssSelector("div.content:nth-child(2) div.my-3:nth-child(1) app-image-slider:nth-child(1) div.container-fluid.img-slider div.carousel.slide.pointer-event button.carousel-control-next > span.carousel-control-next-icon")).click();
		Thread.sleep(2000);
		Driver.findElement(By.cssSelector("div.content:nth-child(2) div.my-3:nth-child(1) app-image-slider:nth-child(1) div.container-fluid.img-slider div.carousel.slide.pointer-event button.carousel-control-next > span.carousel-control-next-icon")).click();
		Thread.sleep(2000);
		//Driver.close();
	}
}

