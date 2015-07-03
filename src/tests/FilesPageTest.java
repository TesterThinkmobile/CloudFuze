package tests;


import methods.FilesPage;
import methods.HomePage;
import methods.StartPage;
import methods.WorkspacePage;
import org.testng.annotations.Test;

public class FilesPageTest extends BaseTest {


    Long date = System.currentTimeMillis();
    String value = String.valueOf(date);

    @Test
    public void Open_file() throws InterruptedException {

        goHome();

        String Message = value + "test";
        String Name = value;
        String CategoryName = "TestFiles";
        String ShareEmail = value + "@yopmail.com";

        StartPage startPage = new StartPage();
        String Email = startPage.getProperty("email.forwork");
        String Password = startPage.getProperty("password.forwork");
        startPage.Login(Email, Password);
        startPage.finishLogin();
        HomePage homePage = new HomePage();
        FilesPage filesPage = homePage.FilesPage();
        //filesPage.Open_File();
        //filesPage.Download_File();
        filesPage.Share_File(ShareEmail,Message);
        //filesPage.Rename_File(Name);
        //filesPage.Chose_Category_File(CategoryName);
        //filesPage.Workspace_File();
        //filesPage.Delete_File();
        //filesPage.Add_Favorites_File();

    }



}
