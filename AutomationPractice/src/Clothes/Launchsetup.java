package Clothes;

import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class Launchsetup {
	
	WebDriver driver;
	
  @Test
  public void f() {
  }
  @BeforeTest(groups={"regression","sanity","smoke"})
  public void beforeTest() throws InterruptedException {
	  
	  System.setProperty("webdriver.chrome.driver","C:\\Users\\Sruthi\\Downloads\\chromedriver_win32\\chromedriver.exe");
	  driver = new ChromeDriver();
	  driver.get("http://automationpractice.com/index.php");
	  driver.manage().window().maximize();
	  Thread.sleep(5000);
	  }
  
  @AfterTest
	public void closeapp(){
 		driver.quit();
  }
}
