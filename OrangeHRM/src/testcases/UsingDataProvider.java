package testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class UsingDataProvider {

	String[][] data= {{"Admin","admin123"},{"Admin1","admin123"},{"Admin1","admin1"},{"Admin","admin1"}};
	
			@DataProvider(name="loginData")
	     public String[][] logindata(){
		return data;
	}
	
	@Test(dataProvider="loginData")
	public void main(String uname,String pword) {
		System.setProperty("webdriver.chrome.driver", "F:\\selenium\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		
		driver.navigate().to("https://opensource-demo.orangehrmlive.com/");
		WebElement username =driver.findElement(By.id("txtUsername"));
		username.sendKeys(uname);
		
		WebElement passWord=driver.findElement(By.id("txtPassword"));
		passWord.sendKeys(pword);
		
		WebElement loginBtn=driver.findElement(By.id("btnLogin"));
		loginBtn.click();
		
		driver.quit();
		
	}
	
	
	
}
