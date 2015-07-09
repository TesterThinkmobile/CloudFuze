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

    public SettingsPage SettingsPage() throws InterruptedException {

        // window maximize
        driver.manage().window().maximize();

        //settings button
        WebElement settings_button = driver.findElement(By.linkText("Settings"));
        settings_button.click();
        wait_sec();
        wait_sec();

        //title is displayed
        WebElement title_isDisplayed = driver.findElement(By.cssSelector("#infotitle"));
        title_isDisplayed.isDisplayed();
        wait_sec();
        wait_sec();
        wait_sec();


        return new SettingsPage();
    }

    public NotificationPage NotificationPage() throws InterruptedException {

        // window maximize
        driver.manage().window().maximize();

        WebElement notification_button = driver.findElement(By.cssSelector(".cf-bell"));
        notification_button.click();
        wait_sec();

        WebElement notification_list= driver.findElement(By.cssSelector("#cf_notification"));
        notification_list.isDisplayed();
        wait_sec();
        wait_sec();


        return new NotificationPage();
    }

    public DeleteCloudPage DeleteCloudPage() throws InterruptedException {

        // window maximize
        driver.manage().window().maximize();

        WebElement cloud_button = driver.findElement(By.cssSelector(".icon-cloud"));
        cloud_button.click();
        wait_sec();

        WebElement manage_clouds = driver.findElement(By.cssSelector("#cm-managecloud>a"));
        manage_clouds.isDisplayed();
        manage_clouds.click();
        wait_sec();
        wait_sec();

        WebElement table_box_displayed = driver.findElement(By.cssSelector(".tabbable.box"));
        table_box_displayed.isDisplayed();
        wait_sec();


        return new DeleteCloudPage();
    }

}
