package AndroidInstaller.dongman;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.qameta.allure.Feature;
import io.qameta.allure.Stories;
import io.qameta.allure.Story;

public class apkInstallTest {
	private AndroidDriver<WebElement> driver;

	public void runTestCase() throws Exception {
		// 输出判断结果
		System.out.println("Result：" + driver.isAppInstalled("com.weibo.comic"));

		// 判断是否安装成功
		Assert.assertEquals(driver.isAppInstalled("com.weibo.comic"), true, "安装失败");
		// 点击登录按钮

		System.out.println("开始了");

		// 点击同意


		try {

			Thread.sleep(2000);
			System.out.println("点击同意");
			WebElement tongyi = (AndroidElement) driver.findElement(By.id("com.weibo.comic:id/sb"));
			tongyi.click();
			// 授权
			Thread.sleep(5000);
			// WebElement shouquan = (AndroidElement) driver
			// .findElement(By.id("com.android.packageinstaller:id/permission_allow_button"));
			// // com.android.packageinstaller:id/permission_allow_button
			// shouquan.click();
			// Thread.sleep(2000);
			// shouquan.click();
			Swipe swipe = new Swipe(driver);
			// 向左滑动工具区5次
			for (int i = 0; i < 5; i++) {
				swipe.swipe_Left(500);
			}

			// 点击首屏幕
			Thread.sleep(5000);
			System.out.println("点击首屏");
			// WebElement kaiqi = (AndroidElement)
			// driver.findElement(By.id("com.weibo.comic:id/in"));//7.7.0
			// WebElement kaiqi = (AndroidElement)
			// driver.findElement(By.id("com.weibo.comic:id/ir"));//7.7.5
			// WebElement kaiqi = (AndroidElement)
			// driver.findElement(By.id("com.weibo.comic:id/jt"));//7/8.0
			// WebElement kaiqi = (AndroidElement)
			// driver.findElement(By.id("com.weibo.comic:id/k6"));7.9.5
			// WebElement kaiqi=(AndroidElement)
			// driver.findElement(By.id("com.weibo.comic:id/k_"));//8.0.0
			WebElement kaiqi = (AndroidElement) driver.findElement(By.id("com.weibo.comic:id/a3r"));// 8.0.2

			kaiqi.click();

			// 选择男女
			Thread.sleep(2000);
			System.out.println("选择男版");
			// WebElement nan = (AndroidElement)
			// driver.findElement(By.id("com.weibo.comic:id/j6"));
			// WebElement
			// nan=(AndroidElement)driver.findElement(By.id("com.weibo.comic:id/x_"));//7.7.0
			// WebElement
			// nan=(AndroidElement)driver.findElement(By.id("com.weibo.comic:id/xz"));//7.7.5
			// WebElement
			// nan=(AndroidElement)driver.findElement(By.id("com.weibo.comic:id/a0v"));//7.8.0
			// WebElement nan = (AndroidElement)
			// driver.findElement(By.id("com.weibo.comic:id/a1l"));
			// WebElement nan =
			// (AndroidElement)driver.findElement(By.id("com.weibo.comic:id/a4w"));//
			WebElement nan = (AndroidElement) driver.findElement(By.id("com.weibo.comic:id/ann"));// 8.0.2
			// WebElement nan = driver.findElementByName("我是男生");
			nan.click();

			// 7.8.0新增流程
			Thread.sleep(2000);
			System.out.println("点击下一步");
			// WebElement
			// next=(AndroidElement)driver.findElement(By.id("com.weibo.comic:id/w9"));//7.8.0
			// WebElement next = (AndroidElement)
			// driver.findElement(By.id("com.weibo.comic:id/wu"));
			WebElement next = (AndroidElement) driver.findElement(By.id("com.weibo.comic:id/ahc"));
			// WebElement next = driver.findElementByName("下一步");
			next.click();


			Thread.sleep(2000);
			System.out.println("点击不填写～");
			// WebElement
			// butianxie=(AndroidElement)driver.findElement(By.id("com.weibo.comic:id/a2h"));//7.8.0
			// WebElement butianxie = (AndroidElement)
			// driver.findElement(By.id("com.weibo.comic:id/a39"));
			// WebElement butianxie = driver.findElementByName("不填了～");
			WebElement butianxie = (AndroidElement) driver.findElement(By.id("com.weibo.comic:id/apn"));
			butianxie.click();

			// 关闭浮窗
			Thread.sleep(2000);
			System.out.println("点击关闭浮窗");
			// WebElement guanbi = (AndroidElement)
			// driver.findElement(By.id("com.weibo.comic:id/dq"));//7.7.0
			// WebElement guanbi = (AndroidElement)
			// driver.findElement(By.id("com.weibo.comic:id/dr"));//7.7.5
			// WebElement guanbi = (AndroidElement)
			// driver.findElement(By.id("com.weibo.comic:id/m4"));//7.8.0
			// WebElement guanbi = (AndroidElement)
			// driver.findElement(By.id("com.weibo.comic:id/mh"));//7.9.5
			WebElement guanbi = (AndroidElement) driver.findElement(By.id("com.weibo.comic:id/a3w"));
			guanbi.click();

			// 断言当前界面是否有指定内容是否包含星次元
			// Thread.sleep(3000);
			// Assert.assertEquals(driver.getPageSource().contains("星次元"),
			// true);

			Thread.sleep(3000);
			System.out.println("点击某个作品");
			// WebElement comic_id = driver.findElement(By.xpath(
			// "//android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.view.ViewGroup[1]/android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.view.ViewGroup[1]/android.view.ViewGroup[1]/android.view.ViewGroup[1]/android.view.ViewGroup[1]/android.view.ViewGroup[1]/android.view.ViewGroup[1]/android.view.ViewGroup[1]/android.support.v4.view.ViewPager[1]/android.view.ViewGroup[1]/android.view.ViewGroup[1]/android.view.ViewGroup[1]/android.widget.ScrollView[1]/android.view.ViewGroup[1]/android.view.ViewGroup[2]/android.view.ViewGroup[1]/android.view.ViewGroup[1]/android.view.ViewGroup[1]"));
			WebElement comic_id = driver.findElement(By.xpath(
					"//android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.view.ViewGroup[1]/android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.view.ViewGroup[1]/android.view.ViewGroup[1]/android.view.ViewGroup[1]/android.view.ViewGroup[1]/android.view.ViewGroup[1]/android.view.ViewGroup[1]/android.view.ViewGroup[1]/android.support.v4.view.ViewPager[1]/android.view.ViewGroup[1]/android.view.ViewGroup[1]/android.view.ViewGroup[1]/android.widget.ScrollView[1]/android.view.ViewGroup[1]/android.view.ViewGroup[2]/android.view.ViewGroup[1]/android.view.ViewGroup[1]/android.widget.TextView[1]"));
			comic_id.click();
			Thread.sleep(5000);
			System.out.println("点击关注按钮");
			WebElement guanzhu = (AndroidElement) driver.findElement(By.id("com.weibo.comic:id/zk"));
			guanzhu.click();
			Thread.sleep(3000);
			System.out.println("点击输入手机号");
			WebElement user_tel = (AndroidElement) driver.findElement(By.id("com.weibo.comic:id/aag"));
			Thread.sleep(1000);
			user_tel.sendKeys("15210068667");
			Thread.sleep(2000);
			System.out.println("点击下一步");
			WebElement next_button = (AndroidElement) driver.findElement(By.id("com.weibo.comic:id/aak"));
			next_button.click();
			Thread.sleep(2000);
			System.out.println("输入密码");
			WebElement user_password = (AndroidElement) driver.findElement(By.id("com.weibo.comic:id/aah"));
			Thread.sleep(1000);
			user_password.sendKeys("11111111");
			Thread.sleep(2000);
			System.out.println("点击登录按钮");
			WebElement user_login = (AndroidElement) driver.findElement(By.id("com.weibo.comic:id/aae"));
			user_login.click();
			Thread.sleep(3000);

		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		// 卸载app
		driver.removeApp("com.weibo.comic");
		// driver.installApp(appPath);
		System.out.println("app已经卸载了");
	}

	

	// @Description("渠道包测试报告")
	@Feature("渠道包测试")
	@Stories(value = { @Story(value = "安装app"), @Story(value = "关注作品"), @Story(value = "登录"), @Story(value = "卸载app") })

	@Test
	public void androidApkCheck() throws Exception {

		// 设置启动的程序位置和程序的名字，循环安装各个渠道apk文件
		File classpathRoot = new File(System.getProperty("user.dir"));
		File appDir = new File(classpathRoot, "/apps");
		File[] apks = appDir.listFiles();
		int apksnumber = 0;
		for (int i = 0; i < apks.length; i++) {
			apksnumber++;
		}
		System.out.println(apksnumber);
		for (File apk : apks) {
			System.out.println("当前包名是:" + apk.getName());
			if (!apk.isDirectory() && apk.getName().endsWith("apk")) {

				// 设置设备的属性
				DesiredCapabilities capabilities = new DesiredCapabilities();

				// 设置平台 Android
				capabilities.setCapability("platformName", "Android");

				// 设置设备的名称，真机或者模拟器的, 设备连接电脑，在命令行输入adb devices 查看即可
				capabilities.setCapability("deviceName", "emulator-5554");// 模拟器

				// 设置Android系统的版本号
				// capabilities.setCapability("platformVersion", "9");
				capabilities.setCapability("platformVersion", "6.0.1");
				// 设置apk文件的路径
				capabilities.setCapability("app", apk.getAbsolutePath());

				// 设置apk的包名
				capabilities.setCapability("appPackage", "com.weibo.comic");

				// 设置main Activity，例如 .mainNmae.activity 记得带上点
				// capabilities.setCapability("appActivity",
				// "com.sina.anime.ui.activity.SplashActivity");
				capabilities.setCapability("appActivity", "com.sina.anime.ui.activity.MainActivity");// 7.4.0启动activity

				// waitActivity ，如果启动成功，没有影响，可以不填写
				capabilities.setCapability("appWaitActivity", "");

				// 设置UNicode键盘支持中文输入，会默认的代替内置的键盘
				capabilities.setCapability("unicodeKeyboard", "True");
				capabilities.setCapability("resetKeyboard", "True");

				try {

					// 加载驱动,ip,填写相应的ip和端口 例如 http://172.16.11.120:4720
					driver = new AndroidDriver<WebElement>(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);

				} catch (MalformedURLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				// 调用测试case
				this.runTestCase();
				// Reporter.log("共验证渠道包个数为：" + apksnumber + "个");
				// 释放驱动
				driver.quit();

			}
		}
		Reporter.log("共验证渠道包个数为：" + apksnumber + "个");
	}

	

}