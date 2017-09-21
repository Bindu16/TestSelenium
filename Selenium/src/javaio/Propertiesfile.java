package javaio;

import java.io.FileInputStream;
//import java.io.FileNotFoundException;
//import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;


public class Propertiesfile {

	public static void main(String[] args) throws  Exception {
		// TODO Auto-generated method stub
		Properties obj = new Properties();
		
		obj.load(new FileInputStream ("D:\\Bindu\\Selenium\\src\\javaio\\12.Properties"));
		
		String strURL = obj.getProperty("URL");
		String strUN = obj.getProperty("username");
		String strPW = obj.getProperty("password");
		
		System.setProperty("webdriver.chrome.driver","D:\\chromedriver.exe");
		
		ChromeDriver Br = new ChromeDriver();
		Br.navigate().to(strURL);
		Thread.sleep(2000);
		
		Br.findElement(By.name("txtUserName")).clear();
		Br.findElement(By.name("txtUserName")).sendKeys(strUN);
		Thread.sleep(3000);
		Br.findElement(By.name("txtPassword")).clear();
		Br.findElement(By.name("txtPassword")).sendKeys(strPW);
		Thread.sleep(3000);
		Br.findElement(By.name("Submit")).click();
		Thread.sleep(2000);
		
		Br.findElement(By.linkText("")).click();
		Br.close();
	}

}
