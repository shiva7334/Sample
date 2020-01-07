package Clothes;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class DragandDrop {
	WebDriver driver;
	
  @Test
  public void f() throws InterruptedException {
	  System.setProperty("webdriver.chrome.driver","C:\\Users\\Sruthi\\Downloads\\chromedriver_win32\\chromedriver.exe");
	  driver = new ChromeDriver();
	  driver.get("https://jqueryui.com/resources/demos/droppable/default.html");
	  driver.manage().window().maximize();
	  Thread.sleep(5000);
	  
	  Actions act=new Actions(driver);
	  WebElement drag=driver.findElement(By.xpath(".//*[@id='draggable']"));
	  WebElement drop=driver.findElement(By.xpath(".//*[@id='droppable']"));
	  act.dragAndDrop(drag, drop).build().perform();
 
	  }
  }

