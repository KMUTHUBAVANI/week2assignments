package week2.day2;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;
public class Facebook {

	

	public static void main(String[] args) {

		// TODO Auto-generated method stub
	     WebDriverManager.chromedriver().setup();
	     ChromeDriver driver = new ChromeDriver();
	     driver.get("https://en-gb.facebook.com/");
	     driver.manage().window().maximize();
	     driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(100));

	     driver.findElement(By.xpath("(//div[@class='_6ltg'])[2]")).click();
	     driver.findElement(By.name("firstname")).sendKeys("Raja");
	     driver.findElement(By.name("lastname")).sendKeys("Maha");
	     driver.findElement(By.name("reg_email__")).sendKeys("7895462310");
	     driver.findElement(By.name("reg_passwd__")).sendKeys("Maha@132");
			WebElement element = driver.findElement(By.name("birthday_day"));
			Select Element = new Select(element);
			Element.selectByVisibleText("20");
			WebElement element1 = driver.findElement(By.name("birthday_month"));
			Select Element1 = new Select(element1);
			Element1.selectByVisibleText("Jan");
			WebElement element2 = driver.findElement(By.name("birthday_year"));
			Select Element2 = new Select(element2);
			Element2.selectByVisibleText("1998");
			driver.findElement(By.xpath("//input[@name='sex']")).click();
			WebElement radio1 = driver.findElement(By.id("u_o_2_jF"));
			radio1.click();
//	     driver.findElement(By.id("u_0_2_6O")).click();
	}

}
