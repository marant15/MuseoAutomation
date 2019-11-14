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
import org.openqa.selenium.interactions.Actions;

public class Sprint1 {
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
	public void title() throws InterruptedException {
		String expectedTitle = "museodorbigny";
		String actualTitle = "";
		driver.get(baseUrl);
		actualTitle = driver.getTitle();
		Assert.assertEquals(actualTitle,expectedTitle);
	}
	@Test
	public void navbar() throws InterruptedException {
		driver.get(baseUrl);
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		Assert.assertEquals(driver.findElement(By.id("navBar")).isDisplayed(),true);
		WebElement home = driver.findElement(By.id("navbar-home"));
		Actions action = new Actions(driver);
		action.moveToElement(home);
		action.click();
		WebElement publicaciones = driver.findElement(By.id("nav-publications"));
		WebElement acerca = driver.findElement(By.id("nav-about"));
		WebElement contact = driver.findElement(By.id("nav-contact"));
		WebElement secciones = driver.findElement(By.id("nav-sections"));
		Assert.assertEquals(publicaciones.isDisplayed(),true);
		Assert.assertEquals(acerca.isDisplayed(),true);
		Assert.assertEquals(contact.isDisplayed(),true);
		Assert.assertEquals(secciones.isDisplayed(),true);
	}
	@Test
	public void carousel() throws InterruptedException {
		driver.get(baseUrl);
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		WebElement carousel = driver.findElement(By.id("carousel"));
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView();", carousel);
		Assert.assertEquals(carousel.isDisplayed(),true);
	}
	
	@Test
	public void proyects() throws InterruptedException {
		driver.get(baseUrl);
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		WebElement projectsWindow = driver.findElement(By.id("projectsWindow"));
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView();", projectsWindow);
		Assert.assertEquals(projectsWindow.isDisplayed(),true);
	}
	@Test
	public void publications() throws InterruptedException {
		driver.get(baseUrl);
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		WebElement postsWindow = driver.findElement(By.id("postsWindow"));
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView();", postsWindow);
		Assert.assertEquals(postsWindow.isDisplayed(),true);
	}
	@Test
	public void footer(){
		driver.get(baseUrl);
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		WebElement footer = driver.findElement(By.className("footer"));
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView();", footer);
		Assert.assertEquals(footer.isDisplayed(),true);
	}
	@Test
	public void contactZoneF(){
		driver.get(baseUrl);
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		WebElement contacto = driver.findElement(By.id("f-name"));
		WebElement email = driver.findElement(By.id("f-email"));
		WebElement telefono = driver.findElement(By.id("f-phone"));
		WebElement direccion = driver.findElement(By.id("f-direction"));
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView();", contacto);
		Assert.assertEquals(contacto.isDisplayed(),true);
		Assert.assertEquals(email.getLocation().x,telefono.getLocation().x);
		Assert.assertEquals(email.getLocation().x,direccion.getLocation().x);
	}
	@Test
	public void socialZoneF(){
		driver.get(baseUrl);
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		WebElement social = driver.findElement(By.id("f-social"));
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView();", social);
		Assert.assertEquals(social.isDisplayed(),true);
		WebElement instagram = driver.findElement(By.id("f-instagram"));
		WebElement facebook = driver.findElement(By.id("f-facebook"));
		WebElement twitter = driver.findElement(By.id("f-twitter"));
		WebElement whatsapp = driver.findElement(By.id("f-whatsapp"));
		Assert.assertEquals(instagram.getLocation().y,facebook.getLocation().y);
		Assert.assertEquals(instagram.getLocation().y,twitter.getLocation().y);
		Assert.assertEquals(instagram.getLocation().y,whatsapp.getLocation().y);
	}
	@Test
	public void instagram(){
		driver.get(baseUrl);
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		WebElement instagram = driver.findElement(By.id("f-instagram"));
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView();", instagram);
		instagram.click();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		Assert.assertEquals(driver.getCurrentUrl().contains("instagram.com/museodorbigny"),true);
	}
	@Test
	public void facebook(){
		driver.get(baseUrl);
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		WebElement facebook = driver.findElement(By.id("f-facebook"));
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView();", facebook);
		facebook.click();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		Assert.assertEquals(driver.getCurrentUrl().contains("facebook.com/MUSEOdOrbigny"),true);
	}
	@Test
	public void twitter(){
		driver.get(baseUrl);
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		WebElement twitter = driver.findElement(By.id("f-twitter"));
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView();", twitter);
		twitter.click();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		Assert.assertEquals(driver.getCurrentUrl().contains("twitter.com/museodorbigny"),true);
	}
	
	@Test
	public void watasapp(){
		driver.get(baseUrl);
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		WebElement whatsapp = driver.findElement(By.id("f-whatsapp"));
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView();", whatsapp);
		whatsapp.click();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		Assert.assertEquals(driver.getCurrentUrl().contains("api.whatsapp.com"),true);
	}
}
