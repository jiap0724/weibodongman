package AndroidInstaller.dongman;

import java.io.File;

import org.apache.http.HttpResponse;
import org.apache.http.HttpStatus;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;

public class DingresulrReport {
	public static String WEBHOOK_TOKEN = "https://oapi.dingtalk.com/robot/send?access_token=a31818427c52db2f59e63a1b77dc1baa274f43f8461fc0525fe03ba676794327";

	public static void main(String args[]) throws Exception {

		HttpClient httpclient = HttpClients.createDefault();

		HttpPost httppost = new HttpPost(WEBHOOK_TOKEN);
		httppost.addHeader("Content-Type", "application/json; charset=utf-8");
		File classpathRoot = new File(System.getProperty("user.dir"));
		File appDir = new File(classpathRoot, "/apps");
		File[] apks = appDir.listFiles();
		int apksnumber = 0;
		for (int i = 0; i < apks.length; i++) {
			apksnumber++;
		}
		System.out.println(apksnumber);
		String textMsg = "{ \"msgtype\": \"text\", \"text\": {\"content\": \"渠道包自动化验证测试结果\n本次共验证渠道包\"}}";
		// String textMsg = "{ "msgtype": "text", "text": {"content": "渠道包自动化验证
		// 本次执行了2条用例"}}";
		StringEntity se = new StringEntity(textMsg, "utf-8");
		httppost.setEntity(se);

		HttpResponse response = httpclient.execute(httppost);
		if (response.getStatusLine().getStatusCode() == HttpStatus.SC_OK) {
			String result = EntityUtils.toString(response.getEntity(), "utf-8");
			System.out.println(result);
		}
	}

}
