package AndroidInstaller.dongman;

import org.mockito.MockitoAnnotations;
import org.openqa.selenium.TakesScreenshot;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
//--------------------- 

public class BaseTester {
	public static TakesScreenshot driver;

	@BeforeClass
	public void setUp() {
		MockitoAnnotations.initMocks(this);
	}

	@BeforeMethod
	public void beforeMethod() {
		p("---------------");
	}

	@AfterMethod
	public void AfterMethod() {
		p("---------------");
	}

	public void p(Object o) {
		System.out.println(o);
	}

}
