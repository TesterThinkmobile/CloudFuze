package tests;


import methods.CloudPage;
import methods.HomePage;
import methods.StartPage;
import methods.WorkspacePage;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

import java.awt.*;

import static org.testng.Assert.assertEquals;

public class WorkspacePageTest extends BaseTest {

    Long date = System.currentTimeMillis();
    String value = String.valueOf(date);

    @Test
    public void A_Create_workspace() throws InterruptedException {

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
        wait_sec();
        homePage.WorkspacePage();
        workspacePage.Delete_workspace();
    }

    @Test
    public void B_Create_workspace_empty() throws InterruptedException {

        goHome();

        String Name = "";
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

        assertEquals("Please enter workspace name.", getDriver().findElement(By.id("statusMsg")).getText());


    }

    @Test
    public void C_Create_workspace_with_adnvaced_settings_positive() throws InterruptedException {

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
        workspacePage.Advanced_settings_in_Create_Workspace(Password);
        workspacePage.Create_button(Password);
        wait_sec();
        homePage.WorkspacePage();
        workspacePage.Delete_workspace();

    }

    @Test
    public void C_Create_workspace_with_adnvaced_settings_withEditPermissions() throws InterruptedException {

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
        workspacePage.Advanced_settings_in_Create_Workspace(Password);
        workspacePage.Edit_permissions(new_Email);
        workspacePage.Create_button(Password);
        wait_sec();
        homePage.WorkspacePage();
        workspacePage.Delete_workspace();

    }

    @Test
    public void C_Create_workspace_with_adnvaced_settings_withCoOwnerPermissions() throws InterruptedException {

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
        workspacePage.Advanced_settings_in_Create_Workspace(Password);
        workspacePage.CoOwner_permissions(new_Email);
        workspacePage.Create_button(Password);
        wait_sec();
        homePage.WorkspacePage();
        workspacePage.Delete_workspace();

    }

    @Test
    public void C_Create_workspace_with_adnvaced_settings_negative() throws InterruptedException {

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
        workspacePage.Advanced_settings_in_Create_Workspace_negative(Password);
//        homePage.WorkspacePage();
//        workspacePage.Delete_workspace();

    }

    @Test
    public void C_Create_workspace_mupltiple_emails() throws InterruptedException {

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
        workspacePage.Create_Workspace_with_multiple_email(Name, new_Email, Notes);
        workspacePage.Create_button(Password);
        assertEquals("Workspace created successfully.", getDriver().findElement(By.cssSelector("div.textoFull > span")).getText());
        wait_sec();
        homePage.WorkspacePage();
        workspacePage.Delete_workspace();

    }

    @Test
    public void D_Create_workspace_Inside_workspace() throws InterruptedException {

        goHome();

        String Name = value + "name";
        String new_Email = value + "@yopmail.com";
        String Notes = value + value + value;


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
        wait_sec();
        homePage.WorkspacePage();
        workspacePage.create_workspace_inside_workspace();

        assertEquals("Workspace created successfully.", getDriver().findElement(By.cssSelector("div.textoFull > span")).getText());

        wait_sec();
        homePage.WorkspacePage();
        workspacePage.Delete_workspace();
        wait_sec();
        homePage.WorkspacePage();
        workspacePage.Delete_workspace();
    }

    @Test
    public void E_Edit_workspace() throws InterruptedException {

        goHome();

        String Name = value + "name";
        String new_Email = value + "@yopmail.com";
        String Notes = value+value+value;

        String new_Name = "New name";
        String new_new_Email ="new" + value + "@yopmail.com";
        String new_Notes = "new notes";

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
        wait_sec();
        homePage.WorkspacePage();
        workspacePage.Edit_workspace(new_Name, new_new_Email, new_Notes);
        wait_sec();
        homePage.WorkspacePage();
        workspacePage.Delete_workspace();

    }

//    @Test
//    public void E_Edit_workspace_negative() throws InterruptedException {
//
//        goHome();
//
//        String Name = value + "name";
//        String new_Email = value + "@yopmail.com";
//        String Notes = value+value+value;
//
//        String new_Name = "New name";
//        String new_new_Email ="new" + value + "@yopmail.com";
//        String new_Notes = "new notes";
//
//        StartPage startPage = new StartPage();
//        String Email = startPage.getProperty("email.forwork");
//        String Password = startPage.getProperty("password.forwork");
//        startPage.Login(Email, Password);
//        startPage.finishLogin();
//        HomePage homePage = new HomePage();
//        WorkspacePage workspacePage = homePage.WorkspacePage();
//        workspacePage.Create_Workspace(Name, new_Email, Notes);
//        workspacePage.Create_button(Password);
//        assertEquals("Workspace created successfully.", getDriver().findElement(By.cssSelector("div.textoFull > span")).getText());
//        wait_sec();
//        homePage.WorkspacePage();
//        workspacePage.Edit_workspace(new_Name, new_new_Email, new_Notes);
//        wait_sec();
//        homePage.WorkspacePage();
//        workspacePage.Delete_workspace();
//
//    }

    @Test
    public void F_Operation_workspace() throws InterruptedException, AWTException {

        goHome();

        String Name = value + "name";
        String new_Email = value + "@yopmail.com";
        String Notes = value+value+value;
        String new_name = "new test name";

        StartPage startPage = new StartPage();
        String Email = startPage.getProperty("email.forwork");
        String Password = startPage.getProperty("password.forwork");
        String downloadPath = startPage.getProperty("downloadPath");
        startPage.Login(Email, Password);
        startPage.finishLogin();
        HomePage homePage = new HomePage();
        WorkspacePage workspacePage = homePage.WorkspacePage();
        workspacePage.Create_Workspace(Name,new_Email,Notes);
        workspacePage.Create_button(Password);
        assertEquals("Workspace created successfully.", getDriver().findElement(By.cssSelector("div.textoFull > span")).getText());
        wait_sec();
        homePage.WorkspacePage();
        workspacePage.Open_workspace(Password);
        ///////////////////////////////////////
        homePage.WorkspacePage();
        workspacePage.Rename_workspace(new_name);
        /////////////////////////////////////
        wait_sec();
        homePage.WorkspacePage();
        workspacePage.Delete_workspace();


    }
        @Test
        public void G_Open_file_workspace() throws InterruptedException, AWTException {

            goHome();

            String Name = value + "name";
            String new_Email = value + "@yopmail.com";
            String Notes = value+value+value;

            StartPage startPage = new StartPage();
            String Email = startPage.getProperty("email.forwork");
            String Password = startPage.getProperty("password.forwork");
            String downloadPath = startPage.getProperty("downloadPath");
            startPage.Login(Email, Password);
            startPage.finishLogin();
            HomePage homePage = new HomePage();
            WorkspacePage workspacePage = homePage.WorkspacePage();
            workspacePage.Create_Workspace(Name, new_Email, Notes);
            workspacePage.Create_button(Password);
            assertEquals("Workspace created successfully.", getDriver().findElement(By.cssSelector("div.textoFull > span")).getText());
            wait_sec();
            homePage.WorkspacePage();
            workspacePage.Open_file_workspace();
            homePage.WorkspacePage();
            workspacePage.Delete_workspace();
        }

    @Test
    public void H_download_file() throws InterruptedException, AWTException {

        goHome();

        String Name = value + "name";
        String new_Email = value + "@yopmail.com";
        String Notes = value+value+value;

        StartPage startPage = new StartPage();
        String Email = startPage.getProperty("email.forwork");
        String Password = startPage.getProperty("password.forwork");
        String downloadPath = startPage.getProperty("downloadPath");
        startPage.Login(Email, Password);
        startPage.finishLogin();
        HomePage homePage = new HomePage();
        WorkspacePage workspacePage = homePage.WorkspacePage();
        workspacePage.Create_Workspace(Name, new_Email, Notes);
        workspacePage.Create_button(Password);
        assertEquals("Workspace created successfully.", getDriver().findElement(By.cssSelector("div.textoFull > span")).getText());
        wait_sec();
        homePage.WorkspacePage();
        workspacePage.download_file_workspace(downloadPath);
        homePage.WorkspacePage();
        workspacePage.Delete_workspace();

    }


    @Test
    public void H_download_multiple_file() throws InterruptedException, AWTException {

        goHome();

        String Name = value + "name";
        String new_Email = value + "@yopmail.com";
        String Notes = value+value+value;

        StartPage startPage = new StartPage();
        String Email = startPage.getProperty("email.forwork");
        String Password = startPage.getProperty("password.forwork");
        String downloadPath = startPage.getProperty("downloadPath");
        startPage.Login(Email, Password);
        startPage.finishLogin();
        HomePage homePage = new HomePage();
        WorkspacePage workspacePage = homePage.WorkspacePage();
        workspacePage.Create_Workspace(Name, new_Email, Notes);
        workspacePage.Create_button(Password);
        assertEquals("Workspace created successfully.", getDriver().findElement(By.cssSelector("div.textoFull > span")).getText());
        wait_sec();
        homePage.WorkspacePage();
        workspacePage.download_mupliple_file_workspace();
        homePage.WorkspacePage();
        workspacePage.Delete_workspace();

    }

    @Test
    public void J_rename_file() throws InterruptedException, AWTException {

        goHome();

        String Name = value + "name";
        String new_Email = value + "@yopmail.com";
        String Notes = value+value+value;
        String new_Name = "newfilename";

        StartPage startPage = new StartPage();
        String Email = startPage.getProperty("email.forwork");
        String Password = startPage.getProperty("password.forwork");
        String downloadPath = startPage.getProperty("downloadPath");
        startPage.Login(Email, Password);
        startPage.finishLogin();
        HomePage homePage = new HomePage();
        WorkspacePage workspacePage = homePage.WorkspacePage();
        workspacePage.Create_Workspace(Name, new_Email, Notes);
        workspacePage.Create_button(Password);
        assertEquals("Workspace created successfully.", getDriver().findElement(By.cssSelector("div.textoFull > span")).getText());
        wait_sec();
        homePage.WorkspacePage();
        workspacePage.rename_file_workspace(new_Name);
        homePage.WorkspacePage();
        workspacePage.Delete_workspace();

    }


    @Test
    public void K_Check_button_workspace() throws InterruptedException, AWTException {

        goHome();

        String Name = value + "name";
        String new_Email = value + "@yopmail.com";
        String Notes = value+value+value;
        String new_Name = "newfilename";

        StartPage startPage = new StartPage();
        String Email = startPage.getProperty("email.forwork");
        String Password = startPage.getProperty("password.forwork");
        String downloadPath = startPage.getProperty("downloadPath");
        startPage.Login(Email, Password);
        startPage.finishLogin();
        HomePage homePage = new HomePage();
        WorkspacePage workspacePage = homePage.WorkspacePage();
        workspacePage.Create_Workspace(Name, new_Email, Notes);
        workspacePage.Create_button(Password);
        assertEquals("Workspace created successfully.", getDriver().findElement(By.cssSelector("div.textoFull > span")).getText());
        wait_sec();
        homePage.WorkspacePage();
        workspacePage.Second_Create_Workspace();
        workspacePage.Create_button(Password);
        assertEquals("Workspace created successfully.", getDriver().findElement(By.cssSelector("div.textoFull > span")).getText());
        wait_sec();
        homePage.WorkspacePage();
        workspacePage.buttons_displayed();
        homePage.WorkspacePage();
        workspacePage.button_delete_displayed();
        homePage.WorkspacePage();
        workspacePage.Delete_workspace();
        homePage.WorkspacePage();
        workspacePage.Delete_workspace();

    }


    @Test
    public void L_Check_file_in_workspace() throws InterruptedException, AWTException {

        goHome();

        String Name = value + "name";
        String new_Email = value + "@yopmail.com";
        String Notes = value+value+value;
        String new_Name = "newfilename";

        StartPage startPage = new StartPage();
        String Email = startPage.getProperty("email.forwork");
        String Password = startPage.getProperty("password.forwork");
        String downloadPath = startPage.getProperty("downloadPath");
        startPage.Login(Email, Password);
        startPage.finishLogin();
        HomePage homePage = new HomePage();
        WorkspacePage workspacePage = homePage.WorkspacePage();
        workspacePage.Create_Workspace(Name, new_Email, Notes);
        workspacePage.Create_button(Password);
        assertEquals("Workspace created successfully.", getDriver().findElement(By.cssSelector("div.textoFull > span")).getText());
        wait_sec();
        homePage.WorkspacePage();
        workspacePage.Check_file_add_to_workspace();
        homePage.WorkspacePage();
        workspacePage.Check_file_delete_to_workspace();
        homePage.WorkspacePage();
        workspacePage.Delete_workspace();

    }

    @Test
    public void M_Comment_file_in_workspace() throws InterruptedException, AWTException {

        goHome();

        String Name = value + "name";
        String new_Email = value + "@yopmail.com";
        String Notes = value+value+value;
        String new_Name = "newfilename";

        StartPage startPage = new StartPage();
        String Email = startPage.getProperty("email.forwork");
        String Password = startPage.getProperty("password.forwork");
        String downloadPath = startPage.getProperty("downloadPath");
        startPage.Login(Email, Password);
        startPage.finishLogin();
        HomePage homePage = new HomePage();
        WorkspacePage workspacePage = homePage.WorkspacePage();
        workspacePage.Create_Workspace(Name, new_Email, Notes);
        workspacePage.Create_button(Password);
        assertEquals("Workspace created successfully.", getDriver().findElement(By.cssSelector("div.textoFull > span")).getText());
        wait_sec();
        homePage.WorkspacePage();
        workspacePage.Add_comments_to_workspace();
        homePage.WorkspacePage();
        workspacePage.Edit_comments_to_workspace();
        homePage.WorkspacePage();
        workspacePage.Delete_comments_to_workspace();
        homePage.WorkspacePage();
        workspacePage.Delete_workspace();

        //

    }

    @Test
    public void N_upload_file() throws InterruptedException, AWTException {

        goHome();

        String Name = value + "name";
        String new_Email = value + "@yopmail.com";
        String Notes = value+value+value;
        String new_Name = "newfilename";

        StartPage startPage = new StartPage();
        String Email = startPage.getProperty("email.forwork");
        String Password = startPage.getProperty("password.forwork");
        startPage.Login(Email, Password);
        startPage.finishLogin();
        HomePage homePage = new HomePage();
        WorkspacePage workspacePage = homePage.WorkspacePage();
        String dir = System.getProperty("user.dir");
        String Path = dir + workspacePage.getProperty("path.file1");
        System.out.println(Path);
        workspacePage.Create_Workspace(Name, new_Email, Notes);
        workspacePage.Create_button(Password);
        assertEquals("Workspace created successfully.", getDriver().findElement(By.cssSelector("div.textoFull > span")).getText());
        wait_sec();
        homePage.WorkspacePage();
        workspacePage.Upload_file(Path);
        workspacePage.Upload_file_check();
        homePage.WorkspacePage();
        workspacePage.Delete_workspace();


    }

    @Test
    public void N_upload_file_negative() throws InterruptedException, AWTException {

        goHome();

        String Name = value + "name";
        String new_Email = value + "@yopmail.com";
        String Notes = value+value+value;
        String new_Name = "newfilename";

        StartPage startPage = new StartPage();
        String Email = startPage.getProperty("email.forwork");
        String Password = startPage.getProperty("password.forwork");
        startPage.Login(Email, Password);
        startPage.finishLogin();
        HomePage homePage = new HomePage();
        WorkspacePage workspacePage = homePage.WorkspacePage();
        String dir = System.getProperty("user.dir");
        String Path = dir + workspacePage.getProperty("path.file9");
        System.out.println(Path);
        workspacePage.Create_Workspace(Name, new_Email, Notes);
        workspacePage.Create_button(Password);
        assertEquals("Workspace created successfully.", getDriver().findElement(By.cssSelector("div.textoFull > span")).getText());
        wait_sec();
        homePage.WorkspacePage();
        workspacePage.Upload_file(Path);
        workspacePage.Upload_file_check();
        homePage.WorkspacePage();
        workspacePage.Upload_file(Path);
        workspacePage.Upload_file_error();
        homePage.WorkspacePage();
        workspacePage.Delete_workspace();


    }

    @Test
    public void N_upload_file_cancel() throws InterruptedException, AWTException {

        goHome();

        String Name = value + "name";
        String new_Email = value + "@yopmail.com";
        String Notes = value+value+value;
        String new_Name = "newfilename";

        StartPage startPage = new StartPage();
        String Email = startPage.getProperty("email.forwork");
        String Password = startPage.getProperty("password.forwork");
        startPage.Login(Email, Password);
        startPage.finishLogin();
        HomePage homePage = new HomePage();
        WorkspacePage workspacePage = homePage.WorkspacePage();
        String dir = System.getProperty("user.dir");
        String Path = dir + workspacePage.getProperty("path.file10");
        System.out.println(Path);
        workspacePage.Create_Workspace(Name, new_Email, Notes);
        workspacePage.Create_button(Password);
        assertEquals("Workspace created successfully.", getDriver().findElement(By.cssSelector("div.textoFull > span")).getText());
        wait_sec();
        homePage.WorkspacePage();
        workspacePage.Upload_file_cancel(Path);
        homePage.WorkspacePage();
        workspacePage.Delete_workspace();




    }

    @Test
    public void N_upload_file_to_directory() throws InterruptedException, AWTException {

        goHome();

        String Name = value + "name";
        String new_Email = value + "@yopmail.com";
        String Notes = value+value+value;
        String new_Name = "newfilename";

        StartPage startPage = new StartPage();
        String Email = startPage.getProperty("email.forwork");
        String Password = startPage.getProperty("password.forwork");
        String downloadPath = startPage.getProperty("downloadPath");
        startPage.Login(Email, Password);
        startPage.finishLogin();
        HomePage homePage = new HomePage();
        WorkspacePage workspacePage = homePage.WorkspacePage();
        workspacePage.Create_Workspace(Name, new_Email, Notes);
        workspacePage.Create_button(Password);
        String dir = System.getProperty("user.dir");
        String Path = dir + workspacePage.getProperty("path.file2");
        System.out.println(Path);
        assertEquals("Workspace created successfully.", getDriver().findElement(By.cssSelector("div.textoFull > span")).getText());
        wait_sec();
        homePage.WorkspacePage();
        workspacePage.Upload_file_to_directory(Path);
        homePage.WorkspacePage();
        workspacePage.Delete_workspace();

    }



//    @Test
//    public void O_Operation_file_workspace() throws InterruptedException, AWTException {
//
//        goHome();
//
//        String Name = value + "name";
//
//
//        StartPage startPage = new StartPage();
//        String Email = startPage.getProperty("email.forwork");
//        String Password = startPage.getProperty("password.forwork");
//        startPage.Login(Email, Password);
//        startPage.finishLogin();
//        HomePage homePage = new HomePage();
//        WorkspacePage workspacePage = homePage.WorkspacePage();
//        workspacePage.Open_file_workspace();
//        homePage.WorkspacePage();
//        workspacePage.rename_file_workspace(Name);
//        homePage.WorkspacePage();
//        workspacePage.delete_file();
//
//    }

    @Test
    public void P_Delete_file_workspace() throws InterruptedException, AWTException {

        goHome();

        String Name = value + "name";
        String new_Email = value + "@yopmail.com";
        String Notes = value+value+value;
        String new_Name = "newfilename";

        StartPage startPage = new StartPage();
        String Email = startPage.getProperty("email.forwork");
        String Password = startPage.getProperty("password.forwork");
        String downloadPath = startPage.getProperty("downloadPath");
        startPage.Login(Email, Password);
        startPage.finishLogin();
        HomePage homePage = new HomePage();
        WorkspacePage workspacePage = homePage.WorkspacePage();
        workspacePage.Create_Workspace(Name, new_Email, Notes);
        workspacePage.Create_button(Password);
        assertEquals("Workspace created successfully.", getDriver().findElement(By.cssSelector("div.textoFull > span")).getText());
        wait_sec();
        homePage.WorkspacePage();
        workspacePage.delete_file();
        homePage.WorkspacePage();
        workspacePage.Delete_workspace();


    }

    @Test
    public void Q_Multi_Delete_file_workspace() throws InterruptedException, AWTException {

        goHome();


        String Name = value + "name";
        String new_Email = value + "@yopmail.com";
        String Notes = value+value+value;
        String new_Name = "newfilename";

        StartPage startPage = new StartPage();
        String Email = startPage.getProperty("email.forwork");
        String Password = startPage.getProperty("password.forwork");
        String downloadPath = startPage.getProperty("downloadPath");
        startPage.Login(Email, Password);
        startPage.finishLogin();
        HomePage homePage = new HomePage();
        WorkspacePage workspacePage = homePage.WorkspacePage();
        workspacePage.Create_Workspace(Name, new_Email, Notes);
        workspacePage.Create_button(Password);
        assertEquals("Workspace created successfully.", getDriver().findElement(By.cssSelector("div.textoFull > span")).getText());
        wait_sec();
        homePage.WorkspacePage();
        workspacePage.delete_multiple_file();
        homePage.WorkspacePage();
        workspacePage.Delete_workspace();


    }

    @Test
    public void R_Delete_fileInFolder_workspace() throws InterruptedException, AWTException {

        goHome();


        String Name = value + "name";
        String new_Email = value + "@yopmail.com";
        String Notes = value+value+value;
        String new_Name = "newfilename";

        StartPage startPage = new StartPage();
        String Email = startPage.getProperty("email.forwork");
        String Password = startPage.getProperty("password.forwork");
        String downloadPath = startPage.getProperty("downloadPath");
        startPage.Login(Email, Password);
        startPage.finishLogin();
        HomePage homePage = new HomePage();
        WorkspacePage workspacePage = homePage.WorkspacePage();
        workspacePage.Create_Workspace(Name, new_Email, Notes);
        workspacePage.Create_button(Password);
        assertEquals("Workspace created successfully.", getDriver().findElement(By.cssSelector("div.textoFull > span")).getText());
        wait_sec();
        String dir = System.getProperty("user.dir");
        String Path = dir + workspacePage.getProperty("path.file3");
        String Path1 = dir + workspacePage.getProperty("path.file4");
        //String Path = dir + workspacePage.getProperty("path.file2");
        System.out.println(Path);
        homePage.WorkspacePage();
        workspacePage.delete_file_inFolder(Path,Path1);
        homePage.WorkspacePage();
        workspacePage.Delete_workspace();


    }

    @Test
    public void S_Delete_multipleFileInFolder_workspace() throws InterruptedException, AWTException {

        goHome();


        String Name = value + "name";
        String new_Email = value + "@yopmail.com";
        String Notes = value+value+value;
        String new_Name = "newfilename";

        StartPage startPage = new StartPage();
        String Email = startPage.getProperty("email.forwork");
        String Password = startPage.getProperty("password.forwork");
        //String downloadPath = startPage.getProperty("downloadPath");
        startPage.Login(Email, Password);
        startPage.finishLogin();
        HomePage homePage = new HomePage();
        WorkspacePage workspacePage = homePage.WorkspacePage();
        workspacePage.Create_Workspace(Name, new_Email, Notes);
        workspacePage.Create_button(Password);
        assertEquals("Workspace created successfully.", getDriver().findElement(By.cssSelector("div.textoFull > span")).getText());
        wait_sec();
        String dir = System.getProperty("user.dir");
        String Path = dir + workspacePage.getProperty("path.file5");
        String Path1 = dir + workspacePage.getProperty("path.file6");
        String Path2 = dir + workspacePage.getProperty("path.file7");
        String Path3 = dir + workspacePage.getProperty("path.file8");
        System.out.println(Path);
        homePage.WorkspacePage();
        workspacePage.multiple_delete_files_inFolder(Path,Path2,Path3,Path1);
        homePage.WorkspacePage();
        workspacePage.Delete_workspace();


    }
    @Test
    public void T_Delete_multipleFolder_workspace() throws InterruptedException, AWTException {

        goHome();


        String Name = value + "name";
        String new_Email = value + "@yopmail.com";
        String Notes = value+value+value;
        String new_Name = "newfilename";

        StartPage startPage = new StartPage();
        String Email = startPage.getProperty("email.forwork");
        String Password = startPage.getProperty("password.forwork");
        String downloadPath = startPage.getProperty("downloadPath");
        startPage.Login(Email, Password);
        startPage.finishLogin();
        HomePage homePage = new HomePage();
        WorkspacePage workspacePage = homePage.WorkspacePage();
        workspacePage.Create_Workspace(Name, new_Email, Notes);
        workspacePage.Create_button(Password);
        assertEquals("Workspace created successfully.", getDriver().findElement(By.cssSelector("div.textoFull > span")).getText());
        wait_sec();
        homePage.WorkspacePage();
        workspacePage.delete_mupltiple_Folder();
        homePage.WorkspacePage();
        workspacePage.Delete_workspace();


    }

//    @Test
//    public void U_Delete_workspace() throws InterruptedException, AWTException {
//
//        goHome();
//
//
//        StartPage startPage = new StartPage();
//        String Email = startPage.getProperty("email.forwork");
//        String Password = startPage.getProperty("password.forwork");
//        startPage.Login(Email, Password);
//        startPage.finishLogin();
//        HomePage homePage = new HomePage();
//        WorkspacePage workspacePage = homePage.WorkspacePage();
//        workspacePage.Delete_workspace();
//
//    }

}

