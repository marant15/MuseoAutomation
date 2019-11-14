package museo.museo;
import java.util.concurrent.TimeUnit;

import org.testng.Assert;
import org.testng.annotations.Test;	
import org.testng.annotations.BeforeClass;	
import org.testng.annotations.AfterClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sprint3 {
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
	public void proyectNavTest(){
		driver.get(baseUrl);
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		WebElement proyects = driver.findElement(By.id("nav-projects"));
		proyects.click();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		Assert.assertEquals(driver.getCurrentUrl().contains("/#/projects"),true);
	}
	@Test
	public void proyectNavbarTest(){
		driver.get(baseUrl);
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		WebElement proyects = driver.findElement(By.id("nav-projects"));
		proyects.click();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		WebElement navbar = driver.findElement(By.id("navBar"));
		Assert.assertEquals(navbar.isDisplayed(),true);
	}
	@Test
	public void publicationsNavTest(){
		driver.get(baseUrl);
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		WebElement publications = driver.findElement(By.id("nav-publications"));
		publications.click();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		Assert.assertEquals(driver.getCurrentUrl().contains("/#/publications"),true);
	}
	@Test
	public void publicationsNavbarTest(){
		driver.get(baseUrl);
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		WebElement publications = driver.findElement(By.id("nav-publications"));
		publications.click();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		WebElement navbar = driver.findElement(By.id("navBar"));
		Assert.assertEquals(navbar.isDisplayed(),true);
	}
}
