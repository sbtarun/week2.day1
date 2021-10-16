package week2.day1.assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateLead {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://leaftaps.com/opentaps/");
		driver.findElement(By.id("username")).sendKeys("demosalesmanager");
		driver.findElement(By.name("PASSWORD")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();

		driver.findElement(By.linkText("CRM/SFA")).click();

		driver.findElement(By.linkText("Leads")).click();

		driver.findElement(By.linkText("Create Lead")).click();

		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("TestLeaf");
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("TARUN");
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("SB");
		driver.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("Tarun");
		driver.findElement(By.id("createLeadForm_lastNameLocal")).sendKeys("SB");
		driver.findElement(By.id("createLeadForm_personalTitle")).sendKeys("Mr.");
		driver.findElement(By.id("createLeadForm_generalProfTitle")).sendKeys("Associate");
		driver.findElement(By.id("createLeadForm_birthDate")).sendKeys("05/05/97");
		driver.findElement(By.id("createLeadForm_departmentName")).sendKeys("MCA");
		driver.findElement(By.id("createLeadForm_annualRevenue")).sendKeys("500000");
		driver.findElement(By.id("createLeadForm_numberEmployees")).sendKeys("150");
		driver.findElement(By.id("createLeadForm_sicCode")).sendKeys("1234");
		driver.findElement(By.id("createLeadForm_tickerSymbol")).sendKeys("Arrow");

		driver.findElement(By.id("createLeadForm_primaryPhoneCountryCode")).clear();
		driver.findElement(By.id("createLeadForm_primaryPhoneCountryCode")).sendKeys("91");
		driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("tarun@gmail.com");
		driver.findElement(By.id("createLeadForm_primaryPhoneNumber")).sendKeys("9597401066");

		driver.findElement(By.name("generalToName")).sendKeys("Tarun");
		driver.findElement(By.id("createLeadForm_generalAddress1")).sendKeys("14th Street");
		driver.findElement(By.id("createLeadForm_generalAddress2")).sendKeys("Sherlock");
		driver.findElement(By.id("createLeadForm_generalCity")).sendKeys("Indiana");
		driver.findElement(By.id("createLeadForm_generalPostalCode")).sendKeys("600044");
		WebElement state = driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId"));
		Select dropdown1 = new Select(state);
		dropdown1.selectByValue("OH");
		driver.findElement(By.className("smallSubmit")).click();

		String title = driver.getTitle();
		System.out.println("Title is " + title);
		String str = "View Lead | opentaps CRM";
		if (str.equals(title)) {
			System.out.println("Title verified");
		}
	}
}
