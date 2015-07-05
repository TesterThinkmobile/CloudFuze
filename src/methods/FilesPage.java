package methods;


import org.apache.commons.io.comparator.NameFileComparator;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import static org.testng.Assert.assertEquals;

public class FilesPage extends BasePage {

    WebDriver driver = getDriver();

    @Override
    protected void Init() {

    }

    public FilesPage() {
        super();

    }

  //-------------------------------Operation with file------------------------------------

    public void Open_File() throws InterruptedException {

        WebElement file_checkbox = driver.findElement(By.cssSelector("div[name=FILE] > input[type=checkbox]"));
        file_checkbox.isDisplayed();
        file_checkbox.click();
        wait_sec();

        WebElement open_button = driver.findElement(By.cssSelector(".cf-eye8"));
        open_button.click();
        wait_sec();
        wait_sec();
        wait_sec();

        WebElement content_file_is_displayed = driver.findElement(By.cssSelector("#filePreview"));
        content_file_is_displayed.isDisplayed();
        wait_sec();

        WebElement close_button = driver.findElement(By.cssSelector("#close_preview_window"));
        close_button.click();
        wait_sec();

        WebElement content_isDisplayed = driver.findElement(By.cssSelector("#headerText"));
        content_isDisplayed.isDisplayed();
        wait_sec();

    }

    public void Download_File() throws InterruptedException {

        WebElement file_checkbox = driver.findElement(By.cssSelector("div[name=FILE] > input[type=checkbox]"));
        file_checkbox.isDisplayed();
        file_checkbox.click();
        wait_sec();

        WebElement download_button = driver.findElement(By.cssSelector(".cf-cloud-download2"));
        download_button.click();
        wait_sec();
        wait_sec();
        wait_sec();
        wait_sec();
        wait_sec();

        System.out.println("File is downloaded");

    }

    public void Share_File_publick(String ShareEmail, String Message) throws InterruptedException {

        WebElement file_name = driver.findElement(By.xpath(".//*[@id='LVContent']/div[starts-with(@data-type,'FILE')][1]/div[@class='LVfileName']"));
        file_name.isDisplayed();
        String sharenamefile = file_name.getText();
        System.out.println(sharenamefile);

        WebElement file_checkbox = driver.findElement(By.cssSelector("div[name=FILE] > input[type=checkbox]"));
        file_checkbox.isDisplayed();
        file_checkbox.click();
        wait_sec();

        WebElement share_button = driver.findElement(By.xpath("html/body/section/div[1]/div[3]/div[1]/a[6]/div/div[1]"));
        share_button.click();
        wait_sec();
        wait_sec();

        WebElement share_window = driver.findElement(By.cssSelector("#shareFilesModel"));
        share_window.isDisplayed();
        wait_sec();

        WebElement share_email = driver.findElement(By.cssSelector("#shareEmailId"));
        share_email.sendKeys(ShareEmail);
        wait_sec();

        WebElement share_add_button = driver.findElement(By.cssSelector("#searchShareUser"));
        share_add_button.click();
        wait_sec();
        wait_sec();

        WebElement share_message_field = driver.findElement(By.cssSelector("#messageNotes"));
        share_message_field.sendKeys(Message);
        wait_sec();

//        WebElement switch_inner_button = driver.findElement(By.cssSelector(".onoffswitch"));
//        switch_inner_button.click();
//        wait_sec();

        WebElement share_submit = driver.findElement(By.cssSelector("#shareSubmit"));
        share_submit.click();
        Thread.sleep(4000);

        assertEquals("File(s) has been successfully shared.", driver.findElement(By.cssSelector("div.textoFull > span")).getText());

        WebElement share_page_button = driver.findElement(By.cssSelector("#CFSharedByMe"));
        share_page_button.click();
        wait_sec();
        wait_sec();

        WebElement new_name_displayed = driver.findElement(By.xpath("//*[contains(text(), '" + sharenamefile + "')] | //*[@value='" + sharenamefile + "']"));
        new_name_displayed.isDisplayed();
        wait_sec();
    }
    public void Share_File_private(String ShareEmail, String Message) throws InterruptedException {

        WebElement file_name = driver.findElement(By.xpath(".//*[@id='LVContent']/div[starts-with(@data-type,'FILE')][1]/div[@class='LVfileName']"));
        file_name.isDisplayed();
        String sharenamefile = file_name.getText();
        System.out.println(sharenamefile);

        WebElement file_checkbox = driver.findElement(By.cssSelector("div[name=FILE] > input[type=checkbox]"));
        file_checkbox.isDisplayed();
        file_checkbox.click();
        wait_sec();

        WebElement share_button = driver.findElement(By.xpath("html/body/section/div[1]/div[3]/div[1]/a[6]/div/div[1]"));
        share_button.click();
        wait_sec();
        wait_sec();

        WebElement share_window = driver.findElement(By.cssSelector("#shareFilesModel"));
        share_window.isDisplayed();
        wait_sec();

        WebElement share_email = driver.findElement(By.cssSelector("#shareEmailId"));
        share_email.sendKeys(ShareEmail);
        wait_sec();

        WebElement share_add_button = driver.findElement(By.cssSelector("#searchShareUser"));
        share_add_button.click();
        wait_sec();
        wait_sec();

        WebElement share_message_field = driver.findElement(By.cssSelector("#messageNotes"));
        share_message_field.sendKeys(Message);
        wait_sec();

        // swich_inner button(to private)
        WebElement switch_inner_button = driver.findElement(By.cssSelector(".onoffswitch"));
        switch_inner_button.click();
        wait_sec();

        WebElement share_submit = driver.findElement(By.cssSelector("#shareSubmit"));
        share_submit.click();
        Thread.sleep(4000);

        assertEquals("File(s) has been successfully shared.", driver.findElement(By.cssSelector("div.textoFull > span")).getText());

        WebElement share_page_button = driver.findElement(By.cssSelector("#CFSharedByMe"));
        share_page_button.click();
        wait_sec();
        wait_sec();

        WebElement new_name_displayed = driver.findElement(By.xpath("//*[contains(text(), '" + sharenamefile + "')] | //*[@value='" + sharenamefile + "']"));
        new_name_displayed.isDisplayed();
        wait_sec();
    }

    public void Delete_Share_File() throws InterruptedException {

        WebElement file_checkbox = driver.findElement(By.cssSelector(".LVcheckBox>input"));
        file_checkbox.isDisplayed();
        file_checkbox.click();
        wait_sec();

        WebElement delete_file = driver.findElement(By.cssSelector(".cf-trashcan2"));
        delete_file.isDisplayed();
        delete_file.click();
        wait_sec();

        WebElement delete_file_window = driver.findElement(By.cssSelector("#deletemodal"));
        delete_file_window.isDisplayed();

        WebElement delete_file_share = driver.findElement(By.cssSelector("#CFDeleteShareBMFile"));
        delete_file_share.isDisplayed();
        delete_file_share.click();
        wait_sec();
        wait_sec();

    }

    public void Advanced_Setting_ShareFile(String ShareEmail, String Message) throws InterruptedException {

        WebElement file_name = driver.findElement(By.xpath(".//*[@id='LVContent']/div[starts-with(@data-type,'FILE')][1]/div[@class='LVfileName']"));
        file_name.isDisplayed();
        String sharenamefile = file_name.getText();
        System.out.println(sharenamefile);

        WebElement file_checkbox = driver.findElement(By.cssSelector("div[name=FILE] > input[type=checkbox]"));
        file_checkbox.isDisplayed();
        file_checkbox.click();
        wait_sec();

        WebElement share_button = driver.findElement(By.xpath("html/body/section/div[1]/div[3]/div[1]/a[6]/div/div[1]"));
        share_button.click();
        wait_sec();
        wait_sec();

        WebElement share_window = driver.findElement(By.cssSelector("#shareFilesModel"));
        share_window.isDisplayed();
        wait_sec();

        WebElement share_email = driver.findElement(By.cssSelector("#shareEmailId"));
        share_email.sendKeys(ShareEmail);
        wait_sec();

        WebElement share_add_button = driver.findElement(By.cssSelector("#searchShareUser"));
        share_add_button.click();
        wait_sec();
        wait_sec();

        WebElement share_message_field = driver.findElement(By.cssSelector("#messageNotes"));
        share_message_field.sendKeys(Message);
        wait_sec();

//        WebElement switch_inner_button = driver.findElement(By.cssSelector(".onoffswitch"));
//        switch_inner_button.click();
//        wait_sec();

        //-----------------------advanced setting-------------------------------------------
        WebElement set_password = driver.findElement(By.cssSelector("#setPwdSAS>span>input"));
        set_password.isDisplayed();
        set_password.click();
        wait_sec();

        WebElement password_field_1 = driver.findElement(By.xpath("html/body/div[4]/div[2]/div[2]/div[3]/div[1]/div[1]/span[2]/input"));
        password_field_1.isDisplayed();
        password_field_1.sendKeys("123456");
        wait_sec();

        WebElement password_field_2 = driver.findElement(By.xpath("html/body/div[4]/div[2]/div[2]/div[3]/div[1]/div[1]/span[3]/input"));
        password_field_2.isDisplayed();
        password_field_2.sendKeys("123456");
        wait_sec();

        WebElement set_data = driver.findElement(By.cssSelector("#setExpSAS>span>input"));
        set_data.isDisplayed();
        set_data.click();
        wait_sec();

        WebElement data_field = driver.findElement(By.cssSelector("#datetimepicker"));
        data_field.isDisplayed();
        data_field.click();
        wait_sec();

        WebElement choose_data_displayed = driver.findElement(By.cssSelector("#ui-datepicker-div"));
        choose_data_displayed.isDisplayed();
        wait_sec();

        WebElement choose_data_click = driver.findElement(By.cssSelector(".ui-state-default.ui-state-hover"));
        choose_data_click.click();
        wait_sec();

        WebElement download_count_checkbox = driver.findElement(By.cssSelector("#setDownCount>span>input"));
        download_count_checkbox.isDisplayed();
        download_count_checkbox.click();
        wait_sec();

        WebElement download_count_field = driver.findElement(By.cssSelector("#downloadCount"));
        download_count_field.isDisplayed();
        download_count_field.sendKeys("5");
        wait_sec();


        WebElement share_submit = driver.findElement(By.cssSelector("#shareSubmit"));
        share_submit.click();
        Thread.sleep(4000);

        assertEquals("File(s) has been successfully shared.", driver.findElement(By.cssSelector("div.textoFull > span")).getText());

        WebElement share_page_button = driver.findElement(By.cssSelector("#CFSharedByMe"));
        share_page_button.click();
        wait_sec();
        wait_sec();

        WebElement new_name_displayed = driver.findElement(By.xpath("//*[contains(text(), '" + sharenamefile + "')] | //*[@value='" + sharenamefile + "']"));
        new_name_displayed.isDisplayed();
        wait_sec();

    }

    public void Advanced_Setting_ShareFile_negatibe(String ShareEmail, String Message) throws InterruptedException {

        WebElement file_name = driver.findElement(By.xpath(".//*[@id='LVContent']/div[starts-with(@data-type,'FILE')][1]/div[@class='LVfileName']"));
        file_name.isDisplayed();
        String sharenamefile = file_name.getText();
        System.out.println(sharenamefile);

        WebElement file_checkbox = driver.findElement(By.cssSelector("div[name=FILE] > input[type=checkbox]"));
        file_checkbox.isDisplayed();
        file_checkbox.click();
        wait_sec();

        WebElement share_button = driver.findElement(By.xpath("html/body/section/div[1]/div[3]/div[1]/a[6]/div/div[1]"));
        share_button.click();
        wait_sec();
        wait_sec();

        WebElement share_window = driver.findElement(By.cssSelector("#shareFilesModel"));
        share_window.isDisplayed();
        wait_sec();

        WebElement share_email = driver.findElement(By.cssSelector("#shareEmailId"));
        share_email.sendKeys(ShareEmail);
        wait_sec();

        WebElement share_add_button = driver.findElement(By.cssSelector("#searchShareUser"));
        share_add_button.click();
        wait_sec();
        wait_sec();

        WebElement share_message_field = driver.findElement(By.cssSelector("#messageNotes"));
        share_message_field.sendKeys(Message);
        wait_sec();

//        WebElement switch_inner_button = driver.findElement(By.cssSelector(".onoffswitch"));
//        switch_inner_button.click();
//        wait_sec();

        //-----------------------advanced setting-------------------------------------------
        WebElement set_password = driver.findElement(By.cssSelector("#setPwdSAS>span>input"));
        set_password.isDisplayed();
        set_password.click();
        wait_sec();

        WebElement password_field_1 = driver.findElement(By.xpath("html/body/div[4]/div[2]/div[2]/div[3]/div[1]/div[1]/span[2]/input"));
        password_field_1.isDisplayed();
        password_field_1.sendKeys("123456");
        wait_sec();

        WebElement password_field_2 = driver.findElement(By.xpath("html/body/div[4]/div[2]/div[2]/div[3]/div[1]/div[1]/span[3]/input"));
        password_field_2.isDisplayed();
        password_field_2.sendKeys("654321");
        wait_sec();

//        WebElement set_data = driver.findElement(By.cssSelector("#setExpSAS>span>input"));
//        set_data.isDisplayed();
//        set_data.click();
//        wait_sec();
//
//        WebElement data_field = driver.findElement(By.cssSelector("#datetimepicker"));
//        data_field.isDisplayed();
//        data_field.click();
//        wait_sec();
//
//        WebElement choose_data_displayed = driver.findElement(By.cssSelector("#ui-datepicker-div"));
//        choose_data_displayed.isDisplayed();
//        wait_sec();
//
//        WebElement choose_data_click = driver.findElement(By.cssSelector(".ui-state-default.ui-state-hover"));
//        choose_data_click.click();
//        wait_sec();
//
//        WebElement download_count_checkbox = driver.findElement(By.cssSelector("#setDownCount>span>input"));
//        download_count_checkbox.isDisplayed();
//        download_count_checkbox.click();
//        wait_sec();
//
//        WebElement download_count_field = driver.findElement(By.cssSelector("#downloadCount"));
//        download_count_field.isDisplayed();
//        download_count_field.sendKeys("5");
//        wait_sec();


        WebElement share_submit = driver.findElement(By.cssSelector("#shareSubmit"));
        share_submit.click();
        wait_sec();

        assertEquals("Password and Confirm password should match.", driver.findElement(By.id("displayMsg")).getText());

    }

    public void Edit_permision_ShareFile(String ShareEmail, String Message) throws InterruptedException {

        WebElement file_name = driver.findElement(By.xpath(".//*[@id='LVContent']/div[starts-with(@data-type,'FILE')][1]/div[@class='LVfileName']"));
        file_name.isDisplayed();
        String sharenamefile = file_name.getText();
        System.out.println(sharenamefile);

        WebElement file_checkbox = driver.findElement(By.cssSelector("div[name=FILE] > input[type=checkbox]"));
        file_checkbox.isDisplayed();
        file_checkbox.click();
        wait_sec();

        WebElement share_button = driver.findElement(By.xpath("html/body/section/div[1]/div[3]/div[1]/a[6]/div/div[1]"));
        share_button.click();
        wait_sec();
        wait_sec();

        WebElement share_window = driver.findElement(By.cssSelector("#shareFilesModel"));
        share_window.isDisplayed();
        wait_sec();

        WebElement share_email = driver.findElement(By.cssSelector("#shareEmailId"));
        share_email.sendKeys(ShareEmail);
        wait_sec();

        WebElement share_add_button = driver.findElement(By.cssSelector("#searchShareUser"));
        share_add_button.click();
        wait_sec();
        wait_sec();

        WebElement share_message_field = driver.findElement(By.cssSelector("#messageNotes"));
        share_message_field.sendKeys(Message);
        wait_sec();

//        WebElement switch_inner_button = driver.findElement(By.cssSelector(".onoffswitch"));
//        switch_inner_button.click();
//        wait_sec();

        //-----------------------Permissions-------------------------------------------
        if ( !driver.findElement(By.xpath("//tr[@id='"+ ShareEmail +"']/td[3]/input")).isSelected());
        {
            driver.findElement(By.xpath("//tr[@id='"+ ShareEmail +"']/td[3]/input")).click();
        }


        WebElement share_submit = driver.findElement(By.cssSelector("#shareSubmit"));
        share_submit.click();
        Thread.sleep(4000);

        assertEquals("File(s) has been successfully shared.", driver.findElement(By.cssSelector("div.textoFull > span")).getText());

        WebElement share_page_button = driver.findElement(By.cssSelector("#CFSharedByMe"));
        share_page_button.click();
        wait_sec();
        wait_sec();

        WebElement new_name_displayed = driver.findElement(By.xpath("//*[contains(text(), '" + sharenamefile + "')] | //*[@value='" + sharenamefile + "']"));
        new_name_displayed.isDisplayed();
        wait_sec();

    }

    public void CoOwner_permision_ShareFile(String ShareEmail, String Message) throws InterruptedException {

        WebElement file_name = driver.findElement(By.xpath(".//*[@id='LVContent']/div[starts-with(@data-type,'FILE')][1]/div[@class='LVfileName']"));
        file_name.isDisplayed();
        String sharenamefile = file_name.getText();
        System.out.println(sharenamefile);

        WebElement file_checkbox = driver.findElement(By.cssSelector("div[name=FILE] > input[type=checkbox]"));
        file_checkbox.isDisplayed();
        file_checkbox.click();
        wait_sec();

        WebElement share_button = driver.findElement(By.xpath("html/body/section/div[1]/div[3]/div[1]/a[6]/div/div[1]"));
        share_button.click();
        wait_sec();
        wait_sec();

        WebElement share_window = driver.findElement(By.cssSelector("#shareFilesModel"));
        share_window.isDisplayed();
        wait_sec();

        WebElement share_email = driver.findElement(By.cssSelector("#shareEmailId"));
        share_email.sendKeys(ShareEmail);
        wait_sec();

        WebElement share_add_button = driver.findElement(By.cssSelector("#searchShareUser"));
        share_add_button.click();
        wait_sec();
        wait_sec();

        WebElement share_message_field = driver.findElement(By.cssSelector("#messageNotes"));
        share_message_field.sendKeys(Message);
        wait_sec();

//        WebElement switch_inner_button = driver.findElement(By.cssSelector(".onoffswitch"));
//        switch_inner_button.click();
//        wait_sec();

        //-----------------------Permissions-------------------------------------------
        if ( !driver.findElement(By.xpath("//tr[@id='"+ ShareEmail +"']/td[4]/input")).isSelected());
        {
            driver.findElement(By.xpath("//tr[@id='"+ ShareEmail +"']/td[4]/input")).click();
        }


        WebElement share_submit = driver.findElement(By.cssSelector("#shareSubmit"));
        share_submit.click();
        Thread.sleep(4000);

        assertEquals("File(s) has been successfully shared.", driver.findElement(By.cssSelector("div.textoFull > span")).getText());

        WebElement share_page_button = driver.findElement(By.cssSelector("#CFSharedByMe"));
        share_page_button.click();
        wait_sec();
        wait_sec();

        WebElement new_name_displayed = driver.findElement(By.xpath("//*[contains(text(), '" + sharenamefile + "')] | //*[@value='" + sharenamefile + "']"));
        new_name_displayed.isDisplayed();
        wait_sec();

    }

    public void Share_with_me() throws InterruptedException {

        WebElement share_with_me_button = driver.findElement(By.cssSelector("#CFSharedWithMe"));
        share_with_me_button.click();
        wait_sec();

        WebElement file_is_displayed = driver.findElement(By.cssSelector(".LVcheckBox>input"));
        file_is_displayed.isDisplayed();
        wait_sec();
        wait_sec();

    }

    public void Rename_File(String Name) throws InterruptedException {

        WebElement file_checkbox = driver.findElement(By.cssSelector("div[name=FILE] > input[type=checkbox]"));
        file_checkbox.isDisplayed();
        file_checkbox.click();
        wait_sec();

        WebElement rename_button = driver.findElement(By.cssSelector(".cf-edit3"));
        rename_button.click();
        wait_sec();
        wait_sec();

        WebElement rename_field = driver.findElement(By.cssSelector(".renameInput"));
        rename_field.clear();
        rename_field.sendKeys(Name);
        wait_sec();

        WebElement rename_ok_button = driver.findElement(By.cssSelector(".RenameOk"));
        rename_ok_button.click();
        Thread.sleep(3000);

        assertEquals("File renamed successfully.", driver.findElement(By.cssSelector("div.textoFull > span")).getText());

    }

    public void Chose_Category_File(String CategoryName) throws InterruptedException {

        WebElement file_checkbox = driver.findElement(By.cssSelector("div[name=FILE] > input[type=checkbox]"));
        file_checkbox.isDisplayed();
        file_checkbox.click();
        wait_sec();

        WebElement category_button = driver.findElement(By.xpath("html/body/section/div[1]/div[3]/div[1]/a[9]/div/div[1]"));
        category_button.click();
        wait_sec();
        wait_sec();

        WebElement category_field = driver.findElement(By.cssSelector("#ms-input-0"));
        category_field.isDisplayed();
        category_field.clear();
        category_field.sendKeys(CategoryName);
        wait_sec();

        WebElement category_ok_button = driver.findElement(By.cssSelector("#CFAddCategoryButton"));
        category_ok_button.click();
        Thread.sleep(4000);

        assertEquals("File(s) added to category successfully.", driver.findElement(By.cssSelector("div.textoFull > span")).getText());

    }


    public void Workspace_File() throws InterruptedException {

        WebElement file_checkbox = driver.findElement(By.xpath("html/body/section/div[1]/div[5]/div/div[4]/div/div[3]/div[1]/div[1]/input"));
        file_checkbox.isDisplayed();
        file_checkbox.click();
        wait_sec();

        WebElement workspace_button = driver.findElement(By.xpath("html/body/section/div[1]/div[3]/div[1]/a[10]/div/div[1]"));
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
        Thread.sleep(4000);

        assertEquals("File(s) added to workspace successfully.", driver.findElement(By.cssSelector("div.textoFull > span")).getText());

    }

    public void Delete_File() throws InterruptedException {

        WebElement file_checkbox = driver.findElement(By.xpath("html/body/section/div[1]/div[5]/div/div[4]/div/div[3]/div[1]/div[1]/input"));
        file_checkbox.isDisplayed();
        file_checkbox.click();
        wait_sec();

        WebElement delete_button = driver.findElement(By.cssSelector(".cf-trashcan2"));
        delete_button.click();
        wait_sec();
        wait_sec();
        wait_sec();

        WebElement delete_contetn_displayed = driver.findElement(By.cssSelector("#deletemodal"));
        delete_contetn_displayed.isDisplayed();
        wait_sec();

        WebElement confirtm_delete_button = driver.findElement(By.cssSelector("#CFDeleteFile"));
        confirtm_delete_button.click();
        Thread.sleep(800);

        assertEquals("Deleting...", driver.findElement(By.cssSelector("#deleting > span.active-link1")).getText());
        wait_sec();

        System.out.println("File is deleted");

    }

    public void Add_Favorites_File() throws InterruptedException {


        WebElement file_name = driver.findElement(By.xpath(".//*[@id='LVContent']/div[starts-with(@data-type,'FILE')][1]/div[@class='LVfileName']"));
        file_name .isDisplayed();
        String namefile = file_name.getText();
        System.out.println(namefile);

        WebElement  favourite_file_button = driver.findElement(By.xpath("html/body/section/div[1]/div[5]/div/div[4]/div/div[3]/div[1]/div[3]/a"));
        favourite_file_button.click();
        wait_sec();

        //check file in favourite page
        WebElement favourite_button = driver.findElement(By.cssSelector("#favourite"));
        favourite_button.click();
        wait_sec();
        wait_sec();
        wait_sec();
        wait_sec();


        try {

            WebElement new_name_displayed = driver.findElement(By.xpath("//*[contains(text(), '" + namefile + "')] | //*[@value='" + namefile + "']"));
            new_name_displayed.isDisplayed();
            wait_sec();
        }
        catch(Exception ok){

            WebElement filespage_button = driver.findElement(By.cssSelector((".icon-files")));
            filespage_button.click();
            wait_sec();
            wait_sec();
            wait_sec();

            WebElement file_name1 = driver.findElement(By.xpath(".//*[@id='LVContent']/div[starts-with(@data-type,'FILE')][1]/div[@class='LVfileName']"));
            file_name1.isDisplayed();
            String namefile1 = file_name1.getText();
            System.out.println(namefile1);

            WebElement  favourite_file_button1 = driver.findElement(By.xpath("html/body/section/div[1]/div[5]/div/div[4]/div/div[3]/div[1]/div[3]/a"));
            favourite_file_button1.click();
            wait_sec();

            //check file in favourite page
            WebElement favourite_button1 = driver.findElement(By.cssSelector("#favourite"));
            favourite_button1.click();
            wait_sec();
            wait_sec();

            WebElement new_name_displayed = driver.findElement(By.xpath("//*[contains(text(), '" + namefile1 + "')] | //*[@value='" + namefile1 + "']"));
            new_name_displayed.isDisplayed();
            wait_sec();


        }

    }
//---------------------------------Category Page-----------------------------------------

    public void Category_Page() throws InterruptedException {

        WebElement categoryPage_button = driver.findElement(By.cssSelector("#categorytogle"));
        categoryPage_button.isDisplayed();
        categoryPage_button.click();
        wait_sec();
        wait_sec();

        WebElement category_list_isdisplayed = driver.findElement(By.cssSelector("#categoryList"));
        category_list_isdisplayed.isDisplayed();
        wait_sec();

    }


    public void Add_new_category(String Name) throws InterruptedException {

        WebElement add_new_category = driver.findElement(By.cssSelector("#addCategory"));
        add_new_category.click();
        wait_sec();

        WebElement add_category_field = driver.findElement(By.cssSelector(".categoryInput"));
        add_category_field.sendKeys(Name);
        wait_sec();

        WebElement add_category_button = driver.findElement(By.cssSelector(".OkCategoryEdit"));
        add_category_button.click();
        wait_sec();

    }








}
