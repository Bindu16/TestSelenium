package Examples;

import java.io.File;
//import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;

public class Screenshot {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver","C:\\Users\\Lab\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver scn = new ChromeDriver();
		scn.get("http://classroom:90/qahrm/login.php");
		scn.manage().window().maximize();
		
		scn.findElement(By.name("txtUserName")).sendKeys("qaplanet");
		scn.findElement(By.name("txtPassword")).sendKeys("qaplanet");
		scn.findElement(By.name("Submit")).click();
		Thread.sleep(2000);
		
		//Taking screenshots when entering incorrect password
		File scrFile =((TakesScreenshot)scn).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(scrFile,new File("D://Paint//screenshot.png"));
		
		scn.close();
		scn.quit();
	}

}
