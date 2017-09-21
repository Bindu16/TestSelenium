package HRM;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

//import org.openqa.selenium.firefox.FirefoxDriver;

public class HRMTC01 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

	
			System.setProperty("webdriver.chrome.driver","D:\\chromedriver.exe");
			ChromeDriver driver = new ChromeDriver();
		
			driver.get("http://classroom:90/qahrm/login.php");
			driver.manage().window().maximize();
			Thread.sleep(1000);
		 
			driver.findElement(By.name("txtUserName")).sendKeys("qaplanet1");
			driver.findElement(By.name("txtPassword")).sendKeys("user1");
			driver.findElement(By.name("Submit")).click();
			System.out.println("Login successfully");
	}

}
