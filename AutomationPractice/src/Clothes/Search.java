package Clothes;

import org.testng.annotations.Test;

import org.openqa.selenium.By;


@Test(groups={"regression","sanity","smoke"})
public class Search extends Launchsetup{
	
	//WebDriver driver;
	
  public void Srch() throws InterruptedException {
driver.findElement(By.name("search_query")).sendKeys("Kids");
driver.findElement(By.name("submit_search")).click();
Thread.sleep(5000);
  }
	/*
	 * @Parameters("browser")
	 * 
	 * @BeforeTest public void beforeTest() throws InterruptedException {
	 * 
	 * System.setProperty("webdriver.chrome.driver",
	 * "C:\\Users\\Sruthi\\Downloads\\chromedriver_win32\\chromedriver.exe"); driver
	 * = new ChromeDriver(); driver.get("http://automationpractice.com/index.php");
	 * driver.manage().window().maximize(); Thread.sleep(5000); }
	 * 
	 * @AfterTest public void afterTest() { }
	 */

}
