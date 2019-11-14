package museo.museo;

import java.util.concurrent.TimeUnit;

import org.testng.Assert;
import org.testng.annotations.Test;	
import org.testng.annotations.BeforeClass;	
import org.testng.annotations.AfterClass;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sprint2 {
	public static WebDriver driver;
	public String baseUrl = "http://localhost:8081/#/";
	@BeforeClass
	public static void beforetests() {
		System.setProperty("webdriver.chrome.driver","C:\\chromeDriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	}
	
	@AfterClass
	public static void aftertests() {
		driver.close();
	}
	@Test
	public void ContactNavTest(){
		driver.get(baseUrl);
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		WebElement contact = driver.findElement(By.id("nav-contact"));
		contact.click();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		Assert.assertEquals(driver.getCurrentUrl().contains("/#/contact"),true);
	}
	@Test
	public void ContactFormTest() throws InterruptedException {
		driver.get(baseUrl);
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		WebElement contact = driver.findElement(By.id("nav-contact"));
		contact.click();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		Thread.sleep(2000);
		WebElement name = driver.findElement(By.id("contact-name"));
		WebElement mail = driver.findElement(By.id("contact-mail"));
		WebElement message = driver.findElement(By.id("contact-message"));
		WebElement sendButton = driver.findElement(By.id("contact-send"));
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView();", driver.findElement(By.id("contact-contact")));
		name.click();
		name.sendKeys("nombre");
		mail.click();
		mail.sendKeys("pensu15@gmail.com");
		message.click();
		message.sendKeys("hola");
		sendButton.click();
	}
	@Test
	public void ContactMapTest() throws InterruptedException {
		driver.get(baseUrl);
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		WebElement contact = driver.findElement(By.id("nav-contact"));
		contact.click();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		Thread.sleep(2000);
		WebElement map = driver.findElement(By.id("contact-map"));
		Assert.assertEquals(map.isDisplayed(),true);
	}
	@Test
	public void ContactNavbarTest(){
		driver.get(baseUrl);
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		WebElement contact = driver.findElement(By.id("nav-contact"));
		contact.click();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		WebElement navbar = driver.findElement(By.id("navBar"));
		Assert.assertEquals(navbar.isDisplayed(),true);
	}
	@Test
	public void ContactFooterTest(){
		driver.get(baseUrl);
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		WebElement contact = driver.findElement(By.id("nav-contact"));
		contact.click();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		WebElement footer = driver.findElement(By.className("footer"));
		Assert.assertEquals(footer.isDisplayed(),true);
	}
	@Test
	public void aboutNavTest(){
		driver.get(baseUrl);
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		WebElement about = driver.findElement(By.id("nav-about"));
		about.click();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		Assert.assertEquals(driver.getCurrentUrl().contains("/#/about"),true);
	}
	@Test
	public void aboutNavbarTest(){
		driver.get(baseUrl);
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		WebElement about = driver.findElement(By.id("nav-about"));
		about.click();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		WebElement navbar = driver.findElement(By.id("navBar"));
		Assert.assertEquals(navbar.isDisplayed(),true);
	}
	@Test
	public void aboutFooterTest(){
		driver.get(baseUrl);
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		WebElement about = driver.findElement(By.id("nav-about"));
		about.click();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		WebElement footer = driver.findElement(By.className("footer"));
		Assert.assertEquals(footer.isDisplayed(),true);
	}
	@Test
	public void aboutCarouselTest(){
		driver.get(baseUrl);
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		WebElement about = driver.findElement(By.id("nav-about"));
		about.click();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		WebElement carousel = driver.findElement(By.id("AboutCarousel"));
		Assert.assertEquals(carousel.isDisplayed(),true);
	}
	@Test
	public void aboutWhoTest(){
		driver.get(baseUrl);
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		WebElement about = driver.findElement(By.id("nav-about"));
		about.click();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		WebElement who = driver.findElement(By.id("QuienesSomos"));
		Assert.assertEquals(who.isDisplayed(),true);
	}
	@Test
	public void aboutMisionTest(){
		driver.get(baseUrl);
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		WebElement about = driver.findElement(By.id("nav-about"));
		about.click();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		WebElement mision = driver.findElement(By.id("Mision"));
		Assert.assertEquals(mision.isDisplayed(),true);
	}
	@Test
	public void aboutVisionTest(){
		driver.get(baseUrl);
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		WebElement about = driver.findElement(By.id("nav-about"));
		about.click();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		WebElement vision = driver.findElement(By.id("Vision"));
		Assert.assertEquals(vision.isDisplayed(),true);
	}
	@Test
	public void aboutHistoryTest(){
		driver.get(baseUrl);
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		WebElement about = driver.findElement(By.id("nav-about"));
		about.click();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		WebElement history = driver.findElement(By.id("History"));
		Assert.assertEquals(history.isDisplayed(),true);
	}
	@Test
	public void aboutTweetsTest(){
		driver.get(baseUrl);
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		WebElement about = driver.findElement(By.id("nav-about"));
		about.click();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		WebElement tweets = driver.findElement(By.id("Tweets"));
		Assert.assertEquals(tweets.isDisplayed(),true);
	}
	@Test
	public void sectionsNavTest(){
		driver.get(baseUrl);
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		WebElement sections = driver.findElement(By.id("nav-sections"));
		sections.click();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		Assert.assertEquals(driver.getCurrentUrl().contains("/#/sections"),true);
	}
	@Test
	public void sectionsNavbarTest(){
		driver.get(baseUrl);
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		WebElement sections = driver.findElement(By.id("nav-sections"));
		sections.click();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		WebElement navbar = driver.findElement(By.id("navBar"));
		Assert.assertEquals(navbar.isDisplayed(),true);
	}
	@Test
	public void sectionsFooterTest(){
		driver.get(baseUrl);
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		WebElement sections = driver.findElement(By.id("nav-sections"));
		sections.click();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		WebElement footer = driver.findElement(By.className("footer"));
		Assert.assertEquals(footer.isDisplayed(),true);
	}
}
