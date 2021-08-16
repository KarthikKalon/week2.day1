package week2.day1;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Testleaf {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.findElement(By.id("username")).sendKeys("demosalesmanager");  
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Create Lead")).click();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Testleaf");
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Karthik");
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Varadhan");
		
		WebElement drop1 = driver.findElement(By.id("createLeadForm_dataSourceId"));
		Select dropdwn=new Select(drop1);
		dropdwn.selectByIndex(3);
		driver.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("Local1");
		driver.findElement(By.id("createLeadForm_lastNameLocal")).sendKeys("Local2");
		driver.findElement(By.id("createLeadForm_personalTitle")).sendKeys("saluation");
		
		WebElement drop2 = driver.findElement(By.id("createLeadForm_marketingCampaignId"));
		Select dropdwn1=new Select(drop2);
		dropdwn1.selectByValue("9002");
		
		driver.findElement(By.id("createLeadForm_generalProfTitle")).sendKeys("Title");
		
		driver.findElement(By.id("createLeadForm_birthDate")).sendKeys("07/8/98");
		driver.findElement(By.id("createLeadForm_departmentName")).sendKeys("Selenium");
		driver.findElement(By.id("createLeadForm_annualRevenue")).sendKeys("111111111");
		
		
		WebElement drop3 = driver.findElement(By.id("createLeadForm_industryEnumId"));
		Select dropdwn2=new Select(drop3);
		dropdwn2.selectByVisibleText("Computer Software");
		
		
		WebElement drop4 = driver.findElement(By.id("createLeadForm_ownershipEnumId"));
		Select dropdwn3=new Select(drop4);
		dropdwn3.selectByValue("OWN_CCORP");
		
		driver.findElement(By.id("createLeadForm_numberEmployees")).sendKeys("3000");
		driver.findElement(By.id("createLeadForm_sicCode")).sendKeys("Sic Code");
		driver.findElement(By.id("createLeadForm_tickerSymbol")).sendKeys("Ticker Symbol");
		driver.findElement(By.id("createLeadForm_description")).sendKeys("No Description");
		driver.findElement(By.id("createLeadForm_importantNote")).sendKeys("Important Note");
		driver.findElement(By.id("createLeadForm_primaryPhoneAreaCode")).sendKeys("6000107");
		
		driver.findElement(By.id("createLeadForm_primaryPhoneNumber")).sendKeys("9876543210");
		driver.findElement(By.id("createLeadForm_primaryPhoneExtension")).sendKeys("Phone Extension");
		driver.findElement(By.id("createLeadForm_primaryPhoneAskForName")).sendKeys("Person");
		driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("testleaf@gmail.com");
		driver.findElement(By.id("createLeadForm_primaryWebUrl")).sendKeys("url");
		driver.findElement(By.id("createLeadForm_generalToName")).sendKeys("GeneralName");
		
		driver.findElement(By.id("createLeadForm_generalAttnName")).sendKeys("AtName");
		driver.findElement(By.id("createLeadForm_generalAddress1")).sendKeys("Address1");
		driver.findElement(By.id("createLeadForm_generalAddress2")).sendKeys("Address2");
		driver.findElement(By.id("createLeadForm_generalCity")).sendKeys("Chennai");
		driver.findElement(By.id("createLeadForm_generalPostalCode")).sendKeys("Chennai");
		driver.findElement(By.id("createLeadForm_generalPostalCodeExt")).sendKeys("Post");
		//driver.findElement(By.id("submitButton")).click();
		
		WebElement drop5 = driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId"));
		Select dropdwn4=new Select(drop5);
		dropdwn4.selectByIndex(2);
	
		driver.findElement(By.name("submitButton")).click();
		String title1 = driver.getTitle();
		System.out.println("Title of Page : " + title1);
		String ExpectedTitle=new String();
		ExpectedTitle="View Lead | opentaps CRM";
		if(title1.equals(ExpectedTitle)) {
			System.out.println("true");
		}
		else {
			System.out.println("false");
		}
	}

}