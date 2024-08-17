package seleniumproject;


import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MyFirstProject {
	
	public static void main(String[] args) throws InterruptedException {
		
		ChromeDriver driver = new ChromeDriver();
		
		//System.setProperty("webdriver.chrome.driver", "C:\\path\\to\\chromedriver.exe");

		driver.get("http://localhost:3444/");
		driver.manage().window().maximize();
		
        driver.findElement(By.cssSelector("input[type='email']")).sendKeys("amosrajkumar1803@gmail.com");
        Thread.sleep(1000);
        driver.findElement(By.id("password")).sendKeys("R@mkumar.p.1");
        Thread.sleep(1000);

        driver.findElement(By.id("view-password")).click();
        Thread.sleep(2000);
        driver.findElement(By.cssSelector("input[type='submit']")).click();
        Thread.sleep(2000);
        driver.findElement(By.linkText("Sign Up")).click();
        driver.findElement(By.cssSelector("input[type='text']")).sendKeys("RamkumarPeriyasamy");
        driver.findElement(By.cssSelector("input[type='email']")).sendKeys("amosrajkumar1803@gmail.com");
        driver.findElement(By.cssSelector("input[type='password']")).sendKeys("R@mkumar.p.1");
        // driver.findElement(By.cssSelector("input[type='checkbox']")).click();
       
        //driver.findElement(By.id("terms-conditions")).click();
        Thread.sleep(2000);
        driver.findElement(By.cssSelector("input[type='submit']")).click();
	}

}
