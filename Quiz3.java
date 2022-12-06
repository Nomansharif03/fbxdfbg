import static org.testng.Assert.assertEquals;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class Quiz3 {
	@FindBy(how=How.NAME,using="vchLogin_Name")
	WebElement enteryourname;
	
	@FindBy(name="vchPassword")
	WebElement EnterPassword;
	

	@FindBy(xpath="//button[@class='btn btn-danger']")
	WebElement ClickLogin;
	//i[@class='icon icon-patient']
	@FindBy(xpath="//i[@class='icon icon-patient']")
	WebElement PatientButton;
	//input[@id='txtLast_Name']
	@FindBy(xpath="//input[@id='txtLast_Name']")
	WebElement LastName;
	
	@FindBy(xpath="//input[@id='txtFirst_Name']")
	WebElement FirstName;
	
	@FindBy(xpath="//input[@id='txtDOB']")
	WebElement DOB;
	
	@FindBy(xpath="//a[@id='anchorPatientName136529']")
	WebElement clickPatient;
	
	@FindBy(xpath="//select[@id='ddlCountry']")
	WebElement dropdown;
	
	@FindBy(xpath="//select[@id='cmbvstatus']")
	WebElement selectdropdown;
	
//AllMethods
WebDriver driver;

Quiz3(WebDriver driver1){
	driver=driver1;
	PageFactory.initElements(driver1,this);
	}
public void Task1Writethename(String yourname) throws InterruptedException {
	enteryourname.sendKeys(yourname);
	Thread.sleep(4000);
	Assert.assertNotNull(enteryourname);
}
public void Task1WritethePassword(String password) throws InterruptedException {
	EnterPassword.sendKeys(password);
	Thread.sleep(4000);
	Assert.assertNotNull(EnterPassword);
}
public void Task1ClickLogin(String Login) throws InterruptedException {
	ClickLogin.click();
	Thread.sleep(4000);
	Assert.assertNotNull(EnterPassword);
}
public void Task1clickPatientButton(String Button) throws InterruptedException {
	PatientButton.click();
	Thread.sleep(6000);
	Assert.assertNotNull(PatientButton);
}
public void Task1LastName(String Button) throws InterruptedException {
	LastName.click();
	Thread.sleep(6000);
	Assert.assertNotNull(LastName);
}

public void Task1FirstName(String Button) throws InterruptedException {
	FirstName.click();
	Thread.sleep(6000);
	Assert.assertNotNull(FirstName);
}
public void Task1DOB(String Button) throws InterruptedException {
		DOB.click();
		Thread.sleep(6000);
		Assert.assertNotNull(DOB);
	}
public void Task2ClickonName(String Button) throws InterruptedException {
	clickPatient.click();
	Thread.sleep(6000);
	Assert.assertNotNull(clickPatient);
}
public void Task2SelectdropdownCountry() throws InterruptedException {
	Select select= new Select(dropdown);
	Thread.sleep(2000);
	select.selectByVisibleText("United States of America");
	Thread.sleep(2000);
	String selectedoption = select.getFirstSelectedOption().getText();
	assertEquals("United States of America",selectedoption );}
	
public void Task3SelectdropdownStatus() throws InterruptedException {
	Select select= new Select(dropdown);
	Thread.sleep(2000);
	select.selectByVisibleText("Single");
	Thread.sleep(2000);
	String selectedoption = select.getFirstSelectedOption().getText();
	assertEquals("Single",selectedoption );}
	}
	