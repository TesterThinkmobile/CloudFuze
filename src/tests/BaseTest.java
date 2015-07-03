package tests;


import data.Settings;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseTest extends Settings {

    @BeforeMethod(groups = {"good", "bad"})
    public void openBrowser() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", getChromeDriverPath());

        ChromeOptions options = new ChromeOptions();
        options.addArguments("test-type");

        setDriver(new ChromeDriver(options));

    }

    @AfterMethod(groups = {"good", "bad"})
    public void after() {
        getDriver().close();
    }
}
