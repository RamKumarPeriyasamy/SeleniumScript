package seleniumwebdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class DwinzoTestNG {
	
	ChromeDriver driver ;
	
  @Test(priority=1)
   void applicationOpen()
  {
	  driver = new ChromeDriver();
	  driver.get("http://localhost:3444/");
	  driver.manage().window().maximize();
		
  }
  @Test(priority=2)
  void  loginName()
 {
	  
	  @SuppressWarnings("unused")
	boolean status=driver.findElement(By.className("get-started-title")).isDisplayed();
	  System.out.println("Login Name Displayed");
	    
 }
  @Test(priority=4)
   void  login() throws InterruptedException
  {
	  driver.findElement(By.cssSelector("input[type='email']")).sendKeys("amosrajkumar1803@gmail.com");
      Thread.sleep(1000);
      driver.findElement(By.id("password")).sendKeys("R@mkumar.p.1");
      Thread.sleep(1000);
      driver.findElement(By.id("view-password")).click();
      Thread.sleep(2000);
      driver.findElement(By.cssSelector("input[type='submit']")).click();
      Thread.sleep(2000);
  }
  
  @Test(priority=3)
  void  googleSign() throws InterruptedException
 {
	  //driver.findElement(By.className("nsm7Bb-HzV7m-LgbsSe-bN97Pc-sM5MNb")).click();
	driver.findElement(By.cssSelector("input[role='button']")).click();
	Thread.sleep(3000);
	driver.findElement(By.className("Wf6lSd")).isDisplayed();
	driver.findElement(By.className("sign-up-wrapper")).click();
	  System.out.println("google sign working");    
 }
  @Test(priority=5)
  void  signupName()
 {
	  
	  @SuppressWarnings("unused")
	boolean status=driver.findElement(By.className("get-started-title")).isDisplayed();
	  System.out.println("signin Name Displayed");
	    
 }
  @Test(priority=5)
   void signup() throws InterruptedException
  {
	  driver.findElement(By.linkText("Sign Up")).click();
      driver.findElement(By.cssSelector("input[type='text']")).sendKeys("RamkumarPeriyasamy");
      driver.findElement(By.cssSelector("input[type='email']")).sendKeys("amosrajkumar1803@gmail.com");
      driver.findElement(By.cssSelector("input[type='password']")).sendKeys("R@mkumar.p.1");
      Thread.sleep(2000);
      driver.findElement(By.cssSelector("input[type='checkbox']")).click();
      Thread.sleep(2000);
      driver.findElement(By.cssSelector("input[type='checkbox']")).click();
      Thread.sleep(2000);
      driver.findElement(By.cssSelector("input[type='submit']")).click();
      Thread.sleep(2000);
  }
  @Test(priority=6)
  void closeApp() 
    {
	  driver.quit(); 
    }
  }
