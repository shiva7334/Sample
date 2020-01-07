package Clothes;

import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class Women extends Launchsetup {
  @Test(groups="regression")
  public void Womn() throws InterruptedException {
	Actions Women = new Actions(driver);
	Women.moveToElement(driver.findElement(By.xpath("/html/body/div[1]/div[1]/header/div[3]/div/div/div[6]/ul/li[1]/a"))).build().perform();
	Thread.sleep(5000);
	driver.findElement(By.xpath("/html/body/div[1]/div[1]/header/div[3]/div/div/div[6]/ul/li[1]/ul/li[1]/ul/li[2]/a")).click();
	  
  }
 }