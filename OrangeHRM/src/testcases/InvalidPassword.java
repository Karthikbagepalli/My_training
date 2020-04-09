package testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;


public class InvalidPassword {


	@Test
	@Parameters({"username","password"})
	public void main(String uname, String pword) {
    System.setProperty("webdriver.chrome.driver", "F:\\selenium\\chromedriver.exe");
	WebDriver driver= new ChromeDriver();

	driver.navigate().to("https://opensource-demo.orangehrmlive.com/");
	
	WebElement userName=driver.findElement(By.id("txtUsername"));
	userName.sendKeys(uname);
	
	WebElement passWord=driver.findElement(By.id("txtPassword"));
	passWord.sendKeys(pword);
	
	WebElement loginBtn=driver.findElement(By.id("btnLogin"));
	loginBtn.click();
	
	driver.quit();
	
}
}
