package Com.PageClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class calculatorOperationsPage {
	static ExtentTest test;
	static ExtentReports report;
	private WebDriver driver;

	By inputLocator = By.xpath("//div[@id='sciInPut']");
	By multiplicationLoactor = By.xpath("(//span[@class='sciop'])[5]");
	By equalsButton = By.xpath("(//span[@class='scieq'])[2]");
	By divisionLocator = By.xpath("(//span[@class='sciop'])[8]");
	By subtractLocator = By.xpath("(//span[@class='sciop'])[3]");
	By additionLocator = By.xpath("(//span[@class='sciop'])[1]");
	By result = By.xpath("//div[@id='scihistory']");

	public calculatorOperationsPage(WebDriver driver) {
		this.driver = driver;
	}

	@BeforeClass
	public void startTest() {
		report = new ExtentReports(System.getProperty("user.dir") + "\\ExtentReportResults.html");
		test = report.startTest("ExtentDemo");
	}

	public void Multiplication() throws AWTException
	{


		Robot r=new Robot();
		//Entering Number 423
		r.keyPress(KeyEvent.VK_4); 
		r.keyRelease(KeyEvent.VK_4);

		r.keyPress(KeyEvent.VK_2); 
		r.keyRelease(KeyEvent.VK_2);

		r.keyPress(KeyEvent.VK_3); 
		r.keyRelease(KeyEvent.VK_3);

		//Clicking on Multiplication button inside the calculator
		driver.findElement(multiplicationLoactor).click();

		//Entering Number 525
		r.keyPress(KeyEvent.VK_5); 
		r.keyRelease(KeyEvent.VK_5);

		r.keyPress(KeyEvent.VK_2);
		r.keyRelease(KeyEvent.VK_2);

		r.keyPress(KeyEvent.VK_5); 
		r.keyRelease(KeyEvent.VK_5);

		//Clicking on Equals to button button inside the calculator
		driver.findElement(equalsButton).click();

		//Verifying result of multiplication and logging in report
		if(driver.findElement(result).getText().contains("= 222075")) {

			test.log(LogStatus.PASS,
					"Expected Result is displayed: "+driver.findElement(result).getText()); }
		else { test.log(LogStatus.FAIL,
				"Expected Result is not displayed: "+driver.findElement(result).getText());

		}

	}

	public void Division() throws AWTException { Robot r=new Robot();

	//Entering number 400
	r.keyPress(KeyEvent.VK_4); 
	r.keyRelease(KeyEvent.VK_4);

	r.keyPress(KeyEvent.VK_0);
	r.keyRelease(KeyEvent.VK_0);

	r.keyPress(KeyEvent.VK_0); 
	r.keyRelease(KeyEvent.VK_0);

	//Clicking on Division button inside the calculator
	driver.findElement(divisionLocator).click();

	//Entering number 200
	r.keyPress(KeyEvent.VK_2); 
	r.keyRelease(KeyEvent.VK_2);

	r.keyPress(KeyEvent.VK_0); 
	r.keyRelease(KeyEvent.VK_0);

	r.keyPress(KeyEvent.VK_0);
	r.keyRelease(KeyEvent.VK_0);
	//Clicking on Equals to button inside the calculator
	driver.findElement(equalsButton).click();

	//Verifying result of Division and logging in report
	if(driver.findElement(result).getText().contains("= 2")) {

		test.log(LogStatus.PASS,
				"Expected Result is displayed: "+driver.findElement(result).getText()); }
	else { test.log(LogStatus.FAIL,
			"Expected Result is not displayed: "+driver.findElement(result).getText());

	} }

	public void Addition() throws AWTException {
		Robot r=new Robot();

		//Clicking on subtract locator initially to get the number as negative
		driver.findElement(subtractLocator).click();
		//Entering Number -234234
		r.keyPress(KeyEvent.VK_2);
		r.keyRelease(KeyEvent.VK_2);

		r.keyPress(KeyEvent.VK_3); 
		r.keyRelease(KeyEvent.VK_3);

		r.keyPress(KeyEvent.VK_4); 
		r.keyRelease(KeyEvent.VK_4);

		r.keyPress(KeyEvent.VK_2); 
		r.keyRelease(KeyEvent.VK_2);

		r.keyPress(KeyEvent.VK_3); 
		r.keyRelease(KeyEvent.VK_3);

		r.keyPress(KeyEvent.VK_4); 
		r.keyRelease(KeyEvent.VK_4);


		//Clicking on addition button to perform addition
		driver.findElement(additionLocator).click();

		//Entering Number 345345
		r.keyPress(KeyEvent.VK_3); 
		r.keyRelease(KeyEvent.VK_3);

		r.keyPress(KeyEvent.VK_4); 
		r.keyRelease(KeyEvent.VK_4);

		r.keyPress(KeyEvent.VK_5); 
		r.keyRelease(KeyEvent.VK_5);

		r.keyPress(KeyEvent.VK_3); 
		r.keyRelease(KeyEvent.VK_3);

		r.keyPress(KeyEvent.VK_4); 
		r.keyRelease(KeyEvent.VK_4);

		r.keyPress(KeyEvent.VK_5); 
		r.keyRelease(KeyEvent.VK_5);

		//Clicking on Equals to button inside the calculator
		driver.findElement(equalsButton).click();

		//Verifying result of Division and logging in report
		if(driver.findElement(result).getText().contains("= 111111")) {

			test.log(LogStatus.PASS,
					"Expected Result is displayed: "+driver.findElement(result).getText()); }
		else { test.log(LogStatus.FAIL,
				"Expected Result is not displayed: "+driver.findElement(result).getText());

		} 
	}

	public void Subtraction() throws AWTException { 
		Robot r=new Robot();

		//Entering number 234823
		r.keyPress(KeyEvent.VK_2); 
		r.keyRelease(KeyEvent.VK_2);

		r.keyPress(KeyEvent.VK_3);
		r.keyRelease(KeyEvent.VK_3);

		r.keyPress(KeyEvent.VK_4); 
		r.keyRelease(KeyEvent.VK_4);

		r.keyPress(KeyEvent.VK_8);
		r.keyRelease(KeyEvent.VK_8);

		r.keyPress(KeyEvent.VK_2); 
		r.keyRelease(KeyEvent.VK_2);

		r.keyPress(KeyEvent.VK_3); 
		r.keyRelease(KeyEvent.VK_3);
		//Clicking on subtract button inside calculator to perform subtraction

		driver.findElement(subtractLocator).click();

		//Clicking on Subtract button Again for getting next number as negative
		driver.findElement(subtractLocator).click();

		//Entering Number -23094823
		r.keyPress(KeyEvent.VK_2); 
		r.keyRelease(KeyEvent.VK_2);

		r.keyPress(KeyEvent.VK_3); 
		r.keyRelease(KeyEvent.VK_3);

		r.keyPress(KeyEvent.VK_0); 
		r.keyRelease(KeyEvent.VK_0);

		r.keyPress(KeyEvent.VK_9); 
		r.keyRelease(KeyEvent.VK_9);

		r.keyPress(KeyEvent.VK_4);
		r.keyRelease(KeyEvent.VK_4);

		r.keyPress(KeyEvent.VK_8); 
		r.keyRelease(KeyEvent.VK_8);

		r.keyPress(KeyEvent.VK_2); 
		r.keyRelease(KeyEvent.VK_2);

		r.keyPress(KeyEvent.VK_3);
		r.keyRelease(KeyEvent.VK_3);
		//Clicking on Equals to button inside the calculator
		driver.findElement(equalsButton).click();

		//Verifying result of Division and logging in report
		if(driver.findElement(result).getText().contains("= 23329646")) {

			test.log(LogStatus.PASS,
					"Expected Result is displayed: "+driver.findElement(result).getText()); }
		else { test.log(LogStatus.FAIL,
				"Expected Result is not displayed: "+driver.findElement(result).getText());

		} 
	}



	@AfterClass
	public void endTest() {
		//Logging report in the directory and ending that report
		//report.endTest(test);
		report.flush();
	}

}
