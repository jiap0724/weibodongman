package AndroidInstaller.dongman;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.IHookCallBack;
import org.testng.IHookable;
import org.testng.ITestResult;

import com.google.common.io.Files;

import io.qameta.allure.Attachment;

public class AllureReporterListener extends apkInstallTest implements IHookable {
	@Override
	public void run(IHookCallBack callBack, ITestResult testResult) {
		callBack.runTestMethod(testResult);
		if (testResult.getThrowable() != null) {
			try {
				takeScreenShot(testResult.getMethod().getMethodName());
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}

	@Attachment(value = "Failure in method {0}", type = "image/png")
	private byte[] takeScreenShot(String methodName) throws IOException {
		File screenshot = (File) ((TakesScreenshot) getDriver()).getScreenshotAs(OutputType.FILE);
		return Files.toByteArray(screenshot);
	}

	private TakesScreenshot getDriver() {
		// TODO Auto-generated method stub
		return null;
	}
}

