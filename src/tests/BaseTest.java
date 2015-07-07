package tests;


import data.Settings;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.util.HashMap;
import java.util.Map;

public class BaseTest extends Settings {

    @BeforeMethod(groups = {"good", "bad"})
    public void openBrowser() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", getChromeDriverPath());

        ChromeOptions options = new ChromeOptions();
        options.addArguments("test-type");
        Map<String, Object> prefs = new HashMap<String, Object>();
        prefs.put("profile.default_content_settings.popups", 0);
        prefs.put("profile.content_settings.pattern_pairs.*.multiple-automatic-downloads", 1 );

        prefs.put("download.prompt_for_download", false);
        options.setExperimentalOption("prefs", prefs);


        setDriver(new ChromeDriver(options));

    }

    @AfterMethod(groups = {"good", "bad"})
    public void after() {
        getDriver().close();
    }
}
