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

        String new_Email = "tester1.thinkmobiles@gmail.com";
        String new_Password = "testertester1993";

        StartPage startPage = new StartPage();
        String Email = startPage.getProperty("email.forwork");
        String Password = startPage.getProperty("password.forwork");
        startPage.Login(Email, Password);
        startPage.finishLogin();
        HomePage homePage = new HomePage();
        CloudPage cloudPage = homePage.CloudPage();
        cloudPage.Google_drive_new_user(new_Email, new_Password );
        cloudPage.Check_result_googleDrive();

    }


    @Test
    public void C_OneDrive() throws InterruptedException {

        goHome();

        String Cloud_email = "quality.cloudfuze@gmail.com";
        String Cloud_password = "account10";

        StartPage startPage = new StartPage();
        String Email = startPage.getProperty("email.forwork");
        String Password = startPage.getProperty("password.forwork");
        startPage.Login(Email, Password);
        startPage.finishLogin();
        HomePage homePage = new HomePage();
        CloudPage cloudPage = homePage.CloudPage();
        cloudPage.One_Drive(Cloud_email, Cloud_password);


    }

    @Test
    public void D_DropBox() throws InterruptedException {

        goHome();

        String Cloud_email = "quality.cloudfuze@gmail.com";
        String Cloud_password = "account10";

        StartPage startPage = new StartPage();
        String Email = startPage.getProperty("email.forwork");
        String Password = startPage.getProperty("password.forwork");
        startPage.Login(Email, Password);
        startPage.finishLogin();
        HomePage homePage = new HomePage();
        CloudPage cloudPage = homePage.CloudPage();
        cloudPage.DropBox(Cloud_email, Cloud_password);


    }

    @Test
    public void E_Yandex_positeve() throws InterruptedException {

        goHome();

        String Cloud_name = "cloudfuze";
        String Cloud_password = "cloudfuze123";

        StartPage startPage = new StartPage();
        String Email = startPage.getProperty("email.forwork");
        String Password = startPage.getProperty("password.forwork");
        startPage.Login(Email, Password);
        startPage.finishLogin();
        HomePage homePage = new HomePage();
        CloudPage cloudPage = homePage.CloudPage();
        cloudPage.Yandex(Cloud_name, Cloud_password);
        cloudPage.Check_result_yandex();

    }

    @Test
    public void F_Yandex_negative() throws InterruptedException {

        goHome();

        String Cloud_name = "tralalalalalalla";
        String Cloud_password = "tralalallalalalla";

        StartPage startPage = new StartPage();
        String Email = startPage.getProperty("email.forwork");
        String Password = startPage.getProperty("password.forwork");
        startPage.Login(Email, Password);
        startPage.finishLogin();
        HomePage homePage = new HomePage();
        CloudPage cloudPage = homePage.CloudPage();
        cloudPage.Yandex(Cloud_name, Cloud_password);
        //cloudPage.Check_result_yandex();

        assertEquals("Failed in registering Yandex Please try again", getDriver().findElement(By.cssSelector("div.toast-message")).getText());


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

        assertEquals("Please fill the required data to complete your oauth process", getDriver().findElement(By.id("errorMsg")).getText());


    }

    @Test
    public void H_Box() throws InterruptedException {

        goHome();


        String Cloud_email = "quality.cloudfuze@gmail.com";
        String Cloud_password = "account10";

        StartPage startPage = new StartPage();
        String Email = startPage.getProperty("email.forwork");
        String Password = startPage.getProperty("password.forwork");
        startPage.Login(Email, Password);
        startPage.finishLogin();
        HomePage homePage = new HomePage();
        CloudPage cloudPage = homePage.CloudPage();
        cloudPage.Box(Cloud_email, Cloud_password);

    }

    @Test
    public void I_CitrixShareFile() throws InterruptedException {

        goHome();


        String Cloud_email = "quality.cloudfuze@gmail.com";
        String Cloud_password = "account10";

        StartPage startPage = new StartPage();
        String Email = startPage.getProperty("email.forwork");
        String Password = startPage.getProperty("password.forwork");
        startPage.Login(Email, Password);
        startPage.finishLogin();
        HomePage homePage = new HomePage();
        CloudPage cloudPage = homePage.CloudPage();
        cloudPage.CitrixShareFile(Cloud_email, Cloud_password);

    }

    @Test
    public void J_Amazon_S3_positeve() throws InterruptedException {

        goHome();

        String EmailId = "Demo1.CloudFuze@gmail.com" ;
        String AccessId = "AKIAJNM7ZPMTIZXBUWXQ";
        String Name = "cloudfuze";
        String SecretAccessId = "tphP2SrYPpXr0NTajBFDHxCCuNndVEc5TKxtHLR0";


        StartPage startPage = new StartPage();
        String Email = startPage.getProperty("email.forwork");
        String Password = startPage.getProperty("password.forwork");
        startPage.Login(Email, Password);
        startPage.finishLogin();
        HomePage homePage = new HomePage();
        CloudPage cloudPage = homePage.CloudPage();
        cloudPage.Amazon_S3(EmailId, AccessId, Name, SecretAccessId);
        cloudPage.Check_result_amazon();

    }

    @Test
    public void K_Amazon_S3_negative() throws InterruptedException {

        goHome();

        String EmailId = "tralala" ;
        String AccessId = "tralalalala";
        String Name = "tralalala";
        String SecretAccessId = "tralalalala";


        StartPage startPage = new StartPage();
        String Email = startPage.getProperty("email.forwork");
        String Password = startPage.getProperty("password.forwork");
        startPage.Login(Email, Password);
        startPage.finishLogin();
        HomePage homePage = new HomePage();
        CloudPage cloudPage = homePage.CloudPage();
        cloudPage.Amazon_S3(EmailId, AccessId, Name, SecretAccessId);

        assertEquals("Failed in registering Amazon S3 Please try again", getDriver().findElement(By.cssSelector("div.toast-message")).getText());


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

        String Domain = "democloudfuze";
        String Username = "demo4";
        String Cloud_Password = "cloudfuze123";


        StartPage startPage = new StartPage();
        String Email = startPage.getProperty("email.forwork");
        String Password = startPage.getProperty("password.forwork");
        startPage.Login(Email, Password);
        startPage.finishLogin();
        HomePage homePage = new HomePage();
        CloudPage cloudPage = homePage.CloudPage();
        cloudPage.Egnyte(Domain, Username, Cloud_Password);

    }

    @Test
    public void N_Delete_cloud() throws InterruptedException {

        goHome();


        String Cloud_name = "cloudfuze";
        String Cloud_password = "cloudfuze123";

        StartPage startPage = new StartPage();
        String Email = startPage.getProperty("email.forwork");
        String Password = startPage.getProperty("password.forwork");
        startPage.Login(Email, Password);
        startPage.finishLogin();
        HomePage homePage = new HomePage();
        CloudPage cloudPage = homePage.CloudPage();
        cloudPage.Delete_cloud();
        homePage.CloudPage();
        cloudPage.Yandex(Cloud_name, Cloud_password);

    }


}
