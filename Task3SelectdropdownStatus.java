import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Task3SelectdropdownStatus {

	WebDriver driver=new ChromeDriver();
	Quiz3 object =new Quiz3(driver);
    
    @Test(description="Write Your Name ",priority =1)
	public void Task1Writethename() throws InterruptedException {
		
    	
		driver.get("http://release01.curemd.com/curemdy/datlogin.asp");
		String mainWindow = driver.getWindowHandle();
		object.Task1Writethename("ChargeClaimAtch");
		object.Task1WritethePassword("SuPPort.2014");
		object.Task1ClickLogin("login");
		for(String handle : driver.getWindowHandles()) {
			if(!handle.equals(mainWindow)) {
				driver.switchTo().window(handle);
			}
		}
		
		driver.switchTo().defaultContent(); 
		driver.switchTo().frame("fra_Menu_CureMD");
		
		object.Task1clickPatientButton("Click the Button");
		
		driver.switchTo().defaultContent(); 
		driver.switchTo().frame("fraCureMD_Body");
		
		object.Task1LastName("Aaa");
		object.Task1FirstName("ZIXHEENOQK");
		object.Task1DOB("01/01/2002");
		object.Task2ClickonName("Click on Name");
		object.Task2SelectdropdownCountry();
		object.Task3SelectdropdownStatus();
		
		
}
}



