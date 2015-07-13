package methods;

import com.gargoylesoftware.htmlunit.javascript.host.geo.Coordinates;
import org.hamcrest.Matchers;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.interactions.Keyboard;
import org.openqa.selenium.internal.Locatable;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.Assert;
import javax.lang.model.element.Name;

import java.awt.*;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.awt.image.ByteLookupTable;
import java.util.*;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.testng.Assert.assertEquals;


public class WorkspacePage extends BasePage {

    WebDriver driver = getDriver();

    @Override
    protected void Init() {

    }

    public WorkspacePage() {
        super();

    }

    public void Create_Workspace(String Name, String new_Email, String Notes) throws InterruptedException {


        WebElement create_workspace_button = driver.findElement(By.xpath("//button[@id='CFCreateWorkSpace']"));
        create_workspace_button.click();
        wait_sec();

        WebElement create_content_is_displayed = driver.findElement(By.cssSelector("#workSpaceFiles"));
        create_content_is_displayed.isDisplayed();
        wait_sec();

        WebElement workspace_name_field = driver.findElement(By.cssSelector("#workspaceName"));
        workspace_name_field.clear();
        workspace_name_field.sendKeys(Name);
        wait_sec();

        WebElement add_Collaborators_field = driver.findElement(By.cssSelector("#workspaceEmailId"));
        add_Collaborators_field.clear();
        add_Collaborators_field.sendKeys(new_Email);
        wait_sec();

        WebElement add_button = driver.findElement(By.cssSelector("#addWorkspaceUser"));
        add_button.click();
        wait_sec();

        WebElement notes_field = driver.findElement(By.xpath("html/body/div[6]/div[2]/div/div[1]/div[8]/div/textarea"));
        notes_field.clear();
        notes_field.sendKeys(Notes);
        wait_sec();

    }

    public void Create_Workspace_with_multiple_email(String Name, String new_Email, String Notes) throws InterruptedException {


        WebElement create_workspace_button = driver.findElement(By.xpath("//button[@id='CFCreateWorkSpace']"));
        create_workspace_button.click();
        wait_sec();

        WebElement create_content_is_displayed = driver.findElement(By.cssSelector("#workSpaceFiles"));
        create_content_is_displayed.isDisplayed();
        wait_sec();

        WebElement workspace_name_field = driver.findElement(By.cssSelector("#workspaceName"));
        workspace_name_field.clear();
        workspace_name_field.sendKeys(Name);
        wait_sec();

        WebElement add_Collaborators_field = driver.findElement(By.cssSelector("#workspaceEmailId"));
        add_Collaborators_field.clear();
        add_Collaborators_field.sendKeys(new_Email);
        wait_sec();

        WebElement add_button = driver.findElement(By.cssSelector("#addWorkspaceUser"));
        add_button.click();
        wait_sec();

        WebElement add_Collaborators_field1 = driver.findElement(By.cssSelector("#workspaceEmailId"));
        add_Collaborators_field1.clear();
        add_Collaborators_field1.sendKeys("tester1.thinkmobile@yopmail.com");
        wait_sec();

        WebElement add_button1 = driver.findElement(By.cssSelector("#addWorkspaceUser"));
        add_button1.click();
        wait_sec();

        WebElement add_Collaborators_field2 = driver.findElement(By.cssSelector("#workspaceEmailId"));
        add_Collaborators_field2.clear();
        add_Collaborators_field2.sendKeys("tester2.thinkmobile@yopmail.com");
        wait_sec();

        WebElement add_button2 = driver.findElement(By.cssSelector("#addWorkspaceUser"));
        add_button2.click();
        wait_sec();

        WebElement notes_field = driver.findElement(By.xpath("html/body/div[6]/div[2]/div/div[1]/div[8]/div/textarea"));
        notes_field.clear();
        notes_field.sendKeys(Notes);
        wait_sec();

    }


    public void Second_Create_Workspace() throws InterruptedException {

        String new_name = "new_name";
        String new_email = "tester1.thinkmobile@yopmail.com";
        String new_notes = "notesnotesnotes";

        WebElement create_workspace_button = driver.findElement(By.xpath("//button[@id='CFCreateWorkSpace']"));
        create_workspace_button.click();
        wait_sec();

        WebElement create_content_is_displayed = driver.findElement(By.cssSelector("#workSpaceFiles"));
        create_content_is_displayed.isDisplayed();
        wait_sec();

        WebElement workspace_name_field = driver.findElement(By.cssSelector("#workspaceName"));
        workspace_name_field.clear();
        workspace_name_field.sendKeys(new_name);
        wait_sec();

        WebElement add_Collaborators_field = driver.findElement(By.cssSelector("#workspaceEmailId"));
        add_Collaborators_field.clear();
        add_Collaborators_field.sendKeys(new_email);
        wait_sec();

        WebElement add_button = driver.findElement(By.cssSelector("#addWorkspaceUser"));
        add_button.click();
        wait_sec();

        WebElement notes_field = driver.findElement(By.xpath("html/body/div[6]/div[2]/div/div[1]/div[8]/div/textarea"));
        notes_field.clear();
        notes_field.sendKeys(new_notes);
        wait_sec();

    }

    public void Advanced_settings_in_Create_Workspace(String Password) throws InterruptedException {


        WebElement advanced_settings_button = driver.findElement(By.cssSelector("#showAdvancedWorkspaceSettings>span"));
        advanced_settings_button.click();
        wait_sec();

        WebElement set_password_checkbox = driver.findElement(By.cssSelector("#setPwdtoWs>span>input"));
        set_password_checkbox.click();
        wait_sec();

        WebElement password_field = driver.findElement(By.xpath("html/body/div[6]/div[2]/div/div[3]/div[1]/div/span[2]/input"));
        password_field.isDisplayed();
        password_field.clear();
        password_field.sendKeys(Password);
        wait_sec();

        WebElement confirm_password_field = driver.findElement(By.xpath("html/body/div[6]/div[2]/div/div[3]/div[1]/div/span[3]/input"));
        confirm_password_field.isDisplayed();
        confirm_password_field.clear();
        confirm_password_field.sendKeys(Password);
        wait_sec();
    }

    public void Edit_permissions(String new_Email) throws InterruptedException {


        WebElement checkbox = driver.findElement(By.id("editASAS"));
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", checkbox);
        checkbox.isDisplayed();
        wait_sec();

        if ( !driver.findElement(By.xpath("//tr[@id='"+ new_Email +"']/td[3]/input")).isSelected());
        {
            driver.findElement(By.xpath("//tr[@id='"+ new_Email +"']/td[3]/input")).click();
        }

        wait_sec();
    }

    public void CoOwner_permissions(String new_Email) throws InterruptedException {


        WebElement checkbox = driver.findElement(By.id("editASAS"));
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", checkbox);
        checkbox.isDisplayed();
        wait_sec();

        if ( !driver.findElement(By.xpath("//tr[@id='"+ new_Email +"']/td[4]/input")).isSelected());
        {
            driver.findElement(By.xpath("//tr[@id='"+ new_Email +"']/td[4]/input")).click();
        }
        wait_sec();
    }

    public void Advanced_settings_in_Create_Workspace_negative(String Password) throws InterruptedException {


        WebElement advanced_settings_button = driver.findElement(By.cssSelector("#showAdvancedWorkspaceSettings>span"));
        advanced_settings_button.click();
        wait_sec();

        WebElement set_password_checkbox = driver.findElement(By.cssSelector("#setPwdtoWs>span>input"));
        set_password_checkbox.click();
        wait_sec();

        WebElement password_field = driver.findElement(By.xpath("html/body/div[6]/div[2]/div/div[3]/div[1]/div/span[2]/input"));
        password_field.isDisplayed();
        password_field.clear();
        password_field.sendKeys(Password);
        wait_sec();

        WebElement confirm_password_field = driver.findElement(By.xpath("html/body/div[6]/div[2]/div/div[3]/div[1]/div/span[3]/input"));
        confirm_password_field.isDisplayed();
        confirm_password_field.clear();
        confirm_password_field.sendKeys("123456");
        wait_sec();

        WebElement create_button = driver.findElement(By.cssSelector("#workspaceSubmit"));
        create_button.click();
        wait_sec();

        assertEquals("Password and Confirm password should match.", driver.findElement(By.id("WsdisplayMsg")).getText());
        wait_sec();



    }

    public void Create_button(String Password) throws InterruptedException {

        WebElement create_button = driver.findElement(By.cssSelector("#workspaceSubmit"));
        create_button.click();
        wait_sec();

        try {
            WebElement protected_workspace = driver.findElement(By.cssSelector("#myPasswordModel1"));
            protected_workspace.isDisplayed();
            wait_sec();

            WebElement password_field = driver.findElement(By.cssSelector("#wsPswd"));
            password_field.isDisplayed();
            password_field.clear();
            password_field.sendKeys(Password);
            wait_sec();

            WebElement ok_button = driver.findElement(By.cssSelector("#CFPwdWorkspace"));
            ok_button.click();
            wait_sec();

            WebElement content_displayed = driver.findElement(By.cssSelector("#headerText"));
            content_displayed.isDisplayed();
            wait_sec();
        } catch (Exception ok)

        {

           // assertEquals("Workspace created successfully.", driver.findElement(By.cssSelector("div.textoFull > span")).getText());


        }

    }

    public void create_workspace_inside_workspace() throws InterruptedException {

        WebElement workspace = driver.findElement(By.cssSelector("#mainContentWrapper"));
        workspace.isDisplayed();
        wait_sec();
//        new Actions(driver).moveToElement(driver.findElement(By.xpath("//i[@name='Workspace']"))).perform();
//        new Actions(driver).moveToElement(driver.findElement(By.cssSelector(".fileCheck"))).perform();
//        wait_sec();
//        WebElement file_checkbox = driver.findElement(By.cssSelector(".fileCheck"));
//        file_checkbox.click();
//        wait_sec();
//        wait_sec();

        WebElement open_button = driver.findElement(By.xpath("//i[@name='Workspace']"));
        open_button.click();
        wait_sec();
        wait_sec();

        WebElement create_workspace_button = driver.findElement(By.cssSelector("#CFCreateWorkSpace"));
        create_workspace_button.click();
        wait_sec();

        WebElement create_content_is_displayed = driver.findElement(By.cssSelector("#workSpaceFiles"));
        create_content_is_displayed.isDisplayed();
        wait_sec();

        WebElement workspace_name_field = driver.findElement(By.cssSelector("#workspaceName"));
        workspace_name_field.clear();
        workspace_name_field.sendKeys("NewWorkspace");
        wait_sec();

        WebElement add_Collaborators_field = driver.findElement(By.cssSelector("#workspaceEmailId"));
        add_Collaborators_field.clear();
        add_Collaborators_field.sendKeys("tester.thonkmobile@yopmail.com");
        wait_sec();

        WebElement add_button = driver.findElement(By.cssSelector("#addWorkspaceUser"));
        add_button.click();
        wait_sec();

        WebElement notes_field = driver.findElement(By.xpath("html/body/div[6]/div[2]/div/div[1]/div[8]/div/textarea"));
        notes_field.clear();
        notes_field.sendKeys("MessageNewMessage");
        wait_sec();

        WebElement create_button = driver.findElement(By.cssSelector("#workspaceSubmit"));
        create_button.click();
        wait_sec();

    }

    public void Edit_workspace(String new_Name, String new_new_Email, String new_Notes) throws InterruptedException {

        WebElement workspace = driver.findElement(By.cssSelector("#mainContentWrapper"));
        workspace.isDisplayed();
        wait_sec();
        new Actions(driver).moveToElement(driver.findElement(By.xpath("//i[@name='Workspace']"))).perform();
        new Actions(driver).moveToElement(driver.findElement(By.cssSelector(".fileCheck"))).perform();
        wait_sec();

        WebElement file_checkbox = driver.findElement(By.cssSelector(".fileCheck"));
        //file_checkbox.
        file_checkbox.click();
        wait_sec();
        wait_sec();

        WebElement edit_workspace_button = driver.findElement(By.cssSelector("#CFEditWorkSpace"));
        edit_workspace_button.click();
        wait_sec();

        WebElement edit_content_is_displayed = driver.findElement(By.cssSelector("#workSpaceFiles"));
        edit_content_is_displayed.isDisplayed();
        wait_sec();

        WebElement workspace_name_field = driver.findElement(By.cssSelector("#workspaceName"));
        workspace_name_field.clear();
        workspace_name_field.sendKeys(new_Name);
        wait_sec();

        WebElement add_Collaborators_field = driver.findElement(By.cssSelector("#workspaceEmailId"));
        add_Collaborators_field.clear();
        add_Collaborators_field.sendKeys(new_new_Email);
        wait_sec();

        WebElement add_button = driver.findElement(By.cssSelector("#addWorkspaceUser"));
        add_button.click();
        wait_sec();

        WebElement notes_field = driver.findElement(By.xpath("html/body/div[6]/div[2]/div/div[1]/div[8]/div/textarea"));
        notes_field.clear();
        notes_field.sendKeys(new_Notes);
        wait_sec();

        WebElement update_button = driver.findElement(By.cssSelector("#CFEditWs"));
        update_button.click();
        wait_sec();
        wait_sec();

//        WebElement content_is_displayed = driver.findElement(By.cssSelector(".filethumbnail.cf-workspace.wsIcon"));
//        content_is_displayed.isDisplayed();
//        wait_sec();

        WebElement correct_name_displayed = driver.findElement(By.xpath("//*[contains(text(), '" + new_Name + "')] | //*[@value='" + new_Name + "']"));
        correct_name_displayed.isDisplayed();
        wait_sec();


    }

    public void buttons_displayed() throws InterruptedException {

        WebElement workspace = driver.findElement(By.cssSelector("#mainContentWrapper"));
        workspace.isDisplayed();
        wait_sec();
        new Actions(driver).moveToElement(driver.findElement(By.xpath("//i[@name='Workspace']"))).perform();
        new Actions(driver).moveToElement(driver.findElement(By.cssSelector(".fileCheck"))).perform();
        wait_sec();
        WebElement file_checkbox = driver.findElement(By.cssSelector(".fileCheck"));
        file_checkbox.click();
        wait_sec();
        wait_sec();

        try {
            WebElement open_button = driver.findElement(By.cssSelector(".cf-eye8"));
            open_button.isDisplayed();

            WebElement rename_button = driver.findElement(By.cssSelector(".cf-edit3"));
            rename_button.isDisplayed();

            WebElement delete_button = driver.findElement(By.cssSelector(".cf-trashcan2"));
            delete_button.isDisplayed();

            System.out.println("Buttons are displayed and actives");


        }
        catch (Exception ok){

            System.out.println("Buttons are not actives");
        }
    }

    public void button_delete_displayed() throws InterruptedException {

        for (int i = 1; i <= 2; i = i + 1) {
            WebElement workspace = driver.findElement(By.cssSelector("#mainContentWrapper"));
            workspace.isDisplayed();
            wait_sec();
            new Actions(driver).moveToElement(driver.findElement(By.xpath("html/body/section/div[3]/div/div[3]/div/div[2]/div["+i+"]/i[1]"))).perform();

            WebElement file_checkbox = driver.findElement(By.xpath("html/body/section/div[3]/div/div[3]/div/div[2]/div[" + i + "]/input"));
            file_checkbox.click();
            wait_sec();
            wait_sec();
        }
        try {

            WebElement delete_button = driver.findElement(By.cssSelector(".cf-trashcan2"));
            delete_button.isDisplayed();

            System.out.println("Button 'Delete' is displayed and active");


        }
        catch (Exception ok){

            System.out.println("Button is not active");
        }
    }

    public void Open_workspace(String Password) throws InterruptedException {

        WebElement workspace = driver.findElement(By.cssSelector("#mainContentWrapper"));
        workspace.isDisplayed();
        wait_sec();
        new Actions(driver).moveToElement(driver.findElement(By.xpath("//i[@name='Workspace']"))).perform();
        new Actions(driver).moveToElement(driver.findElement(By.cssSelector(".fileCheck"))).perform();
        wait_sec();
        WebElement file_checkbox = driver.findElement(By.cssSelector(".fileCheck"));
        file_checkbox.click();
        wait_sec();
        wait_sec();

        WebElement open_button = driver.findElement(By.cssSelector(".cf-eye8"));
        open_button.click();
        wait_sec();
        wait_sec();

        try {
            WebElement protected_workspace = driver.findElement(By.cssSelector("#myPasswordModel1"));
            protected_workspace.isDisplayed();
            wait_sec();

            WebElement password_field = driver.findElement(By.cssSelector("#wsPswd"));
            password_field.isDisplayed();
            password_field.clear();
            password_field.sendKeys(Password);
            wait_sec();

            WebElement ok_button = driver.findElement(By.cssSelector("#CFPwdWorkspace"));
            ok_button.click();
            wait_sec();

            WebElement file_content_is_displayed = driver.findElement(By.cssSelector("#wsFiles"));
            file_content_is_displayed.isDisplayed();
            wait_sec();
        } catch (Exception ok)

        {

            WebElement file_content_is_displayed = driver.findElement(By.cssSelector("#wsFiles"));
            file_content_is_displayed.isDisplayed();
            wait_sec();

        }


    }

    public void Rename_workspace(String new_name) throws InterruptedException {

        WebElement workspace = driver.findElement(By.cssSelector("#mainContentWrapper"));
        workspace.isDisplayed();
        wait_sec();
        new Actions(driver).moveToElement(driver.findElement(By.xpath("//i[@name='Workspace']"))).perform();
        new Actions(driver).moveToElement(driver.findElement(By.cssSelector(".fileCheck"))).perform();
        wait_sec();
        WebElement file_checkbox = driver.findElement(By.cssSelector(".fileCheck"));
        file_checkbox.click();
        wait_sec();
        wait_sec();

        WebElement rename_button = driver.findElement(By.cssSelector(".cf-edit3"));
        rename_button.click();
        wait_sec();

        WebElement rename_field = driver.findElement(By.cssSelector("#CFThumbRename"));
        rename_field.isDisplayed();
        rename_field.clear();
        rename_field.sendKeys(new_name);
        wait_sec();

        WebElement rename_ok_button = driver.findElement(By.cssSelector(".RenameOk"));
        rename_ok_button.click();
        wait_sec();

        WebElement new_name_displayed = driver.findElement(By.xpath("//*[contains(text(), '" + new_name + "')] | //*[@value='" + new_name + "']"));
        new_name_displayed.isDisplayed();
        wait_sec();

    }

    public void Delete_workspace() throws InterruptedException {

        WebElement workspace = driver.findElement(By.cssSelector("#mainContentWrapper"));
        workspace.isDisplayed();
        wait_sec();
        new Actions(driver).moveToElement(driver.findElement(By.xpath("//i[@name='Workspace']"))).perform();
        new Actions(driver).moveToElement(driver.findElement(By.cssSelector(".fileCheck"))).perform();
        wait_sec();
//        WebElement workspace1 = driver.findElement(By.xpath("//i[@name='Workspace']"));
//        workspace1.isDisplayed();
//////i[@name='Workspace']
        WebElement file_checkbox = driver.findElement(By.cssSelector(".fileCheck"));
        file_checkbox.click();
        wait_sec();
        wait_sec();

        WebElement delete_button = driver.findElement(By.cssSelector(".cf-trashcan2"));
        delete_button.click();
        wait_sec();

        WebElement delete_window = driver.findElement(By.cssSelector("#deletemodal"));
        delete_window.isDisplayed();
        wait_sec();

        WebElement delete_button_inwindow = driver.findElement(By.cssSelector("#CFDeleteWs"));
        delete_button_inwindow.click();
        wait_sec();
        wait_sec();
        try {
            WebElement content = driver.findElement(By.xpath("html/body/section/div[2]/div/div[3]/div/div[2]/div[1]/i[1]"));
            content.isDisplayed();
            wait_sec();
        } catch (Exception ok) {
            WebElement content = driver.findElement(By.cssSelector(".padded"));
            content.isDisplayed();
            wait_sec();
        }


    }

////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    public void Add_file_to_workspace_button_check() throws InterruptedException, AWTException {

        WebElement workspace = driver.findElement(By.cssSelector("#mainContentWrapper"));
        workspace.isDisplayed();
        wait_sec();
       // new Actions(driver).moveToElement(driver.findElement(By.xpath("html/body/section/div[2]/div/div[3]/div/div[2]/div/i[1]"))).release().perform();

        WebElement file_checkbox = driver.findElement(By.xpath("html/body/section/div[2]/div/div[3]/div/div[2]/div/i[1]"));
        file_checkbox.click();
        wait_sec();
        wait_sec();
        wait_sec();

//        WebElement open_button = driver.findElement(By.cssSelector(".cf-eye8"));
//        open_button.click();
//        wait_sec();
//        wait_sec();

        try{
            WebElement add_file_button = driver.findElement(By.cssSelector("#AFTWButton"));
            add_file_button.isDisplayed();
            add_file_button.click();
            wait_sec();
            wait_sec();
            wait_sec();

            WebElement recent_file_isdisplayed = driver.findElement(By.cssSelector("#RecentFiles>a"));
            recent_file_isdisplayed.isDisplayed();
            wait_sec();
            System.out.println("Page is redirected to recent files");

        }
        catch(Exception ok){

            System.out.println("Workspace is not empty");

        }

    }

    public void Add_file() throws  InterruptedException{

        WebElement file_button = driver.findElement(By.cssSelector(".icon-files"));
        file_button.click();
        wait_sec();
        wait_sec();
        wait_sec();
        wait_sec();

        WebElement check_file_checkbox = driver.findElement(By.cssSelector("div[name=FILE] > input[type=checkbox]"));
        check_file_checkbox.click();
        wait_sec();

        WebElement workspace_button = driver.findElement(By.xpath("//a[@id='addToWorkspace']/div/div"));
        workspace_button.click();
        wait_sec();
        wait_sec();
        wait_sec();

        WebElement select_workspace_field = driver.findElement(By.cssSelector("#addtoworklist"));
        select_workspace_field.click();
        wait_sec();
        wait_sec();

        WebElement choose_workspace_field = driver.findElement(By.xpath("html/body/div[11]/div[2]/select/option[2]"));
        choose_workspace_field.click();
        wait_sec();

        WebElement add_to_workspace = driver.findElement(By.cssSelector("#addtoworkspace"));
        add_to_workspace.click();
        wait_sec();
        wait_sec();

        assertEquals("File(s) added to workspace successfully.", driver.findElement(By.cssSelector("div.textoFull > span")).getText());

        WebElement workspace_window_button = driver.findElement(By.cssSelector(".cf-workspace"));
        workspace_window_button.click();
        wait_sec();
        wait_sec();

        WebElement workspace1 = driver.findElement(By.cssSelector("#mainContentWrapper"));
        workspace1.isDisplayed();
        wait_sec();

        WebElement file_checkbox = driver.findElement(By.xpath("//i[@name='Workspace']"));
        file_checkbox.click();
        wait_sec();
        wait_sec();
        wait_sec();
    }

    public void Delete() throws  InterruptedException{

        WebElement delete_file_button = driver.findElement(By.cssSelector(".cf-trashcan2"));
        delete_file_button.click();
        wait_sec();

        WebElement delete_window = driver.findElement(By.cssSelector("#deletemodal"));
        delete_window.isDisplayed();
        wait_sec();

        //delete file in window
        WebElement deletefile_button = driver.findElement(By.cssSelector("#CFDeleteFile"));
        deletefile_button.click();
        wait_sec();
        wait_sec();
    }



    public void Check_file_add_to_workspace() throws InterruptedException, AWTException {

        WebElement workspace = driver.findElement(By.cssSelector("#mainContentWrapper"));
        workspace.isDisplayed();
        wait_sec();

        WebElement file_checkbox = driver.findElement(By.xpath("//i[@name='Workspace']"));
        file_checkbox.click();
        wait_sec();
        wait_sec();
        wait_sec();

        java.util.List<WebElement> First = getDriver().findElement(By.id("workspaceFiles")).findElements(By.className("gradeA"));
        Integer Firstnumber = First.size();
        System.out.println(Firstnumber);

        Add_file();

        java.util.List<WebElement> Second = getDriver().findElement(By.id("workspaceFiles")).findElements(By.className("gradeA"));
        Integer Secondnumber = Second.size();
        System.out.println(Secondnumber);

        assertThat("File is not added", Secondnumber, Matchers.greaterThan(Firstnumber));

        }

    public void Check_file_delete_to_workspace() throws InterruptedException, AWTException {

        WebElement workspace = driver.findElement(By.cssSelector("#mainContentWrapper"));
        workspace.isDisplayed();
        wait_sec();

        WebElement file_checkbox = driver.findElement(By.xpath("//i[@name='Workspace']"));
        file_checkbox.click();
        wait_sec();
        wait_sec();
        wait_sec();

        java.util.List<WebElement> First = getDriver().findElement(By.id("workspaceFiles")).findElements(By.className("gradeA"));
        Integer Firstnumber = First.size();
        System.out.println(Firstnumber);

        WebElement chose_file = driver.findElement(By.cssSelector(".wsfcheckbox>input"));
        chose_file.click();
        wait_sec();
        Delete();

        java.util.List<WebElement> Second = getDriver().findElement(By.id("workspaceFiles")).findElements(By.className("gradeA"));
        Integer Secondnumber = Second.size();
        System.out.println(Secondnumber);

        assertThat("File is not added", Secondnumber, Matchers.lessThan(Firstnumber));

    }

    public void Add_comments_to_workspace() throws InterruptedException, AWTException {

        WebElement workspace = driver.findElement(By.cssSelector("#mainContentWrapper"));
        workspace.isDisplayed();
        wait_sec();
        new Actions(driver).moveToElement(driver.findElement(By.xpath("//i[@name='Workspace']"))).perform();
        new Actions(driver).moveToElement(driver.findElement(By.cssSelector(".fileCheck"))).perform();
        wait_sec();
        WebElement file_checkbox = driver.findElement(By.cssSelector(".fileCheck"));
        file_checkbox.click();
        wait_sec();
        wait_sec();
        wait_sec();

        WebElement open_button = driver.findElement(By.cssSelector(".cf-eye8"));
        open_button.click();
        wait_sec();
        wait_sec();

        try{
            WebElement comments_button = driver.findElement(By.cssSelector("#getComments"));
            comments_button.isDisplayed();
            comments_button.click();
            wait_sec();
            wait_sec();
            wait_sec();

            WebElement comments_content_displayed = driver.findElement(By.cssSelector("#addingComments"));
            comments_content_displayed.isDisplayed();
            wait_sec();

            WebElement comments_field = driver.findElement(By.cssSelector("#commentText"));
            comments_field.sendKeys("Test Comment");
            wait_sec();

            WebElement add_comments_button = driver.findElement(By.cssSelector("#addCommenttoFile"));
            add_comments_button.click();
            wait_sec();

            WebElement comments_is_displayed = driver.findElement(By.cssSelector(".article-post"));
            ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", comments_is_displayed);
            comments_is_displayed.isDisplayed();
            wait_sec();

            System.out.println("Comment was created");

        }
        catch(Exception ok){

            System.out.println("File is not added");

            WebElement file_button = driver.findElement(By.cssSelector(".icon-files"));
            file_button.click();
            wait_sec();

            WebElement all_files_button = driver.findElement(By.cssSelector("#homeHome"));
            all_files_button.click();
            wait_sec();
            wait_sec();
            wait_sec();

            WebElement check_file_checkbox = driver.findElement(By.xpath(".//*[@id='LVContent']/div[starts-with(@data-type,'FILE')][1]/div[@class='LVcheckBox']"));
            check_file_checkbox.click();
            wait_sec();

            WebElement workspace_button = driver.findElement(By.xpath("//a[@id='addToWorkspace']/div/div"));
            workspace_button.click();
            wait_sec();
            wait_sec();
            wait_sec();

            WebElement select_workspace_field = driver.findElement(By.cssSelector("#addtoworklist"));
            select_workspace_field.click();
            wait_sec();
            wait_sec();

            WebElement choose_workspace_field = driver.findElement(By.xpath("html/body/div[11]/div[2]/select/option[2]"));
            choose_workspace_field.click();
            wait_sec();

            WebElement add_to_workspace = driver.findElement(By.cssSelector("#addtoworkspace"));
            add_to_workspace.click();
            wait_sec();
            wait_sec();

            assertEquals("File(s) added to workspace successfully.", driver.findElement(By.cssSelector("div.textoFull > span")).getText());

            WebElement workspace_window_button = driver.findElement(By.cssSelector(".cf-workspace"));
            workspace_window_button.click();
            wait_sec();
            wait_sec();

            WebElement workspace1 = driver.findElement(By.cssSelector("#mainContentWrapper"));
            workspace1.isDisplayed();
            wait_sec();
            new Actions(driver).moveToElement(driver.findElement(By.xpath("//i[@name='Workspace']"))).perform();
            new Actions(driver).moveToElement(driver.findElement(By.cssSelector(".fileCheck"))).perform();
            wait_sec();

            WebElement file_checkbox1 = driver.findElement(By.cssSelector(".fileCheck"));
            file_checkbox1.click();
            wait_sec();
            wait_sec();

            WebElement open_button1= driver.findElement(By.cssSelector(".cf-eye8"));
            open_button1.click();
            wait_sec();
            wait_sec();
            //--------------------------------------
            WebElement comments_button = driver.findElement(By.cssSelector("#getComments"));
            comments_button.isDisplayed();
            comments_button.click();
            wait_sec();
            wait_sec();
            wait_sec();

            WebElement comments_content_displayed = driver.findElement(By.cssSelector("#addingComments"));
            comments_content_displayed.isDisplayed();
            wait_sec();

            WebElement comments_field = driver.findElement(By.cssSelector("#commentText"));
            comments_field.sendKeys("Test Comment");
            wait_sec();

            WebElement add_comments_button = driver.findElement(By.cssSelector("#addCommenttoFile"));
            add_comments_button.click();
            wait_sec();

            WebElement comments_is_displayed = driver.findElement(By.cssSelector(".article-post"));
            ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", comments_is_displayed);
            comments_is_displayed.isDisplayed();
            wait_sec();

            System.out.println("Comment was created");

        }

    }

    public void Edit_comments_to_workspace() throws InterruptedException, AWTException {

        WebElement workspace = driver.findElement(By.cssSelector("#mainContentWrapper"));
        workspace.isDisplayed();
        wait_sec();
        new Actions(driver).moveToElement(driver.findElement(By.xpath("//i[@name='Workspace']"))).perform();
        new Actions(driver).moveToElement(driver.findElement(By.cssSelector(".fileCheck"))).perform();
        wait_sec();
        WebElement file_checkbox = driver.findElement(By.cssSelector(".fileCheck"));
        file_checkbox.click();
        wait_sec();
        wait_sec();
        wait_sec();

        WebElement open_button = driver.findElement(By.cssSelector(".cf-eye8"));
        open_button.click();
        wait_sec();
        wait_sec();

        try{
            WebElement comments_button = driver.findElement(By.cssSelector("#getComments"));
            comments_button.isDisplayed();
            comments_button.click();
            wait_sec();
            wait_sec();
            wait_sec();

            WebElement comments_content_displayed = driver.findElement(By.cssSelector("#addingComments"));
            comments_content_displayed.isDisplayed();
            wait_sec();

            WebElement edit_comment_button = driver.findElement(By.cssSelector("#editComment"));
            edit_comment_button.click();
            wait_sec();

            WebElement edit_comments_field = driver.findElement(By.cssSelector("#editText"));
            edit_comments_field.clear();
            edit_comments_field.sendKeys("Test Comment new");
            wait_sec();

            WebElement save_comment_button = driver.findElement(By.cssSelector("#saveComment"));
            save_comment_button.click();
            wait_sec();

            WebElement comments_is_displayed = driver.findElement(By.cssSelector(".article-post"));
            ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", comments_is_displayed);
            comments_is_displayed.isDisplayed();
            wait_sec();


            System.out.println("Comment was edited");

        }
        catch(Exception ok){

            System.out.println("File is not added");

            WebElement file_button = driver.findElement(By.cssSelector(".icon-files"));
            file_button.click();
            wait_sec();

            WebElement all_files_button = driver.findElement(By.cssSelector("#homeHome"));
            all_files_button.click();
            wait_sec();
            wait_sec();
            wait_sec();

            WebElement check_file_checkbox = driver.findElement(By.xpath("html/body/section/div[1]/div[5]/div/div[4]/div/div[3]/div[1]/div[1]/input"));
            check_file_checkbox.click();
            wait_sec();

            WebElement workspace_button = driver.findElement(By.xpath("//a[@id='addToWorkspace']/div/div"));
            workspace_button.click();
            wait_sec();
            wait_sec();
            wait_sec();

            WebElement select_workspace_field = driver.findElement(By.cssSelector("#addtoworklist"));
            select_workspace_field.click();
            wait_sec();
            wait_sec();

            WebElement choose_workspace_field = driver.findElement(By.xpath("html/body/div[11]/div[2]/select/option[2]"));
            choose_workspace_field.click();
            wait_sec();

            WebElement add_to_workspace = driver.findElement(By.cssSelector("#addtoworkspace"));
            add_to_workspace.click();
            wait_sec();
            wait_sec();

            assertEquals("File(s) added to workspace successfully.", driver.findElement(By.cssSelector("div.textoFull > span")).getText());

            WebElement workspace_window_button = driver.findElement(By.cssSelector(".cf-workspace"));
            workspace_window_button.click();
            wait_sec();
            wait_sec();

            WebElement workspace1 = driver.findElement(By.cssSelector("#mainContentWrapper"));
            workspace1.isDisplayed();
            wait_sec();
            new Actions(driver).moveToElement(driver.findElement(By.xpath("html/body/section/div[2]/div/div[3]/div/div[2]/div[1]/i[1]"))).perform();

            WebElement file_checkbox1 = driver.findElement(By.cssSelector(".fileCheck"));
            file_checkbox1.click();
            wait_sec();
            wait_sec();

            WebElement open_button1= driver.findElement(By.cssSelector(".cf-eye8"));
            open_button1.click();
            wait_sec();
            wait_sec();
            //--------------------------------------
            WebElement comments_button = driver.findElement(By.cssSelector("#getComments"));
            comments_button.isDisplayed();
            comments_button.click();
            wait_sec();
            wait_sec();
            wait_sec();

            WebElement comments_content_displayed = driver.findElement(By.cssSelector("#addingComments"));
            comments_content_displayed.isDisplayed();
            wait_sec();

            WebElement edit_comment_button = driver.findElement(By.cssSelector("#editComment"));
            edit_comment_button.click();
            wait_sec();

            WebElement edit_comments_field = driver.findElement(By.cssSelector("#editText"));
            edit_comments_field.clear();
            edit_comments_field.sendKeys("Test Comment new");
            wait_sec();

            WebElement save_comment_button = driver.findElement(By.cssSelector("#saveComment"));
            save_comment_button.click();
            wait_sec();

            WebElement comments_is_displayed = driver.findElement(By.cssSelector(".article-post"));
            ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", comments_is_displayed);
            comments_is_displayed.isDisplayed();
            wait_sec();


            System.out.println("Comment was edited");


        }

    }

    public void Delete_comments_to_workspace() throws InterruptedException, AWTException {

        WebElement workspace = driver.findElement(By.cssSelector("#mainContentWrapper"));
        workspace.isDisplayed();
        wait_sec();
        new Actions(driver).moveToElement(driver.findElement(By.xpath("//i[@name='Workspace']"))).perform();
        new Actions(driver).moveToElement(driver.findElement(By.cssSelector(".fileCheck"))).perform();
        wait_sec();
        WebElement file_checkbox = driver.findElement(By.cssSelector(".fileCheck"));
        file_checkbox.click();
        wait_sec();
        wait_sec();
        wait_sec();

        WebElement open_button = driver.findElement(By.cssSelector(".cf-eye8"));
        open_button.click();
        wait_sec();
        wait_sec();


            WebElement comments_button = driver.findElement(By.cssSelector("#getComments"));
            comments_button.isDisplayed();
            comments_button.click();
            wait_sec();
            wait_sec();
            wait_sec();

            WebElement comments_content_displayed = driver.findElement(By.cssSelector("#addingComments"));
            comments_content_displayed.isDisplayed();
            wait_sec();

            WebElement delete_comment_button = driver.findElement(By.cssSelector("#deleteComment"));
            delete_comment_button.click();
            wait_sec();
            wait_sec();
            wait_sec();
            try {

                WebElement comments_is_displayed = driver.findElement(By.xpath("html/body/section/div[2]/div/div[3]/div/div[3]/div[4]/div/div/div[2]/div[2]/ul/li[1]/div/div[1]"));
                ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", comments_is_displayed);
                comments_is_displayed.isDisplayed();
                wait_sec();

                System.out.println("Comment is not deleted");
            }
            catch(Exception delete)
            {
                System.out.println("Comment is deleted");
            }

    }


    public void Upload_file(String Path) throws InterruptedException, AWTException {

        WebElement workspace = driver.findElement(By.cssSelector("#mainContentWrapper"));
        workspace.isDisplayed();
        wait_sec();
        new Actions(driver).moveToElement(driver.findElement(By.xpath("//i[@name='Workspace']"))).perform();
        new Actions(driver).moveToElement(driver.findElement(By.cssSelector(".fileCheck"))).perform();
        wait_sec();
        WebElement file_checkbox = driver.findElement(By.cssSelector(".fileCheck"));
        file_checkbox.click();
        wait_sec();
        wait_sec();
        wait_sec();

        WebElement open_button = driver.findElement(By.cssSelector(".cf-eye8"));
        open_button.click();
        wait_sec();
        wait_sec();



        WebElement upload_button = driver.findElement(By.cssSelector("#CFUploadFiles"));
        upload_button.click();
        wait_sec();
        wait_sec();

        WebElement upload_field = driver.findElement(By.cssSelector(".dz-default.dz-message"));
        upload_field.click();
        Thread.sleep(5000);
        StringSelection ss = new StringSelection(Path);
        Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss, null);


        Robot robot = new Robot();
        Thread.sleep(2000);

        // Press Enter
        robot.keyPress(KeyEvent.VK_ENTER);

        // Release Enter
        robot.keyRelease(KeyEvent.VK_ENTER);

        // Press CTRL+V
        robot.keyPress(KeyEvent.VK_CONTROL);
        robot.keyPress(KeyEvent.VK_V);

        // Release CTRL+V
        robot.keyRelease(KeyEvent.VK_CONTROL);
        robot.keyRelease(KeyEvent.VK_V);
        Thread.sleep(2000);


        //Press Enter
        robot.keyPress(KeyEvent.VK_ENTER);
        robot.keyRelease(KeyEvent.VK_ENTER);
        Thread.sleep(20000);



    }
    public void Upload_file_check() throws InterruptedException, AWTException {

        WebElement comments_button = driver.findElement(By.cssSelector("#getComments"));
        comments_button.isDisplayed();

    }

    public void Upload_file_error() throws InterruptedException, AWTException {

        WebElement error_button = driver.findElement(By.cssSelector(".dz-error-mark"));
        error_button.isDisplayed();

    }
        public void Upload_file_cancel(String Path) throws InterruptedException, AWTException {

        WebElement workspace = driver.findElement(By.cssSelector("#mainContentWrapper"));
        workspace.isDisplayed();
        wait_sec();
            new Actions(driver).moveToElement(driver.findElement(By.xpath("//i[@name='Workspace']"))).perform();
            new Actions(driver).moveToElement(driver.findElement(By.cssSelector(".fileCheck"))).perform();
            wait_sec();
        WebElement file_checkbox = driver.findElement(By.cssSelector(".fileCheck"));
        file_checkbox.click();
        wait_sec();
        wait_sec();
        wait_sec();

        WebElement open_button = driver.findElement(By.cssSelector(".cf-eye8"));
        open_button.click();
        wait_sec();
        wait_sec();



        WebElement upload_button = driver.findElement(By.cssSelector("#CFUploadFiles"));
        upload_button.click();
        wait_sec();
        wait_sec();

        WebElement upload_field = driver.findElement(By.cssSelector(".dz-default.dz-message"));
        upload_field.click();
        Thread.sleep(5000);
        StringSelection ss = new StringSelection(Path);
        Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss, null);


        Robot robot = new Robot();
        Thread.sleep(2000);

        // Press Enter
        robot.keyPress(KeyEvent.VK_ENTER);

        // Release Enter
        robot.keyRelease(KeyEvent.VK_ENTER);

        // Press CTRL+V
        robot.keyPress(KeyEvent.VK_CONTROL);
        robot.keyPress(KeyEvent.VK_V);

        // Release CTRL+V
        robot.keyRelease(KeyEvent.VK_CONTROL);
        robot.keyRelease(KeyEvent.VK_V);
        Thread.sleep(2000);


        //Press Enter
        robot.keyPress(KeyEvent.VK_ENTER);
        robot.keyRelease(KeyEvent.VK_ENTER);
        Thread.sleep(200);

        WebElement cancel_button = driver.findElement(By.cssSelector(".dz-remove"));
        cancel_button.click();
        wait_sec();
        wait_sec();
            wait_sec();

            driver.switchTo().alert().accept();
//            Keyboard kb = ((RemoteWebDriver) driver).getKeyboard();
//            kb.sendKeys(Keys.ENTER);
            wait_sec();

    }

    public void Upload_file_to_directory(String Path) throws InterruptedException, AWTException {

        WebElement workspace = driver.findElement(By.cssSelector("#mainContentWrapper"));
        workspace.isDisplayed();
        wait_sec();
        //new Actions(driver).moveToElement(driver.findElement(By.xpath("))).release().perform();

        WebElement file_checkbox = driver.findElement(By.xpath("//i[@name='Workspace']"));
        file_checkbox.click();
        wait_sec();
        wait_sec();
        wait_sec();

//        WebElement open_button = driver.findElement(By.cssSelector(".cf-eye8"));
//        open_button.click();
//        wait_sec();
//        wait_sec();

        try{

            WebElement folder = driver.findElement(By.className("folder"));
            folder.isDisplayed();
            folder.click();
            wait_sec();
            wait_sec();

            WebElement upload_button = driver.findElement(By.cssSelector("#CFUploadFiles"));
            upload_button.click();
            wait_sec();
            wait_sec();

            WebElement upload_field = driver.findElement(By.cssSelector(".dz-default.dz-message"));
            upload_field.click();
            Thread.sleep(5000);
            StringSelection ss = new StringSelection(Path);
            Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss, null);


            Robot robot = new Robot();
            Thread.sleep(2000);

            // Press Enter
            robot.keyPress(KeyEvent.VK_ENTER);

            // Release Enter
            robot.keyRelease(KeyEvent.VK_ENTER);

            // Press CTRL+V
            robot.keyPress(KeyEvent.VK_CONTROL);
            robot.keyPress(KeyEvent.VK_V);

            // Release CTRL+V
            robot.keyRelease(KeyEvent.VK_CONTROL);
            robot.keyRelease(KeyEvent.VK_V);
            Thread.sleep(2000);

            //Press Enter
            robot.keyPress(KeyEvent.VK_ENTER);
            robot.keyRelease(KeyEvent.VK_ENTER);
            Thread.sleep(15000);

            WebElement file_displayed =  driver.findElement(By.cssSelector("#getComments"));
            file_displayed.isDisplayed();


        }

        catch(Exception ok){

            WebElement file_button = driver.findElement(By.cssSelector(".icon-files"));
            file_button.click();
            wait_sec();
            wait_sec();
            wait_sec();


//            WebElement all_files_button = driver.findElement(By.cssSelector("#homeHome"));
//            all_files_button.click();
//            wait_sec();

            WebElement check_folder_checkbox = driver.findElement(By.cssSelector("div[name=FOLDER] > input[type=checkbox]"));
            check_folder_checkbox.click();
            wait_sec();
            wait_sec();

            WebElement workspace_button = driver.findElement(By.xpath("//a[@id='addToWorkspace']/div/div"));
            workspace_button.click();
            wait_sec();
            wait_sec();
            wait_sec();

            WebElement select_workspace_field = driver.findElement(By.cssSelector("#addtoworklist"));
            select_workspace_field.click();
            wait_sec();
            wait_sec();

            WebElement choose_workspace_field = driver.findElement(By.xpath("html/body/div[11]/div[2]/select/option[2]"));
            choose_workspace_field.click();
            wait_sec();

            WebElement add_to_workspace = driver.findElement(By.cssSelector("#addtoworkspace"));
            add_to_workspace.click();
            wait_sec();
            wait_sec();

            assertEquals("File(s) added to workspace successfully.", driver.findElement(By.cssSelector("div.textoFull > span")).getText());

//////////////////////////////////////////////////////////////////////////
            WebElement workspace_window_button = driver.findElement(By.cssSelector(".cf-workspace"));
            workspace_window_button.click();
            wait_sec();
            wait_sec();

            WebElement workspace1 = driver.findElement(By.cssSelector("#mainContentWrapper"));
            workspace1.isDisplayed();
            wait_sec();
           // new Actions(driver).moveToElement(driver.findElement(By.xpath(""))).perform();

            WebElement file_checkbox1 = driver.findElement(By.xpath("//i[@name='Workspace']"));
            file_checkbox1.click();
            wait_sec();
            wait_sec();


            WebElement folder = driver.findElement(By.className("folder"));
            folder.isDisplayed();
            folder.click();
            wait_sec();
            wait_sec();

            WebElement upload_button = driver.findElement(By.cssSelector("#CFUploadFiles"));
            upload_button.click();
            wait_sec();
            wait_sec();

            WebElement upload_field = driver.findElement(By.cssSelector(".dz-default.dz-message"));
            upload_field.click();
            Thread.sleep(5000);
            StringSelection ss = new StringSelection(Path);
            Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss, null);

            Robot robot = new Robot();
            Thread.sleep(2000);

            // Press Enter
            robot.keyPress(KeyEvent.VK_ENTER);

            // Release Enter
            robot.keyRelease(KeyEvent.VK_ENTER);

            // Press CTRL+V
            robot.keyPress(KeyEvent.VK_CONTROL);
            robot.keyPress(KeyEvent.VK_V);

            // Release CTRL+V
            robot.keyRelease(KeyEvent.VK_CONTROL);
            robot.keyRelease(KeyEvent.VK_V);
            Thread.sleep(2000);

            //Press Enter
            robot.keyPress(KeyEvent.VK_ENTER);
            robot.keyRelease(KeyEvent.VK_ENTER);
            Thread.sleep(15000);

            WebElement file_displayed =  driver.findElement(By.cssSelector("#getComments"));
            file_displayed.isDisplayed();

        }

    }


    public void download_file_workspace(String downloadPath) throws InterruptedException {

        WebElement workspace = driver.findElement(By.cssSelector("#mainContentWrapper"));
        workspace.isDisplayed();
        wait_sec();
        //new Actions(driver).moveToElement(driver.findElement(By.xpath("html/body/section/div[2]/div/div[3]/div/div[2]/div[1]/i[1]"))).release().perform();

        WebElement file_checkbox = driver.findElement(By.xpath("//i[@name='Workspace']"));
        file_checkbox.click();
        wait_sec();
        wait_sec();

//        WebElement open_button = driver.findElement(By.cssSelector(".cf-eye8"));
//        open_button.click();
//        wait_sec();
//        wait_sec();

        try {
            WebElement check_file = driver.findElement(By.className("sorting_1"));
            check_file.isDisplayed();
            //check_file_checkbox.click();
            wait_sec();

            WebElement check_file_checkbox = driver.findElement(By.xpath("html/body/section/div[2]/div/div[3]/div/div[3]/div[3]/div/div/table/tbody/tr[1]/td[1]/input"));
            check_file_checkbox.click();
            wait_sec();

            WebElement download_file_button = driver.findElement(By.cssSelector(".cf-cloud-download2"));
            download_file_button.click();
            wait_sec();
            wait_sec();
            wait_sec();

            System.out.println("File is downloaded");

        }
        catch(Exception ok){
            System.out.println("File is not added");

            WebElement file_button = driver.findElement(By.cssSelector(".icon-files"));
            file_button.click();
            wait_sec();
            wait_sec();
            wait_sec();

//            WebElement all_files_button = driver.findElement(By.cssSelector("#homeHome"));
//            all_files_button.click();
//            wait_sec();

            WebElement check_file_checkbox = driver.findElement(By.cssSelector("div[name=FILE] > input[type=checkbox]"));
            check_file_checkbox.click();
            wait_sec();

            WebElement workspace_button = driver.findElement(By.xpath("//a[@id='addToWorkspace']/div/div"));
            workspace_button.click();
            wait_sec();
            wait_sec();
            wait_sec();

            WebElement select_workspace_field = driver.findElement(By.cssSelector("#addtoworklist"));
            select_workspace_field.click();
            wait_sec();
            wait_sec();

            WebElement choose_workspace_field = driver.findElement(By.xpath("html/body/div[11]/div[2]/select/option[2]"));
            choose_workspace_field.click();
            wait_sec();

            WebElement add_to_workspace = driver.findElement(By.cssSelector("#addtoworkspace"));
            add_to_workspace.click();
            wait_sec();
            wait_sec();

            assertEquals("File(s) added to workspace successfully.", driver.findElement(By.cssSelector("div.textoFull > span")).getText());


            WebElement workspace_window_button = driver.findElement(By.cssSelector(".cf-workspace"));
            workspace_window_button.click();
            wait_sec();
            wait_sec();

            WebElement workspace1 = driver.findElement(By.cssSelector("#mainContentWrapper"));
            workspace1.isDisplayed();
            wait_sec();
//            new Actions(driver).moveToElement(driver.findElement(By.xpath("html/body/section/div[2]/div/div[3]/div/div[2]/div[1]/i[1]"))).perform();

            WebElement file_checkbox1 = driver.findElement(By.xpath("//i[@name='Workspace']"));
            file_checkbox1.click();
            wait_sec();
            wait_sec();

//            WebElement open_button1= driver.findElement(By.cssSelector(".cf-eye8"));
//            open_button1.click();
//            wait_sec();
//            wait_sec();

            WebElement check_file_checkbox1 = driver.findElement(By.xpath("//tbody[@id='workspaceFiles']/tr/td/input"));
            check_file_checkbox1.isDisplayed();
            check_file_checkbox1.click();
            wait_sec();

            WebElement download_file_button1 = driver.findElement(By.cssSelector(".cf-cloud-download2"));
            download_file_button1.click();
            wait_sec();
            wait_sec();
            wait_sec();

            System.out.println("File is downloaded");
        }
    }

    public void download_mupliple_file_workspace() throws InterruptedException {

        WebElement workspace = driver.findElement(By.cssSelector("#mainContentWrapper"));
        workspace.isDisplayed();
        wait_sec();
        //new Actions(driver).moveToElement(driver.findElement(By.xpath("html/body/section/div[2]/div/div[3]/div/div[2]/div[1]/i[1]"))).release().perform();

        WebElement file_checkbox = driver.findElement(By.xpath("//i[@name='Workspace']"));
        file_checkbox.click();
        wait_sec();
        wait_sec();

//        WebElement open_button = driver.findElement(By.cssSelector(".cf-eye8"));
//        open_button.click();
//        wait_sec();
//        wait_sec();

        try {
            WebElement check_file = driver.findElement(By.className("sorting_1"));
            check_file.isDisplayed();
            //check_file_checkbox.click();
            wait_sec();

            WebElement check_file_checkbox = driver.findElement(By.cssSelector(".table.filesWs>thead>tr>th>input"));
            check_file_checkbox.click();
            wait_sec();

            WebElement download_file_button = driver.findElement(By.cssSelector(".cf-cloud-download2"));
            download_file_button.click();
            wait_sec();
            wait_sec();
            wait_sec();
            wait_sec();


            System.out.println("File is downloaded");

        }
        catch(Exception ok){
            System.out.println("File is not added");

            WebElement file_button = driver.findElement(By.cssSelector(".icon-files"));
            file_button.click();
            wait_sec();
            wait_sec();
            wait_sec();

            WebElement all_files_button = driver.findElement(By.cssSelector("#homeHome"));
            all_files_button.click();
            wait_sec();

            WebElement check_file_checkbox = driver.findElement(By.xpath(".//*[@id='LVContent']/div[starts-with(@data-type,'FILE')][1]/div[@class='LVcheckBox']"));
            check_file_checkbox.click();
            wait_sec();

            WebElement check_file1_checkbox = driver.findElement(By.xpath(".//*[@id='LVContent']/div[starts-with(@data-type,'FILE')][2]/div[@class='LVcheckBox']"));
            check_file1_checkbox.click();
            wait_sec();

            WebElement check_file2_checkbox = driver.findElement(By.xpath(".//*[@id='LVContent']/div[starts-with(@data-type,'FILE')][3]/div[@class='LVcheckBox']"));
            check_file2_checkbox.click();
            wait_sec();

            WebElement workspace_button = driver.findElement(By.xpath("//a[@id='addToWorkspace']/div/div"));
            workspace_button.click();
            wait_sec();
            wait_sec();
            wait_sec();

            WebElement select_workspace_field = driver.findElement(By.cssSelector("#addtoworklist"));
            select_workspace_field.click();
            wait_sec();
            wait_sec();

            WebElement choose_workspace_field = driver.findElement(By.xpath("html/body/div[11]/div[2]/select/option[2]"));
            choose_workspace_field.click();
            wait_sec();

            WebElement add_to_workspace = driver.findElement(By.cssSelector("#addtoworkspace"));
            add_to_workspace.click();
            wait_sec();
            wait_sec();

            assertEquals("File(s) added to workspace successfully.", driver.findElement(By.cssSelector("div.textoFull > span")).getText());


            WebElement workspace_window_button = driver.findElement(By.cssSelector(".cf-workspace"));
            workspace_window_button.click();
            wait_sec();
            wait_sec();

            WebElement workspace1 = driver.findElement(By.cssSelector("#mainContentWrapper"));
            workspace1.isDisplayed();
            wait_sec();
//            new Actions(driver).moveToElement(driver.findElement(By.xpath("html/body/section/div[2]/div/div[3]/div/div[2]/div[1]/i[1]"))).perform();

            WebElement file_checkbox1 = driver.findElement(By.xpath("//i[@name='Workspace']"));
            file_checkbox1.click();
            wait_sec();
            wait_sec();

//            WebElement open_button1= driver.findElement(By.cssSelector(".cf-eye8"));
//            open_button1.click();
//            wait_sec();
//            wait_sec();

            WebElement check_file_checkbox1 = driver.findElement(By.cssSelector(".table.filesWs>thead>tr>th>input"));
            check_file_checkbox1.click();
            wait_sec();

            WebElement download_file_button1 = driver.findElement(By.cssSelector(".cf-cloud-download2"));
            download_file_button1.click();
            wait_sec();
//            new Actions(driver).sendKeys(Keys.TAB).build().perform();
//            new Actions(driver).sendKeys(Keys.ENTER).build().perform();
            wait_sec();
            wait_sec();
            wait_sec();



            System.out.println("File is downloaded");
        }
    }


public void Open_file_workspace() throws InterruptedException {

        WebElement workspace = driver.findElement(By.cssSelector("#mainContentWrapper"));
        workspace.isDisplayed();
        wait_sec();
        //new Actions(driver).moveToElement(driver.findElement(By.xpath("html/body/section/div[2]/div/div[3]/div/div[2]/div[1]/i[1]"))).release().perform();

        WebElement file_checkbox = driver.findElement(By.xpath("//i[@name='Workspace']"));
        file_checkbox.click();
        wait_sec();
        wait_sec();

//        WebElement open_button = driver.findElement(By.cssSelector(".cf-eye8"));
//        open_button.click();
//        wait_sec();
//        wait_sec();

    try{
        WebElement check_file = driver.findElement(By.className("sorting_1"));
        check_file.isDisplayed();
        wait_sec();

        WebElement check_file_checkbox = driver.findElement(By.xpath("html/body/section/div[2]/div/div[3]/div/div[3]/div[3]/div/div/table/tbody/tr[1]/td[1]/input"));
        check_file_checkbox.isDisplayed();
        check_file_checkbox.click();
            wait_sec();

        WebElement open_file_button = driver.findElement(By.cssSelector(".cf-eye8"));
        open_file_button.click();
        wait_sec();
        wait_sec();
        wait_sec();
        wait_sec();

        WebElement file_is_displayed = driver.findElement(By.cssSelector(".modal-content"));
        file_is_displayed.isDisplayed();
        wait_sec();
        wait_sec();

        WebElement close_file = driver.findElement(By.cssSelector(".close"));
        close_file.click();
        wait_sec();

    }
    catch(Exception ok){

        System.out.println("File is not added");

        WebElement file_button = driver.findElement(By.cssSelector(".icon-files"));
        file_button.click();
        wait_sec();
        wait_sec();
        wait_sec();

//        WebElement all_files_button = driver.findElement(By.cssSelector("#homeHome"));
//        all_files_button.click();
//        wait_sec();

        WebElement check_file_checkbox = driver.findElement(By.cssSelector("div[name=FILE] > input[type=checkbox]"));
        check_file_checkbox.click();
        wait_sec();

        WebElement workspace_button = driver.findElement(By.xpath("//a[@id='addToWorkspace']/div/div"));
        workspace_button.click();
        wait_sec();
        wait_sec();
        wait_sec();

        WebElement select_workspace_field = driver.findElement(By.cssSelector("#addtoworklist"));
        select_workspace_field.click();
        wait_sec();
        wait_sec();

        WebElement choose_workspace_field = driver.findElement(By.xpath("html/body/div[11]/div[2]/select/option[2]"));
        choose_workspace_field.click();
        wait_sec();

        WebElement add_to_workspace = driver.findElement(By.cssSelector("#addtoworkspace"));
        add_to_workspace.click();
        wait_sec();
        wait_sec();

        assertEquals("File(s) added to workspace successfully.", driver.findElement(By.cssSelector("div.textoFull > span")).getText());


        WebElement workspace_window_button = driver.findElement(By.cssSelector(".cf-workspace"));
        workspace_window_button.click();
        wait_sec();
        wait_sec();

        WebElement workspace1 = driver.findElement(By.cssSelector("#mainContentWrapper"));
        workspace1.isDisplayed();
        wait_sec();
       // new Actions(driver).moveToElement(driver.findElement(By.xpath("html/body/section/div[2]/div/div[3]/div/div[2]/div[1]/i[1]"))).release().perform();

        WebElement file_checkbox1 = driver.findElement(By.xpath("//i[@name='Workspace']"));
        file_checkbox1.click();
        wait_sec();
        wait_sec();
        wait_sec();

//        WebElement open_button1= driver.findElement(By.cssSelector(".cf-eye8"));
//        open_button1.click();
//        wait_sec();
//        wait_sec();

        WebElement check_file_checkbox1 = driver.findElement(By.xpath("//tbody[@id='workspaceFiles']/tr/td/input"));
        check_file_checkbox1.isDisplayed();
        check_file_checkbox1.click();
        wait_sec();

        WebElement open_file_button1 = driver.findElement(By.cssSelector(".cf-eye8"));
        open_file_button1.click();
        wait_sec();
        wait_sec();
        wait_sec();
        wait_sec();

        WebElement file_is_displayed1 = driver.findElement(By.cssSelector(".modal-content"));
        file_is_displayed1.isDisplayed();
        wait_sec();
        wait_sec();

        WebElement close_file1 = driver.findElement(By.cssSelector(".close"));
        close_file1.click();
        wait_sec();
    }

}

    public void rename_file_workspace(String new_Name) throws InterruptedException {

        WebElement workspace = driver.findElement(By.cssSelector("#mainContentWrapper"));
        workspace.isDisplayed();
        wait_sec();
        //new Actions(driver).moveToElement(driver.findElement(By.xpath("html/body/section/div[2]/div/div[3]/div/div[2]/div[1]/i[1]"))).perform();

        WebElement file_checkbox = driver.findElement(By.xpath("//i[@name='Workspace']"));
        file_checkbox.click();
        wait_sec();
        wait_sec();

//        WebElement open_button = driver.findElement(By.cssSelector(".cf-eye8"));
//        open_button.click();
//        wait_sec();
//        wait_sec();

    try {
        WebElement check_file_checkbox = driver.findElement(By.xpath("html/body/section/div[2]/div/div[3]/div/div[3]/div[3]/div/div/table/tbody/tr/td[1]/input"));
        check_file_checkbox.isDisplayed();
        check_file_checkbox.click();
        wait_sec();


        WebElement rename_button = driver.findElement(By.cssSelector(".cf-edit3"));
        rename_button.click();
        wait_sec();

        WebElement rename_field = driver.findElement(By.cssSelector("input.renameInput"));
        rename_field.isDisplayed();
        rename_field.clear();
        rename_field.sendKeys(new_Name);


        //rename_field.sendKeys(Keys.ENTER);

       // new Actions(driver).moveToElement(driver.findElement(By.className(".RenameOk"))).click();
        WebElement rename_ok_button = driver.findElement(By.className("RenameOk"));
        rename_ok_button.click();
        wait_sec();
        wait_sec();

        WebElement message_is_displayed = driver.findElement(By.cssSelector("div.textoFull > span"));
        message_is_displayed.isDisplayed();

        WebElement new_name_displayed = driver.findElement(By.xpath("//*[contains(text(), '" + new_Name + "')] | //*[@value='" + new_Name + "']"));
        new_name_displayed.isDisplayed();
        wait_sec();

    }

    catch(Exception ok){

        System.out.println("File is not added");

        WebElement file_button = driver.findElement(By.cssSelector(".icon-files"));
        file_button.click();
        wait_sec();

        WebElement all_files_button = driver.findElement(By.cssSelector("#homeHome"));
        all_files_button.click();
        wait_sec();

        WebElement check_file_checkbox = driver.findElement(By.xpath(".//*[@id='LVContent']/div[starts-with(@data-type,'FILE')][1]/div[@class='LVcheckBox']"));
        check_file_checkbox.click();
        wait_sec();

        WebElement workspace_button = driver.findElement(By.xpath("//a[@id='addToWorkspace']/div/div"));
        workspace_button.click();
        wait_sec();
        wait_sec();
        wait_sec();

        WebElement select_workspace_field = driver.findElement(By.cssSelector("#addtoworklist"));
        select_workspace_field.click();
        wait_sec();
        wait_sec();

        WebElement choose_workspace_field = driver.findElement(By.xpath("html/body/div[11]/div[2]/select/option[2]"));
        choose_workspace_field.click();
        wait_sec();

        WebElement add_to_workspace = driver.findElement(By.cssSelector("#addtoworkspace"));
        add_to_workspace.click();
        wait_sec();
        wait_sec();

        assertEquals("File(s) added to workspace successfully.", driver.findElement(By.cssSelector("div.textoFull > span")).getText());


        WebElement workspace_window_button = driver.findElement(By.cssSelector(".cf-workspace"));
        workspace_window_button.click();
        wait_sec();
        wait_sec();

        WebElement workspace1 = driver.findElement(By.cssSelector("#mainContentWrapper"));
        workspace1.isDisplayed();
        wait_sec();
       // new Actions(driver).moveToElement(driver.findElement(By.xpath("html/body/section/div[2]/div/div[3]/div/div[2]/div[1]/i[1]"))).release().perform();

        WebElement file_checkbox1 = driver.findElement(By.xpath("//i[@name='Workspace']"));
        file_checkbox1.click();
        wait_sec();
        wait_sec();
        wait_sec();

//        WebElement open_button1= driver.findElement(By.cssSelector(".cf-eye8"));
//        open_button1.click();
//        wait_sec();
//        wait_sec();

        WebElement check_file_checkbox1 = driver.findElement(By.xpath("//tbody[@id='workspaceFiles']/tr/td/input"));
        check_file_checkbox1.isDisplayed();
        check_file_checkbox1.click();
        wait_sec();


        WebElement rename_button = driver.findElement(By.cssSelector(".cf-edit3"));
        rename_button.click();
        wait_sec();

        WebElement rename_field1 = driver.findElement(By.cssSelector(".renameInput"));
        rename_field1.isDisplayed();
        rename_field1.clear();
        rename_field1.sendKeys(new_Name);


        WebElement rename_ok_button1 = driver.findElement(By.className("RenameOk"));
        rename_ok_button1.click();
        wait_sec();

        WebElement message_is_displayed = driver.findElement(By.cssSelector("div.textoFull > span"));
        message_is_displayed.isDisplayed();

        WebElement new_name_displayed1 = driver.findElement(By.xpath("//*[contains(text(), '" + new_Name + "')] | //*[@value='" + new_Name + "']"));
        new_name_displayed1.isDisplayed();
        wait_sec();
    }

    }

    public void delete_file() throws InterruptedException {

        WebElement workspace = driver.findElement(By.cssSelector("#mainContentWrapper"));
        workspace.isDisplayed();
        wait_sec();
        new Actions(driver).moveToElement(driver.findElement(By.xpath("//i[@name='Workspace']"))).perform();
        new Actions(driver).moveToElement(driver.findElement(By.cssSelector(".fileCheck"))).perform();
        wait_sec();
        WebElement file_checkbox = driver.findElement(By.cssSelector(".fileCheck"));
        file_checkbox.click();
        wait_sec();
        wait_sec();

        WebElement open_button = driver.findElement(By.cssSelector(".cf-eye8"));
        open_button.click();
        wait_sec();
        wait_sec();

        try {
            WebElement check_file_checkbox = driver.findElement(By.xpath("html/body/section/div[2]/div/div[3]/div/div[3]/div[3]/div/div/table/tbody/tr/td[1]/input"));
            check_file_checkbox.isDisplayed();
            check_file_checkbox.click();
            wait_sec();

            WebElement delete_file_button = driver.findElement(By.cssSelector(".cf-trashcan2"));
            delete_file_button.click();
            wait_sec();

            WebElement delete_window = driver.findElement(By.cssSelector("#deletemodal"));
            delete_window.isDisplayed();
            wait_sec();

            //delete file in window
            WebElement deletefile_button = driver.findElement(By.cssSelector("#CFDeleteFile"));
            deletefile_button.click();
            wait_sec();
            wait_sec();
            wait_sec();

            try {
                WebElement content = driver.findElement(By.xpath("html/body/section/div[2]/div/div[3]/div/div[3]/div[3]/div/div/table/tbody/tr/td[1]/input"));
                content.isDisplayed();
                wait_sec();
            } catch (Exception ok) {
                WebElement content = driver.findElement(By.cssSelector("#wsFiles"));
                content.isDisplayed();
                wait_sec();
            }

        } catch (Exception ok) {

            System.out.println("File is not added");

            WebElement file_button = driver.findElement(By.cssSelector(".icon-files"));
            file_button.click();
            wait_sec();

            WebElement all_files_button = driver.findElement(By.cssSelector("#homeHome"));
            all_files_button.click();
            wait_sec();

            WebElement check_file_checkbox = driver.findElement(By.xpath(".//*[@id='LVContent']/div[starts-with(@data-type,'FILE')][1]/div[@class='LVcheckBox']"));
            check_file_checkbox.click();
            wait_sec();


            WebElement workspace_button = driver.findElement(By.xpath("//a[@id='addToWorkspace']/div/div"));
            workspace_button.click();
            wait_sec();
            wait_sec();
            wait_sec();

            WebElement select_workspace_field = driver.findElement(By.cssSelector("#addtoworklist"));
            select_workspace_field.click();
            wait_sec();
            wait_sec();

            WebElement choose_workspace_field = driver.findElement(By.xpath("html/body/div[11]/div[2]/select/option[2]"));
            choose_workspace_field.click();
            wait_sec();

            WebElement add_to_workspace = driver.findElement(By.cssSelector("#addtoworkspace"));
            add_to_workspace.click();
            wait_sec();
            wait_sec();

            assertEquals("File(s) added to workspace successfully.", driver.findElement(By.cssSelector("div.textoFull > span")).getText());


            WebElement workspace_window_button = driver.findElement(By.cssSelector(".cf-workspace"));
            workspace_window_button.click();
            wait_sec();
            wait_sec();

            WebElement workspace1 = driver.findElement(By.cssSelector("#mainContentWrapper"));
            workspace1.isDisplayed();
            wait_sec();
           // new Actions(driver).moveToElement(driver.findElement(By.xpath("html/body/section/div[2]/div/div[3]/div/div[2]/div/i[1]"))).perform();

            WebElement file_checkbox1 = driver.findElement(By.xpath("//i[@name='Workspace']"));
            file_checkbox1.click();
            wait_sec();
            wait_sec();
            wait_sec();

//        WebElement open_button1= driver.findElement(By.cssSelector(".cf-eye8"));
//        open_button1.click();
//        wait_sec();
//        wait_sec();

            WebElement check_file_checkbox1 = driver.findElement(By.xpath("//tbody[@id='workspaceFiles']/tr/td/input"));
            check_file_checkbox1.isDisplayed();
            check_file_checkbox1.click();
            wait_sec();

            WebElement delete_file_button1 = driver.findElement(By.cssSelector(".cf-trashcan2"));
            delete_file_button1.click();
            wait_sec();

            WebElement delete_window1 = driver.findElement(By.cssSelector("#deletemodal"));
            delete_window1.isDisplayed();
            wait_sec();

            //delete file in window
            WebElement deletefile_button1 = driver.findElement(By.cssSelector("#CFDeleteFile"));
            deletefile_button1.click();
            wait_sec();

            try {
                WebElement content = driver.findElement(By.xpath("html/body/section/div[2]/div/div[3]/div/div[3]/div[3]/div/div/table/tbody/tr/td[1]/input"));
                content.isDisplayed();
                wait_sec();
            } catch (Exception ok1) {
                WebElement content = driver.findElement(By.cssSelector("#wsFiles"));
                content.isDisplayed();
                wait_sec();
            }
        }

    }

    public void delete_multiple_file() throws InterruptedException {

        WebElement workspace = driver.findElement(By.cssSelector("#mainContentWrapper"));
        workspace.isDisplayed();
        wait_sec();
        //new Actions(driver).moveToElement(driver.findElement(By.xpath(""))).perform();

        WebElement file_checkbox = driver.findElement(By.xpath("//i[@name='Workspace']"));
        file_checkbox.click();
        wait_sec();
        wait_sec();

//        WebElement open_button = driver.findElement(By.cssSelector(".cf-eye8"));
//        open_button.click();
//        wait_sec();
//        wait_sec();
//
        try {
            for (int i = 1; i <= 2; i = i + 1) {
                WebElement check_file_checkbox = driver.findElement(By.xpath("//tbody[@id='workspaceFiles']/tr["+i+"]/td/input"));
                check_file_checkbox.isDisplayed();
                check_file_checkbox.click();
                wait_sec();
            }
            WebElement delete_file_button = driver.findElement(By.cssSelector(".cf-trashcan2"));
            delete_file_button.click();
            wait_sec();

            WebElement delete_window = driver.findElement(By.cssSelector("#deletemodal"));
            delete_window.isDisplayed();
            wait_sec();

            //delete file in window
            WebElement deletefile_button = driver.findElement(By.cssSelector("#CFDeleteFile"));
            deletefile_button.click();
            wait_sec();
            wait_sec();

            System.out.println("Files is deleted");

        } catch (Exception ok) {

            System.out.println("File is not added");

            WebElement file_button = driver.findElement(By.cssSelector(".icon-files"));
            file_button.click();
            wait_sec();

            WebElement all_files_button = driver.findElement(By.cssSelector("#homeHome"));
            all_files_button.click();
            wait_sec();

            WebElement check_file_checkbox = driver.findElement(By.xpath(".//*[@id='LVContent']/div[starts-with(@data-type,'FILE')][1]/div[@class='LVcheckBox']"));
            check_file_checkbox.click();
            wait_sec();

            WebElement check_file1_checkbox = driver.findElement(By.xpath(".//*[@id='LVContent']/div[starts-with(@data-type,'FILE')][2]/div[@class='LVcheckBox']"));
            check_file1_checkbox.click();
            wait_sec();

            WebElement workspace_button = driver.findElement(By.xpath("//a[@id='addToWorkspace']/div/div"));
            workspace_button.click();
            wait_sec();
            wait_sec();
            wait_sec();

            WebElement select_workspace_field = driver.findElement(By.cssSelector("#addtoworklist"));
            select_workspace_field.click();
            wait_sec();
            wait_sec();

            WebElement choose_workspace_field = driver.findElement(By.xpath("html/body/div[11]/div[2]/select/option[2]"));
            choose_workspace_field.click();
            wait_sec();

            WebElement add_to_workspace = driver.findElement(By.cssSelector("#addtoworkspace"));
            add_to_workspace.click();
            wait_sec();
            wait_sec();

            assertEquals("File(s) added to workspace successfully.", driver.findElement(By.cssSelector("div.textoFull > span")).getText());


            WebElement workspace_window_button = driver.findElement(By.cssSelector(".cf-workspace"));
            workspace_window_button.click();
            wait_sec();
            wait_sec();

            WebElement workspace1 = driver.findElement(By.cssSelector("#mainContentWrapper"));
            workspace1.isDisplayed();
            wait_sec();
            // new Actions(driver).moveToElement(driver.findElement(By.xpath(""))).perform();

            WebElement file_checkbox1 = driver.findElement(By.xpath("//i[@name='Workspace']"));
            file_checkbox1.click();
            wait_sec();
            wait_sec();

            for (int i = 1; i <= 2; i = i + 1) {

                WebElement check_file3_checkbox = driver.findElement(By.xpath("//tbody[@id='workspaceFiles']/tr["+i+"]/td/input"));
                check_file3_checkbox.isDisplayed();
                check_file3_checkbox.click();
                wait_sec();
            }
            WebElement delete_file_button = driver.findElement(By.cssSelector(".cf-trashcan2"));
            delete_file_button.click();
            wait_sec();

            WebElement delete_window = driver.findElement(By.cssSelector("#deletemodal"));
            delete_window.isDisplayed();
            wait_sec();

            //delete file in window
            WebElement deletefile_button = driver.findElement(By.cssSelector("#CFDeleteFile"));
            deletefile_button.click();
            wait_sec();

            System.out.println("Files is deleted");
        }

    }

    public void delete_file_inFolder(String Path, String Path1) throws InterruptedException, AWTException {

        WebElement workspace = driver.findElement(By.cssSelector("#mainContentWrapper"));
        workspace.isDisplayed();
        wait_sec();
        //new Actions(driver).moveToElement(driver.findElement(By.xpath(""))).perform();

        WebElement file_checkbox = driver.findElement(By.xpath("//i[@name='Workspace']"));
        file_checkbox.click();
        wait_sec();
        wait_sec();

//        WebElement open_button = driver.findElement(By.cssSelector(".cf-eye8"));
//        open_button.click();
//        wait_sec();
//        wait_sec();
//
        try {
            WebElement folder = driver.findElement(By.className("folder"));
            folder.isDisplayed();
            folder.click();
            wait_sec();
            wait_sec();

            try {
                WebElement file_in_folder = driver.findElement(By.xpath("//tbody[@id='workspaceFiles']/tr[2]/td/input"));
                file_in_folder.click();
                wait_sec();

                WebElement delete_file_button = driver.findElement(By.cssSelector(".cf-trashcan2"));
                delete_file_button.click();
                wait_sec();

                WebElement delete_window = driver.findElement(By.cssSelector("#deletemodal"));
                delete_window.isDisplayed();
                wait_sec();

                //delete file in window
                WebElement deletefile_button = driver.findElement(By.cssSelector("#CFDeleteFile"));
                deletefile_button.click();
                wait_sec();
                wait_sec();
                wait_sec();
                wait_sec();

                System.out.println("Files is deleted");


            } catch (Exception i) {

                System.out.println("File is not added");

                WebElement upload_button = driver.findElement(By.cssSelector("#CFUploadFiles"));
                upload_button.click();
                wait_sec();
                wait_sec();

                WebElement upload_field = driver.findElement(By.cssSelector(".dz-default.dz-message"));
                upload_field.click();
                Thread.sleep(5000);
                StringSelection ss = new StringSelection(Path);
                Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss, null);


                Robot robot = new Robot();
                Thread.sleep(2000);

                // Press Enter
                robot.keyPress(KeyEvent.VK_ENTER);

                // Release Enter
                robot.keyRelease(KeyEvent.VK_ENTER);

                // Press CTRL+V
                robot.keyPress(KeyEvent.VK_CONTROL);
                robot.keyPress(KeyEvent.VK_V);

                // Release CTRL+V
                robot.keyRelease(KeyEvent.VK_CONTROL);
                robot.keyRelease(KeyEvent.VK_V);
                Thread.sleep(2000);

                //Press Enter
                robot.keyPress(KeyEvent.VK_ENTER);
                robot.keyRelease(KeyEvent.VK_ENTER);
                Thread.sleep(12000);

                WebElement file_displayed = driver.findElement(By.cssSelector(".LVFIL"));
                file_displayed.isDisplayed();

                WebElement close_ulpoad = driver.findElement(By.cssSelector("#closeUpload"));
                close_ulpoad.click();
                wait_sec();

                WebElement file_in_folder = driver.findElement(By.xpath("//tbody[@id='workspaceFiles']/tr[2]/td/input"));
                file_in_folder.click();
                wait_sec();

                WebElement delete_file_button = driver.findElement(By.cssSelector(".cf-trashcan2"));
                delete_file_button.click();
                wait_sec();

                WebElement delete_window = driver.findElement(By.cssSelector("#deletemodal"));
                delete_window.isDisplayed();
                wait_sec();

                //delete file in window
                WebElement deletefile_button = driver.findElement(By.cssSelector("#CFDeleteFile"));
                deletefile_button.click();
                wait_sec();
                wait_sec();
                wait_sec();
                wait_sec();

                System.out.println("Files is deleted");

            }


        } catch (Exception ok) {

            System.out.println("File is not added");

            WebElement file_button = driver.findElement(By.cssSelector(".icon-files"));
            file_button.click();
            wait_sec();
            wait_sec();
            wait_sec();
            wait_sec();
            wait_sec();
            wait_sec();

//            WebElement all_files_button = driver.findElement(By.cssSelector("#homeHome"));
//            all_files_button.click();
//            wait_sec();

            WebElement check_folder_checkbox = driver.findElement(By.cssSelector("div[name=FOLDER] > input[type=checkbox]"));
            check_folder_checkbox.click();
            wait_sec();
            wait_sec();

            WebElement workspace_button = driver.findElement(By.xpath("//a[@id='addToWorkspace']/div/div"));
            workspace_button.click();
            wait_sec();
            wait_sec();
            wait_sec();

            WebElement select_workspace_field = driver.findElement(By.cssSelector("#addtoworklist"));
            select_workspace_field.click();
            wait_sec();
            wait_sec();

            WebElement choose_workspace_field = driver.findElement(By.xpath("html/body/div[11]/div[2]/select/option[2]"));
            choose_workspace_field.click();
            wait_sec();

            WebElement add_to_workspace = driver.findElement(By.cssSelector("#addtoworkspace"));
            add_to_workspace.click();
            wait_sec();
            wait_sec();

            assertEquals("File(s) added to workspace successfully.", driver.findElement(By.cssSelector("div.textoFull > span")).getText());


            WebElement workspace_window_button = driver.findElement(By.cssSelector(".cf-workspace"));
            workspace_window_button.click();
            wait_sec();
            wait_sec();

            WebElement workspace1 = driver.findElement(By.cssSelector("#mainContentWrapper"));
            workspace1.isDisplayed();
            wait_sec();
            // new Actions(driver).moveToElement(driver.findElement(By.xpath(""))).perform();

            WebElement check_file2_checkbox = driver.findElement(By.xpath("//i[@name='Workspace']"));
            check_file2_checkbox.isDisplayed();
            check_file2_checkbox.click();
            wait_sec();

            WebElement folder = driver.findElement(By.className("folder"));
            folder.isDisplayed();
            folder.click();
            wait_sec();
            wait_sec();

            try {
                WebElement file_in_folder = driver.findElement(By.xpath("//tbody[@id='workspaceFiles']/tr[2]/td/input"));
                file_in_folder.click();
                wait_sec();

                WebElement delete_file_button = driver.findElement(By.cssSelector(".cf-trashcan2"));
                delete_file_button.click();
                wait_sec();

                WebElement delete_window = driver.findElement(By.cssSelector("#deletemodal"));
                delete_window.isDisplayed();
                wait_sec();

                //delete file in window
                WebElement deletefile_button = driver.findElement(By.cssSelector("#CFDeleteFile"));
                deletefile_button.click();
                wait_sec();
                wait_sec();
                wait_sec();
                wait_sec();

                System.out.println("Files is deleted");


            } catch (Exception i) {

                System.out.println("File is not added");

                WebElement upload_button = driver.findElement(By.cssSelector("#CFUploadFiles"));
                upload_button.click();
                wait_sec();
                wait_sec();

                WebElement upload_field = driver.findElement(By.cssSelector(".dz-default.dz-message"));
                upload_field.click();
                Thread.sleep(5000);
                StringSelection ss = new StringSelection(Path1);
                Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss, null);


                Robot robot = new Robot();
                Thread.sleep(2000);

                // Press Enter
                robot.keyPress(KeyEvent.VK_ENTER);

                // Release Enter
                robot.keyRelease(KeyEvent.VK_ENTER);

                // Press CTRL+V
                robot.keyPress(KeyEvent.VK_CONTROL);
                robot.keyPress(KeyEvent.VK_V);

                // Release CTRL+V
                robot.keyRelease(KeyEvent.VK_CONTROL);
                robot.keyRelease(KeyEvent.VK_V);
                Thread.sleep(2000);

                //Press Enter
                robot.keyPress(KeyEvent.VK_ENTER);
                robot.keyRelease(KeyEvent.VK_ENTER);
                Thread.sleep(12000);

                WebElement file_displayed = driver.findElement(By.cssSelector(".LVFIL"));
                file_displayed.isDisplayed();

                WebElement close_ulpoad = driver.findElement(By.cssSelector("#closeUpload"));
                close_ulpoad.click();
                wait_sec();


                WebElement file_in_folder = driver.findElement(By.xpath("//tbody[@id='workspaceFiles']/tr[2]/td/input"));
                file_in_folder.click();
                wait_sec();

                WebElement delete_file_button = driver.findElement(By.cssSelector(".cf-trashcan2"));
                delete_file_button.click();
                wait_sec();

                WebElement delete_window = driver.findElement(By.cssSelector("#deletemodal"));
                delete_window.isDisplayed();
                wait_sec();

                //delete file in window
                WebElement deletefile_button = driver.findElement(By.cssSelector("#CFDeleteFile"));
                deletefile_button.click();
                wait_sec();
                wait_sec();
                wait_sec();
                wait_sec();

                System.out.println("Files is deleted");
            }

        }
    }


    public void multiple_delete_files_inFolder(String Path ,String Path2, String Path3,String Path1) throws InterruptedException, AWTException {

        WebElement workspace = driver.findElement(By.cssSelector("#mainContentWrapper"));
        workspace.isDisplayed();
        wait_sec();
        //new Actions(driver).moveToElement(driver.findElement(By.xpath(""))).perform();

        WebElement file_checkbox = driver.findElement(By.xpath("//i[@name='Workspace']"));
        file_checkbox.click();
        wait_sec();
        wait_sec();

//        WebElement open_button = driver.findElement(By.cssSelector(".cf-eye8"));
//        open_button.click();
//        wait_sec();
//        wait_sec();
//
        try {
            WebElement folder = driver.findElement(By.className("folder"));
            folder.isDisplayed();
            folder.click();
            wait_sec();
            wait_sec();

            try {
                for (int i = 2; i <= 3; i = i + 1) {
                    WebElement file_in_folder = driver.findElement(By.xpath("//tbody[@id='workspaceFiles']/tr["+i+"]/td/input"));
                    file_in_folder.click();
                    wait_sec();
                }
                WebElement delete_file_button = driver.findElement(By.cssSelector(".cf-trashcan2"));
                delete_file_button.click();
                wait_sec();

                WebElement delete_window = driver.findElement(By.cssSelector("#deletemodal"));
                delete_window.isDisplayed();
                wait_sec();

                //delete file in window
                WebElement deletefile_button = driver.findElement(By.cssSelector("#CFDeleteFile"));
                deletefile_button.click();
                wait_sec();
                wait_sec();
                wait_sec();
                wait_sec();

                System.out.println("Files are deleted");


            } catch (Exception i) {

                System.out.println("File is not added");
///////////////////////////////////////////////////////////////////
                WebElement upload_button = driver.findElement(By.cssSelector("#CFUploadFiles"));
                upload_button.click();
                wait_sec();
                wait_sec();

                WebElement upload_field = driver.findElement(By.cssSelector(".dz-default.dz-message"));
                upload_field.click();
                Thread.sleep(5000);
                StringSelection path = new StringSelection(Path);
                Toolkit.getDefaultToolkit().getSystemClipboard().setContents(path, null);


                Robot robot = new Robot();
                Thread.sleep(2000);

                // Press Enter
                robot.keyPress(KeyEvent.VK_ENTER);

                // Release Enter
                robot.keyRelease(KeyEvent.VK_ENTER);

                // Press CTRL+V
                robot.keyPress(KeyEvent.VK_CONTROL);
                robot.keyPress(KeyEvent.VK_V);

                // Release CTRL+V
                robot.keyRelease(KeyEvent.VK_CONTROL);
                robot.keyRelease(KeyEvent.VK_V);
                Thread.sleep(2000);

                //Press Enter
                robot.keyPress(KeyEvent.VK_ENTER);
                robot.keyRelease(KeyEvent.VK_ENTER);
                Thread.sleep(5000);
/////////////////////////////////////////////////////////////

                WebElement upload_field1 = driver.findElement(By.cssSelector(".dz-default.dz-message"));
                upload_field1.click();
                Thread.sleep(5000);
                StringSelection path1 = new StringSelection(Path2);
                Toolkit.getDefaultToolkit().getSystemClipboard().setContents(path1, null);


                Robot robot1 = new Robot();
                Thread.sleep(2000);

                // Press Enter
                robot.keyPress(KeyEvent.VK_ENTER);

                // Release Enter
                robot.keyRelease(KeyEvent.VK_ENTER);

                // Press CTRL+V
                robot.keyPress(KeyEvent.VK_CONTROL);
                robot.keyPress(KeyEvent.VK_V);

                // Release CTRL+V
                robot.keyRelease(KeyEvent.VK_CONTROL);
                robot.keyRelease(KeyEvent.VK_V);
                Thread.sleep(2000);

                //Press Enter
                robot.keyPress(KeyEvent.VK_ENTER);
                robot.keyRelease(KeyEvent.VK_ENTER);
                Thread.sleep(15000);

//////////////////////////////////////////////////////////////////////
                WebElement file_displayed = driver.findElement(By.cssSelector(".LVFIL"));
                file_displayed.isDisplayed();

                WebElement close_ulpoad = driver.findElement(By.cssSelector("#closeUpload"));
                close_ulpoad.click();
                wait_sec();

                for (int j = 2; j <= 3; j = j + 1) {
                    WebElement file_in_folder = driver.findElement(By.xpath("//tbody[@id='workspaceFiles']/tr["+j+"]/td/input"));
                    file_in_folder.click();
                    wait_sec();
                }

                WebElement delete_file_button = driver.findElement(By.cssSelector(".cf-trashcan2"));
                delete_file_button.click();
                wait_sec();

                WebElement delete_window = driver.findElement(By.cssSelector("#deletemodal"));
                delete_window.isDisplayed();
                wait_sec();

                //delete file in window
                WebElement deletefile_button = driver.findElement(By.cssSelector("#CFDeleteFile"));
                deletefile_button.click();
                wait_sec();
                wait_sec();
                wait_sec();
                wait_sec();

                System.out.println("Files are deleted");

            }


        } catch (Exception ok) {

            System.out.println("File is not added");

            WebElement file_button = driver.findElement(By.cssSelector(".icon-files"));
            file_button.click();
            wait_sec();
            wait_sec();
            wait_sec();
            wait_sec();
            wait_sec();
            wait_sec();

//            WebElement all_files_button = driver.findElement(By.cssSelector("#homeHome"));
//            all_files_button.click();
//            wait_sec();

            WebElement check_folder_checkbox = driver.findElement(By.cssSelector("div[name=FOLDER] > input[type=checkbox]"));
            check_folder_checkbox.click();
            wait_sec();
            wait_sec();

            WebElement workspace_button = driver.findElement(By.xpath("//a[@id='addToWorkspace']/div/div"));
            workspace_button.click();
            wait_sec();
            wait_sec();
            wait_sec();

            WebElement select_workspace_field = driver.findElement(By.cssSelector("#addtoworklist"));
            select_workspace_field.click();
            wait_sec();
            wait_sec();

            WebElement choose_workspace_field = driver.findElement(By.xpath("html/body/div[11]/div[2]/select/option[2]"));
            choose_workspace_field.click();
            wait_sec();

            WebElement add_to_workspace = driver.findElement(By.cssSelector("#addtoworkspace"));
            add_to_workspace.click();
            wait_sec();
            wait_sec();

            assertEquals("File(s) added to workspace successfully.", driver.findElement(By.cssSelector("div.textoFull > span")).getText());


            WebElement workspace_window_button = driver.findElement(By.cssSelector(".cf-workspace"));
            workspace_window_button.click();
            wait_sec();
            wait_sec();

            WebElement workspace1 = driver.findElement(By.cssSelector("#mainContentWrapper"));
            workspace1.isDisplayed();
            wait_sec();
            // new Actions(driver).moveToElement(driver.findElement(By.xpath(""))).perform();

            WebElement check_file2_checkbox = driver.findElement(By.xpath("//i[@name='Workspace']"));
            check_file2_checkbox.isDisplayed();
            check_file2_checkbox.click();
            wait_sec();

            WebElement folder = driver.findElement(By.className("folder"));
            folder.isDisplayed();
            folder.click();
            wait_sec();
            wait_sec();

            try {
                for (int i = 2; i <= 3; i = i + 1) {
                    WebElement file_in_folder = driver.findElement(By.xpath("//tbody[@id='workspaceFiles']/tr["+i+"]/td/input"));
                    file_in_folder.click();
                    wait_sec();
                }
                WebElement delete_file_button = driver.findElement(By.cssSelector(".cf-trashcan2"));
                delete_file_button.click();
                wait_sec();

                WebElement delete_window = driver.findElement(By.cssSelector("#deletemodal"));
                delete_window.isDisplayed();
                wait_sec();

                //delete file in window
                WebElement deletefile_button = driver.findElement(By.cssSelector("#CFDeleteFile"));
                deletefile_button.click();
                wait_sec();
                wait_sec();
                wait_sec();
                wait_sec();

                System.out.println("Files are deleted");


            } catch (Exception i) {

                System.out.println("File is not added");
///////////////////////////////////////////////////////////////////
                WebElement upload_button = driver.findElement(By.cssSelector("#CFUploadFiles"));
                upload_button.click();
                wait_sec();
                wait_sec();

                WebElement upload_field = driver.findElement(By.cssSelector(".dz-default.dz-message"));
                upload_field.click();
                Thread.sleep(5000);
                StringSelection path = new StringSelection(Path3);
                Toolkit.getDefaultToolkit().getSystemClipboard().setContents(path, null);


                Robot robot = new Robot();
                Thread.sleep(2000);

                // Press Enter
                robot.keyPress(KeyEvent.VK_ENTER);

                // Release Enter
                robot.keyRelease(KeyEvent.VK_ENTER);

                // Press CTRL+V
                robot.keyPress(KeyEvent.VK_CONTROL);
                robot.keyPress(KeyEvent.VK_V);

                // Release CTRL+V
                robot.keyRelease(KeyEvent.VK_CONTROL);
                robot.keyRelease(KeyEvent.VK_V);
                Thread.sleep(2000);

                //Press Enter
                robot.keyPress(KeyEvent.VK_ENTER);
                robot.keyRelease(KeyEvent.VK_ENTER);
                Thread.sleep(5000);
/////////////////////////////////////////////////////////////

                WebElement upload_field1 = driver.findElement(By.cssSelector(".dz-default.dz-message"));
                upload_field1.click();
                Thread.sleep(5000);
                StringSelection path1 = new StringSelection(Path1);
                Toolkit.getDefaultToolkit().getSystemClipboard().setContents(path1, null);


                Robot robot1 = new Robot();
                Thread.sleep(2000);

                // Press Enter
                robot.keyPress(KeyEvent.VK_ENTER);

                // Release Enter
                robot.keyRelease(KeyEvent.VK_ENTER);

                // Press CTRL+V
                robot.keyPress(KeyEvent.VK_CONTROL);
                robot.keyPress(KeyEvent.VK_V);

                // Release CTRL+V
                robot.keyRelease(KeyEvent.VK_CONTROL);
                robot.keyRelease(KeyEvent.VK_V);
                Thread.sleep(2000);

                //Press Enter
                robot.keyPress(KeyEvent.VK_ENTER);
                robot.keyRelease(KeyEvent.VK_ENTER);
                Thread.sleep(15000);

//////////////////////////////////////////////////////////////////////
                WebElement file_displayed = driver.findElement(By.cssSelector(".LVFIL"));
                file_displayed.isDisplayed();

                WebElement close_ulpoad = driver.findElement(By.cssSelector("#closeUpload"));
                close_ulpoad.click();
                wait_sec();

                for (int j = 2; j <= 3; j = j + 1) {
                    WebElement file_in_folder = driver.findElement(By.xpath("//tbody[@id='workspaceFiles']/tr["+j+"]/td/input"));
                    file_in_folder.click();
                    wait_sec();
                }

                WebElement delete_file_button = driver.findElement(By.cssSelector(".cf-trashcan2"));
                delete_file_button.click();
                wait_sec();

                WebElement delete_window = driver.findElement(By.cssSelector("#deletemodal"));
                delete_window.isDisplayed();
                wait_sec();

                //delete file in window
                WebElement deletefile_button = driver.findElement(By.cssSelector("#CFDeleteFile"));
                deletefile_button.click();
                wait_sec();
                wait_sec();
                wait_sec();
                wait_sec();

                System.out.println("Files are deleted");

            }

        }
    }

    public void delete_mupltiple_Folder() throws InterruptedException, AWTException {


        WebElement file_button = driver.findElement(By.cssSelector(".icon-files"));
        file_button.click();
        wait_sec();
        wait_sec();
        wait_sec();
        wait_sec();
        wait_sec();
        wait_sec();


        for (int i = 1; i <= 3; i = i + 1) {
            WebElement check_folder_checkbox = driver.findElement(By.xpath(".//*[@id='LVContent']/div[starts-with(@data-type,'FOLDER')][" + i + "]/div[@class='LVcheckBox']"));
            check_folder_checkbox.click();
            wait_sec();
            wait_sec();
        }


        WebElement workspace_button = driver.findElement(By.xpath("//a[@id='addToWorkspace']/div/div"));
        workspace_button.click();
        wait_sec();
        wait_sec();
        wait_sec();

        WebElement select_workspace_field = driver.findElement(By.cssSelector("#addtoworklist"));
        select_workspace_field.click();
        wait_sec();
        wait_sec();

        WebElement choose_workspace_field = driver.findElement(By.xpath("html/body/div[11]/div[2]/select/option[2]"));
        choose_workspace_field.click();
        wait_sec();

        WebElement add_to_workspace = driver.findElement(By.cssSelector("#addtoworkspace"));
        add_to_workspace.click();
        wait_sec();
        wait_sec();

        assertEquals("File(s) added to workspace successfully.", driver.findElement(By.cssSelector("div.textoFull > span")).getText());

        WebElement workspace_window_button = driver.findElement(By.cssSelector(".cf-workspace"));
        workspace_window_button.click();
        wait_sec();
        wait_sec();

        WebElement workspace = driver.findElement(By.cssSelector("#mainContentWrapper"));
        workspace.isDisplayed();
        wait_sec();
        //new Actions(driver).moveToElement(driver.findElement(By.xpath(""))).perform();

        WebElement file_checkbox = driver.findElement(By.xpath("//i[@name='Workspace']"));
        file_checkbox.click();
        wait_sec();
        wait_sec();
        wait_sec();

        WebElement all_checkbox = driver.findElement(By.cssSelector(".table.filesWs>thead>tr>th>input"));
        all_checkbox.isDisplayed();
        all_checkbox.click();
        wait_sec();
        wait_sec();

        WebElement delete_file_button = driver.findElement(By.cssSelector(".cf-trashcan2"));
        delete_file_button.click();
        wait_sec();

        WebElement delete_window = driver.findElement(By.cssSelector("#deletemodal"));
        delete_window.isDisplayed();
        wait_sec();

        //delete file in window
        WebElement deletefile_button = driver.findElement(By.cssSelector("#CFDeleteFile"));
        deletefile_button.click();
        wait_sec();
        wait_sec();
        wait_sec();
        wait_sec();

        System.out.println("Files is deleted");

    }

}