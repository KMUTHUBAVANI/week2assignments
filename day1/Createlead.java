package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Createlead {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		
		System.out.println(System.getProperty("webdriver.chrome.driver"));
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/login");
		driver.manage().window().maximize();
		driver.findElement(By.id("username")).sendKeys("DemoSalesManager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Create Lead")).click();
//		driver.findElement(By.linkText("Email")).click();
//
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("XYZcompany");
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Test1");
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("T");
		WebElement element = driver.findElement(By.id("createLeadForm_dataSourceId"));
		Select Element = new Select(element);
		Element.selectByVisibleText("Employee");
		WebElement element1 = driver.findElement(By.id("createLeadForm_marketingCampaignId"));
		Select Element1 = new Select(element1);
		Element1.selectByVisibleText("Automobile");
		driver.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("Test1");
		driver.findElement(By.id("createLeadForm_lastNameLocal")).sendKeys("T");
		driver.findElement(By.id("createLeadForm_personalTitle")).sendKeys("Tester");
		driver.findElement(By.id("createLeadForm_birthDate")).sendKeys("01/22/2021");
		driver.findElement(By.id("createLeadForm_generalProfTitle")).sendKeys("AutomationTester");
		driver.findElement(By.id("createLeadForm_departmentName")).sendKeys("Controls");
		driver.findElement(By.id("createLeadForm_annualRevenue")).sendKeys("200000");
		WebElement element2 = driver.findElement(By.id("createLeadForm_industryEnumId"));
		Select Element2 = new Select(element2);
		Element2.selectByVisibleText("Computer Software");
		WebElement element3 = driver.findElement(By.id("createLeadForm_ownershipEnumId"));
		Select Element3 = new Select(element3);
		Element3.selectByVisibleText("Corporation");
		driver.findElement(By.id("createLeadForm_numberEmployees")).sendKeys("200");
		driver.findElement(By.id("createLeadForm_sicCode")).sendKeys("gydfd");
		driver.findElement(By.id("createLeadForm_tickerSymbol")).sendKeys("Key");
		driver.findElement(By.id("createLeadForm_description")).sendKeys("Test");
		driver.findElement(By.id("createLeadForm_importantNote")).sendKeys("Sample");
		
		driver.findElement(By.id("createLeadForm_primaryPhoneAreaCode")).sendKeys("002");
		driver.findElement(By.id("createLeadForm_primaryPhoneNumber")).sendKeys("9487563036");
		driver.findElement(By.id("createLeadForm_primaryPhoneExtension")).sendKeys("91");
		driver.findElement(By.id("createLeadForm_primaryPhoneAskForName")).sendKeys("Test2");
		driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("Sample@gmail.com");
		driver.findElement(By.id("createLeadForm_primaryWebUrl")).sendKeys("http://leaftaps.com/opentaps/control/login");

		driver.findElement(By.id("createLeadForm_generalToName")).sendKeys("Test1");
		driver.findElement(By.id("createLeadForm_generalAttnName")).sendKeys("Test");
		driver.findElement(By.id("createLeadForm_generalAddress1")).sendKeys("91");
		driver.findElement(By.id("createLeadForm_generalAddress2")).sendKeys("southstreet");
		driver.findElement(By.id("createLeadForm_generalCity")).sendKeys("London");
		driver.findElement(By.id("createLeadForm_generalPostalCode")).sendKeys("oogf");
		driver.findElement(By.id("createLeadForm_generalPostalCodeExt")).sendKeys("dvfg");
		WebElement element4 = driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId"));
		Select Element4 = new Select(element4);
		Element4.selectByVisibleText("California");
		driver.findElement(By.className("smallSubmit")).click();
		String title1 = driver.getTitle();
		if (title1.contains("View Lead"))
		{
		System.out.println(title1+"PASS");
		}
		else {
			System.out.println("Fail");

		}
//		driver.close();
		
	}
	

}
