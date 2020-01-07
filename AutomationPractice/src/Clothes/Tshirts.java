package Clothes;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
//import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class Tshirts extends Launchsetup{
	
	//WebDriver driver;
	@Test(groups="sanity")
	public void x() throws InterruptedException {
	driver.findElement(By.xpath("/html/body/div/div[1]/header/div[3]/div/div/div[6]/ul/li[3]/a")).click();
	JavascriptExecutor js = (JavascriptExecutor) driver;
	js.executeScript("window.scrollBy(0,600)");
		/*
		 * Actions act=new
		 * Actions(driver);act.moveToElement(driver.findElement(By.linkText(
		 * "http://automationpractice.com/index.php?id_product=1&amp;controller=product"
		 * ))); Thread.sleep(10000); Actions cart=new Actions(driver);
		 * cart.moveToElement(driver.findElement(By.xpath(
		 * "//*[@id=\"center_column\"]/ul/li/div/div[3]/div[1]/a"))).click();
		 * Thread.sleep(5000);
		 */
	driver.findElement(By.xpath("//*[@id=\"list\"]/a/i")).click();
	driver.findElement(By.xpath("//*[@id=\"center_column\"]/ul/li/div/div/div[3]/div/div[2]/a[1]")).click();
	Thread.sleep(5000);
	driver.findElement(By.xpath("/html/body/div/div[1]/header/div[3]/div/div/div[4]/div[1]/div[2]/div[4]/a")).click();
	Thread.sleep(5000);
	driver.findElement(By.xpath("/html/body/div/div[2]/div/div[3]/div/div[2]/table/tbody/tr/td[5]/input[2]")).sendKeys("2");
	Thread.sleep(5000);
	driver.findElement(By.xpath("//*[@id=\"center_column\"]/p[2]/a[1]")).click();
}
}