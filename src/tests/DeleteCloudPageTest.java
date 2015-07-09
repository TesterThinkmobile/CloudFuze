package tests;


import methods.*;
import org.testng.annotations.Test;

public class DeleteCloudPageTest extends BaseTest {


    @Test
    public void A__Delete_all_clouds() throws InterruptedException {

        goHome();


        StartPage startPage = new StartPage();
        String Email = startPage.getProperty("email.forwork");
        String Password = startPage.getProperty("password.forwork");
        startPage.Login(Email,Password);
        startPage.finishLogin();
        HomePage homePage = new HomePage();
        DeleteCloudPage deleteCloudPage = homePage.DeleteCloudPage();
        deleteCloudPage.Delete_all_Clouds();




    }
}
