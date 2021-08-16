package week2.day1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Facebook {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver= new ChromeDriver();
		driver.get("https://en-gb.facebook.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.linkText("Create New Account")).click();
		driver.findElement(By.name("firstname")).sendKeys("Karthik");
		driver.findElement(By.name("lastname")).sendKeys("Varadhan");
		driver.findElement(By.name("reg_email__")).sendKeys("Karthik@gmail.com"); 
		driver.findElement(By.name("reg_email_confirmation__")).sendKeys("Karthik@gmail.com");
		driver.findElement(By.id("password_step_input")).sendKeys("Karthik78");
		
		WebElement drp1 = driver.findElement(By.id("day"));
		Select drpdwn1=new Select(drp1);
		drpdwn1.selectByIndex(6);
		
		WebElement drp2 = driver.findElement(By.id("month"));
		Select drpdwn2=new Select(drp2);
		drpdwn2.selectByValue("3");
		
		WebElement drp3 = driver.findElement(By.id("year"));
		Select drpdwn3=new Select(drp3);
		drpdwn3.selectByValue("2020");
	}

}
