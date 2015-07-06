package methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class HomePage extends BasePage {


    WebDriver driver = getDriver();

    @Override
    protected void Init() {

    }

    public HomePage() {
        super();

    }

    public CloudPage CloudPage() throws InterruptedException {

        // window maximize
        driver.manage().window().maximize();


        try{
            //cloud button
            WebElement add_cloud_account_button = driver.findElement(By.cssSelector(".button.blue"));
            add_cloud_account_button.click();
            wait_sec();

            //content is dsiplayed
            WebElement content_isDisplayed = driver.findElement(By.cssSelector(".tab-content"));
            content_isDisplayed.isDisplayed();
            wait_sec();

        }
        catch (Exception ok) {
            //cloud button
            WebElement cloud_button = driver.findElement(By.cssSelector(".icon-cloud"));
            cloud_button.click();
            wait_sec();

            //content is dsiplayed
            WebElement content_isDisplayed = driver.findElement(By.cssSelector(".tab-content"));
            content_isDisplayed.isDisplayed();
            wait_sec();

        }

        return new CloudPage();
    }

    public WorkspacePage WorkspacePage() throws InterruptedException {

        // window maximize
        driver.manage().window().maximize();


            wait_sec();
            wait_sec();
            //workspace button
            WebElement workspace_button = driver.findElement(By.cssSelector(".cf-workspace"));
            workspace_button.click();
            wait_sec();

            //text is dsiplayed
            WebElement content_isDisplayed = driver.findElement(By.cssSelector("#headerText"));
            content_isDisplayed.isDisplayed();
            wait_sec();
            wait_sec();

        return new WorkspacePage();
    }

    public FilesPage FilesPage() throws InterruptedException {

        // window maximize
        driver.manage().window().maximize();



        //file button
        WebElement files_button = driver.findElement(By.cssSelector(".icon-files"));
        files_button.click();
        wait_sec();
        wait_sec();

        //text is displayed
        WebElement content_isDisplayed = driver.findElement(By.cssSelector("#headerText"));
        content_isDisplayed.isDisplayed();
        wait_sec();
        wait_sec();
        wait_sec();


        return new FilesPage();
    }

}
