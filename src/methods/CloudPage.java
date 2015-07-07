package methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class CloudPage extends BasePage {

    WebDriver driver = getDriver();

    @Override
    protected void Init() {

    }

    public CloudPage() {
        super();

    }



    public void Google_drive(String Email) throws InterruptedException {

        String winHandleBefore = driver.getWindowHandle();

        //google drive button
        WebElement googleDrive_button = driver.findElement(By.cssSelector(".cloudImgG_DRIVE"));
        googleDrive_button.click();
        wait_sec();

        for (String winHandle : driver.getWindowHandles()) {
            driver.switchTo().window(winHandle);
        }
        WebElement email_field = driver.findElement(By.cssSelector("#Email"));
        email_field.isDisplayed();
        email_field.sendKeys(Email);
        wait_sec();

        WebElement next_button = driver.findElement(By.cssSelector("#next"));
        next_button.click();
        wait_sec();

        WebElement password_field = driver.findElement(By.cssSelector("#Passwd"));
        password_field.isDisplayed();
        password_field.sendKeys("vityabuchok1993");
        wait_sec();

        WebElement signIn_button = driver.findElement(By.cssSelector("#signIn"));
        signIn_button.click();
        wait_sec();

        WebElement submit_button = driver.findElement(By.cssSelector("#submit_approve_access"));
        submit_button.click();
        wait_sec();
        wait_sec();
        wait_sec();


        driver.switchTo().window(winHandleBefore);

    }
        ////////////////////////////////////////////
    public void Check_result_googleDrive() throws InterruptedException {
        WebElement manage_clouds_button = driver.findElement(By.cssSelector("#cm-managecloud>a"));
        manage_clouds_button.click();
        wait_sec();
        wait_sec();

        WebElement check_googleDrive_button = driver.findElement(By.cssSelector("#G_DRIVE"));
        check_googleDrive_button.isDisplayed();
        wait_sec();
        wait_sec();

    }

    public void Google_drive_new_user(String new_Email, String new_Password) throws InterruptedException {

        String winHandleBefore = driver.getWindowHandle();

        //google drive button
        WebElement googleDrive_button = driver.findElement(By.cssSelector(".cloudImgG_DRIVE"));
        googleDrive_button.click();
        wait_sec();

        for (String winHandle : driver.getWindowHandles()) {
            driver.switchTo().window(winHandle);
        }
        WebElement email_field = driver.findElement(By.cssSelector("#Email"));
        email_field.isDisplayed();
        email_field.sendKeys(new_Email);
        wait_sec();

        WebElement next_button = driver.findElement(By.cssSelector("#next"));
        next_button.click();
        wait_sec();

        WebElement password_field = driver.findElement(By.cssSelector("#Passwd"));
        password_field.isDisplayed();
        password_field.sendKeys(new_Password);
        wait_sec();

        WebElement signIn_button = driver.findElement(By.cssSelector("#signIn"));
        signIn_button.click();
        wait_sec();

        WebElement submit_button = driver.findElement(By.cssSelector("#submit_approve_access"));
        submit_button.click();
        wait_sec();
        wait_sec();
        wait_sec();


        driver.switchTo().window(winHandleBefore);

    }

    public void One_Drive(String Cloud_email, String Cloud_password) throws InterruptedException {

        String winHandleBefore = driver.getWindowHandle();

        //oneDrive button
        WebElement OneDrive_button = driver.findElement(By.cssSelector(".cloudImgONEDRIVE"));
        OneDrive_button.click();
        wait_sec();

        for(String winHandle : driver.getWindowHandles()){
            driver.switchTo().window(winHandle);
            wait_sec();
        }
        WebElement email_field = driver.findElement(By.xpath("html/body/div[1]/div/div[2]/form/div[1]/div[4]/div/input"));
        email_field.isDisplayed();
        email_field.sendKeys(Cloud_email);
        wait_sec();

        WebElement password_field = driver.findElement(By.xpath("html/body/div[1]/div/div[2]/form/div[1]/div[6]/div/input"));
        password_field.isDisplayed();
        password_field.sendKeys(Cloud_password);
        wait_sec();

//        WebElement checkbox = driver.findElement(By.cssSelector("#idChkBx_PWD_KMSI0Pwd"));
//        checkbox.click();
//        wait_sec();

        WebElement enter_button = driver.findElement(By.cssSelector("#idSIButton9"));
        enter_button.click();
        Thread.sleep(2000);




        try
        {
            WebElement ok_button = driver.findElement(By.cssSelector("#idBtn_Accept"));
            ok_button.click();
            wait_sec();

            driver.switchTo().window(winHandleBefore);

        }
        catch(Exception ok)
        {
            driver.switchTo().window(winHandleBefore);

        }

    }

    public void One_Drive_duplicate(String Cloud_email, String Cloud_password) throws InterruptedException {

        String winHandleBefore = driver.getWindowHandle();

        //oneDrive button
        WebElement OneDrive_button = driver.findElement(By.cssSelector(".cloudImgONEDRIVE"));
        OneDrive_button.click();
        wait_sec();

        for(String winHandle : driver.getWindowHandles()){
            driver.switchTo().window(winHandle);
            wait_sec();
        }
        WebElement email_field = driver.findElement(By.xpath("html/body/div[1]/div/div[2]/form/div[1]/div[4]/div/input"));
        email_field.isDisplayed();
        email_field.sendKeys(Cloud_email);
        wait_sec();

        WebElement password_field = driver.findElement(By.xpath("html/body/div[1]/div/div[2]/form/div[1]/div[6]/div/input"));
        password_field.isDisplayed();
        password_field.sendKeys(Cloud_password);
        wait_sec();

//        WebElement checkbox = driver.findElement(By.cssSelector("#idChkBx_PWD_KMSI0Pwd"));
//        checkbox.click();
//        wait_sec();

        WebElement enter_button = driver.findElement(By.cssSelector("#idSIButton9"));
        enter_button.click();
        Thread.sleep(2000);


            driver.switchTo().window(winHandleBefore);



    }

    public void Check_result_onedrive() throws InterruptedException {

        WebElement manage_clouds_button = driver.findElement(By.cssSelector("#cm-managecloud>a"));
        manage_clouds_button.click();
        wait_sec();
        wait_sec();

        WebElement check_googleDrive_button = driver.findElement(By.cssSelector("#ONEDRIVE"));
        check_googleDrive_button.isDisplayed();
        wait_sec();
        wait_sec();

    }

    public void DropBox(String Cloud_email, String Cloud_password) throws InterruptedException {

        String winHandleBefore = driver.getWindowHandle();

        //dropbox button
        WebElement dropbox_button = driver.findElement(By.cssSelector(".cloudImgDROP_BOX"));
        dropbox_button.click();
        wait_sec();
        wait_sec();


        for(String winHandle : driver.getWindowHandles()){
            driver.switchTo().window(winHandle);
            wait_sec();
            wait_sec();
            wait_sec();

        }
        WebElement email_field = driver.findElement(By.xpath("//div[2]/input"));
        email_field.isDisplayed();
        email_field.sendKeys(Cloud_email);
        wait_sec();


        WebElement password_field = driver.findElement(By.xpath("//div[2]/div[2]/input"));
        password_field.isDisplayed();
        password_field.sendKeys(Cloud_password);
        wait_sec();

        WebElement enter_button = driver.findElement(By.cssSelector(".login-button.button-primary"));
        enter_button.click();
        wait_sec();
        wait_sec();

        WebElement allow_button = driver.findElement(By.cssSelector(".auth-button.button-primary"));
        allow_button.click();
        wait_sec();

        driver.switchTo().window(winHandleBefore);

    }

    public void Check_result_dropbox() throws InterruptedException {

        WebElement manage_clouds_button = driver.findElement(By.cssSelector("#cm-managecloud>a"));
        manage_clouds_button.click();
        wait_sec();
        wait_sec();

        WebElement check_googleDrive_button = driver.findElement(By.cssSelector("#DROP_BOX"));
        check_googleDrive_button.isDisplayed();
        wait_sec();
        wait_sec();

    }

    public void Yandex(String Cloud_name, String Cloud_password) throws InterruptedException {


        //Yandex button
        WebElement yandex_button = driver.findElement(By.cssSelector(".cloudImgYANDEX_DISK"));
        yandex_button.click();
        wait_sec();
        wait_sec();
        wait_sec();


        WebElement email_field = driver.findElement(By.cssSelector("#Yandex_uname"));
        email_field.isDisplayed();
        email_field.sendKeys(Cloud_name);
        wait_sec();

        WebElement password_field = driver.findElement(By.cssSelector("#Yandex_pwd"));
        password_field.isDisplayed();
        password_field.sendKeys(Cloud_password);
        wait_sec();

        WebElement enter_button = driver.findElement(By.cssSelector("#addYandexCloud"));
        enter_button.click();
        wait_sec();
        wait_sec();

    }

    public void Check_result_yandex() throws InterruptedException {

        WebElement manage_clouds_button = driver.findElement(By.cssSelector("#cm-managecloud>a"));
        manage_clouds_button.click();
        wait_sec();
        wait_sec();

        WebElement check_yandex_button = driver.findElement(By.cssSelector("#YANDEX_DISK"));
        check_yandex_button.isDisplayed();
        wait_sec();
        wait_sec();

    }


    public void Box(String Cloud_email, String Cloud_password) throws InterruptedException {


        String winHandleBefore = driver.getWindowHandle();

        //box button
        WebElement box_button = driver.findElement(By.cssSelector(".cloudImgBOX"));
        box_button.click();
        wait_sec();
        wait_sec();
        wait_sec();

        for(String winHandle : driver.getWindowHandles()){
            driver.switchTo().window(winHandle);
            wait_sec();

        }
        WebElement email_field = driver.findElement(By.cssSelector("#login"));
        email_field.isDisplayed();
        email_field.sendKeys(Cloud_email);
        wait_sec();

        WebElement password_field = driver.findElement(By.cssSelector("#password"));
        password_field.isDisplayed();
        password_field.sendKeys(Cloud_password);
        wait_sec();

        WebElement enter_button = driver.findElement(By.cssSelector(".btn.btn-primary.mhn.login_submit.fw.pvm.ram"));
        enter_button.click();
        wait_sec();
        wait_sec();

        WebElement access_button = driver.findElement(By.cssSelector("#consent_accept_button"));
        access_button.click();
        wait_sec();

        driver.switchTo().window(winHandleBefore);
        ////////////////////////////////////////////
        WebElement manage_clouds_button = driver.findElement(By.cssSelector("#cm-managecloud>a"));
        manage_clouds_button.click();
        wait_sec();
        wait_sec();

        WebElement check_Box_button = driver.findElement(By.cssSelector("#BOX"));
        check_Box_button.isDisplayed();
        wait_sec();
        wait_sec();
    }


    public void CitrixShareFile(String Cloud_email, String Cloud_password) throws InterruptedException {

        String winHandleBefore = driver.getWindowHandle();

        //citrix button
        WebElement citrix_button = driver.findElement(By.cssSelector(".cloudImgSHAREFILE"));
        citrix_button.click();
        wait_sec();
        wait_sec();
        wait_sec();

        for(String winHandle : driver.getWindowHandles()){
            driver.switchTo().window(winHandle);
            wait_sec();

        }
        WebElement email_field = driver.findElement(By.cssSelector("#credentials-email"));
        email_field.isDisplayed();
        email_field.sendKeys(Cloud_email);
        wait_sec();

        WebElement password_field = driver.findElement(By.cssSelector("#credentials-password"));
        password_field.isDisplayed();
        password_field.sendKeys(Cloud_password);
        wait_sec();

        WebElement enter_button = driver.findElement(By.cssSelector(".navlink.fwdlink"));
        enter_button.click();
        wait_sec();
        wait_sec();
        wait_sec();
        wait_sec();
        wait_sec();
        wait_sec();

        WebElement sharefile_emailid_field = driver.findElement(By.cssSelector("#shareFileEmailId"));
        sharefile_emailid_field.clear();
        sharefile_emailid_field.sendKeys(Cloud_email);
        wait_sec();

        WebElement sharefile_emailid_button = driver.findElement(By.cssSelector("#ShareFileDialog>div>button"));
        sharefile_emailid_button.click();
        wait_sec();
        wait_sec();


        driver.switchTo().window(winHandleBefore);
        ////////////////////////////////////////////
        WebElement manage_clouds_button = driver.findElement(By.cssSelector("#cm-managecloud>a"));
        manage_clouds_button.click();
        wait_sec();
        wait_sec();

        WebElement check_citrix_button = driver.findElement(By.cssSelector("#SHAREFILE"));
        check_citrix_button.isDisplayed();
        wait_sec();
        wait_sec();
    }

    public void Amazon_S3(String EmailId, String AccessId, String Name, String SecretAccessId) throws InterruptedException {


        //amazonbutton
        WebElement amazone_button = driver.findElement(By.cssSelector(".cloudImgAMAZON"));
        amazone_button.click();
        wait_sec();
        wait_sec();


        WebElement emailId_field = driver.findElement(By.cssSelector("#amazonEmailId"));
        emailId_field.isDisplayed();
        emailId_field.clear();
        emailId_field.sendKeys(EmailId);
        wait_sec();

        WebElement accessId_field = driver.findElement(By.cssSelector("#amazonaccessToken"));
        accessId_field.isDisplayed();
        accessId_field.clear();
        accessId_field.sendKeys(AccessId);
        wait_sec();

        WebElement name_field = driver.findElement(By.cssSelector("#amazonDisplayName"));
        name_field.isDisplayed();
        name_field.clear();
        name_field.sendKeys(Name);
        wait_sec();

        WebElement secret_accessId_field = driver.findElement(By.cssSelector("#amazonRefreshToken"));
        secret_accessId_field.isDisplayed();
        secret_accessId_field.clear();
        secret_accessId_field.sendKeys(SecretAccessId);
        wait_sec();

        WebElement add_button = driver.findElement(By.cssSelector("#addAmazonCloud"));
        add_button.click();
        wait_sec();
        wait_sec();
        wait_sec();

    }

    public void Check_result_amazon() throws InterruptedException {

        WebElement manage_clouds_button = driver.findElement(By.cssSelector("#cm-managecloud>a"));
        manage_clouds_button.click();
        wait_sec();
        wait_sec();

        WebElement check_amazon_button = driver.findElement(By.cssSelector("#AMAZON"));
        check_amazon_button.isDisplayed();
        wait_sec();
        wait_sec();

    }

    public void Egnyte(String Domain, String Username, String Cloud_Password) throws InterruptedException {

        String winHandleBefore = driver.getWindowHandle();

        //egnyte button
        WebElement egnyte_button = driver.findElement(By.cssSelector(".cloudImgEGNYTE_STORAGE"));
        egnyte_button.click();
        wait_sec();
        wait_sec();
        wait_sec();

        for(String winHandle : driver.getWindowHandles()){
            driver.switchTo().window(winHandle);
            wait_sec();

        }
        WebElement domain_field = driver.findElement(By.cssSelector("#egnyteDomain"));
        domain_field.isDisplayed();
        domain_field.sendKeys(Domain);
        wait_sec();

        WebElement ok_button = driver.findElement(By.cssSelector("#getEgnyteDetails"));
        ok_button.click();
        wait_sec();
        wait_sec();
        wait_sec();

        WebElement username_field = driver.findElement(By.cssSelector("#j_username"));
        username_field.isDisplayed();
        username_field.sendKeys(Username);
        wait_sec();

        WebElement password_field = driver.findElement(By.cssSelector("#j_password"));
        password_field.isDisplayed();
        password_field.sendKeys(Cloud_Password);
        wait_sec();

        WebElement allow_button = driver.findElement(By.cssSelector("#btnSubmit"));
        allow_button.click();
        wait_sec();
        wait_sec();
        wait_sec();

        driver.switchTo().window(winHandleBefore);
        ////////////////////////////////////////////
        WebElement manage_clouds_button = driver.findElement(By.cssSelector("#cm-managecloud>a"));
        manage_clouds_button.click();
        wait_sec();
        wait_sec();

        WebElement check_egnyte_button = driver.findElement(By.cssSelector("#EGNYTE_STORAGE"));
        check_egnyte_button.isDisplayed();
        wait_sec();
        wait_sec();
    }


    public void Delete_cloud() throws InterruptedException {


        WebElement manage_clouds_button = driver.findElement(By.cssSelector("#cm-managecloud>a"));
        manage_clouds_button.click();
        wait_sec();
        wait_sec();

        WebElement delete_button = driver.findElement(By.cssSelector("#CFDeleteCloud"));
        delete_button.click();
        wait_sec();
        wait_sec();
        wait_sec();

        WebElement delete_window = driver.findElement(By.cssSelector("#CFCLdeleteModal"));
        delete_window.isDisplayed();
        wait_sec();

        WebElement yes_button = driver.findElement(By.cssSelector("#CFCLDelete"));
        yes_button.click();
        wait_sec();
        wait_sec();




    }
}
