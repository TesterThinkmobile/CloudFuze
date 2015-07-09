package tests;


import methods.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import static org.hamcrest.Matchers.containsString;
import static org.junit.Assert.assertThat;
import static org.openqa.selenium.lift.match.TextMatcher.text;
import static org.testng.Assert.assertEquals;

public class FilesPageTest extends BaseTest {


    Long date = System.currentTimeMillis();
    String value = String.valueOf(date);



//--------------------------Check clickable buttons---------------------
    @Test
      public void A_Recent_and_all_files_page() throws InterruptedException {

        goHome();


        StartPage startPage = new StartPage();
        String Email = startPage.getProperty("email.forwork");
        String Password = startPage.getProperty("password.forwork");
        startPage.Login(Email, Password);
        startPage.finishLogin();
        HomePage homePage = new HomePage();
        FilesPage filesPage = homePage.FilesPage();
        String Checkbox = filesPage.getProperty("xpath.file.checkbox");
        filesPage.All_button_isdisplayed();
        filesPage.All_file_page(Checkbox);
        filesPage.All_button_isdisplayed();

    }




    @Test
    public void AA_Open_file() throws InterruptedException {

        goHome();

        String check_Shared_Password = "123456";

        StartPage startPage = new StartPage();
        String Email = startPage.getProperty("email.forwork");
        String Password = startPage.getProperty("password.forwork");
        startPage.Login(Email, Password);
        startPage.finishLogin();
        HomePage homePage = new HomePage();
        FilesPage filesPage = homePage.FilesPage();
        String Checkbox = filesPage.getProperty("xpath.file.checkbox");
        filesPage.Open_File(check_Shared_Password,Checkbox);


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
        filesPage.Choose_Category_File(CategoryName);
        filesPage.Category_Page();
        filesPage.Check_file_inCategory(CategoryName);
        filesPage.All_button_isdisplayed();
        filesPage.Delete_category_File();
    }

    @Test
    public void F_Choose_category_Photos_file() throws InterruptedException {

        goHome();


        String CategoryName = "Photos";



        StartPage startPage = new StartPage();
        String Email = startPage.getProperty("email.forwork");
        String Password = startPage.getProperty("password.forwork");
        startPage.Login(Email, Password);
        startPage.finishLogin();
        HomePage homePage = new HomePage();
        FilesPage filesPage = homePage.FilesPage();
        filesPage.Choose_Category_File(CategoryName);
        filesPage.Category_Page();
        filesPage.Check_file_inCategory(CategoryName);
        filesPage.Delete_category_File();
    }

//-----------------------------Shared File---------------------------------------
    @Test
    public void G_Share_file() throws InterruptedException {

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
        String FileName = filesPage.getProperty("xpath.file.name");
        String Checkbox = filesPage.getProperty("xpath.file.checkbox");
        String Checkbox1 = filesPage.getProperty("xpath.file.checkbox1");
        filesPage.Share_File_publick(ShareEmail, Message,FileName,Checkbox);
        homePage.FilesPage();
        filesPage.Share_File_icon();
        filesPage.All_file_page(Checkbox);
        filesPage.Share_File_icon();
        filesPage.Share_by_me();
        filesPage.Delete_Share_File();
        homePage.FilesPage();
        filesPage.Share_File_private(ShareEmail, Message,FileName,Checkbox);
        filesPage.Delete_Share_File();

    }

    @Test
    public void G_Share_MulepleFile() throws InterruptedException {

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
        filesPage.Share_MultipleFile_private(ShareEmail, Message);
        homePage.FilesPage();
        filesPage.Share_File_icon();
        filesPage.Share_by_me();
        filesPage.Delete_Share_MultipleFile();



    }



    @Test
    public void G_Share_file_and_checkEmail() throws InterruptedException {

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
        String FileName = filesPage.getProperty("xpath.file.name");
        String Checkbox = filesPage.getProperty("xpath.file.checkbox");
        String Checkbox1 = filesPage.getProperty("xpath.file.checkbox1");
        filesPage.Share_File_publick(ShareEmail, Message,FileName,Checkbox);
        filesPage.Check_in_email(ShareEmail);
        String originalHandle = getDriver().getWindowHandle();
        for (String handle : getDriver().getWindowHandles()) {
            if (!handle.equals(originalHandle)) {
                getDriver().switchTo().window(handle);
                wait_sec();
                getDriver().close();
            }
        }
        getDriver().switchTo().window(originalHandle);

        goHome();

        homePage.FilesPage();
        filesPage.Share_by_me();
        filesPage.Delete_Share_File();

    }


    @Test
    public void G_Share_File_to_multipleCollaborator() throws InterruptedException {

        goHome();

        String Message = value + "test";
        String ShareEmail = value + "@yopmail.com";
        String ShareEmail1 = value + "new@yopmail.com";
        String ShareEmail2 = value + "new1@yopmail.com";

        StartPage startPage = new StartPage();
        String Email = startPage.getProperty("email.forwork");
        String Password = startPage.getProperty("password.forwork");
        startPage.Login(Email, Password);
        startPage.finishLogin();
        HomePage homePage = new HomePage();
        FilesPage filesPage = homePage.FilesPage();
        String FileName = filesPage.getProperty("xpath.file.name");
        String Checkbox = filesPage.getProperty("xpath.file.checkbox");
        String Checkbox1 = filesPage.getProperty("xpath.file.checkbox1");
        filesPage.Share_File_private_to_MultipleCollaborator(ShareEmail, ShareEmail1, ShareEmail2, Message,FileName,Checkbox);
        filesPage.Check_in_MupltipleEmail(ShareEmail, ShareEmail1, ShareEmail2);
        String originalHandle = getDriver().getWindowHandle();
        for (String handle : getDriver().getWindowHandles()) {
            if (!handle.equals(originalHandle)) {
                getDriver().switchTo().window(handle);
                wait_sec();
                getDriver().close();
            }
        }
        getDriver().switchTo().window(originalHandle);
        for (String handle : getDriver().getWindowHandles()) {
            if (!handle.equals(originalHandle)) {
                getDriver().switchTo().window(handle);
                wait_sec();
                getDriver().close();
            }
        }
        getDriver().switchTo().window(originalHandle);
        for (String handle : getDriver().getWindowHandles()) {
            if (!handle.equals(originalHandle)) {
                getDriver().switchTo().window(handle);
                wait_sec();
                getDriver().close();
            }
        }
        getDriver().switchTo().window(originalHandle);

        goHome();

        homePage.FilesPage();
        filesPage.Share_by_me();
        filesPage.Delete_Share_File();



    }

    @Test
    public void G_Share_file_with_advanced_setting() throws InterruptedException {

        goHome();

        String Message = value + "test";
        String ShareEmail = value + "@yopmail.com";
        String Share_password = "123456";
        String Share_confirm_password = "123456";

        StartPage startPage = new StartPage();
        String Email = startPage.getProperty("email.forwork");
        String Password = startPage.getProperty("password.forwork");
        startPage.Login(Email, Password);
        startPage.finishLogin();
        HomePage homePage = new HomePage();
        FilesPage filesPage = homePage.FilesPage();
        String FileName = filesPage.getProperty("xpath.file.name");
        String Checkbox = filesPage.getProperty("xpath.file.checkbox");
        String Checkbox1 = filesPage.getProperty("xpath.file.checkbox1");
        filesPage.Advanced_Setting_ShareFile(ShareEmail, Message, Share_password, Share_confirm_password,FileName,Checkbox);
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
        String FileName = filesPage.getProperty("xpath.file.name");
        String Checkbox = filesPage.getProperty("xpath.file.checkbox");
        String Checkbox1 = filesPage.getProperty("xpath.file.checkbox1");
        filesPage.Advanced_Setting_ShareFile_negatibe(ShareEmail, Message,FileName,Checkbox);

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
        String FileName = filesPage.getProperty("xpath.file.name");
        String Checkbox = filesPage.getProperty("xpath.file.checkbox");
        String Checkbox1 = filesPage.getProperty("xpath.file.checkbox1");
        filesPage.Edit_permision_ShareFile(ShareEmail, Message,FileName,Checkbox);
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
        String FileName = filesPage.getProperty("xpath.file.name");
        String Checkbox = filesPage.getProperty("xpath.file.checkbox");
        String Checkbox1 = filesPage.getProperty("xpath.file.checkbox1");
        filesPage.CoOwner_permision_ShareFile(ShareEmail, Message,FileName,Checkbox);
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
        String FileName = filesPage.getProperty("xpath.file.name");
        String Checkbox = filesPage.getProperty("xpath.file.checkbox");
        String Checkbox1 = filesPage.getProperty("xpath.file.checkbox1");
        filesPage.Share_File_private(ShareEmail, Message,FileName,Checkbox);
        startPage.Logout();
        startPage.Login(Email, Password);
        startPage.finishLogin();
        filesPage.notification_displayed();
        homePage.FilesPage();
        filesPage.notification_displayed_in_files();
        filesPage.Share_with_me();
        filesPage.All_button_isdisplayed();
        filesPage.Delete_Share_File();
        startPage.Logout();
        startPage.Login_new(Email_share, Password);
        startPage.finishLogin();
        homePage.CloudPage();
        cloudPage.Delete_cloud();
    }

    @Test
    public void G_Share_file_with_me_check_file_delete() throws InterruptedException {

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
        String Checkbox1 = filesPage.getProperty("xpath.file.checkbox1");
        filesPage.Share_File_private(ShareEmail, Message,FileName,Checkbox);
        startPage.Logout();
        startPage.Login(Email, Password);
        startPage.finishLogin();
        filesPage.notification_displayed();
        homePage.FilesPage();
        filesPage.notification_displayed_in_files();
        filesPage.Share_with_me();
        filesPage.All_button_isdisplayed();
        //filesPage.Delete_Share_File();
        startPage.Logout();
        startPage.Login_new(Email_share, Password);
        startPage.finishLogin();
        homePage.CloudPage();
        cloudPage.Delete_cloud();
        startPage.Logout();
        startPage.Login_new(Email, Password);
        startPage.finishLogin();
        filesPage.Share_with_me();
    }

    @Test
    public void G_Share_file_with_me_check_file_unshare() throws InterruptedException {

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
        String Checkbox1 = filesPage.getProperty("xpath.file.checkbox1");
        filesPage.Share_File_private(ShareEmail, Message,FileName,Checkbox);
        startPage.Logout();
        startPage.Login(Email, Password);
        startPage.finishLogin();
        filesPage.notification_displayed();
        homePage.FilesPage();
        filesPage.notification_displayed_in_files();
        filesPage.Share_with_me();
        filesPage.All_button_isdisplayed();
        startPage.Logout();
        startPage.Login_new(Email_share, Password);
        startPage.finishLogin();
        homePage.FilesPage();
        filesPage.Share_by_me();
        filesPage.Delete_Share_File();
        startPage.Logout();
        startPage.Login_new(Email, Password);
        startPage.finishLogin();
        filesPage.Share_with_me();
        startPage.Logout();
        startPage.Login_new(Email_share, Password);
        startPage.finishLogin();
        homePage.CloudPage();
        cloudPage.Delete_cloud();


    }


    @Test
    public void G_Share_file_with_me_check_passwordFile_positive() throws InterruptedException {

        goHome();

        String Message = value + "test";
        String ShareEmail = "tester.thinkmobile@gmail.com";

        String Cloud_email = "quality.cloudfuze@gmail.com";
        String Cloud_password = "account10";

        String Share_password = "123456";
        String Share_confirm_password = "123456";
        String check_Shared_Password = "123456";

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
        String Checkbox1 = filesPage.getProperty("xpath.file.checkbox1");
        filesPage.Advanced_Setting_ShareFile(ShareEmail, Message, Share_password, Share_confirm_password,FileName,Checkbox);
        startPage.Logout();
        //---------------------------------
        startPage.Login(Email, Password);
        startPage.finishLogin();
        filesPage.notification_displayed();
        homePage.FilesPage();
        filesPage.notification_displayed_in_files();
        filesPage.Share_with_me();
        filesPage.All_button_isdisplayed();
        //---------------------------------------
        filesPage.Open_File(check_Shared_Password,Checkbox);
        startPage.Logout();
        //-------------------------------
        startPage.Login_new(Email_share, Password);
        startPage.finishLogin();
        homePage.FilesPage();
        homePage.CloudPage();
        cloudPage.Delete_cloud();
        startPage.Logout();
        startPage.Login_new(Email, Password);
        startPage.finishLogin();
        filesPage.Share_with_me();


    }

    @Test
    public void G_Share_file_with_me_check_passwordFile_negative() throws InterruptedException {

        goHome();

        String Message = value + "test";
        String ShareEmail = "tester.thinkmobile@gmail.com";

        String Cloud_email = "quality.cloudfuze@gmail.com";
        String Cloud_password = "account10";

        String Share_password = "123456";
        String Share_confirm_password = "123456";
        String check_Shared_Password = "654321";

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
        String Checkbox1 = filesPage.getProperty("xpath.file.checkbox1");
        filesPage.Advanced_Setting_ShareFile(ShareEmail, Message, Share_password, Share_confirm_password,FileName,Checkbox);
        startPage.Logout();
        //---------------------------------
        startPage.Login(Email, Password);
        startPage.finishLogin();
        filesPage.notification_displayed();
        homePage.FilesPage();
        filesPage.notification_displayed_in_files();
        filesPage.Share_with_me();
        filesPage.All_button_isdisplayed();
        //---------------------------------------
        filesPage.Open_File_negative(check_Shared_Password,Checkbox);
        //filesPage.Cancel_button_in_delete_window();
        startPage.Logout();
        //-------------------------------
        startPage.Login_new(Email_share, Password);
        startPage.finishLogin();
        homePage.FilesPage();
        homePage.CloudPage();
        cloudPage.Delete_cloud();
        startPage.Logout();
        startPage.Login_new(Email, Password);
        startPage.finishLogin();
        filesPage.Share_with_me();


    }

    @Test
    public void G_Share_file_and_delete_file_in_cloud() throws InterruptedException {

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
        String FileName = filesPage.getProperty("xpath.file.name");
        String Checkbox = filesPage.getProperty("xpath.file.checkbox");
        String Checkbox1 = filesPage.getProperty("xpath.file.checkbox1");
        filesPage.Share_File_publick(ShareEmail, Message,FileName,Checkbox);
        homePage.FilesPage();
        filesPage.Delete_Share_File_in_cloud(Checkbox1);
        filesPage.Share_by_me();

    }


    //-----------------------------Shared folder--------------------------


    @Test
    public void H_Share_folder() throws InterruptedException {

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
        String FileName = filesPage.getProperty("xpath.folder.name");
        String Checkbox = filesPage.getProperty("xpath.folder.checkbox");
        String Checkbox1 = filesPage.getProperty("xpath.folder.checkbox1");
        filesPage.Share_File_publick(ShareEmail, Message,FileName,Checkbox);
        homePage.FilesPage();
        filesPage.Share_File_icon();
        filesPage.All_file_page(Checkbox);
        filesPage.Share_File_icon();
        filesPage.Share_by_me();
        filesPage.Delete_Share_File();
        homePage.FilesPage();
        filesPage.Share_File_private(ShareEmail, Message,FileName,Checkbox);
        filesPage.Delete_Share_File();

    }

    @Test
    public void H_Share_MulepleFolder() throws InterruptedException {

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
        filesPage.Share_MultipleFolder_private(ShareEmail, Message);
        homePage.FilesPage();
        filesPage.Share_File_icon();
        filesPage.Share_by_me();
        filesPage.Delete_Share_MultipleFile();

    }



    @Test
    public void H_Share_folder_and_checkEmail() throws InterruptedException {

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
        String FileName = filesPage.getProperty("xpath.folder.name");
        String Checkbox = filesPage.getProperty("xpath.folder.checkbox");
        String Checkbox1 = filesPage.getProperty("xpath.folder.checkbox1");
        filesPage.Share_File_publick(ShareEmail, Message,FileName,Checkbox);
        filesPage.Check_in_email(ShareEmail);
        String originalHandle = getDriver().getWindowHandle();
        for (String handle : getDriver().getWindowHandles()) {
            if (!handle.equals(originalHandle)) {
                getDriver().switchTo().window(handle);
                wait_sec();
                getDriver().close();
            }
        }
        getDriver().switchTo().window(originalHandle);

        goHome();

        homePage.FilesPage();
        filesPage.Share_by_me();
        filesPage.Delete_Share_File();

    }


    @Test
    public void H_Share_Folder_to_multipleCollaborator() throws InterruptedException {

        goHome();

        String Message = value + "test";
        String ShareEmail = value + "@yopmail.com";
        String ShareEmail1 = value + "new@yopmail.com";
        String ShareEmail2 = value + "new1@yopmail.com";

        StartPage startPage = new StartPage();
        String Email = startPage.getProperty("email.forwork");
        String Password = startPage.getProperty("password.forwork");
        startPage.Login(Email, Password);
        startPage.finishLogin();
        HomePage homePage = new HomePage();
        FilesPage filesPage = homePage.FilesPage();
        String FileName = filesPage.getProperty("xpath.folder.name");
        String Checkbox = filesPage.getProperty("xpath.folder.checkbox");
        String Checkbox1 = filesPage.getProperty("xpath.folder.checkbox1");
        filesPage.Share_File_private_to_MultipleCollaborator(ShareEmail, ShareEmail1, ShareEmail2, Message,FileName,Checkbox);
        filesPage.Check_in_MupltipleEmail(ShareEmail, ShareEmail1, ShareEmail2);
        String originalHandle = getDriver().getWindowHandle();
        for (String handle : getDriver().getWindowHandles()) {
            if (!handle.equals(originalHandle)) {
                getDriver().switchTo().window(handle);
                wait_sec();
                getDriver().close();
            }
        }
        getDriver().switchTo().window(originalHandle);
        for (String handle : getDriver().getWindowHandles()) {
            if (!handle.equals(originalHandle)) {
                getDriver().switchTo().window(handle);
                wait_sec();
                getDriver().close();
            }
        }
        getDriver().switchTo().window(originalHandle);
        for (String handle : getDriver().getWindowHandles()) {
            if (!handle.equals(originalHandle)) {
                getDriver().switchTo().window(handle);
                wait_sec();
                getDriver().close();
            }
        }
        getDriver().switchTo().window(originalHandle);

        goHome();

        homePage.FilesPage();
        filesPage.Share_by_me();
        filesPage.Delete_Share_File();



    }

    @Test
    public void H_Share_FOlder_with_advanced_setting() throws InterruptedException {

        goHome();

        String Message = value + "test";
        String ShareEmail = value + "@yopmail.com";
        String Share_password = "123456";
        String Share_confirm_password = "123456";

        StartPage startPage = new StartPage();
        String Email = startPage.getProperty("email.forwork");
        String Password = startPage.getProperty("password.forwork");
        startPage.Login(Email, Password);
        startPage.finishLogin();
        HomePage homePage = new HomePage();
        FilesPage filesPage = homePage.FilesPage();
        String FileName = filesPage.getProperty("xpath.folder.name");
        String Checkbox = filesPage.getProperty("xpath.folder.checkbox");
        String Checkbox1 = filesPage.getProperty("xpath.folder.checkbox1");
        filesPage.Advanced_Setting_ShareFile(ShareEmail, Message, Share_password, Share_confirm_password,FileName,Checkbox);
        filesPage.Delete_Share_File();

    }

    @Test
    public void H_Share_Folder_with_advanced_setting_negative() throws InterruptedException {

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
        String FileName = filesPage.getProperty("xpath.folder.name");
        String Checkbox = filesPage.getProperty("xpath.folder.checkbox");
        String Checkbox1 = filesPage.getProperty("xpath.folder.checkbox1");
        filesPage.Advanced_Setting_ShareFile_negatibe(ShareEmail, Message,FileName,Checkbox);

    }


    @Test
    public void H_Share_Folder_with_edit_permissions() throws InterruptedException {

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
        String FileName = filesPage.getProperty("xpath.folder.name");
        String Checkbox = filesPage.getProperty("xpath.folder.checkbox");
        String Checkbox1 = filesPage.getProperty("xpath.folder.checkbox1");
        filesPage.Edit_permision_ShareFile(ShareEmail, Message,FileName,Checkbox);
        filesPage.Delete_Share_File();

    }

    @Test
    public void H_Share_Folder_with_CoOwnre_permissions() throws InterruptedException {

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
        String FileName = filesPage.getProperty("xpath.folder.name");
        String Checkbox = filesPage.getProperty("xpath.folder.checkbox");
        String Checkbox1 = filesPage.getProperty("xpath.folder.checkbox1");
        filesPage.CoOwner_permision_ShareFile(ShareEmail, Message,FileName,Checkbox);
        filesPage.Delete_Share_File();

    }

    @Test
    public void H_Share_folder_with_me() throws InterruptedException {

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
        String FileName = filesPage.getProperty("xpath.folder.name");
        String Checkbox = filesPage.getProperty("xpath.folder.checkbox");
        String Checkbox1 = filesPage.getProperty("xpath.folder.checkbox1");
        filesPage.Share_File_private(ShareEmail, Message,FileName,Checkbox);
        startPage.Logout();
        startPage.Login(Email, Password);
        startPage.finishLogin();
        filesPage.notification_displayed();
        homePage.FilesPage();
        filesPage.notification_displayed_in_files();
        filesPage.Share_with_me();
        filesPage.All_button_isdisplayed();
        filesPage.Delete_Share_File();
        startPage.Logout();
        startPage.Login_new(Email_share, Password);
        startPage.finishLogin();
        homePage.CloudPage();
        cloudPage.Delete_cloud();
    }

    @Test
    public void H_Share_Folder_with_me_check_file_delete() throws InterruptedException {

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
        String FileName = filesPage.getProperty("xpath.folder.name");
        String Checkbox = filesPage.getProperty("xpath.folder.checkbox");
        String Checkbox1 = filesPage.getProperty("xpath.folder.checkbox1");
        filesPage.Share_File_private(ShareEmail, Message,FileName,Checkbox);
        startPage.Logout();
        startPage.Login(Email, Password);
        startPage.finishLogin();
        filesPage.notification_displayed();
        homePage.FilesPage();
        filesPage.notification_displayed_in_files();
        filesPage.Share_with_me();
        filesPage.All_button_isdisplayed();
        //filesPage.Delete_Share_File();
        startPage.Logout();
        startPage.Login_new(Email_share, Password);
        startPage.finishLogin();
        homePage.CloudPage();
        cloudPage.Delete_cloud();
        startPage.Logout();
        startPage.Login_new(Email, Password);
        startPage.finishLogin();
        filesPage.Share_with_me();
    }

    @Test
    public void H_Share_Folder_with_me_check_file_unshare() throws InterruptedException {

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
        String FileName = filesPage.getProperty("xpath.folder.name");
        String Checkbox = filesPage.getProperty("xpath.folder.checkbox");
        String Checkbox1 = filesPage.getProperty("xpath.folder.checkbox1");
        filesPage.Share_File_private(ShareEmail, Message,FileName,Checkbox);
        startPage.Logout();
        startPage.Login(Email, Password);
        startPage.finishLogin();
        filesPage.notification_displayed();
        homePage.FilesPage();
        filesPage.notification_displayed_in_files();
        filesPage.Share_with_me();
        filesPage.All_button_isdisplayed();
        startPage.Logout();
        startPage.Login_new(Email_share, Password);
        startPage.finishLogin();
        homePage.FilesPage();
        filesPage.Share_by_me();
        filesPage.Delete_Share_File();
        startPage.Logout();
        startPage.Login_new(Email, Password);
        startPage.finishLogin();
        filesPage.Share_with_me();
        startPage.Logout();
        startPage.Login_new(Email_share, Password);
        startPage.finishLogin();
        homePage.CloudPage();
        cloudPage.Delete_cloud();


    }


    @Test
    public void H_Share_Folder_with_me_check_passwordFile_positive() throws InterruptedException {

        goHome();

        String Message = value + "test";
        String ShareEmail = "tester.thinkmobile@gmail.com";

        String Cloud_email = "quality.cloudfuze@gmail.com";
        String Cloud_password = "account10";

        String Share_password = "123456";
        String Share_confirm_password = "123456";
        String check_Shared_Password = "123456";

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
        String FileName = filesPage.getProperty("xpath.folder.name");
        String Checkbox = filesPage.getProperty("xpath.folder.checkbox");
        String Checkbox1 = filesPage.getProperty("xpath.folder.checkbox1");
        filesPage.Advanced_Setting_ShareFile(ShareEmail, Message, Share_password, Share_confirm_password,FileName,Checkbox);
        startPage.Logout();
        //---------------------------------
        startPage.Login(Email, Password);
        startPage.finishLogin();
        filesPage.notification_displayed();
        homePage.FilesPage();
        filesPage.notification_displayed_in_files();
        filesPage.Share_with_me();
        filesPage.All_button_isdisplayed();
        //---------------------------------------
        filesPage.Open_Folder(check_Shared_Password,Checkbox);
        startPage.Logout();
        //-------------------------------
        startPage.Login_new(Email_share, Password);
        startPage.finishLogin();
        homePage.FilesPage();
        homePage.CloudPage();
        cloudPage.Delete_cloud();
        startPage.Logout();
        startPage.Login_new(Email, Password);
        startPage.finishLogin();
        filesPage.Share_with_me();


    }

    @Test
    public void H_Share_Folder_with_me_check_passwordFile_negative() throws InterruptedException {

        goHome();

        String Message = value + "test";
        String ShareEmail = "tester.thinkmobile@gmail.com";

        String Cloud_email = "quality.cloudfuze@gmail.com";
        String Cloud_password = "account10";

        String Share_password = "123456";
        String Share_confirm_password = "123456";
        String check_Shared_Password = "654321";

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
        String FileName = filesPage.getProperty("xpath.folder.name");
        String Checkbox = filesPage.getProperty("xpath.folder.checkbox");
        String Checkbox1 = filesPage.getProperty("xpath.folder.checkbox1");
        filesPage.Advanced_Setting_ShareFile(ShareEmail, Message, Share_password, Share_confirm_password,FileName,Checkbox);
        startPage.Logout();
        //---------------------------------
        startPage.Login(Email, Password);
        startPage.finishLogin();
        filesPage.notification_displayed();
        homePage.FilesPage();
        filesPage.notification_displayed_in_files();
        filesPage.Share_with_me();
        filesPage.All_button_isdisplayed();
        //---------------------------------------
        filesPage.Open_Folder_negative(check_Shared_Password,Checkbox);
        //filesPage.Cancel_button_in_delete_window();
        startPage.Logout();
        //-------------------------------
        startPage.Login_new(Email_share, Password);
        startPage.finishLogin();
        homePage.FilesPage();
        homePage.CloudPage();
        cloudPage.Delete_cloud();
        startPage.Logout();
        startPage.Login_new(Email, Password);
        startPage.finishLogin();
        filesPage.Share_with_me();


    }

    @Test
    public void H_Share_Folder_and_delete_file_in_cloud() throws InterruptedException {

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
        String FileName = filesPage.getProperty("xpath.folder.name");
        String Checkbox = filesPage.getProperty("xpath.folder.checkbox");
        String Checkbox1 = filesPage.getProperty("xpath.folder.checkbox1");
        filesPage.Share_File_publick(ShareEmail, Message,FileName,Checkbox);
        homePage.FilesPage();
        filesPage.Delete_Share_File_in_cloud(Checkbox1);
        filesPage.Share_by_me();

    }

//---------------------------------------------------------------------------------------------

    @Test
     public void I_Add_file_toFavorites() throws InterruptedException {

        goHome();


        StartPage startPage = new StartPage();
        String Email = startPage.getProperty("email.forwork");
        String Password = startPage.getProperty("password.forwork");
        startPage.Login(Email, Password);
        startPage.finishLogin();
        HomePage homePage = new HomePage();
        FilesPage filesPage = homePage.FilesPage();
        filesPage.Add_Favorites_File();
        filesPage.All_button_isdisplayed();
        filesPage.Delete_Favourite_File();

    }

    @Test
    public void I_Operation_with_category() throws InterruptedException {

        goHome();

        String Name = value + "name";

        StartPage startPage = new StartPage();
        String Email = startPage.getProperty("email.forwork");
        String Password = startPage.getProperty("password.forwork");
        startPage.Login(Email, Password);
        startPage.finishLogin();
        HomePage homePage = new HomePage();
        FilesPage filesPage = homePage.FilesPage();
        filesPage.Category_Page();
        filesPage.Add_new_category(Name);
        //filesPage.Category_Page();
        filesPage.Edit_category();
       // filesPage.Category_Page();
        filesPage.Delete_category();
        filesPage.Category_Page();

    }


    @Test
    public void X_Change_figuration_file() throws InterruptedException {

        goHome();


        StartPage startPage = new StartPage();
        String Email = startPage.getProperty("email.forwork");
        String Password = startPage.getProperty("password.forwork");
        startPage.Login(Email, Password);
        startPage.finishLogin();
        HomePage homePage = new HomePage();
        FilesPage filesPage = homePage.FilesPage();
        filesPage.Change_figuration_file();


    }


    @Test
    public void Z_Search_file_jpg() throws InterruptedException {

        goHome();

        String SearchFile = ".jpg";

        StartPage startPage = new StartPage();
        String Email = startPage.getProperty("email.forwork");
        String Password = startPage.getProperty("password.forwork");
        startPage.Login(Email, Password);
        startPage.finishLogin();
        HomePage homePage = new HomePage();
        FilesPage filesPage = homePage.FilesPage();
        filesPage.Search_file(SearchFile);

        WebElement file_name = getDriver().findElement(By.id("mainContentWrapper"));
        try {


            WebElement checkbox_element = getDriver().findElement(By.cssSelector(".LVcheckBox>input"));
            checkbox_element.isDisplayed();
            wait_sec();

            assertThat(file_name,text(containsString(SearchFile)));

        }

        catch (Exception error){
            System.out.println("File was not found");
        }
    }

    @Test
    public void Z_Search_file_one_leter() throws InterruptedException {

        goHome();

        String SearchFile = "a";

        StartPage startPage = new StartPage();
        String Email = startPage.getProperty("email.forwork");
        String Password = startPage.getProperty("password.forwork");
        startPage.Login(Email, Password);
        startPage.finishLogin();
        HomePage homePage = new HomePage();
        FilesPage filesPage = homePage.FilesPage();
        filesPage.Search_file(SearchFile);

        WebElement file_name = getDriver().findElement(By.id("mainContentWrapper"));
        try {


            WebElement checkbox_element = getDriver().findElement(By.cssSelector(".LVcheckBox>input"));
            checkbox_element.isDisplayed();
            wait_sec();

            assertThat(file_name,text(containsString(SearchFile)));

        }

        catch (Exception error){
            System.out.println("File was not found");
        }

    }

    @Test
    public void Z_Search_file_one_word() throws InterruptedException {

        goHome();

        String SearchFile = "text";

        StartPage startPage = new StartPage();
        String Email = startPage.getProperty("email.forwork");
        String Password = startPage.getProperty("password.forwork");
        startPage.Login(Email, Password);
        startPage.finishLogin();
        HomePage homePage = new HomePage();
        FilesPage filesPage = homePage.FilesPage();
        filesPage.Search_file(SearchFile);
        WebElement file_name = getDriver().findElement(By.id("mainContentWrapper"));
        try {


            WebElement checkbox_element = getDriver().findElement(By.cssSelector(".LVcheckBox>input"));
            checkbox_element.isDisplayed();
            wait_sec();

            assertThat(file_name,text(containsString(SearchFile)));

        }

        catch (Exception error){
            System.out.println("File was not found");
        }

    }

    @Test
    public void Z_Search_incorrect_file() throws InterruptedException {

        goHome();

        String SearchFile = "lalalalalallalalallalalallalal";

        StartPage startPage = new StartPage();
        String Email = startPage.getProperty("email.forwork");
        String Password = startPage.getProperty("password.forwork");
        startPage.Login(Email, Password);
        startPage.finishLogin();
        HomePage homePage = new HomePage();
        FilesPage filesPage = homePage.FilesPage();
        filesPage.Search_file(SearchFile);

        WebElement file_name = getDriver().findElement(By.id("mainContentWrapper"));
        try {


            WebElement checkbox_element = getDriver().findElement(By.cssSelector(".LVcheckBox>input"));
            checkbox_element.isDisplayed();
            wait_sec();

            assertThat(file_name,text(containsString(SearchFile)));

        }

        catch (Exception error){
            System.out.println("File was not found");
        }
    }

    @Test
    public void Z_Search_folder() throws InterruptedException {

        goHome();

        String SearchFile = "SkyDrive";

        StartPage startPage = new StartPage();
        String Email = startPage.getProperty("email.forwork");
        String Password = startPage.getProperty("password.forwork");
        startPage.Login(Email, Password);
        startPage.finishLogin();
        HomePage homePage = new HomePage();
        FilesPage filesPage = homePage.FilesPage();
        filesPage.Search_file(SearchFile);

        WebElement file_name = getDriver().findElement(By.id("mainContentWrapper"));
        try {


            WebElement checkbox_element = getDriver().findElement(By.cssSelector(".LVcheckBox>input"));
            checkbox_element.isDisplayed();
            wait_sec();

            assertThat(file_name,text(containsString(SearchFile)));

        }

        catch (Exception error){
            System.out.println("File was not found");
        }

    }


    @Test
    public void X_My_clouds() throws InterruptedException {

        goHome();

        StartPage startPage = new StartPage();
        String Email = startPage.getProperty("email.forwork");
        String Password = startPage.getProperty("password.forwork");
        startPage.Login(Email, Password);
        startPage.finishLogin();
        HomePage homePage = new HomePage();
        FilesPage filesPage = homePage.FilesPage();
        filesPage.My_clouds_page();
        filesPage.Google_drive();
        //////////////////////////
        filesPage.One_drive();
        //////////////////////////
        filesPage.DropBox();
        //////////////////////////
        filesPage.Yandex();
        //////////////////////////
        filesPage.Box();
        //////////////////////////
        filesPage.Amazon();
        //////////////////////////
        filesPage.Egnyte();
        //////////////////////////
        filesPage.Citrix();


    }





}
