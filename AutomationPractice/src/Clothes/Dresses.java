package Clothes;

import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class Dresses extends Launchsetup {
	@Test(groups="regression")
  public void Dress() throws InterruptedException {
	  
	  driver.findElement(By.xpath("//*[@id=\"block_top_menu\"]/ul/li[2]/a")).click();
	  Thread.sleep(5000);
	  Actions Dress=new Actions(driver);
	  Dress.moveToElement(driver.findElement(By.xpath("//*[@id=\"block_top_menu\"]/ul/li[2]/a"))).click();
	  Thread.sleep(5000);
	  //driver.findElement(By.xpath("/html/body/div[1]/div[1]/header/div[3]/div/div/div[6]/ul/li[2]/ul/li[1]/a")).click();
	  //Thread.sleep(5000);
	}
}
