package tests;

import methods.*;
import org.testng.annotations.Test;

public class NotificationPageTest extends BaseTest{


    Long date = System.currentTimeMillis();
    String value = String.valueOf(date);

    //--------------------------NOTIFICATION-----------------------------------------------

    @Test
    public void B__Check_and_Delete_Notification() throws InterruptedException {

        goHome();

        String Message = value + "test";
        String ShareEmail = "tester.thinkmobile@gmail.com";

        String Cloud_email = "quality.cloudfuze@gmail.com";
        String Cloud_password = "account10";

        StartPage startPage = new StartPage();
        String Email = startPage.getProperty("email.forwork");
        String Email_share = startPage.getProperty("email.toShare");
        String Password = startPage.getProperty("password.forwork");
        startPage.Login_new(Email_share, Password);
        startPage.finishLogin();
        HomePage homePage = new HomePage();
        CloudPage cloudPage = homePage.CloudPage();
        cloudPage.DropBox(Cloud_email, Cloud_password);

        FilesPage filesPage = homePage.FilesPage();
        String FileName = filesPage.getProperty("xpath.file.name");
        String Checkbox = filesPage.getProperty("xpath.file.checkbox");
        filesPage.Share_File_private(ShareEmail, Message, FileName, Checkbox);
        startPage.Logout();
        startPage.Login(Email, Password);
        startPage.finishLogin();
        //---------------------------------
        NotificationPage notificationPage = homePage.NotificationPage();
        notificationPage.Notification_Content();
        homePage.NotificationPage();
        notificationPage.Notification_delete();
        //----------------------------------
        filesPage.Delete_Share_File();
        startPage.Logout();
        startPage.Login_new(Email_share, Password);
        startPage.finishLogin();
        homePage.CloudPage();
        cloudPage.Delete_cloud();


    }

    @Test
    public void A__Check_and_ClearAll_Notification() throws InterruptedException {

        goHome();

        String Message = value + "test";
        String ShareEmail = "tester.thinkmobile@gmail.com";

        String Cloud_email = "quality.cloudfuze@gmail.com";
        String Cloud_password = "account10";

        StartPage startPage = new StartPage();
        String Email = startPage.getProperty("email.forwork");
        String Email_share = startPage.getProperty("email.toShare");
        String Password = startPage.getProperty("password.forwork");
        startPage.Login_new(Email_share, Password);
        startPage.finishLogin();
        HomePage homePage = new HomePage();
        CloudPage cloudPage = homePage.CloudPage();
        cloudPage.DropBox(Cloud_email, Cloud_password);

        FilesPage filesPage = homePage.FilesPage();
        String FileName = filesPage.getProperty("xpath.file.name");
        String Checkbox = filesPage.getProperty("xpath.file.checkbox");
        filesPage.Share_File_private(ShareEmail, Message, FileName, Checkbox);
        startPage.Logout();
        startPage.Login(Email, Password);
        startPage.finishLogin();
        //---------------------------------
        NotificationPage notificationPage = homePage.NotificationPage();
        notificationPage.Notification_Content();
        homePage.NotificationPage();
        notificationPage.Notification_ClearAll();
        //----------------------------------
        filesPage.Delete_Share_File();
        startPage.Logout();
        startPage.Login_new(Email_share, Password);
        startPage.finishLogin();
        homePage.CloudPage();
        cloudPage.Delete_cloud();


    }

    @Test
    public void C__Check_and_IgnoreAll_Notification() throws InterruptedException {

        goHome();

        String Message = value + "test";
        String ShareEmail = "tester.thinkmobile@gmail.com";

        String Cloud_email = "quality.cloudfuze@gmail.com";
        String Cloud_password = "account10";

        StartPage startPage = new StartPage();
        String Email = startPage.getProperty("email.forwork");
        String Email_share = startPage.getProperty("email.toShare");
        String Password = startPage.getProperty("password.forwork");
        startPage.Login_new(Email_share, Password);
        startPage.finishLogin();
        HomePage homePage = new HomePage();
        CloudPage cloudPage = homePage.CloudPage();
        cloudPage.DropBox(Cloud_email, Cloud_password);

        FilesPage filesPage = homePage.FilesPage();
        String FileName = filesPage.getProperty("xpath.file.name");
        String Checkbox = filesPage.getProperty("xpath.file.checkbox");
        filesPage.Share_File_private(ShareEmail, Message, FileName, Checkbox);
        startPage.Logout();
        startPage.Login(Email, Password);
        startPage.finishLogin();
        //---------------------------------
        NotificationPage notificationPage = homePage.NotificationPage();
        notificationPage.Notification_Content();
        homePage.NotificationPage();
        notificationPage.Notification_ignoreAll();
        //----------------------------------
        filesPage.Delete_Share_File();
        startPage.Logout();
        startPage.Login_new(Email_share, Password);
        startPage.finishLogin();
        homePage.CloudPage();
        cloudPage.Delete_cloud();


    }
}
