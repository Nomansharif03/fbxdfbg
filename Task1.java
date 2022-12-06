import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;



public class Task1 
{
	WebDriver driver=new ChromeDriver();
	Quiz3 object =new Quiz3(driver);
    
    @Test(description="Write Your Name ",priority =1)
	public void Task1Writethename() throws InterruptedException {
		
    	
		driver.get("http://release01.curemd.com/curemdy/datlogin.asp");
		object.Task1Writethename("ChargeClaimAtch");
		object.Task1WritethePassword("SuPPort.2014");
		object.Task1ClickLogin("login");
		object.Task1clickPatientButton("Click the Button");
		object.Task1LastName("Aaa");
		object.Task1FirstName("ZIXHEENOQK");
		object.Task1DOB("01/01/2002");

}
}
