package tests;

import methods.StartPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import java.util.Random;
import static org.testng.Assert.assertEquals;

public class StartPageTest extends BaseTest {

    Long date = System.currentTimeMillis();
    String value = String.valueOf(date);

    @Test
    public void Login_positive() throws InterruptedException {

        goHome();

        StartPage startPage = new StartPage();
        String Email = startPage.getProperty("email.forwork");
        String Password = startPage.getProperty("password.forwork");
        startPage.Login(Email,Password);
        startPage.finishLogin();


    }

    @Test
    public void Login_negative() throws InterruptedException {

        goHome();

        String Email = "1111111111";
        String Password = "111111111";

        StartPage startPage = new StartPage();
        startPage.Login(Email,Password);

        assertEquals("Please enter a valid email address.", getDriver().findElement(By.cssSelector("p.statusMesg")).getText());
        wait_sec();


    }

    @Test
    public void Login_empty() throws InterruptedException {

        goHome();

        String Email = "";
        String Password = "";

        StartPage startPage = new StartPage();
        startPage.Login(Email,Password);

        assertEquals("Please enter your email address and password.", getDriver().findElement(By.cssSelector("p.statusMesg")).getText());
        wait_sec();


    }


    @Test
    public void Register_positive() throws InterruptedException {

        goHome();

        Random r = new Random();
        char base1 = (char)(r.nextInt(26) + 'a');
        String name1 = String.valueOf(base1);
        char base2 = (char)(r.nextInt(25) + 'a');
        String name2 = String.valueOf(base2);


        String Name = name1+name2+name1+name2;
        String Email = value + "@yopmail.com";
        String Password = "123456";
        String ConfirmPassword = "123456";

        StartPage startPage = new StartPage();
        startPage.Registration(Name, Email, Password, ConfirmPassword);
        startPage.finishReg(Email);
        String originalHandle = getDriver().getWindowHandle();
        for (String handle : getDriver().getWindowHandles()) {
            if (!handle.equals(originalHandle)) {
                getDriver().switchTo().window(handle);
                wait_sec();
//                WebElement title_is_displayed = getDriver().findElement(By.cssSelector("#resizeScroll"));
//                title_is_displayed.isDisplayed();
                wait_sec();
                //contactPage.Username_button();
                startPage.verifyEmail(Email,Password);
                startPage.finishLogin();


                getDriver().close();
            }
        }
        getDriver().switchTo().window(originalHandle);



    }

    @Test
    public void Register_negative() throws InterruptedException {

        goHome();


        String Name = "test";
        String Email = "tester1.thinkmobile@yopmail.com";
        String Password = "12345";
        String ConfirmPassword = "12345";


        StartPage startPage = new StartPage();
        startPage.Registration(Name,Email,Password,ConfirmPassword);

        assertEquals("Password must be 6-20 characters in length.", getDriver().findElement(By.cssSelector("span.statusMesg")).getText());


    }

    @Test
    public void Register_empty() throws InterruptedException {

        goHome();

        String Name = "";
        String Email = "";
        String Password = "";
        String ConfirmPassword = "";

        StartPage startPage = new StartPage();
        startPage.Registration(Name,Email,Password,ConfirmPassword);

        assertEquals("Please enter all required fields.", getDriver().findElement(By.cssSelector("span.statusMesg")).getText());

    }

    @Test
    public void forgot_password_positive() throws InterruptedException {

        goHome();

        String Email = "tester1.thinkmobile@yopmail.com";

        StartPage startPage = new StartPage();
        startPage.forgot_password(Email);

        assertEquals("Please check your email for reset password link.", getDriver().findElement(By.cssSelector("#index-msg > p")).getText());


    }

    @Test
    public void forgot_password_negative() throws InterruptedException {

        goHome();

        String Email = value + "@yopmail.com";

        StartPage startPage = new StartPage();
        startPage.forgot_password(Email);

        assertEquals("The email address you entered is not associated with CloudFuze.", getDriver().findElement(By.cssSelector("#forgot > form > span.statusMesg")).getText());


    }

    @Test
    public void forgot_password_empty() throws InterruptedException {

        goHome();

        String Email = "";

        StartPage startPage = new StartPage();
        startPage.forgot_password(Email);

        assertEquals("Please enter your email.", getDriver().findElement(By.cssSelector("#forgot > form > span.statusMesg")).getText());


    }

    @Test
    public void domain_login() throws InterruptedException {

        goHome();

        String Domain = "";

        StartPage startPage = new StartPage();
        startPage.domain_login_window(Domain);

        assertEquals("Please enter domain name.", getDriver().findElement(By.cssSelector("#entLogin > form > p.statusMesg")).getText());

        startPage.swich_to_custome_login();
    }

}
