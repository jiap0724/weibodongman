package AndroidInstaller.dongman;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.ITestResult;
import org.testng.TestListenerAdapter;

import io.qameta.allure.Attachment;

public class TestFailListener extends TestListenerAdapter {
	   
    public void onTestFailure(ITestResult result) {
        takePhoto();
    }

    @Attachment(value = "screen shot",type = "image/png")
    public byte[]  takePhoto(){
        byte[] screenshotAs = ((TakesScreenshot)BaseTester.driver).getScreenshotAs(OutputType.BYTES);
        return screenshotAs;
    }

}