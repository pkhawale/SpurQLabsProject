package Com.TestClass;

import static org.testng.Assert.assertEquals;

import java.awt.AWTException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Com.PageClass.calculatorOperationsPage;

public class calculatorOperationsTest {
	private WebDriver driver;
	private calculatorOperationsPage CalculatorOperationsPage;
	@BeforeMethod 
	public void initializeBrowserAndURL()

	{
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://www.calculator.net/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		String ActualTitle = driver.getTitle();
		String ExpectedTitle = "Calculator.net: Free Online Calculators - Math, Fitness, Finance, Science";
		Assert.assertEquals(ExpectedTitle, ActualTitle);
		CalculatorOperationsPage=new calculatorOperationsPage(driver);

	}
	//Test Case for Multiplication Scenario
	@Test(priority = 1, enabled = true)
	public void TC01() throws AWTException {
		CalculatorOperationsPage.startTest();
		CalculatorOperationsPage.Multiplication();
		CalculatorOperationsPage.endTest();
	}
	//Test Case for Division Scenario

	@Test(priority = 2, enabled = true) public void TC02() throws AWTException {
		CalculatorOperationsPage.startTest(); 
		CalculatorOperationsPage.Division();
		CalculatorOperationsPage.endTest(); 
	}





	//Test Case for Addition Scenario



	@Test(priority = 3, enabled = true) public void TC03() throws AWTException {
		CalculatorOperationsPage.startTest(); CalculatorOperationsPage.Addition();
		CalculatorOperationsPage.endTest(); }

	//Test Case for Subtraction Scenario

	@Test(priority = 4, enabled = true) public void TC04() throws AWTException {
		CalculatorOperationsPage.startTest(); CalculatorOperationsPage.Subtraction();
		CalculatorOperationsPage.endTest(); }

}
