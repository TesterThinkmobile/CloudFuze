package tests;


import methods.FilesPage;
import methods.HomePage;
import methods.SettingsPage;
import methods.StartPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.util.Random;

import static org.testng.Assert.assertEquals;

public class SettingsPageTest extends BaseTest {


    Long date = System.currentTimeMillis();
    String value = String.valueOf(date);


    @Test
    public void A_Edit_name_positive() throws InterruptedException {

        goHome();

        Random r = new Random();
        char base1 = (char)(r.nextInt(26) + 'a');
        String EditName = "tester"+String.valueOf(base1);

        StartPage startPage = new StartPage();
        String Email = startPage.getProperty("email.forwork");
        String Password = startPage.getProperty("password.forwork");
        startPage.Login(Email, Password);
        startPage.finishLogin();
        HomePage homePage = new HomePage();
        SettingsPage settingsPage = homePage.SettingsPage();
        settingsPage.Edit_name(EditName);

        WebElement new_name_displayed = getDriver().findElement(By.xpath("//*[contains(text(), '" + EditName + "')] | //*[@value='" + EditName + "']"));
        new_name_displayed.isDisplayed();
        wait_sec();

    }

    @Test
    public void A_Edit_name_negative() throws InterruptedException {

        goHome();

        Random r = new Random();
        char base1 = (char)(r.nextInt(26) + 'a');
        String EditName = "tester123"+String.valueOf(base1);

        StartPage startPage = new StartPage();
        String Email = startPage.getProperty("email.forwork");
        String Password = startPage.getProperty("password.forwork");
        startPage.Login(Email, Password);
        startPage.finishLogin();
        HomePage homePage = new HomePage();
        SettingsPage settingsPage = homePage.SettingsPage();
        settingsPage.Edit_name(EditName);

        assertEquals("Please enter a valid Name. Name can contain characters (a-z, A-Z).", getDriver().findElement(By.cssSelector("div.textoFull > span")).getText());


    }

    @Test
    public void B_Edit_password_positive() throws InterruptedException {

        goHome();

        String EditPassword1 = "tester";
        String EditPassword2 = "tester";

        StartPage startPage = new StartPage();
        String Email = startPage.getProperty("email.forwork");
        String Password = startPage.getProperty("password.forwork");
        startPage.Login(Email, Password);
        startPage.finishLogin();
        HomePage homePage = new HomePage();
        SettingsPage settingsPage = homePage.SettingsPage();
        settingsPage.Edit_password(EditPassword1, EditPassword2);

        assertEquals("Your password updated successfully.", getDriver().findElement(By.cssSelector("div.textoFull > span")).getText());


    }

    @Test
    public void B_Edit_password_negative() throws InterruptedException {

        goHome();

        String EditPassword1 = "tester";
        String EditPassword2 = "123456";

        StartPage startPage = new StartPage();
        String Email = startPage.getProperty("email.forwork");
        String Password = startPage.getProperty("password.forwork");
        startPage.Login(Email, Password);
        startPage.finishLogin();
        HomePage homePage = new HomePage();
        SettingsPage settingsPage = homePage.SettingsPage();
        settingsPage.Edit_password(EditPassword1, EditPassword2);

        assertEquals("Password and Confirm password doesnot match.", getDriver().findElement(By.cssSelector("div.textoFull")).getText());


    }

    @Test
    public void B_Edit_password_empty() throws InterruptedException {

        goHome();

        String EditPassword1 = "";
        String EditPassword2 = "";

        StartPage startPage = new StartPage();
        String Email = startPage.getProperty("email.forwork");
        String Password = startPage.getProperty("password.forwork");
        startPage.Login(Email, Password);
        startPage.finishLogin();
        HomePage homePage = new HomePage();
        SettingsPage settingsPage = homePage.SettingsPage();
        settingsPage.Edit_password(EditPassword1, EditPassword2);

        assertEquals("Please enter the required fields.", getDriver().findElement(By.cssSelector("div.textoFull > span")).getText());


    }

    @Test
    public void C__check_Paymant_info() throws InterruptedException {

        goHome();


        StartPage startPage = new StartPage();
        String Email = startPage.getProperty("email.forwork");
        String Password = startPage.getProperty("password.forwork");
        startPage.Login(Email, Password);
        startPage.finishLogin();
        HomePage homePage = new HomePage();
        SettingsPage settingsPage = homePage.SettingsPage();
        settingsPage.PaymentInfo();
        settingsPage.Upgrade_and_checkout();


    }



}
