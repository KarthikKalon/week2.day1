package week2.day1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SalesForce {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver= new ChromeDriver();
		driver.get("https://www.salesforce.com/in/form/signup/freetrial-sales/?d=70130000000Enyk");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.findElement(By.name("UserFirstName")).sendKeys("Karthik");
		driver.findElement(By.name("UserLastName")).sendKeys("Varadhan");
		driver.findElement(By.name("UserEmail")).sendKeys("Karthik@gmail.com");
		driver.findElement(By.name("CompanyName")).sendKeys("Testleaf");
		driver.findElement(By.name("UserPhone")).sendKeys("9876543210");
		
		WebElement drpdwn1 = driver.findElement(By.name("UserTitle"));
		Select drp1 = new  Select(drpdwn1);
		drp1.selectByIndex(3);
		
		WebElement drpdwn2 = driver.findElement(By.name("CompanyEmployees"));
		Select drp2 = new  Select(drpdwn2);
		drp2.selectByValue("9");
		
		WebElement drpdwn3 = driver.findElement(By.name("CompanyCountry"));
		Select drp3 = new  Select(drpdwn3);
		drp3.selectByIndex(6);
		driver.close();
		
	}

}
