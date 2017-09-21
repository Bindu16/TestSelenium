package TestNG;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class EX1 {
	WebDriver river;
	WebDriverWait wait;
	
	@BeforeClass
	public void method1()
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Lab\\Downloads\\chromedriver`\\chromedriver.exe");
		WebDriver river =new ChromeDriver();
		
		river.manage().window().maximize();
		System.out.println("method1");
	}

	
	@Test
	public void method2()
	{
	river.get("http://classroom:90/qahrm/login.php");
	river.findElement(By.name("txtUserName")).sendKeys("qaplanet1");
	river.findElement(By.name("txtPassword")).sendKeys("user1");
	river.findElement(By.name("Submit")).click();
	
	Reporter.log("Homepage opened successfully");
	}
	
	@AfterClass
	public void method()
	{
		river.close();
		System.out.println("method");
	}
	
}

