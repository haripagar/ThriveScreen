package TestNG;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ThriveScreen2  {
	WebDriver Driver;
	public String URL = "http://hiring.hashtagloyalty.com";

	@BeforeTest
	public void BT() {
		System.setProperty("webdriver.chrome.driver", "E:\\Moolya_TR\\Driver\\chromedriver.exe");
		WebDriverManager.chromedriver().setup();

		Driver = new ChromeDriver();
		Driver.manage().window().maximize();
	}

	//  Screen 2 : Cart
	
	@Test(enabled=true, priority = 0)
	public void TestCase1() throws InterruptedException {
		//MENU
		Driver.get(URL);
		//Add an Item in Cart
		JavascriptExecutor js = (JavascriptExecutor) Driver;
		js.executeScript("window.scrollBy(0,650)", "");
		Thread.sleep(2000);
		
		// Add an Item 1
		Driver.findElement(By.cssSelector(
				"div.content:nth-child(2) div.product-card-group.mb-md-1.mb-lg-2 div.row.row-cols-1.row-cols-md-4:nth-child(2) div.col:nth-child(1) div.card.product-card div.card-body div.card-footer div.row.align-items-center.g-0.inline-add-to-cart div.col-8.col-md-8.col-8.px-0 div.text-end button.btn.btn-primary.btn-md > span:nth-child(1)"))
				.click();
		Thread.sleep(2000);
		
		//TestCase 1 : Users are able to view a list of all items added to the cart.
		//TestCase 2 : Item sub total, taxes applied & grand total are calculated and displayed properly.
		Driver.findElement(By.cssSelector("app-root:nth-child(1) app-header:nth-child(1) div.toolbar div.cart-icon:nth-child(4) > i.fa.fa-shopping-cart")).click();
		Thread.sleep(2000);
		//TestCase 3 :  The checkout button upon clicking should open a pop-up containing JSON of final order details.
		Driver.findElement(By.cssSelector("div.content:nth-child(2) app-cart:nth-child(2) div.container-fluid.cart-container div.payment-detail div.text-center.my-4:nth-child(4) > button.btn.btn-secondary")).click();
		Thread.sleep(2000);
		//On pop up - Click OK 
        Alert alert = Driver.switchTo().alert();
        alert.accept();
		
}
}
