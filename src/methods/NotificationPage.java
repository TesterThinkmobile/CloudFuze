package methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class NotificationPage extends BasePage {

    WebDriver driver = getDriver();

    @Override
    protected void Init() {

    }

    public NotificationPage() {
        super();

    }

    //--------------------------------NOTIFICATION-----------------------------------------
//    public void Notification_button() throws InterruptedException {
//
//        WebElement notification_button = driver.findElement(By.cssSelector(".cf-bell"));
//        notification_button.click();
//        wait_sec();
//
//        WebElement notification_list= driver.findElement(By.cssSelector("#cf_notification"));
//        notification_list.isDisplayed();
//        wait_sec();
//
//
//    }

    public void Notification_ignoreAll() throws InterruptedException {

        WebElement ignoreAll_button = driver.findElement(By.cssSelector("#ignore"));
        ignoreAll_button.isDisplayed();
        ignoreAll_button.click();
        wait_sec();

//        WebElement notification_list= driver.findElement(By.cssSelector("#cf_notification"));
//        notification_list.isDisplayed();
//        wait_sec();

    }

    public void Notification_ClearAll() throws InterruptedException {

        WebElement clearAll_button = driver.findElement(By.cssSelector("#clear"));
        clearAll_button.isDisplayed();
        clearAll_button.click();
        wait_sec();

//        WebElement notification_list= driver.findElement(By.cssSelector("#cf_notification"));
//        notification_list.isDisplayed();
//        wait_sec();

    }

    public void Notification_Content() throws InterruptedException {

        WebElement notification = driver.findElement(By.cssSelector(".content>a>p"));
        //html/body/section/div[1]/div[1]/div[5]/ul[2]/li[1]/span[2]/a/p
        notification.isDisplayed();
        notification.click();
        wait_sec();
        wait_sec();
        wait_sec();

        WebElement file_checkbox = driver.findElement(By.cssSelector(".LVcheckBox>input"));
        file_checkbox.isDisplayed();
        wait_sec();

    }

    public void Notification_delete() throws InterruptedException {

        WebElement notification = driver.findElement(By.className("cf-cross32"));
        //html/body/section/div[1]/div[1]/div[5]/ul[2]/li[1]/i
        notification.isDisplayed();
        notification.click();
        wait_sec();
        wait_sec();
        wait_sec();


    }


}
