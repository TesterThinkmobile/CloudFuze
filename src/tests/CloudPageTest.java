package tests;


import methods.CloudPage;
import methods.HomePage;
import methods.StartPage;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class CloudPageTest extends BaseTest {




    @Test
    public void A_GoogleDrive() throws InterruptedException {

        goHome();


        StartPage startPage = new StartPage();
        String Email = startPage.getProperty("email.forwork");
        String Password = startPage.getProperty("password.forwork");
        startPage.Login(Email, Password);
        startPage.finishLogin();
        HomePage homePage = new HomePage();
        CloudPage cloudPage = homePage.CloudPage();
        cloudPage.Google_drive(Email);
        cloudPage.Check_result_googleDrive();

    }
    @Test
    public void B_GoogleDrive_duplicate() throws InterruptedException {

        goHome();

        StartPage startPage = new StartPage();
        String Email = startPage.getProperty("email.forwork");
        String Password = startPage.getProperty("password.forwork");
        startPage.Login(Email, Password);
        startPage.finishLogin();
        HomePage homePage = new HomePage();
        CloudPage cloudPage = homePage.CloudPage();
        cloudPage.Google_drive(Email);
        //cloudPage.Check_result_googleDrive();

        assertEquals("This e-mail address is already registered. Please enter a different e-mail address.", getDriver().findElement(By.cssSelector("div.toast-message")).getText());

    }

    @Test
    public void B_GoogleDrive_new_user() throws InterruptedException {

        goHome();



        StartPage startPage = new StartPage();
        String Email = startPage.getProperty("email.forwork");
        String Password = startPage.getProperty("password.forwork");
        startPage.Login(Email, Password);
        startPage.finishLogin();
        HomePage homePage = new HomePage();
        CloudPage cloudPage = homePage.CloudPage();
        String new_Email = cloudPage.getProperty("google.drive.email");
        String new_Password = cloudPage.getProperty("google.drive.passwod");
        cloudPage.Google_drive_new_user(new_Email, new_Password);
        cloudPage.Check_result_googleDrive();

    }


    @Test
    public void C_OneDrive() throws InterruptedException {

        goHome();

        StartPage startPage = new StartPage();
        String Email = startPage.getProperty("email.forwork");
        String Password = startPage.getProperty("password.forwork");
        startPage.Login(Email, Password);
        startPage.finishLogin();
        HomePage homePage = new HomePage();
        CloudPage cloudPage = homePage.CloudPage();
        String Cloud_email = cloudPage.getProperty("onedrive.email");
        String Cloud_password = cloudPage.getProperty("onedrive.password");
        cloudPage.One_Drive(Cloud_email, Cloud_password);
        cloudPage.Check_result_onedrive();

    }

    @Test
    public void C_OneDrive_duplicate() throws InterruptedException {

        goHome();

        StartPage startPage = new StartPage();
        String Email = startPage.getProperty("email.forwork");
        String Password = startPage.getProperty("password.forwork");
        startPage.Login(Email, Password);
        startPage.finishLogin();
        HomePage homePage = new HomePage();
        CloudPage cloudPage = homePage.CloudPage();
        String Cloud_email = cloudPage.getProperty("onedrive.email");
        String Cloud_password = cloudPage.getProperty("onedrive.password");
        cloudPage.One_Drive_duplicate(Cloud_email, Cloud_password);
        //cloudPage.Check_result_onedrive();

        assertEquals("This e-mail address is already registered. Please enter a different e-mail address.", getDriver().findElement(By.cssSelector("div.toast-message")).getText());


    }

    @Test
    public void D_DropBox() throws InterruptedException {

        goHome();

        StartPage startPage = new StartPage();
        String Email = startPage.getProperty("email.forwork");
        String Password = startPage.getProperty("password.forwork");
        startPage.Login(Email, Password);
        startPage.finishLogin();
        HomePage homePage = new HomePage();
        CloudPage cloudPage = homePage.CloudPage();
        String Cloud_email = cloudPage.getProperty("dropbox.email");
        String Cloud_password = cloudPage.getProperty("dropbox.password");
        cloudPage.DropBox(Cloud_email, Cloud_password);
        cloudPage.Check_result_dropbox();


    }

    @Test
    public void D_DropBox_duplicate() throws InterruptedException {

        goHome();

        StartPage startPage = new StartPage();
        String Email = startPage.getProperty("email.forwork");
        String Password = startPage.getProperty("password.forwork");
        startPage.Login(Email, Password);
        startPage.finishLogin();
        HomePage homePage = new HomePage();
        CloudPage cloudPage = homePage.CloudPage();
        String Cloud_email = cloudPage.getProperty("dropbox.email");
        String Cloud_password = cloudPage.getProperty("dropbox.password");
        cloudPage.DropBox(Cloud_email, Cloud_password);

        assertEquals("This e-mail address is already registered. Please enter a different e-mail address.", getDriver().findElement(By.cssSelector("div.toast-message")).getText());


    }

    @Test
    public void E_Yandex_positive() throws InterruptedException {

        goHome();

        StartPage startPage = new StartPage();
        String Email = startPage.getProperty("email.forwork");
        String Password = startPage.getProperty("password.forwork");
        startPage.Login(Email, Password);
        startPage.finishLogin();
        HomePage homePage = new HomePage();
        CloudPage cloudPage = homePage.CloudPage();
        String Cloud_name = cloudPage.getProperty("yandex.name");
        String Cloud_password = cloudPage.getProperty("yandex.password");
        cloudPage.Yandex(Cloud_name, Cloud_password);
        cloudPage.Check_result_yandex();

    }

    @Test
    public void F_Yandex_negative() throws InterruptedException {

        goHome();


        StartPage startPage = new StartPage();
        String Email = startPage.getProperty("email.forwork");
        String Password = startPage.getProperty("password.forwork");
        startPage.Login(Email, Password);
        startPage.finishLogin();
        HomePage homePage = new HomePage();
        CloudPage cloudPage = homePage.CloudPage();
        String Cloud_name = cloudPage.getProperty("yandex.name.negative");
        String Cloud_password = cloudPage.getProperty("yandex.password.negative");
        cloudPage.Yandex(Cloud_name, Cloud_password);
        //cloudPage.Check_result_yandex();
        Thread.sleep(1000);

        assertEquals("Failed in registering Yandex Please try again", getDriver().findElement(By.cssSelector("div.toast-message")).getText());


    }

    @Test
    public void F_Yandex_duplicate() throws InterruptedException {

        goHome();


        StartPage startPage = new StartPage();
        String Email = startPage.getProperty("email.forwork");
        String Password = startPage.getProperty("password.forwork");
        startPage.Login(Email, Password);
        startPage.finishLogin();
        HomePage homePage = new HomePage();
        CloudPage cloudPage = homePage.CloudPage();
        String Cloud_name = cloudPage.getProperty("yandex.name");
        String Cloud_password = cloudPage.getProperty("yandex.password");
        cloudPage.Yandex(Cloud_name, Cloud_password);
        //cloudPage.Check_result_yandex();
        Thread.sleep(2000);

        assertEquals("Yandex Already registered with us.", getDriver().findElement(By.cssSelector("div.toast.toast-error")).getText());


    }

    @Test
    public void G_Yandex_empty() throws InterruptedException {

        goHome();

        String Cloud_name = "";
        String Cloud_password = "";

        StartPage startPage = new StartPage();
        String Email = startPage.getProperty("email.forwork");
        String Password = startPage.getProperty("password.forwork");
        startPage.Login(Email, Password);
        startPage.finishLogin();
        HomePage homePage = new HomePage();
        CloudPage cloudPage = homePage.CloudPage();
        cloudPage.Yandex(Cloud_name, Cloud_password);
        //cloudPage.Check_result_yandex();
        Thread.sleep(1000);

        assertEquals("Please fill the required data to complete your oauth process", getDriver().findElement(By.id("errorMsg")).getText());


    }

    @Test
    public void H_Box() throws InterruptedException {

        goHome();



        StartPage startPage = new StartPage();
        String Email = startPage.getProperty("email.forwork");
        String Password = startPage.getProperty("password.forwork");
        startPage.Login(Email, Password);
        startPage.finishLogin();
        HomePage homePage = new HomePage();
        CloudPage cloudPage = homePage.CloudPage();
        String Cloud_email = cloudPage.getProperty("box.email");
        String Cloud_password = cloudPage.getProperty("box.password");
        cloudPage.Box(Cloud_email, Cloud_password);
        cloudPage.Check_result_box();

    }

    @Test
    public void H_Box_duplicate() throws InterruptedException {

        goHome();



        StartPage startPage = new StartPage();
        String Email = startPage.getProperty("email.forwork");
        String Password = startPage.getProperty("password.forwork");
        startPage.Login(Email, Password);
        startPage.finishLogin();
        HomePage homePage = new HomePage();
        CloudPage cloudPage = homePage.CloudPage();
        String Cloud_email = cloudPage.getProperty("box.email");
        String Cloud_password = cloudPage.getProperty("box.password");
        cloudPage.Box(Cloud_email, Cloud_password);

        assertEquals("This e-mail address is already registered. Please enter a different e-mail address.", getDriver().findElement(By.cssSelector("div.toast-message")).getText());


    }

    @Test
    public void I_CitrixShareFile() throws InterruptedException {

        goHome();


        StartPage startPage = new StartPage();
        String Email = startPage.getProperty("email.forwork");
        String Password = startPage.getProperty("password.forwork");
        startPage.Login(Email, Password);
        startPage.finishLogin();
        HomePage homePage = new HomePage();
        CloudPage cloudPage = homePage.CloudPage();
        String Cloud_email = cloudPage.getProperty("citrix.email");
        String Cloud_password = cloudPage.getProperty("citrix.password");
        cloudPage.CitrixShareFile(Cloud_email, Cloud_password);
        cloudPage.Check_result_citrix();

    }

    @Test
    public void I_CitrixShareFile_duplicate() throws InterruptedException {

        goHome();


        StartPage startPage = new StartPage();
        String Email = startPage.getProperty("email.forwork");
        String Password = startPage.getProperty("password.forwork");
        startPage.Login(Email, Password);
        startPage.finishLogin();
        HomePage homePage = new HomePage();
        CloudPage cloudPage = homePage.CloudPage();
        String Cloud_email = cloudPage.getProperty("citrix.email");
        String Cloud_password = cloudPage.getProperty("citrix.password");
        cloudPage.CitrixShareFile(Cloud_email, Cloud_password);

        assertEquals("This e-mail address is already registered. Please enter a different e-mail address.", getDriver().findElement(By.cssSelector("div.toast-message")).getText());


    }

    @Test
    public void J_Amazon_S3_positeve() throws InterruptedException {

        goHome();


        StartPage startPage = new StartPage();
        String Email = startPage.getProperty("email.forwork");
        String Password = startPage.getProperty("password.forwork");
        startPage.Login(Email, Password);
        startPage.finishLogin();
        HomePage homePage = new HomePage();
        CloudPage cloudPage = homePage.CloudPage();
        String EmailId = cloudPage.getProperty("amazon.EmailId");
        String AccessId = cloudPage.getProperty("amazon.AccessId");
        String Name = cloudPage.getProperty("amazon.Name");
        String SecretAccessId = cloudPage.getProperty("amazon.SecretAccessId");
        cloudPage.Amazon_S3(EmailId, AccessId, Name, SecretAccessId);
        cloudPage.Check_result_amazon();

    }

    @Test
    public void K_Amazon_S3_negative() throws InterruptedException {

        goHome();



        StartPage startPage = new StartPage();
        String Email = startPage.getProperty("email.forwork");
        String Password = startPage.getProperty("password.forwork");
        startPage.Login(Email, Password);
        startPage.finishLogin();
        HomePage homePage = new HomePage();
        CloudPage cloudPage = homePage.CloudPage();
        String EmailId = cloudPage.getProperty("amazon.EmailId.negative");
        String AccessId = cloudPage.getProperty("amazon.AccessId.negative");
        String Name = cloudPage.getProperty("amazon.Name.negative");
        String SecretAccessId = cloudPage.getProperty("amazon.SecretAccessId.negative");
        cloudPage.Amazon_S3(EmailId, AccessId, Name, SecretAccessId);

        assertEquals("Failed in registering Amazon S3 Please try again", getDriver().findElement(By.cssSelector("div.toast-message")).getText());


    }

    @Test
    public void K_Amazon_S3_duplicate() throws InterruptedException {

        goHome();



        StartPage startPage = new StartPage();
        String Email = startPage.getProperty("email.forwork");
        String Password = startPage.getProperty("password.forwork");
        startPage.Login(Email, Password);
        startPage.finishLogin();
        HomePage homePage = new HomePage();
        CloudPage cloudPage = homePage.CloudPage();
        String EmailId = cloudPage.getProperty("amazon.EmailId");
        String AccessId = cloudPage.getProperty("amazon.AccessId");
        String Name = cloudPage.getProperty("amazon.Name");
        String SecretAccessId = cloudPage.getProperty("amazon.SecretAccessId");
        cloudPage.Amazon_S3(EmailId, AccessId, Name, SecretAccessId);
        Thread.sleep(800);

        assertEquals("Amazon S3 Already registered with us.", getDriver().findElement(By.cssSelector("div.toast.toast-error")).getText());


    }

    @Test
    public void L_Amazon_S3_empty() throws InterruptedException {

        goHome();

        String EmailId = "" ;
        String AccessId = "";
        String Name = "";
        String SecretAccessId = "";


        StartPage startPage = new StartPage();
        String Email = startPage.getProperty("email.forwork");
        String Password = startPage.getProperty("password.forwork");
        startPage.Login(Email, Password);
        startPage.finishLogin();
        HomePage homePage = new HomePage();
        CloudPage cloudPage = homePage.CloudPage();
        cloudPage.Amazon_S3(EmailId, AccessId, Name, SecretAccessId);

        assertEquals("Please fill the required data to complete your oauth process", getDriver().findElement(By.id("errorMsg")).getText());


    }

    @Test
    public void M_Agnyte() throws InterruptedException {

        goHome();


        StartPage startPage = new StartPage();
        String Email = startPage.getProperty("email.forwork");
        String Password = startPage.getProperty("password.forwork");
        startPage.Login(Email, Password);
        startPage.finishLogin();
        HomePage homePage = new HomePage();
        CloudPage cloudPage = homePage.CloudPage();
        String Domain = cloudPage.getProperty("agnyte.Domain");
        String Username = cloudPage.getProperty("agnyte.Username");
        String Cloud_Password = cloudPage.getProperty("agnyte.Cloud_Password");
        cloudPage.Egnyte(Domain, Username, Cloud_Password);
        cloudPage.Check_result_egnyte();

    }

    @Test
    public void M_Agnyte_duplicate() throws InterruptedException {

        goHome();


        StartPage startPage = new StartPage();
        String Email = startPage.getProperty("email.forwork");
        String Password = startPage.getProperty("password.forwork");
        startPage.Login(Email, Password);
        startPage.finishLogin();
        HomePage homePage = new HomePage();
        CloudPage cloudPage = homePage.CloudPage();
        String Domain = cloudPage.getProperty("agnyte.Domain");
        String Username = cloudPage.getProperty("agnyte.Username");
        String Cloud_Password = cloudPage.getProperty("agnyte.Cloud_Password");
        cloudPage.Egnyte(Domain, Username, Cloud_Password);

        assertEquals("This e-mail address is already registered. Please enter a different e-mail address.", getDriver().findElement(By.cssSelector("div.toast-message")).getText());


    }

//    @Test
//    public void N_Delete_cloud() throws InterruptedException {
//
//        goHome();
//
//
//        String Cloud_name = "cloudfuze";
//        String Cloud_password = "cloudfuze123";
//
//        StartPage startPage = new StartPage();
//        String Email = startPage.getProperty("email.forwork");
//        String Password = startPage.getProperty("password.forwork");
//        startPage.Login(Email, Password);
//        startPage.finishLogin();
//        HomePage homePage = new HomePage();
//        CloudPage cloudPage = homePage.CloudPage();
//        cloudPage.Delete_cloud();
//        homePage.CloudPage();
//        cloudPage.Yandex(Cloud_name, Cloud_password);
//
//    }


}
