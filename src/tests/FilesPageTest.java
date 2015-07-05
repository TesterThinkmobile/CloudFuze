package tests;


import methods.*;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class FilesPageTest extends BaseTest {


    Long date = System.currentTimeMillis();
    String value = String.valueOf(date);

    @Test
    public void A_Open_file() throws InterruptedException {

        goHome();


        StartPage startPage = new StartPage();
        String Email = startPage.getProperty("email.forwork");
        String Password = startPage.getProperty("password.forwork");
        startPage.Login(Email, Password);
        startPage.finishLogin();
        HomePage homePage = new HomePage();
        FilesPage filesPage = homePage.FilesPage();
        filesPage.Open_File();


    }

    @Test
    public void B_Download_file() throws InterruptedException {

        goHome();


        StartPage startPage = new StartPage();
        String Email = startPage.getProperty("email.forwork");
        String Password = startPage.getProperty("password.forwork");
        startPage.Login(Email, Password);
        startPage.finishLogin();
        HomePage homePage = new HomePage();
        FilesPage filesPage = homePage.FilesPage();
        filesPage.Download_File();


    }

    @Test
    public void C_Rename_file() throws InterruptedException {

        goHome();


        String Name = value;


        StartPage startPage = new StartPage();
        String Email = startPage.getProperty("email.forwork");
        String Password = startPage.getProperty("password.forwork");
        startPage.Login(Email, Password);
        startPage.finishLogin();
        HomePage homePage = new HomePage();
        FilesPage filesPage = homePage.FilesPage();
        filesPage.Rename_File(Name);


    }


    @Test
    public void D_Workspace_file() throws InterruptedException {

        goHome();

        String Name = value + "name";
        String new_Email = value + "@yopmail.com";
        String Notes = value+value+value;

        StartPage startPage = new StartPage();
        String Email = startPage.getProperty("email.forwork");
        String Password = startPage.getProperty("password.forwork");
        startPage.Login(Email, Password);
        startPage.finishLogin();
        HomePage homePage = new HomePage();
        WorkspacePage workspacePage = homePage.WorkspacePage();
        workspacePage.Create_Workspace(Name, new_Email, Notes);
        workspacePage.Create_button(Password);
        assertEquals("Workspace created successfully.", getDriver().findElement(By.cssSelector("div.textoFull > span")).getText());
        FilesPage filesPage = homePage.FilesPage();
        filesPage.Workspace_File();
        homePage.WorkspacePage();
        workspacePage.Delete_workspace();

    }

    @Test
    public void F_Choose_category_file() throws InterruptedException {

        goHome();


        String CategoryName = "TestFiles";


        StartPage startPage = new StartPage();
        String Email = startPage.getProperty("email.forwork");
        String Password = startPage.getProperty("password.forwork");
        startPage.Login(Email, Password);
        startPage.finishLogin();
        HomePage homePage = new HomePage();
        FilesPage filesPage = homePage.FilesPage();
        filesPage.Chose_Category_File(CategoryName);


    }

    @Test
    public void G_Share_file_() throws InterruptedException {

        goHome();

        String Message = value + "test";
        String ShareEmail = value + "@yopmail.com";

        StartPage startPage = new StartPage();
        String Email = startPage.getProperty("email.forwork");
        String Password = startPage.getProperty("password.forwork");
        startPage.Login(Email, Password);
        startPage.finishLogin();
        HomePage homePage = new HomePage();
        FilesPage filesPage = homePage.FilesPage();
        filesPage.Share_File_publick(ShareEmail, Message);
        filesPage.Delete_Share_File();
        homePage.FilesPage();
        filesPage.Share_File_private(ShareEmail,Message);
        filesPage.Delete_Share_File();


    }

    @Test
    public void G_Share_file_with_advanced_setting() throws InterruptedException {

        goHome();

        String Message = value + "test";
        String ShareEmail = value + "@yopmail.com";

        StartPage startPage = new StartPage();
        String Email = startPage.getProperty("email.forwork");
        String Password = startPage.getProperty("password.forwork");
        startPage.Login(Email, Password);
        startPage.finishLogin();
        HomePage homePage = new HomePage();
        FilesPage filesPage = homePage.FilesPage();
        filesPage.Advanced_Setting_ShareFile(ShareEmail, Message);
        filesPage.Delete_Share_File();

    }

    @Test
    public void G_Share_file_with_advanced_setting_negative() throws InterruptedException {

        goHome();

        String Message = value + "test";
        String ShareEmail = value + "@yopmail.com";

        StartPage startPage = new StartPage();
        String Email = startPage.getProperty("email.forwork");
        String Password = startPage.getProperty("password.forwork");
        startPage.Login(Email, Password);
        startPage.finishLogin();
        HomePage homePage = new HomePage();
        FilesPage filesPage = homePage.FilesPage();
        filesPage.Advanced_Setting_ShareFile_negatibe(ShareEmail, Message);

    }


    @Test
    public void G_Share_file_with_edit_permissions() throws InterruptedException {

        goHome();

        String Message = value + "test";
        String ShareEmail = value + "@yopmail.com";

        StartPage startPage = new StartPage();
        String Email = startPage.getProperty("email.forwork");
        String Password = startPage.getProperty("password.forwork");
        startPage.Login(Email, Password);
        startPage.finishLogin();
        HomePage homePage = new HomePage();
        FilesPage filesPage = homePage.FilesPage();
        filesPage.Edit_permision_ShareFile(ShareEmail, Message);
        filesPage.Delete_Share_File();

    }

    @Test
    public void G_Share_file_with_CoOwnre_permissions() throws InterruptedException {

        goHome();

        String Message = value + "test";
        String ShareEmail = value + "@yopmail.com";

        StartPage startPage = new StartPage();
        String Email = startPage.getProperty("email.forwork");
        String Password = startPage.getProperty("password.forwork");
        startPage.Login(Email, Password);
        startPage.finishLogin();
        HomePage homePage = new HomePage();
        FilesPage filesPage = homePage.FilesPage();
        filesPage.CoOwner_permision_ShareFile(ShareEmail, Message);
        filesPage.Delete_Share_File();

    }

    @Test
    public void G_Share_file_with_me() throws InterruptedException {

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
        filesPage.Share_File_private(ShareEmail, Message);
        startPage.Logout();
        startPage.Login(Email, Password);
        startPage.finishLogin();
        homePage.FilesPage();
        filesPage.Share_with_me();
        //filesPage.Delete_Share_File();
        startPage.Logout();
        startPage.Login_new(Email_share, Password);
        startPage.finishLogin();
        homePage.CloudPage();
        cloudPage.Delete_cloud();
    }

    @Test
    public void H_Add_file_toFavorites() throws InterruptedException {

        goHome();


        StartPage startPage = new StartPage();
        String Email = startPage.getProperty("email.forwork");
        String Password = startPage.getProperty("password.forwork");
        startPage.Login(Email, Password);
        startPage.finishLogin();
        HomePage homePage = new HomePage();
        FilesPage filesPage = homePage.FilesPage();
        filesPage.Add_Favorites_File();
        filesPage.Delete_File();

    }

    @Test
    public void Z_Delete_file() throws InterruptedException {

        goHome();


        StartPage startPage = new StartPage();
        String Email = startPage.getProperty("email.forwork");
        String Password = startPage.getProperty("password.forwork");
        startPage.Login(Email, Password);
        startPage.finishLogin();
        HomePage homePage = new HomePage();
        FilesPage filesPage = homePage.FilesPage();
        filesPage.Delete_File();

    }


}
