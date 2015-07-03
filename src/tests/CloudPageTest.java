package tests;


import methods.CloudPage;
import methods.HomePage;
import methods.StartPage;
import org.testng.annotations.Test;

public class CloudPageTest extends BaseTest {




    @Test
    public void GoogleDrive() throws InterruptedException {

        goHome();


        StartPage startPage = new StartPage();
        String Email = startPage.getProperty("email.forwork");
        String Password = startPage.getProperty("password.forwork");
        startPage.Login(Email, Password);
        startPage.finishLogin();
        HomePage homePage = new HomePage();
        CloudPage cloudPage = homePage.CloudPage();
        cloudPage.Google_drive(Email);


    }

    @Test
    public void OneDrive() throws InterruptedException {

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
    public void DropBox() throws InterruptedException {

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
    public void Yandex() throws InterruptedException {

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

    }

    @Test
    public void Box() throws InterruptedException {

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
    public void CitrixShareFile() throws InterruptedException {

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
    public void Amazon_S3() throws InterruptedException {

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

    }

    @Test
    public void Agnyte() throws InterruptedException {

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
    public void Delete_cloud() throws InterruptedException {

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
