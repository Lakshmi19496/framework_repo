package createorgTest;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class CreateContactTest {
	@Test(groups="ST")
	public void createContactTest() {
	System.out.println("====createContactTest====");	
	System.out.println("====createContactTest====");	
	}
	@Test(groups="RT")
	public void modifyContactTest() {
	System.out.println("====createContactTest====");	
	}
	@BeforeClass(alwaysRun = true)
	public void openBrowser() {
		System.out.println("openBrowser");
	}
	@AfterClass(alwaysRun = true)
	public void closeBrowser() {
		System.out.println("closeBrowser");
	}
	

}
