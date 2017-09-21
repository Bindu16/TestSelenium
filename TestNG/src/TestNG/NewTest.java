package TestNG;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;

public class NewTest {
  @Test
  public void method1() {
  Reporter.log("method1");
  }
  @BeforeClass
  public void beforeClass() {
	  System.out.println("beforeclass");
  }
  
 
  @AfterClass
  public void afterClass() {
  System.out.println("afterclass");
  }
  
  @Test
  public void method2() {
  Reporter.log("method2");
  }
  
  }


