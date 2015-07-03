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
    public void Create_workspace() throws InterruptedException {

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
    }

    @Test
    public void Create_workspace_empty() throws InterruptedException {

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
    public void Create_workspace_with_adnvaced_settings() throws InterruptedException {

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

    }
    @Test
    public void Create_workspace_Inside_workspace() throws InterruptedException {

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
        workspacePage.create_workspace_inside_workspace(Name, new_Email, Notes);
        workspacePage.Create_button(Password);

        assertEquals("Workspace created successfully.", getDriver().findElement(By.cssSelector("div.textoFull > span")).getText());

    }

    @Test
    public void Edit_workspace() throws InterruptedException {

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
        workspacePage.Edit_workspace(Name, new_Email, Notes);

    }

    @Test
    public void Operation_workspace() throws InterruptedException, AWTException {

        goHome();

        String Name = value + "name";


        StartPage startPage = new StartPage();
        String Email = startPage.getProperty("email.forwork");
        String Password = startPage.getProperty("password.forwork");
        String downloadPath = startPage.getProperty("downloadPath");
        startPage.Login(Email, Password);
        startPage.finishLogin();
        HomePage homePage = new HomePage();
        WorkspacePage workspacePage = homePage.WorkspacePage();
        workspacePage.Open_workspace(Password);
        ///////////////////////////////////////
        homePage.WorkspacePage();
        workspacePage.Rename_workspace(Name);
        /////////////////////////////////////
        homePage.WorkspacePage();
        workspacePage.Delete_workspace();
        ///////////////////////////////////////

        workspacePage.Open_file_workspace();
        homePage.WorkspacePage();
        workspacePage.download_file_workspace(downloadPath);
        homePage.WorkspacePage();
        workspacePage.rename_file_workspace(Name);
        homePage.WorkspacePage();
        workspacePage.delete_file();


    }
    @Test
    public void Check_button_workspace() throws InterruptedException, AWTException {

        goHome();

        StartPage startPage = new StartPage();
        String Email = startPage.getProperty("email.forwork");
        String Password = startPage.getProperty("password.forwork");
        startPage.Login(Email, Password);
        startPage.finishLogin();
        HomePage homePage = new HomePage();
        WorkspacePage workspacePage = homePage.WorkspacePage();
        workspacePage.buttons_displayed();
        homePage.WorkspacePage();
        workspacePage.button_delete_displayed();


    }


    @Test
    public void Check_file_in_workspace() throws InterruptedException, AWTException {

        goHome();

        StartPage startPage = new StartPage();
        String Email = startPage.getProperty("email.forwork");
        String Password = startPage.getProperty("password.forwork");
        startPage.Login(Email, Password);
        startPage.finishLogin();
        HomePage homePage = new HomePage();
        WorkspacePage workspacePage = homePage.WorkspacePage();
        workspacePage.Add_file_to_workspace();

    }

    @Test
    public void Comment_file_in_workspace() throws InterruptedException, AWTException {

        goHome();

        StartPage startPage = new StartPage();
        String Email = startPage.getProperty("email.forwork");
        String Password = startPage.getProperty("password.forwork");
        startPage.Login(Email, Password);
        startPage.finishLogin();
        HomePage homePage = new HomePage();
        WorkspacePage workspacePage = homePage.WorkspacePage();
        workspacePage.Add_comments_to_workspace();
        homePage.WorkspacePage();
        workspacePage.Edit_comments_to_workspace();
        homePage.WorkspacePage();
        workspacePage.Delete_comments_to_workspace();

    }

    @Test
    public void upload_file() throws InterruptedException, AWTException {

        goHome();

        String Name = value + "name";


        StartPage startPage = new StartPage();
        String Email = startPage.getProperty("email.forwork");
        String Password = startPage.getProperty("password.forwork");

        startPage.Login(Email, Password);
        startPage.finishLogin();
        HomePage homePage = new HomePage();
        WorkspacePage workspacePage = homePage.WorkspacePage();
        //workspacePage.Upload_file();
        workspacePage.Upload_file_to_directory();
    }

    @Test
    public void download_file() throws InterruptedException, AWTException {

        goHome();

        String Name = value + "name";


        StartPage startPage = new StartPage();
        String Email = startPage.getProperty("email.forwork");
        String Password = startPage.getProperty("password.forwork");
        String downloadPath = startPage.getProperty("downloadPath");
        startPage.Login(Email, Password);
        startPage.finishLogin();
        HomePage homePage = new HomePage();
        WorkspacePage workspacePage = homePage.WorkspacePage();
        workspacePage.download_file_workspace(downloadPath);

    }

    @Test
    public void Operation_file_workspace() throws InterruptedException, AWTException {

        goHome();

        String Name = value + "name";


        StartPage startPage = new StartPage();
        String Email = startPage.getProperty("email.forwork");
        String Password = startPage.getProperty("password.forwork");
        startPage.Login(Email, Password);
        startPage.finishLogin();
        HomePage homePage = new HomePage();
        WorkspacePage workspacePage = homePage.WorkspacePage();
        workspacePage.Open_file_workspace();
        homePage.WorkspacePage();
        workspacePage.rename_file_workspace(Name);
        homePage.WorkspacePage();
        workspacePage.delete_file();

    }

    @Test
    public void Multi_Delete_file_workspace() throws InterruptedException, AWTException {

        goHome();


        StartPage startPage = new StartPage();
        String Email = startPage.getProperty("email.forwork");
        String Password = startPage.getProperty("password.forwork");
        startPage.Login(Email, Password);
        startPage.finishLogin();
        HomePage homePage = new HomePage();
        WorkspacePage workspacePage = homePage.WorkspacePage();
        workspacePage.delete_multiple_file();

    }

    @Test
    public void Delete_fileInFolder_workspace() throws InterruptedException, AWTException {

        goHome();


        StartPage startPage = new StartPage();
        String Email = startPage.getProperty("email.forwork");
        String Password = startPage.getProperty("password.forwork");
        startPage.Login(Email, Password);
        startPage.finishLogin();
        HomePage homePage = new HomePage();
        WorkspacePage workspacePage = homePage.WorkspacePage();
        workspacePage.delete_file_inFolder();

    }

    @Test
    public void Delete_multipleFileInFolder_workspace() throws InterruptedException, AWTException {

        goHome();


        StartPage startPage = new StartPage();
        String Email = startPage.getProperty("email.forwork");
        String Password = startPage.getProperty("password.forwork");
        startPage.Login(Email, Password);
        startPage.finishLogin();
        HomePage homePage = new HomePage();
        WorkspacePage workspacePage = homePage.WorkspacePage();
        workspacePage.multiple_delete_files_inFolder();

    }
    @Test
    public void Delete_multipleFolder_workspace() throws InterruptedException, AWTException {

        goHome();


        StartPage startPage = new StartPage();
        String Email = startPage.getProperty("email.forwork");
        String Password = startPage.getProperty("password.forwork");
        startPage.Login(Email, Password);
        startPage.finishLogin();
        HomePage homePage = new HomePage();
        WorkspacePage workspacePage = homePage.WorkspacePage();
        workspacePage.delete_mupltiple_Folder();

    }

}

