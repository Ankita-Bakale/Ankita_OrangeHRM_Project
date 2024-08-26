package BusinessLogic;

import java.io.IOException;

import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import PomPages.Pom_PIM;

@Listeners(BusinessLogic.ListenersClass.class)
public class PIM_Page extends BaseClass{

	Pom_PIM home;
	JavascriptExecutor js;

	@Test(priority = 1)
	public void addEmpDetailsAndValidate() throws IOException, InterruptedException {
		// Add Employee
		String firstName = "Elena";
		String lastName = "Damon";
		String middleName = "Salvatore";
		// Add Employee
		js = (JavascriptExecutor) driver;
		SoftAssert soft = new SoftAssert();
		home = new Pom_PIM(driver);
		home.getPim().click();
		home.getAddEmpBtn().click();
		home.getFname().sendKeys(firstName);
		home.getMidName().sendKeys(middleName);
		home.getLname().sendKeys(lastName);
		String EmployeeId = home.getEmpId().getText();
		
		home.getCreateLoginCred().click();
		home.getUserName().sendKeys("ElenaGilberrr");
		js.executeScript("arguments[0].click()", home.getStatusDisable());
		home.getPassword().sendKeys("Damon@123");
		home.getConfirmPassword().sendKeys("Damon@123");
		js.executeScript("arguments[0].click()", home.getSaveBtn());
		
		//Employee Search Validation
		home.getEmpListBtn().click();
		for(int i=0;i<2;i++) {
			if(i==0) {
				home.getSearchByempName().sendKeys(firstName);
			}
			else {
				home.getSearchByempId().sendKeys(EmployeeId);
			}
			home.getSearchBtn().click();
			Thread.sleep(1500);
			String empIDGot=home.getEmpIDGot().getText();
			String empNameGot=home.getNameGot().getText();
			String empLastNameGot=home.getLastNameGot().getText();
			
			try {
				soft.assertTrue(empIDGot.equals(EmployeeId)&&empNameGot.contains(firstName)&&empNameGot.contains(middleName)&&empLastNameGot.equals(lastName));
				System.out.println("Employee Information is Correct");
			}catch(Exception e){
				System.out.println("Employee Information is not Correct");
			}
			home.getResetBtn().click();
		}
	}
}
