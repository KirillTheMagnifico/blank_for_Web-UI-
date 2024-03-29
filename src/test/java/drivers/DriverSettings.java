package drivers;

import com.codeborne.selenide.Configuration;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import config.Project;

public class DriverSettings {
    public static void configure() {
        Configuration.browser = Project.config.browser();
        Configuration.browserSize = Project.config.browserSize();


        DesiredCapabilities capabilities = new DesiredCapabilities();
        ChromeOptions chromeOptions = new ChromeOptions();

        chromeOptions.addArguments("--no-sandbox");
        chromeOptions.addArguments("--disable-infobars");
        chromeOptions.addArguments("--disable-popup-blocking");
        chromeOptions.addArguments("--disable-notifications");
        chromeOptions.addArguments("--lang=en-en");

        //String remoteUrl = Project.config.remoteDriverUrl();
        //if (remoteUrl != null) {
         //   capabilities.setCapability("enableVNC", true);
          //  capabilities.setCapability("enableVideo", true);

       // }

        capabilities.setCapability(ChromeOptions.CAPABILITY, chromeOptions);
        Configuration.browserCapabilities = capabilities;
    }
}