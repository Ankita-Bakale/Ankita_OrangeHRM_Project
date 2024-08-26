package BusinessLogic;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import PomPages.Pom_Logout;

@Listeners(BusinessLogic.ListenersClass.class)
public class Logout_Page extends BaseClass{
	Pom_Logout logout;
	
	@Test
	public void tearDown() {
		try {
			logout = new Pom_Logout(driver);
			logout.getProfileDrpdwn().click();
			logout.getLogOutBtn().click();
		} catch (Exception e) {
			System.out.println(e);
		}
	}
}
