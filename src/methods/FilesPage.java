package methods;


import org.apache.commons.io.comparator.NameFileComparator;
import org.openqa.selenium.*;
import org.testng.Assert;

import static org.hamcrest.Matchers.containsString;
import static org.junit.Assert.assertThat;
import static org.openqa.selenium.lift.match.TextMatcher.text;
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

    public void All_file_page(String Checkbox) throws InterruptedException {

        WebElement all_file_button = driver.findElement(By.cssSelector("#homeHome"));
        all_file_button.click();
        wait_sec();

        WebElement file_checkbox = driver.findElement(By.cssSelector(Checkbox));
        file_checkbox.isDisplayed();
        wait_sec();

    }


    public void Open_File(String check_Shared_Password,String Checkbox) throws InterruptedException {

        WebElement file_checkbox = driver.findElement(By.cssSelector(Checkbox));
        file_checkbox.isDisplayed();
        file_checkbox.click();
        wait_sec();

        WebElement open_button = driver.findElement(By.cssSelector(".cf-eye8"));
        open_button.click();
        wait_sec();
        wait_sec();
        wait_sec();
        try{
            WebElement password_isDisplayed = driver.findElement(By.cssSelector("#myPriviewPasswordModel"));
            password_isDisplayed.isDisplayed();
            wait_sec();
            wait_sec();

            WebElement password_filed = driver.findElement(By.cssSelector("#priviewPswd"));
            password_filed.isDisplayed();
            password_filed.sendKeys(check_Shared_Password);
            wait_sec();

            WebElement ok_button = driver.findElement(By.cssSelector(".button.mini.rounded.blue.CFPriviewPwdok"));
            ok_button.click();
            wait_sec();
            wait_sec();
            wait_sec();


            try {
                WebElement file_displayed = driver.findElement(By.cssSelector("#filePreview"));
                file_displayed.isDisplayed();
                wait_sec();

                WebElement close_button = driver.findElement(By.cssSelector("#close_preview_window"));
                close_button.click();
                wait_sec();
                wait_sec();

                WebElement header_displayed = driver.findElement(By.cssSelector("#headerText"));
                header_displayed.isDisplayed();
                wait_sec();


            }
            catch (Exception ok){

               WebElement message =  driver.findElement(By.cssSelector(".statusMesg"));
               message.isDisplayed();
               wait_sec();

                WebElement cancel_button = driver.findElement(By.xpath("html/body/div[8]/div[3]/div/a[1]"));
                cancel_button.click();
                cancel_button.click();
                wait_sec();
                wait_sec();
                wait_sec();

            }
        }
        catch (Exception s) {


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

 }

    public void Open_Folder(String check_Shared_Password,String Checkbox) throws InterruptedException {

        WebElement file_checkbox = driver.findElement(By.cssSelector(Checkbox));
        file_checkbox.isDisplayed();
        file_checkbox.click();
        wait_sec();

        WebElement open_button = driver.findElement(By.cssSelector(".cf-eye8"));
        open_button.click();
        wait_sec();
        wait_sec();
        wait_sec();

        WebElement password_isDisplayed = driver.findElement(By.cssSelector("#sharePasswordModel"));
        password_isDisplayed.isDisplayed();
        wait_sec();
        wait_sec();

        WebElement password_filed = driver.findElement(By.xpath("html/body/div[6]/div[2]/div[1]/input"));
        password_filed.isDisplayed();
        password_filed.sendKeys(check_Shared_Password);
        wait_sec();

        WebElement ok_button = driver.findElement(By.cssSelector("#CFSharePwdButton"));
        ok_button.click();
        wait_sec();
        wait_sec();
        wait_sec();


        WebElement folder_displayed = driver.findElement(By.cssSelector("#mainContentWrapper"));
        folder_displayed.isDisplayed();
        wait_sec();







    }

    public void Open_File_negative(String check_Shared_Password, String Checkbox) throws InterruptedException {

        WebElement file_checkbox = driver.findElement(By.cssSelector(Checkbox));
        file_checkbox.isDisplayed();
        file_checkbox.click();
        wait_sec();

        WebElement open_button = driver.findElement(By.cssSelector(".cf-eye8"));
        open_button.click();
        wait_sec();
        wait_sec();
        wait_sec();

        WebElement password_isDisplayed = driver.findElement(By.cssSelector("#myPriviewPasswordModel"));
        password_isDisplayed.isDisplayed();
        wait_sec();
        wait_sec();

        WebElement password_filed = driver.findElement(By.cssSelector("#priviewPswd"));
        password_filed.isDisplayed();
        password_filed.sendKeys(check_Shared_Password);
        wait_sec();

        WebElement ok_button = driver.findElement(By.cssSelector(".button.mini.rounded.blue.CFPriviewPwdok"));
        ok_button.click();
        wait_sec();

        WebElement message =  driver.findElement(By.cssSelector(".statusMesg"));
        message.isDisplayed();
        wait_sec();

        WebElement cancel_button = driver.findElement(By.xpath("html/body/div[8]/div[3]/div/a[1]"));
        cancel_button.click();
        wait_sec();
        wait_sec();
        wait_sec();

        WebElement content_isDisplayed = driver.findElement(By.cssSelector("#headerText"));
        content_isDisplayed.isDisplayed();
        wait_sec();


    }

    public void Open_Folder_negative(String check_Shared_Password, String Checkbox) throws InterruptedException {

        WebElement file_checkbox = driver.findElement(By.cssSelector(Checkbox));
        file_checkbox.isDisplayed();
        file_checkbox.click();
        wait_sec();

        WebElement open_button = driver.findElement(By.cssSelector(".cf-eye8"));
        open_button.click();
        wait_sec();
        wait_sec();
        wait_sec();

        WebElement password_isDisplayed = driver.findElement(By.cssSelector("#sharePasswordModel"));
        password_isDisplayed.isDisplayed();
        wait_sec();
        wait_sec();

        WebElement password_filed = driver.findElement(By.xpath("html/body/div[6]/div[2]/div[1]/input"));
        password_filed.isDisplayed();
        password_filed.sendKeys(check_Shared_Password);
        wait_sec();

        WebElement ok_button = driver.findElement(By.cssSelector("#CFSharePwdButton"));
        ok_button.click();
        wait_sec();


        WebElement message =  driver.findElement(By.cssSelector(".statusMesg"));
        message.isDisplayed();
        wait_sec();

        WebElement cancel_button = driver.findElement(By.cssSelector("#_sharePwdClose"));
        cancel_button.click();
        wait_sec();
        wait_sec();
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

    public void Share_File_publick(String ShareEmail, String Message, String FileName, String Checkbox) throws InterruptedException {

        WebElement file_name = driver.findElement(By.xpath(FileName));
        file_name.isDisplayed();
        String sharenamefile = file_name.getText();
        System.out.println(sharenamefile);

        WebElement file_checkbox = driver.findElement(By.cssSelector(Checkbox));
        file_checkbox.isDisplayed();
        file_checkbox.click();
        wait_sec();

        WebElement share_button = driver.findElement(By.xpath("//a[@id='CFAShare']/div/div"));
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




    public void Share_File_private(String ShareEmail, String Message, String FileName, String Checkbox) throws InterruptedException {

        WebElement file_name = driver.findElement(By.xpath(FileName));
        file_name.isDisplayed();
        String sharenamefile = file_name.getText();
        System.out.println(sharenamefile);

        WebElement file_checkbox = driver.findElement(By.cssSelector(Checkbox));
        file_checkbox.isDisplayed();
        file_checkbox.click();
        wait_sec();

        WebElement share_button = driver.findElement(By.xpath("//a[@id='CFAShare']/div/div"));
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


    public void Share_File_private_to_MultipleCollaborator(String ShareEmail,String ShareEmail1,String ShareEmail2, String Message,String FileName, String Checkbox) throws InterruptedException {

        WebElement file_name = driver.findElement(By.xpath(FileName));
        file_name.isDisplayed();
        String sharenamefile = file_name.getText();
        System.out.println(sharenamefile);

        WebElement file_checkbox = driver.findElement(By.cssSelector(Checkbox));
        file_checkbox.isDisplayed();
        file_checkbox.click();
        wait_sec();

        WebElement share_button = driver.findElement(By.xpath("//a[@id='CFAShare']/div/div"));
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

        WebElement share_email1 = driver.findElement(By.cssSelector("#shareEmailId"));
        share_email1.sendKeys(ShareEmail1);
        wait_sec();

        WebElement share_add_button1 = driver.findElement(By.cssSelector("#searchShareUser"));
        share_add_button1.click();
        wait_sec();
        wait_sec();

        WebElement share_email2 = driver.findElement(By.cssSelector("#shareEmailId"));
        share_email2.sendKeys(ShareEmail2);
        wait_sec();

        WebElement share_add_button2 = driver.findElement(By.cssSelector("#searchShareUser"));
        share_add_button2.click();
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

    public void Share_MultipleFile_private(String ShareEmail, String Message) throws InterruptedException {


        String[] sharenamefile = new String[4];

        for (int i = 1; i <= 3; i=i+1) {
            WebElement file_name = driver.findElement(By.xpath(".//*[@id='LVContent']/div[starts-with(@data-type,'FILE')]["+i+"]/div[@class='LVfileName']"));
            ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", file_name);
            file_name.isDisplayed();
            sharenamefile[i] = file_name.getText();
            System.out.println(sharenamefile[i]);

            WebElement file_checkbox = driver.findElement(By.xpath(".//*[@id='LVContent']/div[starts-with(@data-type,'FILE')][" + i + "]/div[@class='LVcheckBox']"));
            file_checkbox.isDisplayed();
            file_checkbox.click();
            wait_sec();
        }
        WebElement share_button = driver.findElement(By.xpath("//a[@id='CFAShare']/div/div"));
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
        for (int i = 1; i <= 3; i=i+1) {
            WebElement new_name_displayed = driver.findElement(By.xpath("//*[contains(text(), '" + sharenamefile[i] + "')] | //*[@value='" + sharenamefile[i] + "']"));
            new_name_displayed.isDisplayed();
            wait_sec();
        }
    }


    public void Share_MultipleFolder_private(String ShareEmail, String Message) throws InterruptedException {


        String[] sharenamefile = new String[4];

        for (int i = 1; i <= 3; i=i+1) {
            WebElement file_name = driver.findElement(By.xpath(".//*[@id='LVContent']/div[starts-with(@data-type,'FOLDER')]["+i+"]/div[@class='LVfileName']"));
            ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", file_name);
            file_name.isDisplayed();
            sharenamefile[i] = file_name.getText();
            System.out.println(sharenamefile[i]);

            WebElement file_checkbox = driver.findElement(By.xpath(".//*[@id='LVContent']/div[starts-with(@data-type,'FOLDER')][" + i + "]/div[@class='LVcheckBox']"));
            file_checkbox.isDisplayed();
            file_checkbox.click();
            wait_sec();
        }
        WebElement share_button = driver.findElement(By.xpath("//a[@id='CFAShare']/div/div"));
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
        for (int i = 1; i <= 3; i=i+1) {
            WebElement new_name_displayed = driver.findElement(By.xpath("//*[contains(text(), '" + sharenamefile[i] + "')] | //*[@value='" + sharenamefile[i] + "']"));
            new_name_displayed.isDisplayed();
            wait_sec();
        }
    }

    public void Share_File_icon() throws InterruptedException {

        try {
            WebElement share_icon = driver.findElement(By.cssSelector(".LVSharetrue"));
            ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", share_icon);
            share_icon.isDisplayed();
            wait_sec();
        }
        catch (Exception error){

            System.out.println("File is located in folder");
        }

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
        wait_sec();

        try {
            WebElement delete_file_share = driver.findElement(By.cssSelector("#CFDeleteShareBMFile"));
            delete_file_share.isDisplayed();
            delete_file_share.click();
            wait_sec();
            wait_sec();
        }
        catch (Exception ok){
        WebElement delete_file_share = driver.findElement(By.cssSelector("#CFDeleteSharedwithfile"));
        delete_file_share.isDisplayed();
        delete_file_share.click();
        wait_sec();
        wait_sec();
        }
    }

    public void Delete_Share_MultipleFile() throws InterruptedException {

        WebElement file_checkbox = driver.findElement(By.cssSelector(".LVHcheckBox>input"));
        file_checkbox.isDisplayed();
        file_checkbox.click();
        wait_sec();

        WebElement delete_file = driver.findElement(By.xpath("//a[@id='CFHDelete']/div/div"));
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

    public void Delete_Share_File_in_cloud(String Checkbox1) throws InterruptedException {

        WebElement file_checkbox = driver.findElement(By.xpath(Checkbox1));
        file_checkbox.isDisplayed();
        file_checkbox.click();
        wait_sec();

        WebElement delete_file = driver.findElement(By.cssSelector(".cf-trashcan2"));
        delete_file.isDisplayed();
        delete_file.click();
        wait_sec();

        WebElement delete_file_window = driver.findElement(By.cssSelector("#deletemodal"));
        delete_file_window.isDisplayed();

        WebElement delete_file_share = driver.findElement(By.cssSelector("#CFDeleteFile"));
        delete_file_share.isDisplayed();
        delete_file_share.click();
        wait_sec();
        wait_sec();

    }

    public void Advanced_Setting_ShareFile(String ShareEmail, String Message, String Share_Password, String Share_confirm_password,String FileName, String Checkbox) throws InterruptedException {

        WebElement file_name = driver.findElement(By.xpath(FileName));
        file_name.isDisplayed();
        String sharenamefile = file_name.getText();
        System.out.println(sharenamefile);

        WebElement file_checkbox = driver.findElement(By.cssSelector(Checkbox));
        file_checkbox.isDisplayed();
        file_checkbox.click();
        wait_sec();

        WebElement share_button = driver.findElement(By.xpath("//a[@id='CFAShare']/div/div"));
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
        password_field_1.sendKeys(Share_Password);
        wait_sec();

        WebElement password_field_2 = driver.findElement(By.xpath("html/body/div[4]/div[2]/div[2]/div[3]/div[1]/div[1]/span[3]/input"));
        password_field_2.isDisplayed();
        password_field_2.sendKeys(Share_confirm_password);
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
        try {
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
        catch (Exception ok){

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

    }

    public void Advanced_Setting_ShareFile_negatibe(String ShareEmail, String Message,String FileName, String Checkbox) throws InterruptedException {

        WebElement file_name = driver.findElement(By.xpath(FileName));
        file_name.isDisplayed();
        String sharenamefile = file_name.getText();
        System.out.println(sharenamefile);

        WebElement file_checkbox = driver.findElement(By.cssSelector(Checkbox));
        file_checkbox.isDisplayed();
        file_checkbox.click();
        wait_sec();

        WebElement share_button = driver.findElement(By.xpath("//a[@id='CFAShare']/div/div"));
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

    public void Edit_permision_ShareFile(String ShareEmail, String Message,String FileName, String Checkbox) throws InterruptedException {

        WebElement file_name = driver.findElement(By.xpath(FileName));
        file_name.isDisplayed();
        String sharenamefile = file_name.getText();
        System.out.println(sharenamefile);

        WebElement file_checkbox = driver.findElement(By.cssSelector(Checkbox));
        file_checkbox.isDisplayed();
        file_checkbox.click();
        wait_sec();

        WebElement share_button = driver.findElement(By.xpath("//a[@id='CFAShare']/div/div"));
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

    public void CoOwner_permision_ShareFile(String ShareEmail, String Message,String FileName, String Checkbox) throws InterruptedException {

        WebElement file_name = driver.findElement(By.xpath(FileName));
        file_name.isDisplayed();
        String sharenamefile = file_name.getText();
        System.out.println(sharenamefile);

        WebElement file_checkbox = driver.findElement(By.cssSelector(Checkbox));
        file_checkbox.isDisplayed();
        file_checkbox.click();
        wait_sec();

        WebElement share_button = driver.findElement(By.xpath("//a[@id='CFAShare']/div/div"));
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

        try {
            WebElement share_with_me_button = driver.findElement(By.cssSelector("#CFSharedWithMe"));
            share_with_me_button.click();
            wait_sec();

            WebElement file_is_displayed = driver.findElement(By.cssSelector(".LVcheckBox>input"));
            file_is_displayed.isDisplayed();
            wait_sec();
            wait_sec();
        }
        catch (Exception ok){

            System.out.println("File was deleted in collaborator cloud ");
        }

    }

    public void Share_by_me() throws InterruptedException {


        try {
        WebElement share_by_me_button = driver.findElement(By.cssSelector("#CFSharedByMe"));
        share_by_me_button.click();
        wait_sec();

        WebElement file_is_displayed = driver.findElement(By.cssSelector(".LVcheckBox>input"));
        file_is_displayed.isDisplayed();
        wait_sec();
        wait_sec();

        }
        catch (Exception ok){

            System.out.println("File was deleted");
        }

    }



    public void Check_in_email(String ShareEmail) throws InterruptedException {


        //go to email
        driver.get("http://www.yopmail.com/");
        wait_sec();
        wait_sec();

        WebElement login_field = driver.findElement(By.cssSelector("#login"));
        login_field.sendKeys(ShareEmail);
        System.out.println(ShareEmail);
        wait_sec();

        WebElement submit_button = driver.findElement(By.cssSelector(".sbut"));
        submit_button.click();
        wait_sec();
        wait_sec();
        wait_sec();

        driver.switchTo().frame("ifmail");//(driver.findElement(By.cssSelector(".couponBlock>tbody>tr>td>table>tbody>tr>td>a")));
        WebElement activate_link_button = driver.findElement(By.cssSelector(".couponBlock>tbody>tr>td>table>tbody>tr>td>a"));
        activate_link_button.click();
        wait_sec();
        wait_sec();

    }


    public void Check_in_MupltipleEmail(String ShareEmail, String ShareEmail1, String ShareEmail2) throws InterruptedException {


        //go to email
        driver.get("http://www.yopmail.com/");
        wait_sec();
        wait_sec();

        WebElement login_field = driver.findElement(By.cssSelector("#login"));
        login_field.sendKeys(ShareEmail);
        System.out.println(ShareEmail);
        wait_sec();

        WebElement submit_button = driver.findElement(By.cssSelector(".sbut"));
        submit_button.click();
        wait_sec();
        wait_sec();
        wait_sec();

        driver.switchTo().frame("ifmail");//(driver.findElement(By.cssSelector(".couponBlock>tbody>tr>td>table>tbody>tr>td>a")));
        WebElement activate_link_button = driver.findElement(By.cssSelector(".couponBlock>tbody>tr>td>table>tbody>tr>td>a"));
        activate_link_button.click();
        wait_sec();
        wait_sec();

        //go to email
        driver.get("http://www.yopmail.com/");
        wait_sec();
        wait_sec();

        WebElement login_field1 = driver.findElement(By.cssSelector("#login"));
        login_field1.sendKeys(ShareEmail1);
        System.out.println(ShareEmail1);
        wait_sec();

        WebElement submit_button1 = driver.findElement(By.cssSelector(".sbut"));
        submit_button1.click();
        wait_sec();
        wait_sec();
        wait_sec();

        driver.switchTo().frame("ifmail");//(driver.findElement(By.cssSelector(".couponBlock>tbody>tr>td>table>tbody>tr>td>a")));
        WebElement activate_link_button1 = driver.findElement(By.cssSelector(".couponBlock>tbody>tr>td>table>tbody>tr>td>a"));
        activate_link_button1.click();
        wait_sec();
        wait_sec();


        //go to email
        driver.get("http://www.yopmail.com/");
        wait_sec();
        wait_sec();

        WebElement login_field2 = driver.findElement(By.cssSelector("#login"));
        login_field2.sendKeys(ShareEmail2);
        System.out.println(ShareEmail2);
        wait_sec();

        WebElement submit_button2 = driver.findElement(By.cssSelector(".sbut"));
        submit_button2.click();
        wait_sec();
        wait_sec();
        wait_sec();

        driver.switchTo().frame("ifmail");//(driver.findElement(By.cssSelector(".couponBlock>tbody>tr>td>table>tbody>tr>td>a")));
        WebElement activate_link_button2 = driver.findElement(By.cssSelector(".couponBlock>tbody>tr>td>table>tbody>tr>td>a"));
        activate_link_button2.click();
        wait_sec();
        wait_sec();




    }

    public void notification_displayed() throws InterruptedException {


        WebElement notification_count = driver.findElement(By.cssSelector("#notify_count"));
        notification_count.isDisplayed();
        wait_sec();

        WebElement bell_button = driver.findElement(By.cssSelector(".cf-bell"));
        bell_button.click();
        wait_sec();

        WebElement notification_displayed = driver.findElement(By.cssSelector(".notify_unred"));
        notification_displayed.isDisplayed();
        wait_sec();

    }

    public void notification_displayed_in_files() throws InterruptedException {

        WebElement red_count = driver.findElement(By.cssSelector("#count"));
        red_count.isDisplayed();
        wait_sec();
        wait_sec();

    }

    public void password_window(String Shared_Password) throws InterruptedException {


            WebElement password_isDisplayed = driver.findElement(By.cssSelector("#myPriviewPasswordModel"));
            password_isDisplayed.isDisplayed();
            wait_sec();
            wait_sec();

            WebElement password_filed = driver.findElement(By.cssSelector("#priviewPswd"));
            password_filed.isDisplayed();
            password_filed.sendKeys(Shared_Password);
            wait_sec();

            WebElement ok_button = driver.findElement(By.cssSelector(".button.mini.rounded.blue.CFPriviewPwdok"));
            ok_button.click();
            wait_sec();
            wait_sec();
            wait_sec();

        try {
            WebElement file_displayed = driver.findElement(By.cssSelector("#filePreview"));
            file_displayed.isDisplayed();
            wait_sec();


        }
        catch (Exception ok){

            assertEquals("Password does not match.", driver.findElement(By.cssSelector("#myPriviewPasswordModel > div.modal-body. > #Msg > span.statusMesg")).getText());


        }
    }

    public void Cancel_button_in_delete_window() throws InterruptedException {

        WebElement Grid_view_button = driver.findElement(By.cssSelector(".button.mini.rounded.light-gray"));
        Grid_view_button.isDisplayed();
        Grid_view_button.click();
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

    public void Choose_Category_File(String CategoryName) throws InterruptedException {

        WebElement file_checkbox = driver.findElement(By.cssSelector("div[name=FILE] > input[type=checkbox]"));
        file_checkbox.isDisplayed();
        file_checkbox.click();
        wait_sec();

        WebElement category_button = driver.findElement(By.xpath("//a[@id='addToCategory']/div/div"));
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

    public void Check_file_inCategory(String CategoryName) throws InterruptedException {

        WebElement new_name_displayed = driver.findElement(By.xpath("//a[contains(text(),'" + CategoryName + "')]"));
        new_name_displayed.isDisplayed();
        new_name_displayed.click();
        wait_sec();
        wait_sec();

        WebElement file_checkbox = driver.findElement(By.cssSelector(".LVcheckBox>input"));
        file_checkbox.isDisplayed();
        wait_sec();

    }

    public void All_button_isdisplayed() throws InterruptedException {
        try {
            WebElement file_checkbox = driver.findElement(By.cssSelector("div[name=FILE] > input[type=checkbox]"));
            file_checkbox.isDisplayed();
            file_checkbox.click();
            wait_sec();
            wait_sec();

            WebElement open_button = driver.findElement(By.cssSelector(".cf-eye8"));
            open_button.isDisplayed();

            WebElement download_button = driver.findElement(By.cssSelector(".cf-cloud-download2"));
            download_button.isDisplayed();

            WebElement share_button = driver.findElement(By.cssSelector(".cf-share4"));
            share_button.isDisplayed();

            WebElement rename_button = driver.findElement(By.cssSelector(".cf-edit3"));
            rename_button.isDisplayed();

            WebElement delete_button = driver.findElement(By.cssSelector(".cf-trashcan2"));
            delete_button.isDisplayed();

            WebElement category_button = driver.findElement(By.cssSelector(".cf-cabinet3"));
            category_button.isDisplayed();

            WebElement workspace_button = driver.findElement(By.cssSelector(".cf-workspace"));
            workspace_button.isDisplayed();

            WebElement file_checkbox1 = driver.findElement(By.cssSelector("div[name=FILE] > input[type=checkbox]"));
            file_checkbox1.click();
            wait_sec();

        }
        catch (Exception folder){

            WebElement file_checkbox = driver.findElement(By.cssSelector("div[name=FOLDER] > input[type=checkbox]"));
            file_checkbox.isDisplayed();
            file_checkbox.click();
            wait_sec();
            wait_sec();

            WebElement open_button = driver.findElement(By.cssSelector(".cf-eye8"));
            open_button.isDisplayed();

//            WebElement download_button = driver.findElement(By.cssSelector(".cf-cloud-download2"));
//            download_button.isDisplayed();

            WebElement share_button = driver.findElement(By.cssSelector(".cf-share4"));
            share_button.isDisplayed();

            WebElement rename_button = driver.findElement(By.cssSelector(".cf-edit3"));
            rename_button.isDisplayed();

            WebElement delete_button = driver.findElement(By.cssSelector(".cf-trashcan2"));
            delete_button.isDisplayed();

//            WebElement category_button = driver.findElement(By.cssSelector(".cf-cabinet3"));
//            category_button.isDisplayed();

            WebElement workspace_button = driver.findElement(By.cssSelector(".cf-workspace"));
            workspace_button.isDisplayed();

            WebElement file_checkbox1 = driver.findElement(By.cssSelector("div[name=FOLDER] > input[type=checkbox]"));
            file_checkbox1.click();
            wait_sec();


        }

    }


    public void Workspace_File() throws InterruptedException {

        WebElement file_checkbox = driver.findElement(By.xpath(".//*[@id='LVContent']/div[starts-with(@data-type,'FILE')][1]/div[@class='LVcheckBox']"));
        file_checkbox.isDisplayed();
        file_checkbox.click();
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
        Thread.sleep(4000);

        assertEquals("File(s) added to workspace successfully.", driver.findElement(By.cssSelector("div.textoFull > span")).getText());

    }

    public void Delete_File() throws InterruptedException {

        WebElement file_checkbox = driver.findElement(By.xpath(".//*[@id='LVContent']/div[starts-with(@data-type,'FILE')][1]/div[@class='LVcheckBox']"));
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

    public void Delete_Favourite_File() throws InterruptedException {

        WebElement file_checkbox = driver.findElement(By.xpath("html/body/section/div[2]/div[5]/div/div[4]/div/div[3]/div[1]/div[1]/input"));
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

        WebElement confirtm_delete_button = driver.findElement(By.cssSelector("#CFDeleteFavFile"));
        confirtm_delete_button.click();
        Thread.sleep(1000);

        //assertEquals("Deleting...", driver.findElement(By.cssSelector("#deleting > span.active-link1")).getText());
        wait_sec();

        System.out.println("File is deleted");

    }


    public void Delete_category_File() throws InterruptedException {

        WebElement file_checkbox = driver.findElement(By.xpath("html/body/section/div[2]/div[5]/div/div[4]/div/div[3]/div[1]/div[1]/input"));
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

        WebElement confirtm_delete_button = driver.findElement(By.cssSelector("#CFDeleteCatFiles"));
        confirtm_delete_button.click();
        wait_sec();

        System.out.println("File is deleted");

    }

    public void Add_Favorites_File() throws InterruptedException {


        WebElement file_name = driver.findElement(By.xpath(".//*[@id='LVContent']/div[starts-with(@data-type,'FILE')][1]/div[@class='LVfileName']"));
        file_name .isDisplayed();
        String namefile = file_name.getText();
        System.out.println(namefile);

        WebElement  favourite_file_button = driver.findElement(By.xpath("html/body/section/div[2]/div[5]/div/div[4]/div/div[3]/div[1]/div[3]/a"));
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

            WebElement  favourite_file_button1 = driver.findElement(By.xpath("html/body/section/div[2]/div[5]/div/div[4]/div/div[3]/div[1]/div[3]/a"));
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

    public void Edit_category() throws InterruptedException {

        WebElement edit_category = driver.findElement(By.cssSelector(".editCategory"));
        edit_category.click();
        wait_sec();

        WebElement edit_category_field = driver.findElement(By.cssSelector(".categoryInput"));
        edit_category_field.sendKeys("NewNameCategory");
        wait_sec();

        WebElement add_category_button = driver.findElement(By.cssSelector(".OkCategoryEdit"));
        add_category_button.click();
        wait_sec();
        wait_sec();

    }

    public void Delete_category() throws InterruptedException {

        WebElement delete_category = driver.findElement(By.cssSelector(".removeCategory"));
        delete_category.click();
        wait_sec();

        WebElement delete_window_displayed = driver.findElement(By.cssSelector("#deletemodal"));
        delete_window_displayed.isDisplayed();
        wait_sec();

        WebElement remove_button = driver.findElement(By.cssSelector("#CFDeleteCategory"));
        remove_button.click();
        wait_sec();
        wait_sec();

    }




    public void Change_figuration_file() throws InterruptedException {

        WebElement Grid_view_button = driver.findElement(By.cssSelector("#GView"));
        Grid_view_button.isDisplayed();
        Grid_view_button.click();
        wait_sec();
        wait_sec();

        WebElement files_displayed_grid = driver.findElement(By.className("filethumbnail"));
        files_displayed_grid.isDisplayed();
        wait_sec();
        wait_sec();


        WebElement List_view_button= driver.findElement(By.cssSelector("#LView"));
        List_view_button.isDisplayed();
        List_view_button.click();
        wait_sec();
        wait_sec();

        WebElement files_displayed_list = driver.findElement(By.className("panel-data"));
        files_displayed_list.isDisplayed();
        wait_sec();
        wait_sec();



    }

    public void Search_file(String SearchFile) throws InterruptedException {

        WebElement Search_field = driver.findElement(By.id("CFHomeSearch"));
        Search_field.isDisplayed();
        Search_field.clear();
        Search_field.sendKeys(SearchFile);
        Thread.sleep(1000);
        Search_field.sendKeys(Keys.ENTER);
        wait_sec();
        wait_sec();

//        WebElement file_name = driver.findElement(By.id("mainContentWrapper"));
//        assertThat(file_name,text(containsString(".jpg")));


    }

    public void My_clouds_page() throws InterruptedException {

        WebElement my_clouds_page = driver.findElement(By.cssSelector("#mycloudstogle"));
        my_clouds_page.isDisplayed();
        my_clouds_page.click();
        wait_sec();
        wait_sec();


    }

    public void Google_drive() throws InterruptedException {

        WebElement google_drive = driver.findElement(By.xpath("html/body/nav[2]/ul/li[7]/ul/li[1]/a"));
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", google_drive);
        google_drive.click();
        wait_sec();
        wait_sec();

        WebElement google_drive_clouds = driver.findElement(By.cssSelector(".cloudDispName"));
        google_drive_clouds.isDisplayed();
        google_drive_clouds.click();
        wait_sec();

        WebElement container_is_displayed = driver.findElement(By.cssSelector("#mainContentWrapper"));
        container_is_displayed.isDisplayed();
        wait_sec();


    }

    public void One_drive() throws InterruptedException {

        WebElement oneDrive = driver.findElement(By.xpath("html/body/nav[2]/ul/li[7]/ul/li[2]/a"));
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", oneDrive);
        oneDrive.click();
        wait_sec();
        wait_sec();

        WebElement oneDrive_clouds = driver.findElement(By.xpath("html/body/nav[2]/ul/li[7]/ul/li[2]/ul/li/p"));
        oneDrive_clouds.isDisplayed();
        oneDrive_clouds.click();
        wait_sec();

        WebElement container_is_displayed = driver.findElement(By.cssSelector("#mainContentWrapper"));
        container_is_displayed.isDisplayed();
        wait_sec();


    }

    public void DropBox() throws InterruptedException {

        WebElement dropbox = driver.findElement(By.xpath("html/body/nav[2]/ul/li[7]/ul/li[3]/a"));
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", dropbox);
        dropbox.click();
        wait_sec();
        wait_sec();

        WebElement dropbox_clouds = driver.findElement(By.xpath("html/body/nav[2]/ul/li[7]/ul/li[3]/ul/li/p"));
        dropbox_clouds.isDisplayed();
        dropbox_clouds.click();
        wait_sec();

        WebElement container_is_displayed = driver.findElement(By.cssSelector("#mainContentWrapper"));
        container_is_displayed.isDisplayed();
        wait_sec();


    }

    public void Yandex() throws InterruptedException {

        WebElement yandex = driver.findElement(By.xpath("html/body/nav[2]/ul/li[7]/ul/li[4]/a"));
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", yandex);
        yandex.click();
        wait_sec();
        wait_sec();

        WebElement yandex_clouds = driver.findElement(By.xpath("html/body/nav[2]/ul/li[7]/ul/li[4]/ul/li/p"));
        yandex_clouds.isDisplayed();
        yandex_clouds.click();
        wait_sec();

        WebElement container_is_displayed = driver.findElement(By.cssSelector("#mainContentWrapper"));
        container_is_displayed.isDisplayed();
        wait_sec();


    }

    public void Box() throws InterruptedException {

        WebElement box = driver.findElement(By.xpath("html/body/nav[2]/ul/li[7]/ul/li[5]/a"));
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", box);
        box.click();
        wait_sec();
        wait_sec();

        WebElement box_clouds = driver.findElement(By.xpath("html/body/nav[2]/ul/li[7]/ul/li[5]/ul/li/p"));
        box_clouds.isDisplayed();
        box_clouds.click();
        wait_sec();

        WebElement container_is_displayed = driver.findElement(By.cssSelector("#mainContentWrapper"));
        container_is_displayed.isDisplayed();
        wait_sec();


    }

    public void Amazon() throws InterruptedException {

        WebElement amazon = driver.findElement(By.xpath("html/body/nav[2]/ul/li[7]/ul/li[6]/a"));
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", amazon);
        amazon.click();
        wait_sec();
        wait_sec();

        WebElement amazon_clouds = driver.findElement(By.xpath("html/body/nav[2]/ul/li[7]/ul/li[6]/ul/li/p"));
        amazon.isDisplayed();
        amazon.click();
        wait_sec();

        WebElement container_is_displayed = driver.findElement(By.cssSelector("#mainContentWrapper"));
        container_is_displayed.isDisplayed();
        wait_sec();


    }

    public void Egnyte() throws InterruptedException {

        WebElement egnyte = driver.findElement(By.xpath("html/body/nav[2]/ul/li[7]/ul/li[7]/a"));
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", egnyte);
        egnyte.click();
        wait_sec();
        wait_sec();

        WebElement egnyte_clouds = driver.findElement(By.xpath("html/body/nav[2]/ul/li[7]/ul/li[7]/ul/li/p"));
        egnyte_clouds.isDisplayed();
        egnyte_clouds.click();
        wait_sec();

        WebElement container_is_displayed = driver.findElement(By.cssSelector("#mainContentWrapper"));
        container_is_displayed.isDisplayed();
        wait_sec();


    }

    public void Citrix() throws InterruptedException {

        WebElement citrix_cloud = driver.findElement(By.xpath("html/body/nav[2]/ul/li[7]/ul/li[8]/a"));
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", citrix_cloud);
        citrix_cloud.click();
        wait_sec();
        wait_sec();

        WebElement citrix_clouds = driver.findElement(By.xpath("html/body/nav[2]/ul/li[7]/ul/li[8]/ul/li/p"));
        citrix_clouds.isDisplayed();
        citrix_clouds.click();
        wait_sec();

        WebElement container_is_displayed = driver.findElement(By.cssSelector("#mainContentWrapper"));
        container_is_displayed.isDisplayed();
        wait_sec();


    }







}
