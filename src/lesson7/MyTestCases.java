package lesson7;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class MyTestCases {

	
		WebDriver driver= new ChromeDriver ();
		
		String myUrl = "https://www.saucedemo.com/";
		Assertion MyAssert = new Assertion();
		List <Srting> arr = new ArrayList()<String> ;
		
	@BeforeTest
		
		public void myBeforeTest() 
		{
			driver.get(myUrl);
			WebElement UserName = driver.findElement(By.xpath("//*[@id=\"user-name\"]"));
			UserName.sendKeys("standard_user");
			
			WebElement PassWord = driver.findElement(By.xpath("//*[@id=\"password\"]"));
			PassWord.sendKeys("secret_sauce");
			WebElement SubmitButton = driver.findElement(By.xpath("//*[@id=\"login-button\"]"));
			SubmitButton.click();
			
		}
		
		@Test
		
		public void AddToCart() throws InterruptedException
		{
			List<WebElement> AddToCart = driver.findElements(By.className("btn"));
			
			for (int i=0 ; i < AddToCart.size(); i++)
			{
				
				AddToCart.get(i).click();
				

			}
			}
			
			@Test
			
			public void RemoveFromCart() throws InterruptedException
			{
				List<WebElement> AddToCart = driver.findElements(By.className("btn"));
				Thread.sleep(3000);
				for (int i=0 ; i < AddToCart.size(); i++)
				{
					
					AddToCart.get(i).click();
					Thread.sleep(3000);

				}
				
				
		}
		
		@AfterTest
		public void myAfterTest()
		{
			
			
		}



}
