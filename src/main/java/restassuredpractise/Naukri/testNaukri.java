package restassuredpractise.Naukri;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class testNaukri {
	WebDriver driver;
	
	@BeforeTest
	public void initializebrowser()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\suresh\\Downloads\\chromedriver_win32\\chromedriver.exe");
	
		driver= new ChromeDriver();
		
	}
	
	@Test
	public void updateNaukriProfile() throws Throwable
{
	
driver.get("https:\\www.naukri.com");
Thread.sleep(2000);

driver.findElement(By.xpath("//div[@class='mTxt' and text()='Login']")).click();;

driver.findElement(By.xpath("//input[@id='eLoginNew']")).sendKeys("sureshready77@gmail.com");

driver.findElement(By.xpath("//input[@id='pLogin']")).sendKeys("Suresh@267");

driver.findElement(By.xpath("//button[@class='blueBtn' and text()='Login']")).click();

Thread.sleep(4000);
driver.findElement(By.xpath("//a[contains(text(),'UPDATE PROFILE')]")).click();

Thread.sleep(2000);

driver.findElement(By.xpath("//div[@class='resumeHeadline']//span[@class='edit icon']")).click();

driver.findElement(By.xpath("//textarea[@id='resumeHeadlineTxt']")).clear();

driver.findElement(By.xpath("//textarea[@id='resumeHeadlineTxt']")).sendKeys("4 years experience as a Software development Engineer in test which includes 20% of Manual Testing and 80% Automation testing using selenium.testng, data driven framework,SVN, Maven,GitHub, jenkins. web services automation using Qmetry framework.");

driver.findElement(By.xpath("//button[text()='Save']")).click();


	
}
	
	
	
	
	
	

}
