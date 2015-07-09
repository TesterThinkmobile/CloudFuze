package methods;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import static data.Settings.getDriver;

public class SettingsPage extends BasePage {

    WebDriver driver = getDriver();

    @Override
    protected void Init() {

    }

    public SettingsPage() {
        super();

    }

    public void Edit_name(String EditName) throws InterruptedException {

        WebElement edit_name_button = driver.findElement(By.cssSelector("#CFEditName"));
        edit_name_button.click();
        wait_sec();

        WebElement field_name = driver.findElement(By.cssSelector("#uName"));
        field_name.isDisplayed();
        field_name.clear();
        field_name.sendKeys(EditName);
        wait_sec();


        WebElement ok_button = driver.findElement(By.cssSelector(".userNameOk"));
        ok_button.click();
        Thread.sleep(1000);

//        WebElement new_name_displayed = driver.findElement(By.cssSelector(".ProfileContent]")).findElement(By.xpath("//*[contains(text(), '" + EditName + "')] | //*[@value='" + EditName + "']"));
//        new_name_displayed.isDisplayed();
//        wait_sec();

    }


    public void Edit_password(String EditPassword1, String EditPassword2) throws InterruptedException {

        WebElement edit_name_button = driver.findElement(By.cssSelector("#editPswd"));
        edit_name_button.click();
        wait_sec();

        WebElement field_password1 = driver.findElement(By.cssSelector("#Cpswd"));
        field_password1.isDisplayed();
        field_password1.clear();
        field_password1.sendKeys(EditPassword1);
        wait_sec();

        WebElement field_password2 = driver.findElement(By.cssSelector("#Rpswd"));
        field_password2.isDisplayed();
        field_password2.clear();
        field_password2.sendKeys(EditPassword2);
        wait_sec();


        WebElement ok_button = driver.findElement(By.cssSelector(".changePwdOk"));
        ok_button.click();
        Thread.sleep(1000);

//        WebElement new_name_displayed = driver.findElement(By.cssSelector(".ProfileContent]")).findElement(By.xpath("//*[contains(text(), '" + EditName + "')] | //*[@value='" + EditName + "']"));
//        new_name_displayed.isDisplayed();
//        wait_sec();

    }

    public void PaymentInfo() throws InterruptedException {

        WebElement patmantinfo_button = driver.findElement(By.cssSelector("#paymentinfo"));
        patmantinfo_button.click();
        wait_sec();

        WebElement info_title= driver.findElement(By.cssSelector("#infotitle"));
        info_title.isDisplayed();
        wait_sec();


    }

    public void Upgrade_and_checkout() throws InterruptedException {

        WebElement upgrade_button = driver.findElement(By.cssSelector("#monthlysubscribe"));
        upgrade_button.click();
        wait_sec();

        WebElement checkout_window= driver.findElement(By.cssSelector("#calcpricemodal"));
        checkout_window.isDisplayed();
        wait_sec();
        wait_sec();

        WebElement close_button = driver.findElement(By.cssSelector("#closepricing"));
        close_button.click();
        wait_sec();wait_sec();


    }









}
