package methods;

import com.gargoylesoftware.htmlunit.WebWindow;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.internal.Streams;
import org.openqa.selenium.interactions.Actions;

import javax.lang.model.element.Element;
import java.util.ArrayList;


public class StartPage extends BasePage {

    WebDriver driver = getDriver();

    @Override
    protected void Init() {

    }

    public StartPage() {
        super();

    }


    public void Login(String Email, String Password) throws InterruptedException {

        driver.manage().window().maximize();

        //email field
        WebElement email_field = driver.findElement(By.xpath("html/body/div[1]/div/div[2]/div/div/div[2]/div[1]/form/div/input[1]"));
        email_field.sendKeys(Email);
        wait_sec();

        //password field
        WebElement password_field = driver.findElement(By.xpath("html/body/div[1]/div/div[2]/div/div/div[2]/div[1]/form/div/input[2]"));
        password_field.sendKeys(Password);
        wait_sec();

        //login button
        WebElement login_button = driver.findElement(By.cssSelector("#login-submit"));
        login_button.click();
        wait_sec();


    }

    public void Login_new(String Email_share, String Password) throws InterruptedException {

        driver.manage().window().maximize();

        //email field
        WebElement email_field = driver.findElement(By.xpath("html/body/div[1]/div/div[2]/div/div/div[2]/div[1]/form/div/input[1]"));
        email_field.sendKeys(Email_share);
        wait_sec();

        //password field
        WebElement password_field = driver.findElement(By.xpath("html/body/div[1]/div/div[2]/div/div/div[2]/div[1]/form/div/input[2]"));
        password_field.sendKeys(Password);
        wait_sec();

        //login button
        WebElement login_button = driver.findElement(By.cssSelector("#login-submit"));
        login_button.click();
        wait_sec();


    }

    public void finishLogin() throws InterruptedException {
        // content is displayed
        WebElement content_is_displayed = driver.findElement(By.cssSelector(".container-fluid"));
        content_is_displayed.isDisplayed();
        wait_sec();


    }


    public void Registration(String Name, String Email, String Password, String ConfirmPassword) throws InterruptedException {
        driver.manage().window().maximize();

        // signup button
        WebElement signup_button = driver.findElement(By.cssSelector("#register-link"));
        signup_button.click();
        wait_sec();

        // name field
        WebElement name_field = driver.findElement(By.xpath("html/body/div[1]/div/div[2]/div/div/div[2]/div[2]/form/div[1]/input[1]"));
        name_field.sendKeys(Name);
        wait_sec();

        // email field
        WebElement email_field = driver.findElement(By.xpath("html/body/div[1]/div/div[2]/div/div/div[2]/div[2]/form/div[1]/input[2]"));
        email_field.isDisplayed();
        email_field.sendKeys(Email);
        wait_sec();

        // password field
        WebElement password_field = driver.findElement(By.xpath("html/body/div[1]/div/div[2]/div/div/div[2]/div[2]/form/div[1]/input[3]"));
        password_field.sendKeys(Password);
        wait_sec();

        // confirm_password field
        WebElement confirm_password_field = driver.findElement(By.xpath("html/body/div[1]/div/div[2]/div/div/div[2]/div[2]/form/div[1]/input[4]"));
        confirm_password_field.sendKeys(ConfirmPassword);
        wait_sec();

        // I agree combobox
        WebElement Iagree_combobox = driver.findElement(By.cssSelector("#terms_conditons"));
        Iagree_combobox.click();
        wait_sec();

        // register_button
        WebElement register_button = driver.findElement(By.cssSelector("#register-submit"));
        register_button.click();
        wait_sec();


    }

    public void finishReg(String Email) throws InterruptedException {

        WebElement message_displayed = driver.findElement(By.xpath("html/body/div[1]/div/div[2]/div/div/div[2]/div[5]/form/div"));
        message_displayed.isDisplayed();
        wait_sec();

        //go to email
        driver.get("http://www.yopmail.com/");
        wait_sec();
        wait_sec();

        WebElement login_field = driver.findElement(By.cssSelector("#login"));
        login_field.sendKeys(Email);
        System.out.println(Email);
        wait_sec();

        WebElement submit_button = driver.findElement(By.cssSelector(".sbut"));
        submit_button.click();
        wait_sec();
        wait_sec();
        wait_sec();

        driver.switchTo().frame("ifmail");//(driver.findElement(By.cssSelector(".couponBlock>tbody>tr>td>table>tbody>tr>td>a")));
        WebElement activate_button = driver.findElement(By.cssSelector(".couponBlock>tbody>tr>td>table>tbody>tr>td>a"));
        activate_button.click();
        wait_sec();
        wait_sec();

    }

    public void verifyEmail(String Email, String Password) throws InterruptedException {


        WebElement email_field = driver.findElement(By.xpath("html/body/div[1]/div[3]/div/form/div/input[1]"));
        email_field.isDisplayed();
        email_field.sendKeys(Email);
        wait_sec();

        WebElement pass_field = driver.findElement(By.xpath("html/body/div[1]/div[3]/div/form/div/input[2]"));
        pass_field.isDisplayed();
        pass_field.sendKeys(Password);
        wait_sec();

        WebElement login_button = driver.findElement(By.cssSelector("#login-submit"));
        login_button.click();
        wait_sec();


    }

    public void forgot_password(String Email) throws InterruptedException {

        driver.manage().window().maximize();

        WebElement forgot_pass_button = driver.findElement(By.cssSelector("#forgot-link"));
        forgot_pass_button.click();
        wait_sec();

        WebElement email_field = driver.findElement(By.xpath("html/body/div[1]/div/div[2]/div/div/div[2]/div[3]/form/div/input"));
        email_field.sendKeys(Email);
        wait_sec();

        WebElement submit_button = driver.findElement(By.cssSelector("#forgot-submit"));
        submit_button.click();
        wait_sec();

//        WebElement message_displayed = driver.findElement(By.cssSelector("#index-msg"));
//        message_displayed.isDisplayed();
//        wait_sec();


    }

    public void domain_login_window(String Domain) throws InterruptedException {

        driver.manage().window().maximize();

        WebElement swich_to_interprise_login = driver.findElement(By.cssSelector("#entLoginButton"));
        swich_to_interprise_login.click();
        wait_sec();
        wait_sec();

        WebElement domain_field = driver.findElement(By.cssSelector("#domain"));
        domain_field.isDisplayed();
        domain_field.sendKeys(Domain);
        wait_sec();

        WebElement continue_button = driver.findElement(By.cssSelector("#ent-submit"));
        continue_button.click();
        wait_sec();
        wait_sec();

    }

    public void swich_to_custome_login() throws InterruptedException {

        driver.manage().window().maximize();

        WebElement swich_to_customer_login = driver.findElement(By.cssSelector("#consuLoginButton"));
        swich_to_customer_login.click();
        wait_sec();
        wait_sec();
        wait_sec();

        WebElement swich_to_interprise_login = driver.findElement(By.cssSelector("#entLoginButton"));
        swich_to_interprise_login.isDisplayed();
        wait_sec();

    }


    public void Logout() throws InterruptedException {


        //login button
        WebElement logout_button = driver.findElement(By.cssSelector("#cf-logout"));
        logout_button.click();
        wait_sec();
        wait_sec();
        wait_sec();

    }
}